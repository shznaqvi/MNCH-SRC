package edu.aku.hassannaqvi.mnch_src;

/**
 * Created by hassan.naqvi on 11/5/2016.
 */


import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;

import static edu.aku.hassannaqvi.mnch_src.MainActivity.pd;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class SyncAll extends AsyncTask<URL, String, JSONArray[]> {

    private static final String TAG = "SyncAll()";
    private Context mContext;


    public SyncAll(Context context) {
        mContext = context;
    }

    public static void longInfo(String str) {
        if (str.length() > 4000) {
            Log.i(TAG, str.substring(0, 4000));
            longInfo(str.substring(4000));
        } else
            Log.i("TAG: ", str);
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
        String line = "No Response";

        // Only display the first 500 characters of the retrieved
        // web page content.
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setReadTimeout(10000 /* milliseconds */);
        conn.setConnectTimeout(15000 /* milliseconds */);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("charset", "utf-8");
        conn.setUseCaches(false);
        conn.connect();

        JSONArray jsonSync = new JSONArray();

        DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
        SRCDBHelper db = new SRCDBHelper(mContext);
        Collection<FormContract> Forms = db.getUnsyncedForms();
        Log.d(TAG, String.valueOf(Forms.size()));


        for (FormContract fc : Forms) {
            try {
                jsonSync.put(fc.toJSONObject());
            } catch (JSONException e1) {
                e1.printStackTrace();
            }

        }
        wr.writeBytes(jsonSync.toString().replace("\uFEFF", "") + "\n");
        longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
        wr.flush();
        int HttpResult = conn.getResponseCode();
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    conn.getInputStream(), "utf-8"));
            StringBuffer sb = new StringBuffer();

            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();

            System.out.println("" + sb.toString());
            return sb.toString();
        } else {
            System.out.println(conn.getResponseMessage());
            return conn.getResponseMessage();
        }
    }

    // Makes sure that the InputStream is closed after the app is
    // finished using it.
}


