package edu.aku.hassannaqvi.mnch_src2.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import edu.aku.hassannaqvi.mnch_src2.R;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec4aContract;
import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;
import edu.aku.hassannaqvi.mnch_src2.core.SRCDBHelper;
import edu.aku.hassannaqvi.mnch_src2.other.CVars;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class Section4Activity extends AppCompatActivity
{

    private static final String TAG = "Sec4";
    public static String data = null;
    public TextView tcount;
    public int countM = 0;
    public DatePickerInputEditText s4q41b_dod;
    String dateToday;
    String maxDateyear;
    private EditText s4q41a;
    private EditText s4q41b;
    private EditText s4q41b1;
    private EditText s4q41b2;
    private RadioGroup radio_s4q41c;
    private RadioButton rdo_s4q41c_1;
    private RadioButton rdo_s4q41c_2;
    private RadioButton rdo_s4q41c_3;
    private RadioButton rdo_s4q41c_4;
    private RadioButton rdo_s4q41c_5;
    private RadioButton rdo_s4q41c_6;
    private int rdo_s4q41c;
    private RadioGroup radio_s4q41d;
    private RadioButton rdo_s4q41d_1;
    private RadioButton rdo_s4q41d_2;
    private RadioButton rdo_s4q41d_3;
    private RadioButton rdo_s4q41d_4;
    private RadioButton rdo_s4q41d_5;
    private RadioButton rdo_s4q41d_6;
    private RadioButton rdo_s4q41d_7;
    private RadioButton rdo_s4q41d_8;
    private RadioButton rdo_s4q41d_9;
    private RadioButton rdo_s4q41d_10;
    private EditText s4q41doth;
    private int rdo_s4q41d;
    private EditText s4q41e;
    private LinearLayout vu_s4q41doth;
    private String var_s4q41c;
    private String var_s4q41d;
    //private Button btncontinue;
    private TextView app_header;
    private Button btnNext;
    private Button btnadd;
    private int sno = 0;

    public static boolean dobValidation(int y, int m, int d) {

        if ((y == 49
                || y > 49)
                && (m > 11
                || m > 0)) {
            return true;
        } else if ((y < 15)
                && (m > 11
                || m > 0)) {
            return true;
        } else if ((d > 29 || d < 0)
                && (m > 11 || m < 0)) {
            return true;
        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section4);
//        ButterKnife.bind(this);

        dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());
        try {

            String s2 = "2016-12-01";
            Date d1 = (new SimpleDateFormat("yyyy-MM-dd")).parse(s2);
            maxDateyear = (new SimpleDateFormat("dd/MM/yyyy")).format(d1);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Calendar c = Calendar.getInstance();
        c.set(2016, Calendar.DECEMBER, 1);

       /* Calendar c1 =Calendar.getInstance();
        c1.set(2016,Calendar.AUGUST,01);*/


        s4q41b_dod = findViewById(R.id.s4q41b_dod);

        s4q41b_dod.setManager(getSupportFragmentManager());
        s4q41b_dod.setMaxDate(dateToday);
        s4q41b_dod.setMinDate(maxDateyear);



        app_header = findViewById(R.id.app_header);

//        app_header.setText("SRC - > Section4a");
        app_header.setText(getString(R.string.sec4) + " (" + SRCApp.mdCount + " of " + SRCApp.mdTotal + ")");


        tcount = findViewById(R.id.tcount);

        s4q41a = findViewById(R.id.s4q41a);
        s4q41b = findViewById(R.id.s4q41b);

        s4q41b1 = findViewById(R.id.s4q41b1);
        s4q41b2 = findViewById(R.id.s4q41b2);

        s4q41doth = findViewById(R.id.s4q41doth);

        radio_s4q41c = findViewById(R.id.radio_s4q41c);
        rdo_s4q41c_1 = findViewById(R.id.RDO_s4q41c_1);
        rdo_s4q41c_2 = findViewById(R.id.RDO_s4q41c_2);
        rdo_s4q41c_3 = findViewById(R.id.RDO_s4q41c_3);
        rdo_s4q41c_4 = findViewById(R.id.RDO_s4q41c_4);
        rdo_s4q41c_5 = findViewById(R.id.RDO_s4q41c_5);
        rdo_s4q41c_6 = findViewById(R.id.RDO_s4q41c_6);
        radio_s4q41d = findViewById(R.id.radio_s4q41d);
        rdo_s4q41d_1 = findViewById(R.id.RDO_s4q41d_1);
        rdo_s4q41d_2 = findViewById(R.id.RDO_s4q41d_2);
        rdo_s4q41d_3 = findViewById(R.id.RDO_s4q41d_3);
        rdo_s4q41d_4 = findViewById(R.id.RDO_s4q41d_4);
        rdo_s4q41d_5 = findViewById(R.id.RDO_s4q41d_5);
        rdo_s4q41d_6 = findViewById(R.id.RDO_s4q41d_6);
        rdo_s4q41d_7 = findViewById(R.id.RDO_s4q41d_7);
        rdo_s4q41d_8 = findViewById(R.id.RDO_s4q41d_8);
        rdo_s4q41d_9 = findViewById(R.id.RDO_s4q41d_9);
        rdo_s4q41d_10 = findViewById(R.id.RDO_s4q41d_10);
        s4q41e = findViewById(R.id.s4q41e);

        vu_s4q41doth = findViewById(R.id.vu_s4q41doth);

//        btnNext = (Button) findViewById(R.id.btnNext);
//        btnadd = (Button) findViewById(R.id.btnadd);
//        btnNext.setVisibility(View.GONE);

        CVars var = new CVars();
        //data = getIntent().getStringExtra("myDataKey");
        if (getIntent().hasExtra("myDataKey")) {
            data = getIntent().getExtras().getString("myDataKey");
        }

//        tcount.setText(var.GetHHNO() + "-" + var.GetHHCode() + " " + "(" + "Deceased Mother " + SRCApp.tcount + " of " + data + ")");

        radio_s4q41d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == rdo_s4q41d_10.getId()) {

                    vu_s4q41doth.setVisibility(View.VISIBLE);
                    s4q41doth.requestFocus();

                } else {

                    vu_s4q41doth.setVisibility(View.GONE);
                    s4q41doth.setText("");
                }
            }
        });

        try {
            countM = Integer.parseInt(data);
        } catch (NumberFormatException nfe) {

        }


