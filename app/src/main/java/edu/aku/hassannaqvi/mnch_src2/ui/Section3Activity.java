package edu.aku.hassannaqvi.mnch_src2.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import edu.aku.hassannaqvi.mnch_src2.R;
import edu.aku.hassannaqvi.mnch_src2.contract.BLRandomContract;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec3Contract;
import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;
import edu.aku.hassannaqvi.mnch_src2.core.SRCDBHelper;
import edu.aku.hassannaqvi.mnch_src2.other.CVars;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;

public class Section3Activity extends AppCompatActivity {

    private static final String TAG = "Sec3";
    public static JSONObject s1;
    public LinearLayout vu_s3q301f;
    public int wcount1;
    public DatePickerInputEditText s3q301h_dod;
    String var_s3q301d = "";
    String var_s3q301f1 = "";
    String var_s3q301f = "";
    String var_s3q301g = "";
    String var_s3q301h = "";
    String var_s3q301i = "";
    String var_s3q301j = "";
    String dateToday;
    String maxDateyear;
    ArrayList<String> mwraNames;
    Map<String, BLRandomContract> mwraMap;
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
    private RadioButton rDOS3q301h3;
    private RadioButton rDOS3q301h4;
    private RadioButton rDOS3q301h5;
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
    private Spinner s3q301a;
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


        s3q301h_dod = findViewById(R.id.s3q301h_dod);
        s3q301h_dod.setManager(getSupportFragmentManager());
        s3q301h_dod.setMaxDate(dateToday);
        s3q301h_dod.setMinDate(maxDateyear);


        scrollView01 = findViewById(R.id.ScrollView01);

        appHeader = findViewById(R.id.app_header);
        appHeader.setText(getString(R.string.sec3) + " (" + SRCApp.mwCount + " of " + SRCApp.mwras + ")");

        vu_s3q301g = findViewById(R.id.vu_s3q301g);
        vu_s3q301d = findViewById(R.id.vu_s3q301d);
        vu_s3q301h = findViewById(R.id.vu_s3q301h);
        vu_s3q301ioth = findViewById(R.id.vu_s3q301ioth);
        vu_s3q301joth = findViewById(R.id.vu_s3q301joth);


        lblS3q301a = findViewById(R.id.lbl_s3q301a);
        lblS3q301b = findViewById(R.id.lbl_s3q301b);
        lblS3q301c = findViewById(R.id.lbl_s3q301c);
        lblS3q301d = findViewById(R.id.lbl_s3q301d);
        radioS3q301d = findViewById(R.id.radio_s3q301d);
        rDOS3q301d1 = findViewById(R.id.RDO_s3q301d_1);
        rDOS3q301d2 = findViewById(R.id.rDOS3q301d2);
        lblS3q301e = findViewById(R.id.lbl_s3q301e);
        lblS3q301f = findViewById(R.id.lbl_s3q301f);

        radioS3q301f1 = findViewById(R.id.radio_s3q301f1);
        rDOS3q301f11 = findViewById(R.id.RDO_s3q301f1_1);
        rDOS3q301f12 = findViewById(R.id.RDO_s3q301f1_2);

