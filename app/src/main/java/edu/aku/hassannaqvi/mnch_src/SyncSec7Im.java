package edu.aku.hassannaqvi.mnch_src;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;

/**
 * Created by hassan.naqvi on 7/26/2016.
 */
public class SyncSec7Im extends AsyncTask<Void, Void, String> {

//    private static final String TAG = "SyncSec7Im";
//    private Context mContext;
//    private ProgressDialog pd;
//
//
//    public SyncSec7Im(Context context) {
//        mContext = context;
//    }
//
//    public static void longInfo(String str) {
//        if (str.length() > 4000) {
//            Log.i("TAG: ", str.substring(0, 4000));
//            longInfo(str.substring(4000));
//        } else
//            Log.i("TAG: ", str);
//    }
//
//
//    @Override
//    protected void onPreExecute() {
//        super.onPreExecute();
//        pd = new ProgressDialog(mContext);
//        pd.setTitle("Please wait... Processing Sec7Im");
//        pd.show();
//
//    }
//
//
//    @Override
//    protected String doInBackground(Void... params) {
//        try {
//            return downloadUrl(SRCApp._HOST_URL + "/src/api/sec7im.php");
//        } catch (IOException e) {
//            return "Unable to upload data. Server may be down.";
//        }
//    }
//
//    private String downloadUrl(String myurl) throws IOException {
//        String line = "No Response";
//
//        HttpURLConnection connection = null;
//        try {
//            String request = myurl;
//            //String request = "http://10.1.42.30:3000/Sec7Im";
//
//            URL url = new URL(request);
//            connection = (HttpURLConnection) url.openConnection();
//            connection.setDoOutput(true);
//            connection.setDoInput(true);
//            connection.setInstanceFollowRedirects(false);
//            connection.setRequestMethod("POST");
//            connection.setRequestProperty("Content-Type", "application/json");
//            connection.setRequestProperty("charset", "utf-8");
//            connection.setUseCaches(false);
//            connection.connect();
//
//
//            JSONArray jsonSync = new JSONArray();
//
//            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
//            SRCDBHelper db = new SRCDBHelper(mContext);
//            Collection<Sec7ImContract> Sec7Im = db.getUnsyncedSec7Im();
//            Log.d(TAG, String.valueOf(Sec7Im.size()));
////            pd.setMessage("Total Sec7Im: " );
//            for (Sec7ImContract fc : Sec7Im) {
//
//                jsonSync.put(fc.toJSONObject());
//                //wr.writeBytes(jsonParam.toString().replace("\uFEFF", "") + "\n");
//
//            }
//            wr.writeBytes(jsonSync.toString().replace("\uFEFF", "") + "\n");
//            longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
//            wr.flush();
//            int HttpResult = connection.getResponseCode();
//            if (HttpResult == HttpURLConnection.HTTP_OK) {
//                BufferedReader br = new BufferedReader(new InputStreamReader(
//                        connection.getInputStream(), "utf-8"));
//                StringBuffer sb = new StringBuffer();
//
//                while ((line = br.readLine()) != null) {
//                    sb.append(line + "\n");
//                }
//                br.close();
//
//                System.out.println("" + sb.toString());
//                return sb.toString();
//            } else {
//                System.out.println(connection.getResponseMessage());
//                return connection.getResponseMessage();
//            }
//        } catch (MalformedURLException e) {
//
//            e.printStackTrace();
//        } catch (IOException e) {
//
//            e.printStackTrace();
//        } catch (JSONException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } finally {
//            if (connection != null)
//                connection.disconnect();
//        }
//        return line;
//    }
//
//    @Override
//    protected void onPostExecute(String result) {
//        super.onPostExecute(result);
//        int sSynced = 0;
//        JSONArray json = null;
//        try {
//            json = new JSONArray(result);
//            SRCDBHelper db = new SRCDBHelper(mContext);
//            for (int i = 0; i < json.length(); i++) {
//                JSONObject jsonObject = new JSONObject(json.getString(i));
//                if (jsonObject.getString("status").equals("1")) {
//                    db.updateSyncedSec7Im(jsonObject.getString("id"));
//                    sSynced++;
//                }
//            }
//            Toast.makeText(mContext, sSynced + " Sec7Im synced." + String.valueOf(json.length() - sSynced) + " Errors.", Toast.LENGTH_SHORT).show();
//
//            pd.setMessage(sSynced + " Sec7Im synced." + String.valueOf(json.length() - sSynced) + " Errors.");
//            pd.setTitle("Done uploading Sec7Im data");
//            pd.show();
//        } catch (JSONException e) {
//            e.printStackTrace();
//            Toast.makeText(mContext, "Failed Sync " + result, Toast.LENGTH_SHORT).show();
//
//            pd.setMessage(result);
//            pd.setTitle("Sec7Im Sync Failed");
//            pd.show();
//
//        }
//    }

