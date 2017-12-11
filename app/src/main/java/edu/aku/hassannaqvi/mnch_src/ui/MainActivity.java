package edu.aku.hassannaqvi.mnch_src.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.mnch_src.core.AndroidDatabaseManager;
import edu.aku.hassannaqvi.mnch_src.get.GetDistricts;
import edu.aku.hassannaqvi.mnch_src.get.GetUsers;
import edu.aku.hassannaqvi.mnch_src.get.GetVillages;
import edu.aku.hassannaqvi.mnch_src.R;
import edu.aku.hassannaqvi.mnch_src.sync.SyncForms;
import edu.aku.hassannaqvi.mnch_src.sync.SyncSec3;
import edu.aku.hassannaqvi.mnch_src.sync.SyncSec4a;
import edu.aku.hassannaqvi.mnch_src.sync.SyncSec4b;
import edu.aku.hassannaqvi.mnch_src.sync.SyncSec7Im;

public class MainActivity extends Activity {

    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    private Boolean exit = false;

    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    AlertDialog.Builder builder;
    String m_Text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TagID Start*/
        sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        editor = sharedPref.edit();

        builder = new AlertDialog.Builder(MainActivity.this);
        ImageView img = new ImageView(getApplicationContext());
        img.setImageResource(R.drawable.tagimg);
        img.setPadding(0, 15, 0, 15);
        builder.setCustomTitle(img);

        final EditText input = new EditText(MainActivity.this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                if (!m_Text.equals("")) {
                    editor.putString("tagName", m_Text);
                    editor.commit();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        if (sharedPref.getString("tagName", null) == "" || sharedPref.getString("tagName", null) == null) {
            builder.show();
        }
        /*TagID End*/

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
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }
    }

    public void OpenDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    public void OpenForm(View v) {

        if (sharedPref.getString("tagName", null) != "" && sharedPref.getString("tagName", null) != null) {
            Intent oF = new Intent(MainActivity.this, Section1Activity.class);
            startActivity(oF);
        } else {

            builder = new AlertDialog.Builder(MainActivity.this);
            ImageView img = new ImageView(getApplicationContext());
            img.setImageResource(R.drawable.tagimg);
            img.setPadding(0, 15, 0, 15);
            builder.setCustomTitle(img);

            final EditText input = new EditText(MainActivity.this);
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    m_Text = input.getText().toString();
                    if (!m_Text.equals("")) {
                        editor.putString("tagName", m_Text);
                        editor.commit();

                        Intent oF = new Intent(MainActivity.this, Section1Activity.class);
                        startActivity(oF);
                    }
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.show();
        }

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
