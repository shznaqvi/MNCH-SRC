package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainPage extends Activity {

    private static final String TAG = "MainPage";

    private TextView username;
    private LinearLayout vu_opendb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        vu_opendb = (LinearLayout) findViewById(R.id.vu_opendb);

        CVars var = new CVars();

        if (CVars.myuser != null) {
            username = (TextView) findViewById(R.id.username);
            username.setText("Welcome : " + CVars.myuser);
        }


        if (CVars.isadmin.equals("1")) {
            vu_opendb.setVisibility(View.VISIBLE);
        } else {
            vu_opendb.setVisibility(View.GONE);
        }
    }

    public void OpenForm(View v) {
        Intent sec1_intent = new Intent(this, Section1Activity.class);
        startActivity(sec1_intent);
    }

    public void Logout(View v) {
        CVars.myuser = null;
        Intent login_intent = new Intent(this, LoginActivity.class);
        startActivity(login_intent);
    }

    public void OpenDBAccess(View v) {
        Intent sec2_intent = new Intent(this, MainActivity.class);
        startActivity(sec2_intent);
    }

    public void OpenSection2(View v) {
        Intent sec2_intent = new Intent(this, Section2Activity.class);
        startActivity(sec2_intent);
    }

    public void OpenSection3(View v) {
        Intent sec2_intent = new Intent(this, Section3Activity.class);
        startActivity(sec2_intent);
    }

    public void OpenSection4(View v) {
        Intent sec2_intent = new Intent(this, Section4Activity.class);
        startActivity(sec2_intent);
    }

    public void OpenSection5(View v) {
        Intent sec2_intent = new Intent(this, Section5Activity.class);
        startActivity(sec2_intent);
    }

    public void OpenSection6(View v) {
        Intent sec2_intent = new Intent(this, Section6Activity.class);
        startActivity(sec2_intent);
    }

    public void OpenSection7(View v) {
        Intent sec2_intent = new Intent(this, Section7Activity.class);
        startActivity(sec2_intent);
    }

    public void OpenSection8(View v) {
        Intent sec2_intent = new Intent(this, Section8Activity.class);
        startActivity(sec2_intent);
    }
}