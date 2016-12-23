package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void syncUser(View v) {
        GetUsers users = new GetUsers(getApplicationContext());
        Toast.makeText(getApplicationContext(), "Syncing Users from Server...", Toast.LENGTH_SHORT).show();
        users.execute();
    }


    public void syncData(View v) {
        SyncForms ff = new SyncForms(this);
        Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
        ff.execute();
    }


    public void OpenDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }
}
