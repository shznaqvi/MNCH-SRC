package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Collection;

public class GetCluster extends Activity {

    private final String TAG = "GetHF";
    private Button btnGetHF;
    private EditText txturl;

    private EditText txturlvillages;
    private Button btnGetVillages;

    private Button btnGetUsers;
    private EditText txturlusers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_cluster);

        txturl = (EditText) findViewById(R.id.txturl);
        btnGetHF = (Button) findViewById(R.id.btnGetHF);

        txturlvillages = (EditText) findViewById(R.id.txturlvillages);
        btnGetVillages = (Button) findViewById(R.id.btnGetVillages);

        txturlusers = (EditText) findViewById(R.id.txturl_users);
        btnGetUsers = (Button) findViewById(R.id.btnGetUsers);

    }

    public void getHF(View v) {

        if (txturl.getText().toString().isEmpty() || txturl.getText().toString() == null) {
            Toast.makeText(this, "Please enter url to get the cluster / health facility", Toast.LENGTH_SHORT).show();
            txturl.requestFocus();

            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(txturl.getWindowToken(), 0);

        } else {

            ConnectivityManager connMgr = (ConnectivityManager)
                    getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isConnected()) {

                CVars var = new CVars();
                var.setUrl_sync_hf(txturl.getText().toString());

                SyncCluster gf1 = new SyncCluster(this);
                gf1.execute();

                SRCDBHelper db = new SRCDBHelper(this);
                Collection<Members> lst = db.getCluster();

                if (lst.size() == 0) {
                    Toast.makeText(this, "Could not obtained list of Cluster / UC List ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Got the list of Cluster / UC List ", Toast.LENGTH_SHORT).show();
                }

                //new SyncForms_Section2(this).execute(stringUrl);
            } else {
                Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void getVillages(View v) {

        if (txturlvillages.getText().toString().isEmpty() || txturlvillages.getText().toString() == null) {
            Toast.makeText(this, "Please enter url to get the villages list ", Toast.LENGTH_SHORT).show();
            txturlvillages.requestFocus();

            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(txturlvillages.getWindowToken(), 0);

        } else {

            ConnectivityManager connMgr = (ConnectivityManager)
                    getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isConnected()) {

                CVars var = new CVars();
                var.setUrl_sync_lhw(txturlvillages.getText().toString());

                SyncVillages gf1 = new SyncVillages(this);
                gf1.execute();

                SRCDBHelper db = new SRCDBHelper(this);
                Collection<Members> lst = db.getVillages();

                if (lst.size() == 0) {
                    Toast.makeText(this, "Could not obtained list of Cluster / UC List ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Got the list of Cluster / UC List ", Toast.LENGTH_SHORT).show();
                }

                //new SyncForms_Section2(this).execute(stringUrl);
            } else {
                Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void getUsers(View v) {

        if (txturlusers.getText().toString().isEmpty() || txturlusers.getText().toString() == null) {
            Toast.makeText(this, "Please enter url to get the Users list", Toast.LENGTH_SHORT).show();
            txturlusers.requestFocus();

            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(txturlusers.getWindowToken(), 0);

        } else {

            ConnectivityManager connMgr = (ConnectivityManager)
                    getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isConnected()) {

                CVars var = new CVars();
                var.setUrl_sync_usr(txturlusers.getText().toString());

                GetUsers gf1 = new GetUsers(this);
                gf1.execute();

                SRCDBHelper db = new SRCDBHelper(this);
                Collection<UsersContract> lst = db.getAllUsers();

                if (lst.size() == 0) {
                    Toast.makeText(this, "Could not obtained list of users", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Got the list of Users", Toast.LENGTH_SHORT).show();
                }

            } else {
                Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}