package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

public class Section2Activity extends Activity {

    private static final String TAG = "Sec2";
    String var_s2q203 = "";
    String var_s2q205 = "";
    private ScrollView scrollView01;
    private TextView appHeader;
    private TextView lblS2q201;
    private TextView lblS2q202;
    private TextView lblS2q203;
    private RadioGroup radioS2q203;
    private RadioButton rDOS2q2031;
    private RadioButton rDOS2q2032;
    private TextView lblS2q204;
    private TextView lblS2q205;
    private TextView lblS2q205oth;
    private RadioGroup radioS2q205;
    private RadioButton rDOS2q2051;
    private RadioButton rDOS2q2052;
    private RadioButton rDOS2q2053;
    private RadioButton rDOS2q2054;
    private RadioButton rDOS2q2055;
    private RadioButton rDOS2q2056;
    private RadioButton rDOS2q2057;
    private RadioButton rDOS2q2058;
    private RadioButton rDOS2q2059;
    private RadioButton rDOS2q20510;
    private RadioButton rDOS2q20511;
    private RadioButton rDOS2q20512;
    private RadioButton rDOS2q20513;
    private TextView lblS2q206;
    private TextView lblS2q206a;
    private TextView lblS2q206b;
    private TextView lblS2q206c;
    private TextView lblS2q206d;
    private TextView lblS2q206e;
    private TextView lblS2q206f;
    private TextView lblS2q206g;
    private TextView lblS2q206h;
    private EditText s2q201;
    private EditText s2q202;
    private EditText s2q204;
    private EditText s2q205oth;
    private EditText s2q206a;
    private EditText s2q206b;
    private EditText s2q206c;
    private EditText s2q206d;
    private EditText s2q206e;
    private EditText s2q206f;
    private EditText s2q206g;
    private EditText s2q206h;
    private TextView lbl_hhhead;
    private LinearLayout vu_s2q205oth;
    private int rdo_s2q203;
    private int rdo_s2q205;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section2);

        scrollView01 = (ScrollView) findViewById(R.id.ScrollView01);
        appHeader = (TextView) findViewById(R.id.app_header);
        appHeader.setText("SRC - > Section2");

        lblS2q201 = (TextView) findViewById(R.id.lbl_s2q201);
        lblS2q202 = (TextView) findViewById(R.id.lbl_s2q202);
        lblS2q203 = (TextView) findViewById(R.id.lbl_s2q203);
        radioS2q203 = (RadioGroup) findViewById(R.id.radio_s2q203);
        rDOS2q2031 = (RadioButton) findViewById(R.id.RDO_s2q203_1);
        rDOS2q2032 = (RadioButton) findViewById(R.id.RDO_s2q203_2);
        lblS2q204 = (TextView) findViewById(R.id.lbl_s2q204);
        lblS2q205 = (TextView) findViewById(R.id.lbl_s2q205);
        lblS2q205oth = (TextView) findViewById(R.id.lbl_s2q205);
        radioS2q205 = (RadioGroup) findViewById(R.id.radio_s2q205);
        rDOS2q2051 = (RadioButton) findViewById(R.id.RDO_s2q205_1);
        rDOS2q2052 = (RadioButton) findViewById(R.id.RDO_s2q205_2);
        rDOS2q2053 = (RadioButton) findViewById(R.id.RDO_s2q205_3);
        rDOS2q2054 = (RadioButton) findViewById(R.id.RDO_s2q205_4);
        rDOS2q2055 = (RadioButton) findViewById(R.id.RDO_s2q205_5);
        rDOS2q2056 = (RadioButton) findViewById(R.id.RDO_s2q205_6);
        rDOS2q2057 = (RadioButton) findViewById(R.id.RDO_s2q205_7);
        rDOS2q2058 = (RadioButton) findViewById(R.id.RDO_s2q205_8);
        rDOS2q2059 = (RadioButton) findViewById(R.id.RDO_s2q205_9);
        rDOS2q20510 = (RadioButton) findViewById(R.id.RDO_s2q205_10);
        rDOS2q20511 = (RadioButton) findViewById(R.id.RDO_s2q205_11);
        rDOS2q20512 = (RadioButton) findViewById(R.id.RDO_s2q205_12);
        rDOS2q20513 = (RadioButton) findViewById(R.id.RDO_s2q205_13);
        lblS2q206 = (TextView) findViewById(R.id.lbl_s2q206);
        lblS2q206a = (TextView) findViewById(R.id.lbl_s2q206a);
        lblS2q206b = (TextView) findViewById(R.id.lbl_s2q206b);
        lblS2q206c = (TextView) findViewById(R.id.lbl_s2q206c);
        lblS2q206d = (TextView) findViewById(R.id.lbl_s2q206d);
        lblS2q206e = (TextView) findViewById(R.id.lbl_s2q206e);
        lblS2q206f = (TextView) findViewById(R.id.lbl_s2q206f);
        lblS2q206g = (TextView) findViewById(R.id.lbl_s2q206g);
        lblS2q206h = (TextView) findViewById(R.id.lbl_s2q206h);

        s2q201 = (EditText) findViewById(R.id.s2q201);
        s2q202 = (EditText) findViewById(R.id.s2q202);
        s2q204 = (EditText) findViewById(R.id.s2q204);
        s2q205oth = (EditText) findViewById(R.id.s2q205oth);
        s2q206a = (EditText) findViewById(R.id.s2q206a);
        s2q206b = (EditText) findViewById(R.id.s2q206b);
        s2q206c = (EditText) findViewById(R.id.s2q206c);
        s2q206d = (EditText) findViewById(R.id.s2q206d);
        s2q206e = (EditText) findViewById(R.id.s2q206e);
        s2q206f = (EditText) findViewById(R.id.s2q206f);
        s2q206g = (EditText) findViewById(R.id.s2q206g);
        s2q206h = (EditText) findViewById(R.id.s2q206h);


        vu_s2q205oth = (LinearLayout) findViewById(R.id.vu_s2q205oth);


        lbl_hhhead = (TextView) findViewById(R.id.lbl_hhhead);

        CVars var = new CVars();
        lbl_hhhead.setText(var.GetHHNO() + "-" + var.GetHHCode());


        radioS2q205.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == rDOS2q20510.getId()) {

                    vu_s2q205oth.setVisibility(View.VISIBLE);
                    s2q205oth.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(s2q205oth.getWindowToken(), 0);

                } else {

                    vu_s2q205oth.setVisibility(View.GONE);
                    s2q205oth.setText("");
                }
            }
        });

    }

    private EditText getS2q201() {
        return (EditText) findViewById(R.id.s2q201);
    }

    private EditText getS2q202() {
        return (EditText) findViewById(R.id.s2q202);
    }

    private EditText getS2q204() {
        return (EditText) findViewById(R.id.s2q204);
    }

    private EditText getS2q205oth() {
        return (EditText) findViewById(R.id.s2q205oth);
    }

    private EditText getS2q206a() {
        return (EditText) findViewById(R.id.s2q206a);
    }

    private EditText getS2q206b() {
        return (EditText) findViewById(R.id.s2q206b);
    }

    private EditText getS2q206c() {
        return (EditText) findViewById(R.id.s2q206c);
    }

    private EditText getS2q206d() {
        return (EditText) findViewById(R.id.s2q206d);
    }

    private EditText getS2q206e() {
        return (EditText) findViewById(R.id.s2q206e);
    }

    private EditText getS2q206f() {
        return (EditText) findViewById(R.id.s2q206f);
    }

    private EditText getS2q206g() {
        return (EditText) findViewById(R.id.s2q206g);
    }

    private EditText getS2q206h() {
        return (EditText) findViewById(R.id.s2q206h);
    }


    public void gotoSection3(View view) {

        if (ValidateForm()) {

            if (SaveDraft()) {

                Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

                if (UpdateDB()) {

                    CVars var = new CVars();

                    if (var.GetReproductionAgeWoman() == 0) {
                        Intent sec3_intent = new Intent(this, Section4Activity.class);
                        startActivity(sec3_intent);
                    } else {
                        Intent sec3_intent = new Intent(this, Section3Activity.class);
                        startActivity(sec3_intent);
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }


    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);
        db.updateS2();
        return true;
    }


    private boolean SaveDraft() {
        JSONObject s2 = new JSONObject();
        try {

            s2.put("s2q201", s2q201.getText().toString());
            s2.put("s2q202", s2q202.getText().toString());

            switch (radioS2q203.getCheckedRadioButtonId()) {
                case R.id.RDO_s2q203_1:
                    var_s2q203 = "1";
                    break;
                case R.id.RDO_s2q203_2:
                    var_s2q203 = "2";
                    break;
            }

            s2.put("s2q203", var_s2q203);
            s2.put("s2q204", s2q204.getText().toString());

            switch (radioS2q205.getCheckedRadioButtonId()) {
                case R.id.RDO_s2q205_1:
                    var_s2q205 = "1";
                    break;
                case R.id.RDO_s2q205_2:
                    var_s2q205 = "2";
                    break;
                case R.id.RDO_s2q205_3:
                    var_s2q205 = "3";
                    break;
                case R.id.RDO_s2q205_4:
                    var_s2q205 = "4";
                    break;
                case R.id.RDO_s2q205_5:
                    var_s2q205 = "5";
                    break;
                case R.id.RDO_s2q205_6:
                    var_s2q205 = "6";
                    break;

                case R.id.RDO_s2q205_7:
                    var_s2q205 = "7";
                    break;
                case R.id.RDO_s2q205_8:
                    var_s2q205 = "8";
                    break;
                case R.id.RDO_s2q205_9:
                    var_s2q205 = "9";
                    break;
                case R.id.RDO_s2q205_10:
                    var_s2q205 = "10";
                    break;
                case R.id.RDO_s2q205_11:
                    var_s2q205 = "11";
                    break;
                case R.id.RDO_s2q205_12:
                    var_s2q205 = "12";
                    break;
                case R.id.RDO_s2q205_13:
                    var_s2q205 = "13";
                    break;
            }

            s2.put("s2q205", var_s2q205);
            s2.put("s2q205oth", s2q205oth.getText().toString());
            s2.put("s2q206a", s2q206a.getText().toString());
            s2.put("s2q206b", s2q206b.getText().toString());
            s2.put("s2q206c", s2q206c.getText().toString());
            s2.put("s2q206d", s2q206d.getText().toString());
            s2.put("s2q206e", s2q206e.getText().toString());
            s2.put("s2q206f", s2q206f.getText().toString());
            s2.put("s2q206g", s2q206g.getText().toString());
            s2.put("s2q206h", s2q206h.getText().toString());

            CVars var = new CVars();

            if (!s2q206h.getText().toString().isEmpty() || s2q206h.getText().toString() != null) {
                var.StoreReporductionAgeWoman(Integer.parseInt(s2q206h.getText().toString()));
            } else {
                var.StoreReporductionAgeWoman(Integer.parseInt("0"));
            }


            SRCApp.fc.setROW_S2(s2.toString());

        } catch (Exception e) {
        }

        return true;
    }


    private boolean ValidateForm() {
        //Toast.makeText(getApplicationContext(), "Validating Form", Toast.LENGTH_SHORT).show();

        if (getS2q201().getText().toString().isEmpty() || s2q201.getText().toString() == null) {
            s2q201.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter household head name \r\n", Toast.LENGTH_LONG).show();
            s2q201.requestFocus();
            return false;
        } else {
            s2q201.setError(null);
        }

        if (getS2q202().getText().toString().isEmpty() || s2q202.getText().toString() == null) {
            s2q202.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter household head age \r\n", Toast.LENGTH_LONG).show();
            s2q202.requestFocus();
            return false;
        } else {
            s2q202.setError(null);
        }

        rdo_s2q203 = radioS2q203.getCheckedRadioButtonId();

        if (rdo_s2q203 == -1) {
            rDOS2q2031.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS2q2031.requestFocus();
            return false;
        } else {
            rDOS2q2031.setError(null);
        }


        if (getS2q204().getText().toString().isEmpty() || s2q204.getText().toString() == null) {
            s2q204.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter years of schooling head of household \r\n", Toast.LENGTH_LONG).show();
            s2q204.requestFocus();
            return false;
        } else {
            s2q204.setError(null);
        }


        rdo_s2q205 = radioS2q205.getCheckedRadioButtonId();

        if (rdo_s2q205 == -1) {
            rDOS2q2051.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS2q2051.requestFocus();
            return false;
        } else {
            rDOS2q2051.setError(null);
        }


        switch (rdo_s2q205) {
            case R.id.RDO_s2q205_1:
                var_s2q205 = "1";
                break;

            case R.id.RDO_s2q205_2:
                var_s2q205 = "2";
                break;

            case R.id.RDO_s2q205_3:
                var_s2q205 = "3";
                break;

            case R.id.RDO_s2q205_4:
                var_s2q205 = "4";
                break;

            case R.id.RDO_s2q205_5:
                var_s2q205 = "5";
                break;

            case R.id.RDO_s2q205_6:
                var_s2q205 = "6";
                break;

            case R.id.RDO_s2q205_7:
                var_s2q205 = "7";
                break;

            case R.id.RDO_s2q205_8:
                var_s2q205 = "8";
                break;

            case R.id.RDO_s2q205_9:
                var_s2q205 = "9";
                break;

            case R.id.RDO_s2q205_10:
                var_s2q205 = "10";
                break;

            case R.id.RDO_s2q205_11:
                var_s2q205 = "11";
                break;

            case R.id.RDO_s2q205_12:
                var_s2q205 = "12";
                break;

            case R.id.RDO_s2q205_13:
                var_s2q205 = "13";
                break;
        }


        if (var_s2q205 == "10" && getS2q205oth().getText().toString().isEmpty() ||
                var_s2q205 == "10" && s2q205oth.getText().toString() == null) {
            s2q205oth.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify occupation if others \r\n", Toast.LENGTH_LONG).show();
            s2q205oth.requestFocus();
            return false;
        } else {
            s2q205oth.setError(null);
        }

        if (getS2q206a().getText().toString().isEmpty() || s2q206a.getText().toString() == null) {
            s2q206a.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter total number of members \r\n", Toast.LENGTH_LONG).show();
            s2q206a.requestFocus();
            return false;
        } else {
            s2q206a.setError(null);
        }


        if (getS2q206b().getText().toString().isEmpty()) {
            s2q206b.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter number of males \r\n", Toast.LENGTH_LONG).show();
            s2q206b.requestFocus();
            return false;
        } else {
            s2q206b.setError(null);
        }


        if (getS2q206c().getText().toString().isEmpty() || s2q206c.getText().toString() == null) {
            s2q206c.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter number of females \r\n", Toast.LENGTH_LONG).show();
            s2q206c.requestFocus();
            return false;
        } else {
            s2q206c.setError(null);
        }


        if (getS2q206d().getText().toString().isEmpty() || s2q206d.getText().toString() == null) {
            s2q206d.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter neonates 0 - 28 \r\n", Toast.LENGTH_LONG).show();
            s2q206d.requestFocus();
            return false;
        } else {
            s2q206d.setError(null);
        }

        if (getS2q206e().getText().toString().isEmpty() || s2q206e.getText().toString() == null) {
            s2q206e.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter children 1 - 5 years \r\n", Toast.LENGTH_LONG).show();
            s2q206e.requestFocus();
            return false;
        } else {
            s2q206e.setError(null);
        }


        if (getS2q206f().getText().toString().isEmpty() || s2q206f.getText().toString() == null) {
            s2q206f.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter children 5 - 14  \r\n", Toast.LENGTH_LONG).show();
            s2q206f.requestFocus();
            return false;
        } else {
            s2q206f.setError(null);
        }

        if (getS2q206g().getText().toString().isEmpty() || s2q206g.getText().toString() == null) {
            s2q206g.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter women of 15 - 49 \r\n", Toast.LENGTH_LONG).show();
            s2q206g.requestFocus();
            return false;
        } else {
            s2q206f.setError(null);
        }

        if (getS2q206h().getText().toString().isEmpty() || s2q206h.getText().toString() == null) {
            s2q206h.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter married women of 15 - 49 \r\n", Toast.LENGTH_LONG).show();
            s2q206h.requestFocus();
            return false;
        } else {
            s2q206h.setError(null);
        }


        if (Integer.parseInt(s2q202.getText().toString()) < 18 ||
                Integer.parseInt(s2q202.getText().toString()) > 99) {
            Toast.makeText(getApplicationContext(), "Head of household age must be between 18 - 99 \r\n", Toast.LENGTH_LONG).show();
            s2q202.requestFocus();
            return false;
        }


        if (Integer.parseInt(s2q204.getText().toString()) < 0
                && Integer.parseInt(s2q204.getText().toString()) != 91
                && Integer.parseInt(s2q204.getText().toString()) != 92
                || Integer.parseInt(s2q204.getText().toString()) > 16
                && Integer.parseInt(s2q204.getText().toString()) != 91
                && Integer.parseInt(s2q204.getText().toString()) != 92) {
            Toast.makeText(getApplicationContext(), "Years of schooling of head of household must be 0 - 16 or 91 or 92 \r\n", Toast.LENGTH_LONG).show();
            s2q204.requestFocus();
            return false;
        }


        int result = Integer.parseInt(s2q206b.getText().toString()) +
                Integer.parseInt(s2q206c.getText().toString()) +
                Integer.parseInt(s2q206d.getText().toString()) +
                Integer.parseInt(s2q206e.getText().toString()) +
                Integer.parseInt(s2q206f.getText().toString());

        if (!s2q206a.getText().toString().equals(String.valueOf(result))) {
            Toast.makeText(getApplicationContext(), "Total number of members mismatch \r\n", Toast.LENGTH_LONG).show();
            s2q206a.requestFocus();
            return false;
        }


        int result1 = Integer.parseInt(s2q206g.getText().toString()) + Integer.parseInt(s2q206h.getText().toString());


        if (Integer.parseInt(s2q206c.getText().toString()) != result1) {
            Toast.makeText(getApplicationContext(), "Total number of woman must be equal to the number of married and non married woman \r\n", Toast.LENGTH_LONG).show();
            s2q206c.requestFocus();
            return false;
        }


        return true;
    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        SRCApp.fc.setROW_GPS_LAT(GPSPref.getString("Latitude", "0"));
        SRCApp.fc.setROW_GPS_LANG(GPSPref.getString("Longitude", "0"));
        SRCApp.fc.setROW_GPS_ACC(GPSPref.getString("Accuracy", "0"));
        SRCApp.fc.setROW_GPS_ACC(GPSPref.getString(date, "0"));

        Log.d(TAG, "setGPS: " + GPSPref.getString("Latitude", "0") + "\n" + GPSPref.getString("Longitude", "0") + "\n" + GPSPref.getString("Accuracy", "0") + "\n" + GPSPref.getString(date, "0"));

        Toast.makeText(Section2Activity.this, "GPS set", Toast.LENGTH_SHORT).show();
    }

}
