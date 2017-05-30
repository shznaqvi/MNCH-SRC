package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {

    protected static ProgressDialog pd;
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    private Boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void getData(View v) throws MalformedURLException {
        //String formsUrl = SRCApp._HOST_URL + "src/forms.php";
        //String usersUrl = SRCApp._HOST_URL + "/src/api/users_login.php";
        //String clustersUrl = SRCApp._HOST_URL + "/src/api/getdistricts.php";
        //String villagesUrl = SRCApp._HOST_URL + "/src/api/getvillages.php";

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        pd = new ProgressDialog(this);
        pd.setTitle("Getting Data");
        pd.setMessage("Getting connected to server...");
        pd.show();
        if (networkInfo != null && networkInfo.isConnected()) {

            new GetAll(this).execute(
                    new URL(SRCApp._HOST_URL + DistrictsContract.singleDistrict._URI),
                    new URL(SRCApp._HOST_URL + VillagesContract.singleVillages._URI),
                    new URL(SRCApp._HOST_URL + UsersContract.singleUser._URI)
            );

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastDownSyncServer", dtToday);

            editor.apply();


        } else {
            pd.setMessage("No network connection available.");
            pd.show();
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_LONG).show();
        }
    }

    public void sendData(View v) throws MalformedURLException {

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        pd = new ProgressDialog(this);
        pd.setTitle("Sending Data");
        pd.setMessage("Getting connected to server...");
        pd.show();
        if (networkInfo != null && networkInfo.isConnected()) {
           /* new SyncAll(this).execute(
                    new URL(SRCApp._HOST_URL + FormContract.Sec1Entry._URL),
                    new URL(SRCApp._HOST_URL + Sec3Contract.Sec3Entry._URL),
                    new URL(SRCApp._HOST_URL + Sec4aContract.Section4Entry._URL),
                    new URL(SRCApp._HOST_URL + Sec4bContract.Section4bEntry._URL),
                    new URL(SRCApp._HOST_URL + Sec7ImContract.single7Im._URL)
);
*/


            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this).execute();


            Toast.makeText(getApplicationContext(), "Syncing Section 3", Toast.LENGTH_SHORT).show();
            new SyncSec3(this).execute();


            Toast.makeText(getApplicationContext(), "Syncing Section 4a", Toast.LENGTH_SHORT).show();
            new SyncSec4a(this).execute();


            Toast.makeText(getApplicationContext(), "Syncing Section 4b", Toast.LENGTH_SHORT).show();
            new SyncSec4b(this).execute();


            Toast.makeText(getApplicationContext(), "Syncing Section 7Im", Toast.LENGTH_SHORT).show();
            new SyncSec7Im(this).execute();



            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastUpSyncServer", dtToday);

            editor.apply();

        } else {
            pd.setMessage("No network connection available.");
            pd.show();
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_LONG).show();
        }
    }

    public void OpenDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    public void OpenForm(View v) {

        Intent sec1_intent = new Intent(this, Section1Activity.class);
        startActivity(sec1_intent);

    }

    public void OpenSection4(View v) {

        Intent sec1_intent = new Intent(this, Section8Activity.class);
        startActivity(sec1_intent);

    }

    @Override
    public void onBackPressed() {
        if (exit) {
            finish(); // finish activity
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }
    }



}
