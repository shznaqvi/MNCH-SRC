package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

public class Section3Activity extends Activity {

    private static final String TAG = "Sec3";
    public static JSONObject s1;
    public LinearLayout vu_s3q301f;
    public int wcount1;
    String var_s3q301d = "";
    String var_s3q301f1 = "";
    String var_s3q301f = "";
    String var_s3q301g = "";
    String var_s3q301h = "";
    String var_s3q301i = "";
    String var_s3q301j = "";
    private ScrollView scrollView01;
    private TextView appHeader;
    private TextView lblS3q301a;
    private TextView lblS3q301b;
    private TextView lblS3q301c;
    private TextView lblS3q301d;
    private RadioGroup radioS3q301d;
    private RadioButton rDOS3q301d1;
    private RadioButton rDOS3q301d2;
    private TextView lblS3q301e;
    private RadioGroup radioS3q301f1;
    private RadioButton rDOS3q301f11;
    private RadioButton rDOS3q301f12;
    private TextView lblS3q301f;
    private RadioGroup radioS3q301f;
    private RadioButton rDOS3q301f1;
    private RadioButton rDOS3q301f2;
    private RadioButton rDOS3q301f3;
    private RadioButton rDOS3q301f4;
    private int counter;
    private int sno;
    private TextView lblS3q301g;
    private TextView lblS3q301h;
    private RadioGroup radioS3q301h;
    private RadioButton rDOS3q301h1;
    private RadioButton rDOS3q301h2;
    private RadioGroup radioS3q301g;
    private RadioButton rDOS3q301g1;
    private RadioButton rDOS3q301g2;
    private RadioButton rDOS3q301g3;
    private TextView lblS3q301i;
    private RadioGroup radioS3q301i;
    private RadioButton rDOS3q301i1;
    private RadioButton rDOS3q301i2;
    private RadioButton rDOS3q301i3;
    private RadioButton rDOS3q301i4;
    private RadioButton rDOS3q301i5;
    private RadioButton rDOS3q301i6;
    private RadioButton rDOS3q301i7;
    private RadioButton rDOS3q301i8;
    private RadioButton rDOS3q301i9;
    private RadioButton rDOS3q301i10;
    private TextView lblS3q301j;
    private RadioGroup radioS3q301j;
    private RadioButton rDOS3q301j1;
    private RadioButton rDOS3q301j2;
    private RadioButton rDOS3q301j3;
    private RadioButton rDOS3q301j4;
    private RadioButton rDOS3q301j5;
    private RadioButton rDOS3q301j6;
    private RadioButton rDOS3q301j7;
    private RadioButton rDOS3q301j8;
    private TextView lblS3q301k;
    private Button btnnext;
    private Button btnadd;
    private LinearLayout vu_s3q301g;
    private LinearLayout vu_s3q301d;
    private LinearLayout vu_s3q301h;
    private LinearLayout vu_s3q301ioth;
    private LinearLayout vu_s3q301joth;
    private EditText s3q301a;
    private EditText s3q301b;
    private EditText s3q301c;
    private EditText s3q301e;
    private EditText s3q301g;
    private EditText s3q301k;
    private EditText s3q301ioth;
    private EditText s3q301joth;
    private TextView wcount;
    private int rdo_s3q301d;
    private int rdo_s3q301f1;
    private int rdo_s3q301f;
    private int rdo_s3q301g;
    private int rdo_s3q301h;
    private int rdo_s3q301i;
    private int rdo_s3q301j;
    private TextView lbl_hhhead;
    private TextView lbl_wcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section3);

        counter = 1;
        sno = 0;

        scrollView01 = (ScrollView) findViewById(R.id.ScrollView01);

        appHeader = (TextView) findViewById(R.id.app_header);
        appHeader.setText("SRC - > Section3");

        vu_s3q301g = (LinearLayout) findViewById(R.id.vu_s3q301g);
        vu_s3q301d = (LinearLayout) findViewById(R.id.vu_s3q301d);
        vu_s3q301h = (LinearLayout) findViewById(R.id.vu_s3q301h);
        vu_s3q301ioth = (LinearLayout) findViewById(R.id.vu_s3q301ioth);
        vu_s3q301joth = (LinearLayout) findViewById(R.id.vu_s3q301joth);


        lblS3q301a = (TextView) findViewById(R.id.lbl_s3q301a);
        lblS3q301b = (TextView) findViewById(R.id.lbl_s3q301b);
        lblS3q301c = (TextView) findViewById(R.id.lbl_s3q301c);
        lblS3q301d = (TextView) findViewById(R.id.lbl_s3q301d);
        radioS3q301d = (RadioGroup) findViewById(R.id.radio_s3q301d);
        rDOS3q301d1 = (RadioButton) findViewById(R.id.RDO_s3q301d_1);
        rDOS3q301d2 = (RadioButton) findViewById(R.id.RDO_s3q301d_2);
        lblS3q301e = (TextView) findViewById(R.id.lbl_s3q301e);
        lblS3q301f = (TextView) findViewById(R.id.lbl_s3q301f);

        radioS3q301f1 = (RadioGroup) findViewById(R.id.radio_s3q301f1);
        rDOS3q301f11 = (RadioButton) findViewById(R.id.RDO_s3q301f1_1);
        rDOS3q301f12 = (RadioButton) findViewById(R.id.RDO_s3q301f1_2);

        radioS3q301f = (RadioGroup) findViewById(R.id.radio_s3q301f);
        rDOS3q301f1 = (RadioButton) findViewById(R.id.RDO_s3q301f_1);
        rDOS3q301f2 = (RadioButton) findViewById(R.id.RDO_s3q301f_2);
        rDOS3q301f3 = (RadioButton) findViewById(R.id.RDO_s3q301f_3);
        rDOS3q301f4 = (RadioButton) findViewById(R.id.RDO_s3q301f_4);
        lblS3q301g = (TextView) findViewById(R.id.lbl_s3q301g);
        radioS3q301g = (RadioGroup) findViewById(R.id.radio_s3q301g);
        rDOS3q301g1 = (RadioButton) findViewById(R.id.RDO_s3q301g_1);
        rDOS3q301g2 = (RadioButton) findViewById(R.id.RDO_s3q301g_2);
        rDOS3q301g3 = (RadioButton) findViewById(R.id.RDO_s3q301g_3);
        lblS3q301h = (TextView) findViewById(R.id.lbl_s3q301h);
        radioS3q301h = (RadioGroup) findViewById(R.id.radio_s3q301h);
        rDOS3q301h1 = (RadioButton) findViewById(R.id.RDO_s3q301h_1);
        rDOS3q301h2 = (RadioButton) findViewById(R.id.RDO_s3q301h_2);
        lblS3q301i = (TextView) findViewById(R.id.lbl_s3q301i);
        radioS3q301i = (RadioGroup) findViewById(R.id.radio_s3q301i);
        rDOS3q301i1 = (RadioButton) findViewById(R.id.RDO_s3q301i_1);
        rDOS3q301i2 = (RadioButton) findViewById(R.id.RDO_s3q301i_2);
        rDOS3q301i3 = (RadioButton) findViewById(R.id.RDO_s3q301i_3);
        rDOS3q301i4 = (RadioButton) findViewById(R.id.RDO_s3q301i_4);
        rDOS3q301i5 = (RadioButton) findViewById(R.id.RDO_s3q301i_5);
        rDOS3q301i6 = (RadioButton) findViewById(R.id.RDO_s3q301i_6);
        rDOS3q301i7 = (RadioButton) findViewById(R.id.RDO_s3q301i_7);
        rDOS3q301i8 = (RadioButton) findViewById(R.id.RDO_s3q301i_8);
        rDOS3q301i9 = (RadioButton) findViewById(R.id.RDO_s3q301i_9);
        rDOS3q301i10 = (RadioButton) findViewById(R.id.RDO_s3q301i_10);
        lblS3q301j = (TextView) findViewById(R.id.lbl_s3q301j);
        radioS3q301j = (RadioGroup) findViewById(R.id.radio_s3q301j);
        rDOS3q301j1 = (RadioButton) findViewById(R.id.RDO_s3q301j_1);
        rDOS3q301j2 = (RadioButton) findViewById(R.id.RDO_s3q301j_2);
        rDOS3q301j3 = (RadioButton) findViewById(R.id.RDO_s3q301j_3);
        rDOS3q301j4 = (RadioButton) findViewById(R.id.RDO_s3q301j_4);
        rDOS3q301j5 = (RadioButton) findViewById(R.id.RDO_s3q301j_5);
        rDOS3q301j6 = (RadioButton) findViewById(R.id.RDO_s3q301j_6);
        rDOS3q301j7 = (RadioButton) findViewById(R.id.RDO_s3q301j_7);
        rDOS3q301j8 = (RadioButton) findViewById(R.id.RDO_s3q301j_8);
        lblS3q301k = (TextView) findViewById(R.id.lbl_s3q301k);
        s3q301ioth = (EditText) findViewById(R.id.s3q301ioth);
        s3q301joth = (EditText) findViewById(R.id.s3q301joth);

        s3q301a = (EditText) findViewById(R.id.s3q301a);
        s3q301b = (EditText) findViewById(R.id.s3q301b);
        s3q301c = (EditText) findViewById(R.id.s3q301c);
        s3q301e = (EditText) findViewById(R.id.s3q301e);
        s3q301k = (EditText) findViewById(R.id.s3q301k);
        s3q301ioth = (EditText) findViewById(R.id.s3q301ioth);
        s3q301joth = (EditText) findViewById(R.id.s3q301joth);
        vu_s3q301d = (LinearLayout) findViewById(R.id.vu_s3q301d);

        vu_s3q301f = (LinearLayout) findViewById(R.id.vu_s3q301f);
        //vu_s3q301f1 = (LinearLayout) findViewById(R.id.vu_s3q301f1);
        vu_s3q301g = (LinearLayout) findViewById(R.id.vu_s3q301g);

        btnnext = (Button) findViewById(R.id.btnnext);
        //btnadd = (Button) findViewById(R.id.btnadd);
        lbl_wcount = (TextView) findViewById(R.id.lbl_wcount);
        wcount = (TextView) findViewById(R.id.wcount);

        CVars var = new CVars();

        lbl_hhhead = (TextView) findViewById(R.id.lbl_hhhead);
        //lbl_hhhead.setText(var.GetHHNO() + "-" + var.GetHHCode());


        //lbl_wcount.setText("Total Reproductive Woman : " + var.GetReproductionAgeWoman());
        wcount.setText(var.GetHHNO() + "-" + var.GetHHCode() + " " + "(" + "Woman " + SRCApp.tcount + " of " + var.GetReproductionAgeWoman() + ")");
        //wcount.setTextColor(Color.RED);
        //wcount1 = Integer.parseInt(wcount.getText().toString());

        if (SRCApp.tcount < var.GetReproductionAgeWoman()) {
            btnnext.setVisibility(View.VISIBLE);
            btnnext.setText("Add Woman");

        } else if (SRCApp.tcount == var.GetReproductionAgeWoman()) {
            btnnext.setText("Section 4");
        }

        //btnnext.setEnabled(false);

