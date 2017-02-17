package edu.aku.hassannaqvi.mnch_src;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by isd on 30/12/2016.
 */

public class SyncVillages extends AsyncTask<String, String, String> {

    private final String TAG = "SyncVillages";
    HttpURLConnection urlConnection;
    private Context mContext;

    public SyncVillages(Context context) {
        mContext = context;
    }


    @Override
    protected String doInBackground(String... args) {

        StringBuilder result = new StringBuilder();

        try {
            //URL url = new URL("http://10.198.96.72:8080/mapps/users_login.php");

            CVars var = new CVars();
            URL url = new URL(var.getUrl_sync_lhw());

            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());

            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            String line;
            while ((line = reader.readLine()) != null) {
                Log.i(TAG, "User In: " + line);
                result.append(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            urlConnection.disconnect();
        }

        return result.toString();
    }

    @Override
    protected void onPostExecute(String result) {

        //Do something with the JSON string

        String json = result;
        //json = json.replaceAll("\\[", "").replaceAll("\\]","");
        Log.d(TAG, result);
        ArrayList<VillagesContract> userArrayList;
        SRCDBHelper db = new SRCDBHelper(mContext);
        try {
            userArrayList = new ArrayList<VillagesContract>();
            //JSONObject jsonObject = new JSONObject(json);
            JSONArray jsonArray = new JSONArray(json);
            db.syncVILLAGES(jsonArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        db.getVillages();
    }
}