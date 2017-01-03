package edu.aku.hassannaqvi.mnch_src;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

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
        if (str.length() > 4000) {
            Log.i("TAG: ", str.substring(0, 4000));
            longInfo(str.substring(4000));
        } else
            Log.i("TAG: ", str);
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

        String line = "No Response";

        HttpURLConnection connection = null;
        try {

            String request = SRCApp._IP + "/src/syncdata.php";


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
//            pd.setMessage("Total Forms: " );
            for (FormContract fc : forms) {

                JSONObject jsonParam = new JSONObject();

                jsonParam.put("ID", fc.get_ID());
                jsonParam.put("devid", fc.getROW_DEVID());
                jsonParam.put("formid", fc.getROW_FORM_ID());
                jsonParam.put("s1q101", fc.getROW_S1Q101());
                jsonParam.put("s1q102", fc.getROW_S1Q102());
                jsonParam.put("s1q103", fc.getROW_S1Q103());
                jsonParam.put("s1q104", fc.getROW_S1Q104());
                jsonParam.put("s1q105", fc.getROW_S1Q105());
                jsonParam.put("s1q106a", fc.getROW_S1Q106a());
                jsonParam.put("s1q106b", fc.getROW_S1Q106b());
                jsonParam.put("s1q107", fc.getROW_S1Q107());
                jsonParam.put("s1q108", fc.getROW_S1Q108());
                jsonParam.put("s1q108b", fc.getROW_S1Q108b());
                jsonParam.put("s1q110", fc.getROW_S1Q110());
                jsonParam.put("s1q110", fc.getROW_S1Q111());
                jsonParam.put("s1q111", fc.getROW_S1Q112());
                jsonParam.put("s1q111oth", fc.getROW_S1Q111oth());
                jsonParam.put("s1q112", fc.getROW_S1Q112());

                jsonParam.put("userid", fc.getROW_USERID());
                jsonParam.put("entrydate", fc.getROW_ENTRYDATE());
                jsonParam.put("s3", fc.getROW_S3());
                jsonParam.put("uuid", fc.getROW_UID());
                jsonParam.put("gps_lang", fc.getROW_GPS_LANG());
                jsonParam.put("gps_lat", fc.getROW_GPS_LAT());
                jsonParam.put("gps_dt", fc.getROW_GPS_DT());
                jsonParam.put("gps_acc", fc.getROW_GPS_ACC());

                jsonSync.put(jsonParam);

                //jsonSync.put(fc.toJSONObject().toString());
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

        if (result == "" || result == null) {
            pd.setMessage("Data synchronized successfully - Section 1 ");
        } else {
            pd.setMessage("Error: Data not synchronized - Section 1 \r\n\r\n" + result);
        }
    }
}