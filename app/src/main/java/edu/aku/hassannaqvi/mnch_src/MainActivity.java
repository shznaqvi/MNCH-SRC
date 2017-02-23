package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class MainActivity extends Activity {

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    private Boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void syncData(View v) {
        //String formsUrl = SRCApp._HOST_URL + "src/forms.php";
        //String usersUrl = SRCApp._HOST_URL + "/src/api/users_login.php";
        //String clustersUrl = SRCApp._HOST_URL + "/src/api/getdistricts.php";
        //String villagesUrl = SRCApp._HOST_URL + "/src/api/getvillages.php";

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "Getting Users", Toast.LENGTH_SHORT).show();
            new GetUsers(this).execute();
            Toast.makeText(getApplicationContext(), "Getting Districts", Toast.LENGTH_SHORT).show();
            new GetDistricts(this).execute();
            Toast.makeText(getApplicationContext(), "Getting Villages", Toast.LENGTH_SHORT).show();
            new GetVillages(this).execute();

            SRCDBHelper db = new SRCDBHelper(this);
            Collection<FormContract> fc = db.getUnsyncedForms();
            Collection<Sec3Contract> s3 = db.getUnsyncedSec3();
            Collection<Sec4aContract> s4a = db.getUnsyncedSec4a();
            Collection<Sec4bContract> s4b = db.getUnsyncedSec4b();
            Collection<Sec7ImContract> s7im = db.getUnsyncedSec7Im();

            if (fc.size() > 0) {
            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this).execute();
            }

            if (s3.size() > 0) {
            Toast.makeText(getApplicationContext(), "Syncing Section 3", Toast.LENGTH_SHORT).show();
            new SyncSec3(this).execute();
            }

            if (s4a.size() > 0) {
            Toast.makeText(getApplicationContext(), "Syncing Section 4a", Toast.LENGTH_SHORT).show();
            new SyncSec4a(this).execute();
            }

            if (s4b.size() > 0) {
            Toast.makeText(getApplicationContext(), "Syncing Section 4b", Toast.LENGTH_SHORT).show();
            new SyncSec4b(this).execute();
            }

            if (s7im.size() > 0) {
                Toast.makeText(getApplicationContext(), "Syncing Section 7Im", Toast.LENGTH_SHORT).show();
                new SyncSec7Im(this).execute();
            }

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastUpSyncServer", dtToday);

            editor.apply();


        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
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