        radioS3q301f = findViewById(R.id.radio_s3q301f);
        rDOS3q301f1 = findViewById(R.id.RDO_s3q301f_1);
        rDOS3q301f2 = findViewById(R.id.RDO_s3q301f_2);
        rDOS3q301f3 = findViewById(R.id.RDO_s3q301f_3);
        rDOS3q301f4 = findViewById(R.id.RDO_s3q301f_4);
        lblS3q301g = findViewById(R.id.lbl_s3q301g);
        radioS3q301g = findViewById(R.id.radio_s3q301g);
        rDOS3q301g1 = findViewById(R.id.RDO_s3q301g_1);
        rDOS3q301g2 = findViewById(R.id.RDO_s3q301g_2);
        rDOS3q301g3 = findViewById(R.id.RDO_s3q301g_3);
        lblS3q301h = findViewById(R.id.lbl_s3q301h);
        radioS3q301h = findViewById(R.id.radio_s3q301h);
        rDOS3q301h1 = findViewById(R.id.RDO_s3q301h_1);
        rDOS3q301h2 = findViewById(R.id.RDO_s3q301h_2);
        rDOS3q301h3 = findViewById(R.id.RDO_s3q301h_3);
        rDOS3q301h4 = findViewById(R.id.RDO_s3q301h_4);
        rDOS3q301h5 = findViewById(R.id.RDO_s3q301h_5);
        lblS3q301i = findViewById(R.id.lbl_s3q301i);
        radioS3q301i = findViewById(R.id.radio_s3q301i);
        rDOS3q301i1 = findViewById(R.id.RDO_s3q301i_1);
        rDOS3q301i2 = findViewById(R.id.RDO_s3q301i_2);
        rDOS3q301i3 = findViewById(R.id.RDO_s3q301i_3);
        rDOS3q301i4 = findViewById(R.id.RDO_s3q301i_4);
        rDOS3q301i5 = findViewById(R.id.RDO_s3q301i_5);
        rDOS3q301i6 = findViewById(R.id.RDO_s3q301i_6);
        rDOS3q301i7 = findViewById(R.id.RDO_s3q301i_7);
        rDOS3q301i8 = findViewById(R.id.RDO_s3q301i_8);
        rDOS3q301i9 = findViewById(R.id.RDO_s3q301i_9);
        rDOS3q301i10 = findViewById(R.id.RDO_s3q301i_10);
        lblS3q301j = findViewById(R.id.lbl_s3q301j);
        radioS3q301j = findViewById(R.id.radio_s3q301j);
        rDOS3q301j1 = findViewById(R.id.RDO_s3q301j_1);
        rDOS3q301j2 = findViewById(R.id.RDO_s3q301j_2);
        rDOS3q301j3 = findViewById(R.id.RDO_s3q301j_3);
        rDOS3q301j4 = findViewById(R.id.RDO_s3q301j_4);
        rDOS3q301j5 = findViewById(R.id.RDO_s3q301j_5);
        rDOS3q301j6 = findViewById(R.id.RDO_s3q301j_6);
        rDOS3q301j7 = findViewById(R.id.RDO_s3q301j_7);
        rDOS3q301j8 = findViewById(R.id.RDO_s3q301j_8);
        lblS3q301k = findViewById(R.id.lbl_s3q301k);
        s3q301ioth = findViewById(R.id.s3q301ioth);
        s3q301joth = findViewById(R.id.s3q301joth);

        s3q301a = findViewById(R.id.s3q301a);
        s3q301b = findViewById(R.id.s3q301b);
        s3q301c = findViewById(R.id.s3q301c);
        s3q301e = findViewById(R.id.s3q301e);
        s3q301k = findViewById(R.id.s3q301k);
        s3q301ioth = findViewById(R.id.s3q301ioth);
        s3q301joth = findViewById(R.id.s3q301joth);
        vu_s3q301d = findViewById(R.id.vu_s3q301d);

        vu_s3q301f = findViewById(R.id.vu_s3q301f);
        //vu_s3q301f1 = (LinearLayout) findViewById(R.id.vu_s3q301f1);
        vu_s3q301g = findViewById(R.id.vu_s3q301g);

//        btnnext = (Button) findViewById(R.id.btnnext);
//        btnadd = (Button) findViewById(R.id.btnadd);

        lbl_wcount = findViewById(R.id.lbl_wcount);
        wcount = findViewById(R.id.wcount);

        CVars var = new CVars();

        lbl_hhhead = findViewById(R.id.lbl_hhhead);