//        if (SRCApp.tcount < countM) {
//            btnadd.setVisibility(View.VISIBLE);
//            btnNext.setVisibility(View.GONE);
//
//        } else {
//            btnNext.setVisibility(View.VISIBLE);
//            btnadd.setVisibility(View.GONE);
//        }


    }

    /*public void AddWoman(View view) {

        if (ValidateForm()) {

            if (SaveDraft()) {

                Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

                if (UpdateDB()) {

                    SRCApp.tcount++;
                    Intent fA = new Intent(this, Section4Activity.class);
                    startActivity(fA);

                    vu_s4q41doth.setVisibility(View.GONE);

                }


                } else {
                Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
                }
            }
        }*/

    public void NextSection(View view) {

        //tcount.setVisibility(View.VISIBLE);

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                if (SRCApp.mdCount < SRCApp.mdTotal) {
                    Intent sec4_intent = new Intent(this, Section4Activity.class);
                    SRCApp.mdCount++;
                    startActivity(sec4_intent);
                } else if (SRCApp.cmCount < SRCApp.cmTotal) {
                    Intent sec4b_intent = new Intent(this, Section4bActivity.class);
                    SRCApp.cmCount++;
                    startActivity(sec4b_intent);
                } else {
                    Intent sec5_intent = new Intent(this, Section5Activity.class);
                    startActivity(sec5_intent);
                }
            }
        } else {
            Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();

        }
    }

    private boolean SaveDraft() throws JSONException {

        SRCApp.sc4a = new Sec4aContract();

        CVars var = new CVars();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        SRCApp.sc4a.setTagID(sharedPref.getString("tagName", null));
        SRCApp.sc4a.setVersion(SRCApp.versionName + "." + SRCApp.versionCode);

        SRCApp.sc4a.set_HHNO(SRCApp.hhno);
        //SRCApp.sc4a.set_HHCODE(var.GetHHCode());
        SRCApp.sc4a.set_DEVID(SRCApp.DEVID);
        SRCApp.sc4a.setROW_UUID(SRCApp.fc.getROW_UUID());
        SRCApp.sc4a.set_FORM_DATE(SRCApp.fc.getROW_ENTRYDATE());
        //SRCApp.sc4a.set_FORM_ID(var.GetHHNO());
        //SRCApp.sc4a.set_HHCODE(var.GetHHCode());
        //SRCApp.countM.set


        if (sno == 0) {
            SRCApp.sc4a.set_SNO("1");
            sno = 1;
        } else {

            SRCDBHelper db = new SRCDBHelper(this);

            sno = db.getSNO1();
            SRCApp.sc4a.set_SNO(String.valueOf(sno));
        }

        JSONObject s4a = new JSONObject();

        s4a.put("s4q41a", s4q41a.getText().toString());
        s4a.put("s4q41b", s4q41b.getText().toString());
        s4a.put("s4q41b1", s4q41b1.getText().toString());
        s4a.put("s4q41b2", s4q41b2.getText().toString());
        s4a.put("s4q41b_dod", s4q41b_dod.getText().toString());
        s4a.put("s4q41c", rdo_s4q41c_1.isChecked() ? "1"
                : rdo_s4q41c_2.isChecked() ? "2"
                : rdo_s4q41c_3.isChecked() ? "3"
                : rdo_s4q41c_4.isChecked() ? "4"
                : rdo_s4q41c_5.isChecked() ? "5"
                : rdo_s4q41c_6.isChecked() ? "6" : "0");

        s4a.put("s4q41d", rdo_s4q41d_1.isChecked() ? "1"
                : rdo_s4q41d_2.isChecked() ? "2"
                : rdo_s4q41d_3.isChecked() ? "3"
                : rdo_s4q41d_4.isChecked() ? "4"
                : rdo_s4q41d_5.isChecked() ? "5"
                : rdo_s4q41d_6.isChecked() ? "6"
                : rdo_s4q41d_7.isChecked() ? "7"
                : rdo_s4q41d_8.isChecked() ? "8"
                : rdo_s4q41d_9.isChecked() ? "9"
                : rdo_s4q41d_10.isChecked() ? "88"
                : "0");
        s4a.put("s4q41doth", s4q41doth.getText().toString());
        s4a.put("s4q41e", s4q41e.getText().toString());

        SRCApp.sc4a.set_s4a(String.valueOf(s4a));


        return true;
    }

    private boolean ValidateForm() {
        if (s4q41a.getText().toString().isEmpty()) {
            s4q41a.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify name of deceased mother name ", Toast.LENGTH_LONG).show();
            s4q41a.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 41a empty");
            return false;
        } else {
            s4q41a.setError(null);
        }

        if (s4q41b.getText().toString().isEmpty()) {
            s4q41b.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Cannot be empty", Toast.LENGTH_LONG).show();
            s4q41b.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 41b empty");
            return false;
        } else {
            s4q41b.setError(null);
        }

        if (s4q41b1.getText().toString().isEmpty()) {
            s4q41b1.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Cannot be empty", Toast.LENGTH_LONG).show();
            s4q41b1.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 41b1 empty");
            return false;
        } else {
            s4q41b1.setError(null);
        }

        if (s4q41b2.getText().toString().isEmpty()) {
            s4q41b2.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Cannot be empty", Toast.LENGTH_LONG).show();
            s4q41b2.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 41b2 empty");
            return false;
        } else {
            s4q41b2.setError(null);
        }

        if (s4q41b.getText().toString().isEmpty() || s4q41b1.getText().toString().isEmpty() || s4q41b2.getText().toString().isEmpty()) {
            s4q41b.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Cannot be empty", Toast.LENGTH_LONG).show();
            s4q41b.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type:41b empty");
            return false;
        } else {
            s4q41b.setError(null);
        }
        if (!(s4q41b.getText().toString().isEmpty() && s4q41b1.getText().toString().isEmpty() && s4q41b2.getText().toString().isEmpty())) {

            // AGE: DAYS 0 - 29
            if ((Integer.parseInt(s4q41b.getText().toString()) < 0 || Integer.parseInt(s4q41b.getText().toString()) > 29)) {

                s4q41b.setError("Invalid:" + getString(R.string.baseline_s4q41b));
                Toast.makeText(getApplicationContext(), "Invalid: Range is 0 to 29 days" + getString(R.string.baseline_s4q41b), Toast.LENGTH_LONG).show();
                s4q41b.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type:41b invalid");
                return false;
            } else {
                s4q41b.setError(null);
            }

            // AGE: MONTHS 0 - 11
            if ((Integer.parseInt(s4q41b1.getText().toString()) < 0 || Integer.parseInt(s4q41b1.getText().toString()) > 11)) {

                s4q41b1.setError("Invalid:" + getString(R.string.baseline_s4q41b1));
                Toast.makeText(getApplicationContext(), "Invalid: Range is 0 to 11 months" + getString(R.string.baseline_s4q41b1), Toast.LENGTH_LONG).show();
                s4q41b1.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type: 41b1 invalid");
                return false;
            } else {
                s4q41b1.setError(null);
            }

            // AGE: YEARS 15 - 49
            if ((Integer.parseInt(s4q41b2.getText().toString()) < 15 || Integer.parseInt(s4q41b2.getText().toString()) > 49)) {

                s4q41b2.setError("Invalid:" + getString(R.string.baseline_s4q41b2));
                Toast.makeText(getApplicationContext(), "Invalid: Range is 15 to 49 years" + getString(R.string.baseline_s4q41b2), Toast.LENGTH_LONG).show();
                s4q41b2.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type: 41b2 invalid");
                return false;
            } else {
                s4q41b2.setError(null);
            }


        }
        rdo_s4q41c = radio_s4q41c.getCheckedRadioButtonId();

        if (rdo_s4q41c == -1) {
            rdo_s4q41c_1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            radio_s4q41c.requestFocus();
            radio_s4q41c.setFocusable(true);
            radio_s4q41c.setFocusableInTouchMode(true);
            Log.d(TAG, "ValidateForm: Error Type:41c not selected");
            return false;
        } else {
            rdo_s4q41c_1.setError(null);
        }

        switch (rdo_s4q41c) {
            case R.id.RDO_s4q41c_1:
                var_s4q41c = "1";
                break;
            case R.id.RDO_s4q41c_2:
                var_s4q41c = "2";
                break;
            case R.id.RDO_s4q41c_3:
                var_s4q41c = "3";
                break;
            case R.id.RDO_s4q41c_4:
                var_s4q41c = "4";
                break;
            case R.id.RDO_s4q41c_5:
                var_s4q41c = "5";
                break;
            case R.id.RDO_s4q41c_6:
                var_s4q41c = "6";
                break;

        }

        rdo_s4q41d = radio_s4q41d.getCheckedRadioButtonId();

        if (rdo_s4q41d == -1) {
            rdo_s4q41d_1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            radio_s4q41d.requestFocus();
            radio_s4q41d.setFocusableInTouchMode(true);
            radio_s4q41d.setFocusable(true);
            Log.d(TAG, "ValidateForm: Error Type: 41d not selected");
            return false;
        } else {
            rdo_s4q41d_1.setError(null);
        }

        switch (rdo_s4q41d) {
            case R.id.RDO_s4q41d_1:
                var_s4q41d = "1";
                break;
            case R.id.RDO_s4q41d_2:
                var_s4q41d = "2";
                break;
            case R.id.RDO_s4q41d_3:
                var_s4q41d = "3";
                break;
            case R.id.RDO_s4q41d_4:
                var_s4q41d = "4";
                break;
            case R.id.RDO_s4q41d_5:
                var_s4q41d = "5";
                break;
            case R.id.RDO_s4q41d_6:
                var_s4q41d = "6";
                break;
            case R.id.RDO_s4q41d_7:
                var_s4q41d = "7";
                break;
            case R.id.RDO_s4q41d_8:
                var_s4q41d = "8";
                break;
            case R.id.RDO_s4q41d_9:
                var_s4q41d = "9";
                break;
            case R.id.RDO_s4q41d_10:
                var_s4q41d = "10";
                break;
        }

        if (var_s4q41d.equals("10")) {
            if (s4q41doth.getText().toString().isEmpty()) {
                s4q41doth.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please specify others ", Toast.LENGTH_LONG).show();
                s4q41doth.requestFocus();
                Log.d(TAG, "ValidateForm: 41doth empty");
                return false;
            } else {
                s4q41doth.setError(null);
            }
        }


        if (s4q41e.getText().toString().isEmpty()) {
            s4q41e.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify cause of death ", Toast.LENGTH_LONG).show();
            s4q41e.requestFocus();
            Log.d(TAG, "ValidateForm: 41e empty");
            return false;
        } else {
            s4q41e.setError(null);
        }

        return true;
    }

    private boolean UpdateDB() {
        Long rowId;
        SRCDBHelper db = new SRCDBHelper(this);

        rowId = db.addSec4a(SRCApp.sc4a);

        SRCApp.sc4a.set_ID(rowId);

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            SRCApp.sc4a.set_UID((SRCApp.sc4a.get_DEVID() + SRCApp.sc4a.get_ID()));
            db.updateSec4aUID();
            Toast.makeText(this, "Current Form No: " + SRCApp.sc4a.get_DEVID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void endInterview(View view) {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                Intent end_intent = new Intent(this, EndingActivity.class);
                end_intent.putExtra("check", false);
                startActivity(end_intent);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}