//        Checking Married Women

        //CVars var = new CVars();
        if (var.GetReproductionAgeWoman() == 0) {
            startActivity(new Intent(Section3Activity.this, Section4Activity.class));
        }
//

        // ================ Q 3.01d If lady is pregnant ask gestational Age ====================
        radioS3q301d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == rDOS3q301d1.getId()) {
                    vu_s3q301d.setVisibility(View.VISIBLE);

                    radioS3q301f1.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(s3q301e.getWindowToken(), 0);

                } else {

                    vu_s3q301d.setVisibility(View.GONE);
                    radioS3q301f1.clearCheck();
                    s3q301e.setText(null);

                }
            }
        });

        // ==================  Q 3.01f If lady was pregnant in last two years Probe: ==============
        radioS3q301f1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rDOS3q301f12.getId()) {

                    vu_s3q301f.setVisibility(View.GONE);
                    radioS3q301f.clearCheck();
                    radioS3q301g.clearCheck();
                    radioS3q301h.clearCheck();
                    radioS3q301i.clearCheck();
                    s3q301ioth.setText(null);
                    radioS3q301j.clearCheck();
                    s3q301joth.setText(null);
                    s3q301k.setText(null);

                } else {

                    vu_s3q301f.setVisibility(View.VISIBLE);


                }
            }
        });

        // ==================  Q 3.01f Outcome ==============

        radioS3q301f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rDOS3q301f1.getId()) {

                    vu_s3q301h.setVisibility(View.GONE);
                    vu_s3q301g.setVisibility(View.GONE);

                    radioS3q301h.clearCheck();
                    radioS3q301g.clearCheck();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(radioS3q301i.getWindowToken(), 0);

                } else if (checkedId == rDOS3q301f2.getId()) {

                    vu_s3q301h.setVisibility(View.GONE);
                    vu_s3q301g.setVisibility(View.GONE);

                    radioS3q301h.clearCheck();
                    radioS3q301g.clearCheck();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(radioS3q301i.getWindowToken(), 0);

                } else if (checkedId == rDOS3q301f3.getId()) {

                    vu_s3q301h.setVisibility(View.VISIBLE);
                    vu_s3q301g.setVisibility(View.GONE);

                    radioS3q301g.clearCheck();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(radioS3q301h.getWindowToken(), 0);

                } else if (checkedId == rDOS3q301f4.getId()) {

                    vu_s3q301g.setVisibility(View.VISIBLE);
                    vu_s3q301h.setVisibility(View.GONE);

                    radioS3q301h.clearCheck();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(radioS3q301g.getWindowToken(), 0);
                }

            }
        });

        // ==================  Q 3.01g If outcome was Live Birth ==============

        radioS3q301g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == rDOS3q301g2.getId() || checkedId == rDOS3q301g3.getId()) {

                    vu_s3q301h.setVisibility(View.VISIBLE);

                } else {


                    vu_s3q301h.setVisibility(View.GONE);
                    radioS3q301h.clearCheck();

                }

            }
        });


        radioS3q301i.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == rDOS3q301i10.getId()) {

                    vu_s3q301ioth.setVisibility(View.VISIBLE);

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(s3q301ioth.getWindowToken(), 0);

                } else {
                    vu_s3q301ioth.setVisibility(View.GONE);
                    s3q301ioth.setText(null);
                }
            }
        });


        radioS3q301j.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == rDOS3q301j8.getId()) {

                    vu_s3q301joth.setVisibility(View.VISIBLE);

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(s3q301joth.getWindowToken(), 0);

                } else {
                    vu_s3q301joth.setVisibility(View.GONE);
                    s3q301joth.setText(null);
                }
            }
        });

    }

    private EditText getS3q301a() {
        return (EditText) findViewById(R.id.s3q301a);
    }

    private EditText getS3q301b() {
        return (EditText) findViewById(R.id.s3q301b);
    }

    private EditText getS3q301c() {
        return (EditText) findViewById(R.id.s3q301c);
    }

    private EditText getS3q301e() {
        return (EditText) findViewById(R.id.s3q301e);
    }

    private EditText getS3q301ioth() {
        return (EditText) findViewById(R.id.s3q301ioth);
    }

    private EditText getS3q301joth() {
        return (EditText) findViewById(R.id.s3q301joth);
    }

    private EditText getS3q301k() {
        return (EditText) findViewById(R.id.s3q301k);
    }


    public void AddWoman(View view) {

        //CVars var = new CVars();

        Log.d(TAG, "counter: " + counter);
        //Log.d(TAG, "getwoman: " + var.GetReproductionAgeWoman());


            if (ValidateForm()) {

                SaveDraft();

                if (UpdateDB()) {
                    //counter++;
                    //SRCApp.tcount++;

                    Intent fA = new Intent(this, Section3Activity.class);
                    startActivity(fA);

                    //s3q301a.requestFocus();


                    } else {
                        Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
                    }
                }
            }





    public void gotoSection4(View view) {

        CVars var = new CVars();
        if (ValidateForm()) {
            for (int i = 1; i <= var.GetReproductionAgeWoman(); i++) {
                if (var.GetReproductionAgeWoman() >= SRCApp.tcount) {
                    SRCApp.tcount++;
                    AddWoman(view);
                } else {
                    break;
                }
            }
        }
        if (ValidateForm()) {
            SaveDraft();
            if (UpdateDB()) {
                Intent sec4_intent = new Intent(this, Section4Activity.class);
                startActivity(sec4_intent);
            }
        } else {
            Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
        }

    }


    // ============== Update DB================
    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);
        Long rowId = db.InsertRecord_Section3(SRCApp.sc3);
        return true;
    }


    // ============== Form Saving================

    private boolean SaveDraft() {

        SRCApp.sc3 = new Sec3Contract();

        try {

            CVars var = new CVars();

            SRCApp.sc3.setROW_DEVID(SRCApp.DEVID);
            SRCApp.sc3.setROW_UID(SRCApp.uid);

            SRCApp.sc3.setROW_FORM_ID(var.GetHHNO());
            SRCApp.sc3.setROW_HHCODE(var.GetHHCode());

            SRCApp.sc3.set_s3q301a(s3q301a.getText().toString());
            SRCApp.sc3.set_s3q301b(s3q301b.getText().toString());
            SRCApp.sc3.set_s3q301c(s3q301c.getText().toString());


            if (sno == 0) {
                SRCApp.sc3.setROW_SNO("1");
                sno = 1;
            } else {

                SRCDBHelper db = new SRCDBHelper(this);

                sno = db.getSNO();

                Log.d(TAG, "sno: " + sno);
                SRCApp.sc3.setROW_SNO(String.valueOf(sno + 1));
            }


            rdo_s3q301d = radioS3q301d.getCheckedRadioButtonId();

            switch (rdo_s3q301d) {
                case R.id.RDO_s3q301d_1:
                    var_s3q301d = "1";
                    break;

                case R.id.RDO_s3q301d_2:
                    var_s3q301d = "2";
                    break;
            }

            SRCApp.sc3.set_s3q301d(var_s3q301d);


            rdo_s3q301f1 = radioS3q301f1.getCheckedRadioButtonId();

            switch (rdo_s3q301f1) {
                case R.id.RDO_s3q301f1_1:
                    var_s3q301f1 = "1";
                    break;

                case R.id.RDO_s3q301f1_2:
                    var_s3q301f1 = "2";
                    break;
            }

            SRCApp.sc3.set_s3q301f1(var_s3q301f1);


            SRCApp.sc3.set_s3q301e(s3q301e.getText().toString());


            rdo_s3q301f = radioS3q301f.getCheckedRadioButtonId();

            switch (rdo_s3q301f) {
                case R.id.RDO_s3q301f_1:
                    var_s3q301f = "1";
                    break;

                case R.id.RDO_s3q301f_2:
                    var_s3q301f = "2";
                    break;

                case R.id.RDO_s3q301f_3:
                    var_s3q301f = "3";
                    break;

                case R.id.RDO_s3q301f_4:
                    var_s3q301f = "4";
                    break;
            }


            SRCApp.sc3.set_s3q301f(var_s3q301f);


            rdo_s3q301g = radioS3q301g.getCheckedRadioButtonId();

            switch (rdo_s3q301g) {
                case R.id.RDO_s3q301g_1:
                    var_s3q301g = "1";
                    break;

                case R.id.RDO_s3q301g_2:
                    var_s3q301g = "2";
                    break;
            }


            SRCApp.sc3.set_s3q301g(var_s3q301g);

            rdo_s3q301h = radioS3q301h.getCheckedRadioButtonId();

            switch (rdo_s3q301h) {
                case R.id.RDO_s3q301h_1:
                    var_s3q301h = "1";
                    break;

                case R.id.RDO_s3q301h_2:
                    var_s3q301h = "2";
                    break;
            }


            SRCApp.sc3.set_s3q301h(var_s3q301h);


            rdo_s3q301i = radioS3q301i.getCheckedRadioButtonId();

            switch (rdo_s3q301i) {
                case R.id.RDO_s3q301i_1:
                    var_s3q301i = "1";
                    break;

                case R.id.RDO_s3q301i_2:
                    var_s3q301i = "2";
                    break;

                case R.id.RDO_s3q301i_3:
                    var_s3q301i = "3";
                    break;

                case R.id.RDO_s3q301i_4:
                    var_s3q301i = "4";
                    break;

                case R.id.RDO_s3q301i_5:
                    var_s3q301i = "5";
                    break;

                case R.id.RDO_s3q301i_6:
                    var_s3q301i = "6";
                    break;

                case R.id.RDO_s3q301i_7:
                    var_s3q301i = "7";
                    break;

                case R.id.RDO_s3q301i_8:
                    var_s3q301i = "8";
                    break;

                case R.id.RDO_s3q301i_9:
                    var_s3q301i = "9";
                    break;

                case R.id.RDO_s3q301i_10:
                    var_s3q301i = "10";
                    break;
            }


            SRCApp.sc3.set_s3q301h(var_s3q301h);


            rdo_s3q301j = radioS3q301j.getCheckedRadioButtonId();

            switch (rdo_s3q301j) {
                case R.id.RDO_s3q301j_1:
                    var_s3q301j = "1";
                    break;

                case R.id.RDO_s3q301j_2:
                    var_s3q301j = "2";
                    break;

                case R.id.RDO_s3q301j_3:
                    var_s3q301j = "3";
                    break;

                case R.id.RDO_s3q301j_4:
                    var_s3q301j = "4";
                    break;

                case R.id.RDO_s3q301j_5:
                    var_s3q301j = "5";
                    break;

                case R.id.RDO_s3q301j_6:
                    var_s3q301j = "6";
                    break;

                case R.id.RDO_s3q301j_7:
                    var_s3q301j = "7";
                    break;

                case R.id.RDO_s3q301j_8:
                    var_s3q301j = "8";
                    break;
            }

            SRCApp.sc3.set_s3q301j(var_s3q301j);


        } catch (Exception e) {

        }

        return true;
    }


    // ============= Form Validation===============
    private boolean ValidateForm() {
        //Toast.makeText(getApplicationContext(), "Validating Form", Toast.LENGTH_SHORT).show();

        if (getS3q301a().getText().toString().isEmpty()) {
            s3q301a.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter name of a married woman \r\n", Toast.LENGTH_LONG).show();
            s3q301a.requestFocus();
            return false;
        } else {
            s3q301a.setError(null);
        }

        if (getS3q301b().getText().toString().isEmpty()) {
            s3q301b.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter age in years \r\n", Toast.LENGTH_LONG).show();
            s3q301b.requestFocus();
            return false;
        } else {
            s3q301b.setError(null);
        }

        //Age Limit

        if ((Integer.parseInt(s3q301b.getText().toString()) < 15)
                || Integer.parseInt(s3q301b.getText().toString()) > 49) {
            s3q301b.setError("Age Limit should be 15 to 49");
            Toast.makeText(getApplicationContext(), "Please enter age in 15-49 years \r\n", Toast.LENGTH_LONG).show();
            s3q301b.requestFocus();
            return false;
        } else {
            s3q301b.setError(null);
        }

        if (getS3q301c().getText().toString().isEmpty()) {
            s3q301c.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter education status \r\n", Toast.LENGTH_LONG).show();
            s3q301c.requestFocus();
            return false;
        } else {
            s3q301c.setError(null);
        }


        rdo_s3q301d = radioS3q301d.getCheckedRadioButtonId();

        switch (rdo_s3q301d) {
            case R.id.RDO_s3q301d_1:
                var_s3q301d = "1";
                break;

            case R.id.RDO_s3q301d_2:
                var_s3q301d = "2";
                break;
        }


        if (rdo_s3q301d == -1) {
            rDOS3q301d1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS3q301d1.requestFocus();
            return false;
        } else {
            rDOS3q301d1.setError(null);
        }


        rdo_s3q301f1 = radioS3q301f1.getCheckedRadioButtonId();

        switch (rdo_s3q301f1) {
            case R.id.RDO_s3q301f1_1:
                var_s3q301f1 = "1";
                break;

            case R.id.RDO_s3q301f1_2:
                var_s3q301f1 = "2";
                break;
        }


            if (rdo_s3q301f1 == -1) {
                rDOS3q301f11.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
                rDOS3q301f11.requestFocus();
                return false;
            } else {
                rDOS3q301f11.setError(null);
            }


        if (var_s3q301d.equals("1")) {
            if (var_s3q301f1.equals("1") && getS3q301e().getText().toString().isEmpty() || var_s3q301f1.equals("1")) {
                s3q301e.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please enter gestational age \r\n", Toast.LENGTH_LONG).show();
                s3q301e.requestFocus();
                return false;
            } else {
                s3q301e.setError(null);
            }
        }


        rdo_s3q301f = radioS3q301f.getCheckedRadioButtonId();

        switch (rdo_s3q301f) {
            case R.id.RDO_s3q301f_1:
                var_s3q301f = "1";
                break;

            case R.id.RDO_s3q301f_2:
                var_s3q301f = "2";
                break;

            case R.id.RDO_s3q301f_3:
                var_s3q301f = "3";
                break;

            case R.id.RDO_s3q301f_4:
                var_s3q301f = "4";
                break;
        }

        if (rDOS3q301f11.isChecked()) {

            if (rdo_s3q301f == -1) {
                rDOS3q301f1.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
                rDOS3q301f1.requestFocus();
                return false;
            } else {
                rDOS3q301f1.setError(null);
            }


            var_s3q301g = "";

            rdo_s3q301g = radioS3q301g.getCheckedRadioButtonId();

            switch (rdo_s3q301g) {
                case R.id.RDO_s3q301g_1:
                    var_s3q301g = "1";
                    break;

                case R.id.RDO_s3q301g_2:
                    var_s3q301g = "2";
                    break;
            }


            if (var_s3q301f.equals("4") && rdo_s3q301g == -1) {
                rDOS3q301g1.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
                rDOS3q301g1.requestFocus();
                return false;
            } else {
                rDOS3q301g1.setError(null);
            }


            var_s3q301h = "";

            rdo_s3q301h = radioS3q301h.getCheckedRadioButtonId();

            switch (rdo_s3q301h) {
                case R.id.RDO_s3q301h_1:
                    var_s3q301h = "1";
                    break;

                case R.id.RDO_s3q301h_2:
                    var_s3q301h = "2";
                    break;
            }

            if (var_s3q301f.equals("3") && rdo_s3q301h == -1) {

                rDOS3q301h1.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
                rDOS3q301h1.requestFocus();
                return false;

            } else {
                rDOS3q301h1.setError(null);
            }


            rdo_s3q301i = radioS3q301i.getCheckedRadioButtonId();

            switch (rdo_s3q301i) {
                case R.id.RDO_s3q301i_1:
                    var_s3q301i = "1";
                    break;

                case R.id.RDO_s3q301i_2:
                    var_s3q301i = "2";
                    break;

                case R.id.RDO_s3q301i_3:
                    var_s3q301i = "3";
                    break;

                case R.id.RDO_s3q301i_4:
                    var_s3q301i = "4";
                    break;

                case R.id.RDO_s3q301i_5:
                    var_s3q301i = "5";
                    break;

                case R.id.RDO_s3q301i_6:
                    var_s3q301i = "6";
                    break;

                case R.id.RDO_s3q301i_7:
                    var_s3q301i = "7";
                    break;

                case R.id.RDO_s3q301i_8:
                    var_s3q301i = "8";
                    break;

                case R.id.RDO_s3q301i_9:
                    var_s3q301i = "9";
                    break;

                case R.id.RDO_s3q301i_10:
                    var_s3q301i = "10";
                    break;
            }


            if (var_s3q301i.equals("")) {
                rDOS3q301i1.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
                rDOS3q301i1.requestFocus();
                return false;
            } else {
                rDOS3q301i1.setError(null);
            }


            if (var_s3q301i.equals("10") && getS3q301ioth().getText().toString().isEmpty()) {
                s3q301ioth.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please specify place of delivery if others  \r\n", Toast.LENGTH_LONG).show();
                s3q301ioth.requestFocus();
                return false;
            } else {
                s3q301ioth.setError(null);
            }


            rdo_s3q301j = radioS3q301j.getCheckedRadioButtonId();

            switch (rdo_s3q301j) {
                case R.id.RDO_s3q301j_1:
                    var_s3q301j = "1";
                    break;

                case R.id.RDO_s3q301j_2:
                    var_s3q301j = "2";
                    break;

                case R.id.RDO_s3q301j_3:
                    var_s3q301j = "3";
                    break;

                case R.id.RDO_s3q301j_4:
                    var_s3q301j = "4";
                    break;

                case R.id.RDO_s3q301j_5:
                    var_s3q301j = "5";
                    break;

                case R.id.RDO_s3q301j_6:
                    var_s3q301j = "6";
                    break;

                case R.id.RDO_s3q301j_7:
                    var_s3q301j = "7";
                    break;

                case R.id.RDO_s3q301j_8:
                    var_s3q301j = "8";
                    break;
            }


            if (rdo_s3q301j == -1) {
                rDOS3q301j1.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
                rDOS3q301j1.requestFocus();
                return false;
            } else {
                rDOS3q301j1.setError(null);
            }


            if (var_s3q301j.equals("8") && getS3q301joth().getText().toString().isEmpty()) {
                s3q301joth.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please specify delivery conducted by if others  \r\n", Toast.LENGTH_LONG).show();
                s3q301joth.requestFocus();
                return false;
            } else {
                s3q301joth.setError(null);
            }


            if (getS3q301k().getText().toString().isEmpty()) {
                s3q301k.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please specify cost of delivery  \r\n", Toast.LENGTH_LONG).show();
                s3q301k.requestFocus();
                return false;
            } else {
                s3q301k.setError(null);
            }


            if (s3q301e.getText().toString().isEmpty()) {

            } else {
                if (Integer.parseInt(s3q301e.getText().toString()) <= 2 || Integer.parseInt(s3q301e.getText().toString()) > 43) {
                    Toast.makeText(getApplicationContext(), "Gestational age must be 3 - 44 weeks \r\n", Toast.LENGTH_LONG).show();
                    s3q301e.requestFocus();
                    return false;
                }
            }


            if (Integer.parseInt(s3q301c.getText().toString()) == 0
                    && Integer.parseInt(s3q301c.getText().toString()) != 91
                    && Integer.parseInt(s3q301c.getText().toString()) != 92
                    || Integer.parseInt(s3q301c.getText().toString()) > 16
                    && Integer.parseInt(s3q301c.getText().toString()) != 91
                    && Integer.parseInt(s3q301c.getText().toString()) != 92) {
                s3q301c.requestFocus();
                Toast.makeText(getApplicationContext(), "Years of schooling of woman must be 0 - 16 or 91 or 92 \r\n", Toast.LENGTH_LONG).show();
                s3q301c.setError("Years of schooling of woman must be 0 - 16 or 91 or 92");
                return false;
            } else {
                s3q301c.setError(null);
            }


        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}