        // ================ Q 3.01d If lady is pregnant ask gestational Age ====================
        radioS3q301d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == rDOS3q301d1.getId()) {
                    vu_s3q301d.setVisibility(View.VISIBLE);


                } else {

                    vu_s3q301d.setVisibility(View.GONE);
                    s3q301e.setText(null);

                }
            }
        });

        // ==================  Q 3.01f If lady was pregnant in last two years Probe: ==============
        radioS3q301f1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radioS3q301f.clearCheck();
                radioS3q301g.clearCheck();
                radioS3q301h.clearCheck();
                radioS3q301i.clearCheck();
                s3q301ioth.setText(null);
                radioS3q301j.clearCheck();
                s3q301joth.setText(null);
                s3q301k.setText(null);

                if (rDOS3q301f12.isChecked()) {

                    vu_s3q301f.setVisibility(View.GONE);

                } else {

                    vu_s3q301f.setVisibility(View.VISIBLE);


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


        //Question f

        radioS3q301f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radioS3q301h.clearCheck();
                radioS3q301g.clearCheck();

                if (rDOS3q301f1.isChecked() || rDOS3q301f2.isChecked()) {

                    vu_s3q301h.setVisibility(View.GONE);
                    vu_s3q301g.setVisibility(View.GONE);

                } else if (rDOS3q301f3.isChecked()) {

                    vu_s3q301h.setVisibility(View.VISIBLE);
                    vu_s3q301g.setVisibility(View.GONE);

                    rDOS3q301h1.setEnabled(true);
                    rDOS3q301h2.setEnabled(true);

                    rDOS3q301h3.setEnabled(false);
                    rDOS3q301h4.setEnabled(false);
                    rDOS3q301h5.setEnabled(false);
                } else if (rDOS3q301f4.isChecked()) {

                    vu_s3q301h.setVisibility(View.GONE);
                    vu_s3q301g.setVisibility(View.VISIBLE);

                    rDOS3q301h3.setEnabled(true);
                    rDOS3q301h4.setEnabled(true);
                    rDOS3q301h5.setEnabled(true);

                    rDOS3q301h1.setEnabled(false);
                    rDOS3q301h2.setEnabled(false);
                }
            }
        });


        radioS3q301g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radioS3q301h.clearCheck();

                if (rDOS3q301g1.isChecked()) {
                    vu_s3q301h.setVisibility(View.GONE);
                } else if (rDOS3q301g2.isChecked()) {
                    vu_s3q301h.setVisibility(View.VISIBLE);

                    rDOS3q301h1.setEnabled(true);
                    rDOS3q301h2.setEnabled(true);

                    rDOS3q301h3.setEnabled(false);
                    rDOS3q301h4.setEnabled(false);
                    rDOS3q301h5.setEnabled(false);
                } else if (rDOS3q301g3.isChecked()) {
                    vu_s3q301h.setVisibility(View.VISIBLE);

                    rDOS3q301h3.setEnabled(true);
                    rDOS3q301h4.setEnabled(true);
                    rDOS3q301h5.setEnabled(true);

                    rDOS3q301h1.setEnabled(false);
                    rDOS3q301h2.setEnabled(false);
                }
            }
        });


