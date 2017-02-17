package edu.aku.hassannaqvi.mnch_src;

import android.app.ProgressDialog;
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
 * Created by hassan.naqvi on 4/28/2016.
 */
public class GetVillages extends AsyncTask<String, String, String> {

    private final String TAG = "GetVillages()";
    HttpURLConnection urlConnection;
    private Context mContext;
    private ProgressDialog pd;

    public GetVillages(Context context) {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Getting Clusters");
        pd.setMessage("Preparing...");
        pd.show();

    }

    @Override
    protected String doInBackground(String... args) {

        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(SRCApp._HOST_URL + "/src/api/getvillages.php");
            urlConnection = (HttpURLConnection) url.openConnection();
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                //pd.show();

                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                String line;
                while ((line = reader.readLine()) != null) {
                    //pd.show();
                    Log.i(TAG, "Clusters In: " + line);
                    result.append(line);
                }
            } else {
                result.append("URL not found");

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
        if (result != "URL not found") {

            String json = result;
            //json = json.replaceAll("\\[", "").replaceAll("\\]","");
            Log.d(TAG, result);
            ArrayList<VillagesContract> VILLAGESArrayList;
            SRCDBHelper db = new SRCDBHelper(mContext);
            try {
                VILLAGESArrayList = new ArrayList<VillagesContract>();
                //JSONObject jsonObject = new JSONObject(json);
                JSONArray jsonArray = new JSONArray(json);
                pd.setMessage("Received: " + jsonArray.length() + " Villages");
                pd.setTitle("Done... Synced Villages");
                db.syncVILLAGES(jsonArray);
            } catch (JSONException e) {
                e.printStackTrace();
                pd.setMessage("Received: 0 Villages");
                pd.setTitle("Error... Syncing Villages");
            }
//            db.getAllDistricts();
            pd.show();
        }



/*        try {
            JSONObject obj = new JSONObject(json);
            Log.d("My App", obj.toString());
        } catch (Throwable t) {
            Log.e("My App", "Could not parse malformed JSON: \"" + json + "\"");
        }*/

//        ArrayList<String> listdata = new ArrayList<String>();
//        JSONArray jArray = (JSONArray)jsonObject;
//        if (jArray != null) {
//            for (int i=0;i<jArray.length();i++){
//                listdata.add(jArray.get(i).toString());
//            }
//        }

    }
}