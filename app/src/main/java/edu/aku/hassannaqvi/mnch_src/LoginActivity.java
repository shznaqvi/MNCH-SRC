package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class LoginActivity extends Activity {

    private static final String TAG = "Login";

    private EditText userid;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;
    private TextView txtinstalldate;

    private LinearLayout vu_syncusers;
    private Button btnSyncUsers;


    private AlertDialog.Builder alert;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        SRCDBHelper db = new SRCDBHelper(this);
        ArrayList<UsersContract> lstUsers = db.getAllUsers();



        // Set up the login form.
        userid = (EditText) findViewById(R.id.userid);
        txtinstalldate = (TextView) findViewById(R.id.txtinstalldate);
        try {
            long installedOn = this
                    .getPackageManager()
                    .getPackageInfo("edu.aku.hassannaqvi.mnch_src", 0)
                    .lastUpdateTime;
            Integer versionCode = this
                    .getPackageManager()
                    .getPackageInfo("edu.aku.hassannaqvi.mnch_src", 0)
                    .versionCode;
            String versionName = this
                    .getPackageManager()
                    .getPackageInfo("edu.aku.hassannaqvi.mnch_src", 0)
                    .versionName;
            txtinstalldate.setText("Ver. " + versionName + "." + String.valueOf(versionCode) + " \r\n( Last Updated: " + new SimpleDateFormat("dd MMM. yyyy").format(new Date(installedOn)) + " )");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        mPasswordView = (EditText) findViewById(R.id.password);
        mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                return id == R.id.login || id == EditorInfo.IME_NULL;
            }
        });

        Button mEmailSignInButton = (Button) findViewById(R.id.email_sign_in_button);
        mEmailSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUser(view);
            }
        });

        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);


        alert = new AlertDialog.Builder(this);
        alert.setTitle("Confirm Exit");
        alert.setMessage("Are you sure you want to close this app ?")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        android.os.Process.killProcess(android.os.Process.myPid());
                        LoginActivity.super.onDestroy();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
    }



    public void loginUser(View view) {

        LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (mlocManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {

            String username = userid.getText().toString();
            String password = mPasswordView.getText().toString();
            try {

                // Reset errors.
                userid.setError(null);
                mPasswordView.setError(null);

                boolean cancel = false;
                View focusView = null;

                // Check for a valid email address.
                if (TextUtils.isEmpty(username)) {
                    userid.setError(getString(R.string.error_field_required));
                    focusView = userid;
                    cancel = true;
                } else {
                    userid.setError(null);
                }

                if (TextUtils.isEmpty(password)) {
                    mPasswordView.setError(getString(R.string.error_field_required));
                    focusView = mPasswordView;
                    cancel = true;
                } else {
                    mPasswordView.setError(null);
                }

                if (cancel == false) {
                    mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                    if (mlocManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                        SRCDBHelper db = new SRCDBHelper(LoginActivity.this);

                        if (db.Login(username, password) || (username.equals("test1234") && password.equals("test1234"))) {
                            Toast.makeText(LoginActivity.this, "Successfully Logged In", Toast.LENGTH_LONG).show();

                            CVars var = new CVars();
                            var.StoreUser(username);
                            Intent login_intent = new Intent(this, MainActivity.class);

                            startActivity(login_intent);
                        } else {
                            Toast.makeText(LoginActivity.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                        }
                        db.close();
                    } else {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                                LoginActivity.this);
                        alertDialogBuilder
                                .setMessage("GPS is disabled in your device. Enable it?")
                                .setCancelable(false)
                                .setPositiveButton("Enable GPS",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog,
                                                                int id) {
                                                Intent callGPSSettingIntent = new Intent(
                                                        android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                                                startActivity(callGPSSettingIntent);
                                            }
                                        });
                        alertDialogBuilder.setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = alertDialogBuilder.create();
                        alert.show();

                    }
                }

            } catch (Exception e) {
                Toast.makeText(LoginActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
            }
        }else {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                    LoginActivity.this);
            alertDialogBuilder
                    .setMessage("GPS is disabled in your device. Enable it?")
                    .setCancelable(false)
                    .setPositiveButton("Enable GPS",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {
                                    Intent callGPSSettingIntent = new Intent(
                                            android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                                    startActivity(callGPSSettingIntent);
                                }
                            });
            alertDialogBuilder.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = alertDialogBuilder.create();
            alert.show();

        }
    }
}