//        Setting Spinner

        mwraNames = new ArrayList<>();
        mwraMap = new HashMap<>();

        mwraNames.add("....");

        int index = 0;
        for (BLRandomContract rand : SRCApp.blRandomized) {
            if (SRCApp.selectedPos != index) {
                mwraNames.add(rand.getMwname());
                mwraMap.put(rand.getMwname(), rand);
            }
            index++;
        }

        s3q301a.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, mwraNames));

        s3q301a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                SRCApp.selectedPos = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    private Spinner getS3q301a() {
        return (Spinner) findViewById(R.id.s3q301a);
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



    public void NextSection(View view) {


        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                if (SRCApp.mwCount < SRCApp.mwras) {
                    Intent sec3_intent = new Intent(this, Section3Activity.class);
                    SRCApp.mwCount++;
                    startActivity(sec3_intent);
                } else if (SRCApp.mdCount < SRCApp.mdTotal) {

                    SRCApp.selectedPos = -1;

                    Intent sec4_intent = new Intent(this, Section4Activity.class);
                    SRCApp.mdCount++;
                    startActivity(sec4_intent);
                } else if (SRCApp.cmCount < SRCApp.cmTotal) {

                    SRCApp.selectedPos = -1;

                    Intent sec4b_intent = new Intent(this, Section4bActivity.class);
                    SRCApp.cmCount++;
                    startActivity(sec4b_intent);
                } else if (SRCApp.selectedMWRAs.size() > 0) {

                    SRCApp.selectedPos = -1;

                    Intent sec5_intent = new Intent(this, Section5Activity.class);
                    startActivity(sec5_intent);
                } else {

                    SRCApp.selectedPos = -1;

                    Intent sec5_intent = new Intent(this, Section6Activity.class);
                    startActivity(sec5_intent);
                }
            }
        } else {
            Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();

        }
    }


    // ============== Update DB================
    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);
        SRCApp.sc3.set_ID(db.InsertRecord_Section3(SRCApp.sc3));
        SRCApp.sc3.setROW_UID(SRCApp.sc3.getROW_DEVID() + SRCApp.sc3.get_ID().toString());
        db.updateSec3UID();

        return true;
    }


    // ============== Form Saving================

    private boolean SaveDraft() throws JSONException {

        SRCApp.sc3 = new Sec3Contract();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        SRCApp.sc3.setTagID(sharedPref.getString("tagName", null));
        SRCApp.sc3.setVersion(SRCApp.versionName + "." + SRCApp.versionCode);

        SRCApp.sc3.setROW_DEVID(SRCApp.DEVID);
        SRCApp.sc3.setROW_UUID(SRCApp.fc.getROW_UUID());
        SRCApp.sc3.setROW_FORM_DATE(SRCApp.fc.getROW_ENTRYDATE());
        SRCApp.sc3.setHHNO(SRCApp.hhno);
        SRCApp.sc3.setROW_USERID(SRCApp.fc.getROW_USERID());


        JSONObject s3 = new JSONObject();

        BLRandomContract selectedRand = mwraMap.get(s3q301a.getSelectedItem().toString());

        s3.put("s3q301a", selectedRand.getMwname());
        s3.put("s3q301a_luid", selectedRand.getLUID());
        s3.put("s3q301a_village", selectedRand.getSubVillageCode());
        s3.put("s3q301a_structure", selectedRand.getStructure());
        s3.put("s3q301a_sno", selectedRand.getSno());
        s3.put("s3q301a_rndDT", selectedRand.getRandomDT());
        s3.put("s3q301a_ID", selectedRand.get_ID());

        if (rDOS3q301f11.isChecked()) {
            SRCApp.selectedMWRAs.add(selectedRand);
        }

        s3.put("s3q301b", s3q301b.getText().toString());
        s3.put("s3q301c", s3q301c.getText().toString());
        s3.put("s3q301d", rDOS3q301d1.isChecked() ? "1"
                : rDOS3q301d2.isChecked() ? "2" : "0");
        s3.put("s3q301e", s3q301e.getText().toString());
        s3.put("s3q301f1", rDOS3q301f11.isChecked() ? "1"
                : rDOS3q301f12.isChecked() ? "2" : "0");

        s3.put("s3q301f", rDOS3q301f1.isChecked() ? "1"
                : rDOS3q301f2.isChecked() ? "2"
                : rDOS3q301f3.isChecked() ? "3"
                : rDOS3q301f4.isChecked() ? "4"
                : "0");


        s3.put("s3q301g", rDOS3q301g1.isChecked() ? "1"
                : rDOS3q301g2.isChecked() ? "2"
                : rDOS3q301g3.isChecked() ? "3"
                : "0");

        s3.put("s3q301h", rDOS3q301h1.isChecked() ? "1"
                : rDOS3q301h2.isChecked() ? "2"
                : rDOS3q301h3.isChecked() ? "3"
                : rDOS3q301h4.isChecked() ? "4"
                : rDOS3q301h5.isChecked() ? "5"
                : "0");

        s3.put("s3q301h_dod", s3q301h_dod.getText().toString());

        s3.put("s3q301i", rDOS3q301i1.isChecked() ? "1"
                : rDOS3q301i2.isChecked() ? "2"
                : rDOS3q301i3.isChecked() ? "3"
                : rDOS3q301i4.isChecked() ? "4"
                : rDOS3q301i5.isChecked() ? "5"
                : rDOS3q301i6.isChecked() ? "6"
                : rDOS3q301i7.isChecked() ? "7"
                : rDOS3q301i8.isChecked() ? "8"
                : rDOS3q301i9.isChecked() ? "9"
                : rDOS3q301i10.isChecked() ? "88"
                : "0");

        s3.put("s3q301ioth", s3q301ioth.getText().toString());

        s3.put("s3q301j", rDOS3q301j1.isChecked() ? "1"
                : rDOS3q301j2.isChecked() ? "2"
                : rDOS3q301j3.isChecked() ? "3"
                : rDOS3q301j4.isChecked() ? "4"
                : rDOS3q301j5.isChecked() ? "5"
                : rDOS3q301j6.isChecked() ? "6"
                : rDOS3q301j7.isChecked() ? "7"
                : rDOS3q301j8.isChecked() ? "88"
                : "0");

        s3.put("s3q301joth", s3q301joth.getText().toString());
        s3.put("s3q301k", s3q301k.getText().toString());


        if (sno == 0) {
            SRCApp.sc3.setROW_SNO("1");
            sno = 1;
        } else {

            SRCDBHelper db = new SRCDBHelper(this);

            sno = db.getSNO();

            Log.d(TAG, "sno: " + sno);
            SRCApp.sc3.setROW_SNO(String.valueOf(sno + 1));
        }

        if (!SRCApp.curPreg) {
            SRCApp.curPreg = rDOS3q301d1.isChecked();
        }


        SRCApp.sc3.setROW_S3(String.valueOf(s3));


        return true;
    }


    // ============= Form Validation===============
    private boolean ValidateForm() {
        //Toast.makeText(getApplicationContext(), "Validating Form", Toast.LENGTH_SHORT).show();

        TextView errorText = (TextView) s3q301a.getSelectedView();
        if (s3q301a.getSelectedItemPosition() == 0) {
            errorText.setTextColor(Color.RED);//just to highlight that this is an error
            errorText.setText("Please select an Answer");//changes the selected item text to this
            Toast.makeText(getApplicationContext(), "Please select an Answer.", Toast.LENGTH_LONG).show();
            Log.d(TAG, "Error Type: s3q301a empty");
            return false;
        } else {
            errorText.setError(null);
        }

        if (getS3q301b().getText().toString().isEmpty()) {
            s3q301b.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter age in years \r\n", Toast.LENGTH_LONG).show();
            s3q301b.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 301b empty ");
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
            Log.d(TAG, "ValidateForm: Error Type: 301b invalid");
            return false;
        } else {
            s3q301b.setError(null);
        }

        if (getS3q301c().getText().toString().isEmpty()) {
            s3q301c.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter education status \r\n", Toast.LENGTH_LONG).show();
            s3q301c.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type:301c empty");
            return false;
        } else {
            s3q301c.setError(null);
        }

        if (Integer.parseInt(s3q301c.getText().toString()) < 1
                && Integer.parseInt(s3q301c.getText().toString()) != 91
                && Integer.parseInt(s3q301c.getText().toString()) != 92
                || Integer.parseInt(s3q301c.getText().toString()) > 18
                && Integer.parseInt(s3q301c.getText().toString()) != 91
                && Integer.parseInt(s3q301c.getText().toString()) != 92) {
            s3q301c.requestFocus();
            Toast.makeText(getApplicationContext(), "Years of schooling of woman must be 1 - 18 or 91 or 92 \r\n", Toast.LENGTH_LONG).show();
            s3q301c.setError("Years of schooling of woman must be 1 - 18 or 91 or 92");
            Log.d(TAG, "ValidateForm: Error Type:301c invalid");
            return false;
        } else {
            s3q301c.setError(null);
        }


        rdo_s3q301d = radioS3q301d.getCheckedRadioButtonId();

        switch (rdo_s3q301d) {
            case R.id.RDO_s3q301d_1:
                var_s3q301d = "1";
                break;

            case R.id.rDOS3q301d2:
                var_s3q301d = "2";
                break;
        }


        if (rdo_s3q301d == -1) {
            rDOS3q301d1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS3q301d1.requestFocus();
            rDOS3q301d1.setFocusableInTouchMode(true);
            rDOS3q301d1.setFocusable(true);
            Log.d(TAG, "ValidateForm: Error Type:301d not selected ");
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

        if (rDOS3q301d1.isChecked()) {
            if (s3q301e.getText().toString().isEmpty()) {
                s3q301e.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please enter gestational age \r\n", Toast.LENGTH_LONG).show();
                s3q301e.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type: 301e empty");
                return false;
            } else {
                s3q301e.setError(null);
            }

            if (s3q301e.getText().toString().isEmpty()) {

            } else {
                if (Integer.parseInt(s3q301e.getText().toString()) < 1 || Integer.parseInt(s3q301e.getText().toString()) > 9) {
                    Toast.makeText(getApplicationContext(), "Gestational age must be 1 - 9 months \r\n", Toast.LENGTH_LONG).show();
                    s3q301e.requestFocus();
                    Log.d(TAG, "ValidateForm: Error Type: 301e invalid");
                    return false;
                }
            }
        }

        if (rdo_s3q301f1 == -1) {
            rDOS3q301f11.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS3q301f11.requestFocus();
            rDOS3q301f11.setFocusable(true);
            rDOS3q301f11.setFocusableInTouchMode(true);
            Log.d(TAG, "ValidateForm: Error Type: 301f not selected");
            return false;
        } else {
            rDOS3q301f11.setError(null);
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
                rDOS3q301f1.setFocusableInTouchMode(true);
                rDOS3q301f1.setFocusable(true);
                Log.d(TAG, "ValidateForm: Error Type: 301f not selected");
                return false;
            } else {
                rDOS3q301f1.setError(null);
            }


            var_s3q301g = "";

            rdo_s3q301g = radioS3q301g.getCheckedRadioButtonId();

            switch (rdo_s3q301g) {
                case R.id.RDO_s3q301g_2:
                    var_s3q301g = "2";
                    break;

                case R.id.RDO_s3q301g_3:
                    var_s3q301g = "3";
                    break;
            }


            if (var_s3q301f.equals("4") && rdo_s3q301g == -1) {
                rDOS3q301g1.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
                rDOS3q301g1.requestFocus();
                rDOS3q301g1.setFocusable(true);
                rDOS3q301g1.setFocusableInTouchMode(true);
                Log.d(TAG, "ValidateForm: Error Type: 301f not selected ");
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

            if ((var_s3q301f.equals("3") && rdo_s3q301h == -1) ||
                    ((var_s3q301g.equals("2") || var_s3q301g.equals("3")) && rdo_s3q301h == -1)) {

                rDOS3q301h1.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
                rDOS3q301h1.requestFocus();
                rDOS3q301h1.setFocusableInTouchMode(true);
                rDOS3q301h1.setFocusable(true);
                Log.d(TAG, "ValidateForm: Error Type: 301g not selected  ");
                return false;

            } else {
                rDOS3q301h1.setError(null);
            }


            if (s3q301h_dod.getText().toString().isEmpty()) {
                s3q301h_dod.setError(getString(R.string.rdoerr));
                Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
                s3q301h_dod.requestFocus();

                Log.d(TAG, "ValidateForm: Error Type: 301h not selected ");
                return false;
            } else {
                s3q301h_dod.setError(null);
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
                rDOS3q301i1.setFocusable(true);
                rDOS3q301i1.setFocusableInTouchMode(true);
                Log.d(TAG, "ValidateForm: Error Type: 301i not selected");
                return false;
            } else {
                rDOS3q301i1.setError(null);
            }


            if (var_s3q301i.equals("10") && getS3q301ioth().getText().toString().isEmpty()) {
                s3q301ioth.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please specify place of delivery if others  \r\n", Toast.LENGTH_LONG).show();
                s3q301ioth.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type:301i empty ");
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
                rDOS3q301j1.setFocusableInTouchMode(true);
                rDOS3q301j1.setFocusable(true);
                Log.d(TAG, "ValidateForm: Error Type: 301j not selected");
                return false;
            } else {
                rDOS3q301j1.setError(null);
            }


            if (var_s3q301j.equals("8") && getS3q301joth().getText().toString().isEmpty()) {
                s3q301joth.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please specify delivery conducted by if others  \r\n", Toast.LENGTH_LONG).show();
                s3q301joth.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type: 301j not selected ");
                return false;
            } else {
                s3q301joth.setError(null);
            }


            if (getS3q301k().getText().toString().isEmpty()) {
                s3q301k.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please specify cost of delivery  \r\n", Toast.LENGTH_LONG).show();
                s3q301k.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type:301k empty");
                return false;
            } else {
                s3q301k.setError(null);
            }

            if (Integer.parseInt(s3q301k.getText().toString()) < 99
                    || Integer.parseInt(s3q301k.getText().toString()) > 100000
                    ) {
                s3q301k.setError("Invalid specify cost of delivery (100 - 100000) and 99 for free");
                Toast.makeText(getApplicationContext(), "Invalid specify cost of delivery  \r\n", Toast.LENGTH_LONG).show();
                s3q301k.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type:301k invalid");
                return false;
            } else {
                s3q301k.setError(null);
            }


        }

        return true;
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