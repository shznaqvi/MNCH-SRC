package edu.aku.hassannaqvi.mnch_src;

/**
 * Created by hassan.naqvi on 11/5/2016.
 */


import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static edu.aku.hassannaqvi.mnch_src.MainActivity.pd;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class GetAll extends AsyncTask<URL, String, JSONArray[]> {

    private final String TAG = "GetAll()";
    private Context mContext;


    public GetAll(Context context) {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

    }

    @Override
    protected JSONArray[] doInBackground(URL... urls) {

        int count = urls.length;
        JSONArray[] jsons = new JSONArray[count];
        for (int i = 0; i < count; i++) {
            try {
                Log.d(TAG, "doInBackground1: " + urls[i]);
                Log.d(TAG, "doInBackground2: " + downloadUrl(urls[i]));
                jsons[i] = new JSONArray(downloadUrl(urls[i]));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String[] c = urls[i].toString().split("/");
            publishProgress(c[c.length - 1].trim());
            // Escape early if cancel() is called
            if (isCancelled()) break;
        }
        return jsons;
    }

    @Override
    protected void onProgressUpdate(String... progress) {

        pd.setMessage("Getting data from... " + progress[0]);
        pd.show();
    }

    @Override
    protected void onPostExecute(JSONArray[] jsons) {
        int count = jsons.length;
        String pdm = "";
        for (int i = 0; i < count; i++) {
            if (jsons[i].length() > 0) {
                Log.d(TAG, jsons.length + " onPostExecute: " + jsons[i].length());
                SRCDBHelper db = new SRCDBHelper(mContext);
                Log.d(TAG, "onPostExecute JSON: " + jsons[i]);
                //JSONArray jsonArray = new JSONArray(jsons[i]);
                switch (i) {
                    case 0:
                        db.syncDistrict(jsons[i]);
                        pdm += "Districts Received: " + jsons[i].length() + "\n";

                        break;
                    case 1:
                        db.syncVILLAGES(jsons[i]);
                        pdm += "Villages Received: " + jsons[i].length() + "\n";

                        break;
                    case 2:
                        db.syncUser(jsons[i]);
                        pdm += "Users Received: " + jsons[i].length() + "\n";

                        break;
                }

                pd.setMessage(pdm);
                pd.show();


                //db.getAllUsers();
            } else {
                pd.setMessage("Received: " + jsons[i].length() + "");
                pd.show();
            }
        }

    }

    private String downloadUrl(URL url) throws IOException {
        // Only display the first 500 characters of the retrieved
        // web page content.
        StringBuilder result = new StringBuilder();

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(10000 /* milliseconds */);
        conn.setConnectTimeout(15000 /* milliseconds */);
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("charset", "utf-8");
        conn.setUseCaches(false);
        // Starts the query
        conn.connect();
        int response = conn.getResponseCode();
        Log.d(TAG, "The response is: " + response);
        InputStream in = new BufferedInputStream(conn.getInputStream());

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String line;
        while ((line = reader.readLine()) != null) {
            //Log.i(TAG, "Children In: " + line);
            result.append(line);
        }
        return result.toString();

        // Makes sure that the InputStream is closed after the app is
        // finished using it.
    }


}