    private static final String TAG = "SyncSec7Im";
    private Context mContext;
    private ProgressDialog pd;


    public SyncSec7Im(Context context) {
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
        pd = new ProgressDialog(mContext);
        pd.setTitle("Please wait... Processing Sec7Im");
        pd.show();

    }


    @Override
    protected String doInBackground(Void... params) {
        try {
            String url = SRCApp._HOST_URL + Sec7ImContract.single7Im._URL;
            Log.d(TAG, "doInBackground: URL " + url);
            return downloadUrl(url);
        } catch (IOException e) {
            return "Unable to upload data. Server may be down.";
        }
    }

    private String downloadUrl(String myurl) throws IOException {
        String line = "No Response";
        // Only display the first 500 characters of the retrieved
        // web page content.
        //int len = 500;
        SRCDBHelper db = new SRCDBHelper(mContext);
        Collection<Sec7ImContract> forms = db.getUnsyncedSec7Im();
        Log.d(TAG, String.valueOf(forms.size()));
        if (forms.size() > 0) {
            try {
                URL url = new URL(myurl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setReadTimeout(20000 /* milliseconds */);
                conn.setConnectTimeout(30000 /* milliseconds */);
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                conn.setDoInput(true);
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestProperty("charset", "utf-8");
                conn.setUseCaches(false);
                // Starts the query
                conn.connect();
                JSONArray jsonSync = new JSONArray();
                try {
                    DataOutputStream wr = new DataOutputStream(conn.getOutputStream());

                    for (Sec7ImContract fc : forms) {

                        jsonSync.put(fc.toJSONObject());

                    }
                    wr.writeBytes(jsonSync.toString().replace("\uFEFF", "") + "\n");
                    //longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
                    wr.flush();
                } catch (JSONException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            /*==================================SERVER RESPONSE===================================*/
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
            } catch (MalformedURLException e) {

                e.printStackTrace();
            } catch (IOException e) {

                e.printStackTrace();
            }
        } else {
            return "No new records to sync";
        }
        return line;
            /*==================================SERVER RESPONSE===================================*/

    }


    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        int sSynced = 0;
        JSONArray json = null;
        try {
            json = new JSONArray(result);
            SRCDBHelper db = new SRCDBHelper(mContext);
            for (int i = 0; i < json.length(); i++) {
                JSONObject jsonObject = new JSONObject(json.getString(i));
                if (jsonObject.getString("status").equals("1")) {
                    db.updateSyncedSec7Im(jsonObject.getString("id"));
                    sSynced++;
                }
            }
            Toast.makeText(mContext, sSynced + " Sec7Im synced." + String.valueOf(json.length() - sSynced) + " Errors.", Toast.LENGTH_SHORT).show();

            pd.setMessage(sSynced + " Sec7Im synced." + String.valueOf(json.length() - sSynced) + " Errors.");
            pd.setTitle("Done uploading Sec7Im data");
            pd.show();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(mContext, "Failed Sync " + result, Toast.LENGTH_SHORT).show();

            pd.setMessage(result);
            pd.setTitle("Sec7Im Sync Failed");
            pd.show();


        }
    }

}