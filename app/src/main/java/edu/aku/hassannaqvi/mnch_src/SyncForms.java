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
public class SyncForms extends AsyncTask<Void, Void, String> {

    private static final String TAG = "SyncForms";
    private Context mContext;
    private ProgressDialog pd;


    public SyncForms(Context context) {
        mContext = context;
    }

    public static void longInfo(String str) {
//        if (str.length() > 4000) {
//            Log.i("TAG: ", str.substring(0, 4000));
//            longInfo(str.substring(4000));
//        } else
//            Log.i("TAG: ", str);
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Please wait... Processing Forms");
        pd.show();

    }


    @Override
    protected String doInBackground(Void... params) {
        try {
            return downloadUrl("http://"+SRCApp._DefaultIP+"/forms");
        } catch (IOException e) {
            return "Unable to upload data. Server may be down.";
        }
    }

    private String downloadUrl(String myurl) throws IOException {
        String line = "No Response";

        HttpURLConnection connection = null;
        try {
            String request = myurl;
            //String request = "http://10.1.42.30:3000/forms";

            URL url = new URL(request);
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("charset", "utf-8");
            connection.setUseCaches(false);
            connection.connect();


            JSONArray jsonSync = new JSONArray();

            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            SRCDBHelper db = new SRCDBHelper(mContext);
            Collection<FormContract> forms = db.getAllForms();
            Log.d(TAG, String.valueOf(forms.size()));
//            pd.setMessage("Total Forms: " );
            for (FormContract fc : forms) {

                jsonSync.put(fc.toJSONObject().toString());
                //wr.writeBytes(jsonParam.toString().replace("\uFEFF", "") + "\n");

            }
            wr.writeBytes(jsonSync.toString().replace("\uFEFF", "") + "\n");
            longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
            wr.flush();
            int HttpResult = connection.getResponseCode();
            if (HttpResult == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        connection.getInputStream(), "utf-8"));
                StringBuffer sb = new StringBuffer();

                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();

                System.out.println("" + sb.toString());
                return sb.toString();
            } else {
                System.out.println(connection.getResponseMessage());
                return connection.getResponseMessage();
            }
        } catch (MalformedURLException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (connection != null)
                connection.disconnect();
        }
        return line;
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
                if(jsonObject.getString("status").equals("1")){
                    db.updateForms(jsonObject.getString("id"));
                    sSynced++;
                }
            }
            Toast.makeText(mContext, sSynced+" Forms synced." + String.valueOf(json.length()-sSynced) + " Errors.", Toast.LENGTH_SHORT).show();

            pd.setMessage(sSynced+" Forms synced." + String.valueOf(json.length()-sSynced) + " Errors.");
            pd.setTitle("Done uploading Forms data");
            pd.show();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(mContext, "Failed Sync " + result, Toast.LENGTH_SHORT).show();

            pd.setMessage(result);
            pd.setTitle("Formss Sync Failed");
            pd.show();


        }
    }


}