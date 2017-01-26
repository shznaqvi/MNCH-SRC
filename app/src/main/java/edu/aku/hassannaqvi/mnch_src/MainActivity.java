package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void syncData(View v) {
        //String formsUrl = SRCApp._HOST_URL + "src/forms.php";
        String usersUrl = SRCApp._HOST_URL + "/src/users_login.php";
        String clustersUrl = SRCApp._HOST_URL + "/src/getdistricts.php";
        String villagesUrl = SRCApp._HOST_URL + "/src/getvillages.php";

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            //Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            // new SyncForms(this).execute();

            Toast.makeText(getApplicationContext(), "Getting Users", Toast.LENGTH_SHORT).show();
            new GetUsers(this).execute(usersUrl);
            Toast.makeText(getApplicationContext(), "Getting Districts", Toast.LENGTH_SHORT).show();
            new GetClusters(this).execute(clustersUrl);
            Toast.makeText(getApplicationContext(), "Getting Villages", Toast.LENGTH_SHORT).show();
            new GetVillages(this).execute(villagesUrl);

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

    public void OpenSection7(View v) {

        Intent sec1_intent = new Intent(this, Section7ImActivity.class);
        startActivity(sec1_intent);

    }



}
