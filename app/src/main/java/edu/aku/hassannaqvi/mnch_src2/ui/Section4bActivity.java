package edu.aku.hassannaqvi.mnch_src2.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mnch_src2.R;
import edu.aku.hassannaqvi.mnch_src2.contract.BLRandomContract;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec4bContract;
import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;
import edu.aku.hassannaqvi.mnch_src2.core.SRCDBHelper;
import edu.aku.hassannaqvi.mnch_src2.other.CVars;
import io.blackbox_vision.datetimepickeredittext.view.DatePickerInputEditText;


public class Section4bActivity extends AppCompatActivity {

    private static final String TAG = "Sec4b";
    private static int mortalityCounter = 1;
    public int count = 0;
    @BindView(R.id.s4q42d_dod)
    DatePickerInputEditText s4q42d_dod;
    String dateToday;
    String maxDate5year;
    ArrayList<String> mwraNames;
    Map<String, BLRandomContract> mwraMap;
    private TextView appHeader;
    private TextView lbl_hhhead;
    private LinearLayout vu_s4q42eoth;
    private Spinner s4q42a;
    private EditText s4q42b;
    private RadioGroup radio_s4q42c;
    private RadioButton rdo_s4q42c_1;
    private RadioButton rdo_s4q42c_2;
    private int rdo_s4q42c;
    private EditText s4q42d;
    private EditText s4q42d1;
    private EditText s4q42d2;
    private RadioGroup radio_s4q42e;
    private RadioButton rdo_s4q42e_1;
    private RadioButton rdo_s4q42e_2;
    private RadioButton rdo_s4q42e_3;
    private RadioButton rdo_s4q42e_4;
    private RadioButton rdo_s4q42e_5;
    private RadioButton rdo_s4q42e_6;
    private RadioButton rdo_s4q42e_7;
    private RadioButton rdo_s4q42e_8;
    private RadioButton rdo_s4q42e_9;
    private RadioButton rdo_s4q42e_10;
    private EditText s4q42eoth;
    private int rdo_s4q42e;
    private EditText s4q42f;
    private String var_s4q42c;
    private String var_s4q42e;
    private int sno = 0;
    private int counter = 0;
    private LinearLayout md03;
    private LinearLayout md04;
    private LinearLayout childMortalityFlag;
    private EditText countCMortality;
    private Button btnNext;
    private Button btnadd;
    private Button btncontinue;
    private TextView lbl_hhhead1;

    public static boolean dobValidation(int y, int m, int d) {

        if ((y == 5
                || y >= 5)
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
        setContentView(R.layout.activity_section4b);
        ButterKnife.bind(this);

        dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());
        try {

            String s2 = "2012-12-01";
            Date d1 = (new SimpleDateFormat("yyyy-MM-dd")).parse(s2);
            maxDate5year = (new SimpleDateFormat("dd/MM/yyyy")).format(d1);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Calendar c = Calendar.getInstance();
        c.set(2012, Calendar.DECEMBER, 1);

       /* Calendar c1 =Calendar.getInstance();
        c1.set(2016,Calendar.AUGUST,01);*/


        s4q42d_dod.setManager(getSupportFragmentManager());
        s4q42d_dod.setMaxDate(dateToday);
        s4q42d_dod.setMinDate(maxDate5year);


        appHeader = findViewById(R.id.app_header);
//        appHeader.setText("SRC - > Section4b");

        appHeader.setText(getString(R.string.sec4b) + " (" + SRCApp.cmCount + " of " + SRCApp.cmTotal + ")");

        lbl_hhhead = findViewById(R.id.lbl_hhhead);
        lbl_hhhead1 = findViewById(R.id.lbl_hhhead1);


        s4q42a = findViewById(R.id.s4q42a);
        s4q42b = findViewById(R.id.s4q42b);
        radio_s4q42c = findViewById(R.id.radio_s4q42c);
        rdo_s4q42c_1 = findViewById(R.id.RDO_s4q42c_1);
        rdo_s4q42c_2 = findViewById(R.id.RDO_s4q42c_2);
        s4q42d = findViewById(R.id.s4q42d);
        s4q42d1 = findViewById(R.id.s4q42d1);
        s4q42d2 = findViewById(R.id.s4q42d2);
        radio_s4q42e = findViewById(R.id.radio_s4q42e);
        rdo_s4q42e_1 = findViewById(R.id.RDO_s4q42e_1);
        rdo_s4q42e_2 = findViewById(R.id.RDO_s4q42e_2);
        rdo_s4q42e_3 = findViewById(R.id.RDO_s4q42e_3);
        rdo_s4q42e_4 = findViewById(R.id.RDO_s4q42e_4);
        rdo_s4q42e_5 = findViewById(R.id.RDO_s4q42e_5);
        rdo_s4q42e_6 = findViewById(R.id.RDO_s4q42e_6);
        rdo_s4q42e_7 = findViewById(R.id.RDO_s4q42e_7);
        rdo_s4q42e_8 = findViewById(R.id.RDO_s4q42e_8);
        rdo_s4q42e_9 = findViewById(R.id.RDO_s4q42e_9);
        rdo_s4q42e_10 = findViewById(R.id.RDO_s4q42e_10);
        s4q42eoth = findViewById(R.id.s4q42eoth);

        s4q42f = findViewById(R.id.s4q42f);

        vu_s4q42eoth = findViewById(R.id.vu_s4q42eoth);

        counter = 1;


        //        Setting Spinner

        mwraNames = new ArrayList<>();
        mwraMap = new HashMap<>();

        mwraNames.add("....");

        mwraNames.add("NA");
        mwraMap.put("NA", new BLRandomContract("99", "99", "99", "99", "99", "99", "99"));

        for (BLRandomContract rand : SRCApp.blRandomized) {
            mwraNames.add(rand.getMwname());
            mwraMap.put(rand.getMwname(), rand);
        }

        s4q42a.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, mwraNames));


        radio_s4q42e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == rdo_s4q42e_10.getId()) {

                    vu_s4q42eoth.setVisibility(View.VISIBLE);
                    radio_s4q42e.requestFocus();

                } else {

                    vu_s4q42eoth.setVisibility(View.GONE);
                    s4q42eoth.setText("");
                }
            }
        });
    }

    public void NextSection(View view) {

        if (ValidateForm()) {

            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

            if (UpdateDB()) {

                if (SRCApp.cmCount < SRCApp.cmTotal) {
                    Intent sec4b_intent = new Intent(this, Section4bActivity.class);
                    SRCApp.cmCount++;
                    startActivity(sec4b_intent);
                } else if (SRCApp.selectedMWRAs.size() > 0) {
                    Intent sec5_intent = new Intent(this, Section5Activity.class);
                    sec5_intent.putExtra("check", false);
                    startActivity(sec5_intent);
                } else {
                    Intent sec5_intent = new Intent(this, Section6Activity.class);
                    startActivity(sec5_intent);
                }

            } else {
                Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
            }

        }
    }


    private boolean UpdateDB() {
        Long rowId;
        SRCDBHelper db = new SRCDBHelper(this);

        rowId = db.addSec4b(SRCApp.sc4b);

        SRCApp.sc4b.set_ID(rowId);

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            SRCApp.sc4b.setROW_UID((SRCApp.sc4b.getROW_DEVID() + SRCApp.sc4b.get_ID()));
            db.updateSec4bUID();
            Toast.makeText(this, "Current Form No: " + SRCApp.sc4b.getROW_UID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean SaveDraft() throws JSONException {

        SRCApp.sc4b = new Sec4bContract();
        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        SRCApp.sc4b.setTagID(sharedPref.getString("tagName", null));
        SRCApp.sc4b.setVersion(SRCApp.versionName + "." + SRCApp.versionCode);

        SRCApp.sc4b.setHHNO(SRCApp.fc.getHHNO());
        SRCApp.sc4b.setROW_DEVID(SRCApp.DEVID);
        SRCApp.sc4b.setROW_UUID(SRCApp.fc.getROW_UUID());
        SRCApp.sc4b.setROW_FORM_DATE(SRCApp.fc.getROW_ENTRYDATE());
        SRCApp.sc4b.setROW_USERID(SRCApp.fc.getROW_USERID());


        if (sno == 0) {
            SRCApp.sc4b.setROW_SNO("1");
            sno = 1;
        } else {

            SRCDBHelper db = new SRCDBHelper(this);

            sno = db.getSNO2();
            SRCApp.sc4b.setROW_SNO(String.valueOf(sno));
        }


        JSONObject s4b = new JSONObject();

        //s4b.put("s4q42a", s4q42a.getSelectedItem().toString());

        BLRandomContract selectedRand = mwraMap.get(s4q42a.getSelectedItem().toString());

        s4b.put("s4q42a", selectedRand.getMwname());
        s4b.put("s4q42a_luid", selectedRand.getLUID());
        s4b.put("s4q42a_village", selectedRand.getSubVillageCode());
        s4b.put("s4q42a_structure", selectedRand.getStructure());
        s4b.put("s4q42a_sno", selectedRand.getSno());
        s4b.put("s4q42a_rndDT", selectedRand.getRandomDT());
        s4b.put("s4q42a_ID", selectedRand.get_ID());


        s4b.put("s4q42b", s4q42b.getText().toString());
        s4b.put("s4q42c", rdo_s4q42c_1.isChecked() ? "1"
                : rdo_s4q42c_2.isChecked() ? "2" : "0");
        s4b.put("s4q42d", s4q42d.getText().toString());
        s4b.put("s4q42d1", s4q42d1.getText().toString());
        s4b.put("s4q42d2", s4q42d2.getText().toString());
        s4b.put("s4q42d_dod", s4q42d_dod.getText().toString());
        s4b.put("s4q42e", rdo_s4q42e_1.isChecked() ? "1"
                : rdo_s4q42e_2.isChecked() ? "2"
                : rdo_s4q42e_3.isChecked() ? "3"
                : rdo_s4q42e_4.isChecked() ? "4"
                : rdo_s4q42e_5.isChecked() ? "5"
                : rdo_s4q42e_6.isChecked() ? "6"
                : rdo_s4q42e_7.isChecked() ? "7"
                : rdo_s4q42e_8.isChecked() ? "8"
                : rdo_s4q42e_9.isChecked() ? "9"
                : rdo_s4q42e_10.isChecked() ? "88" : "0");
        s4b.put("s4q42eoth", s4q42eoth.getText().toString());
        s4b.put("s4q42f", s4q42f.getText().toString());


        SRCApp.sc4b.set_s4b(String.valueOf(s4b));

        return true;
    }

    public void gotoSection5(View view) {

        if (ValidateForm()) {

            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Toast.makeText(this, "Storing Values", Toast.LENGTH_SHORT).show();

            if (UpdateDB()) {

                //        Checking Married Women

                CVars var = new CVars();
                if (var.GetReproductionAgeWoman() != 0) {
                    startActivity(new Intent(this, Section5Activity.class));
                } else if (var.getNeonatesChild() != 0) {
                    startActivity(new Intent(this, Section7Activity.class));
                } else if (var.getIMChild() != 0) {
                    startActivity(new Intent(this, Section7IMActivity.class));
                } else {
                    startActivity(new Intent(this, Section8Activity.class));
                }
//
            }
        }

    }


    private boolean ValidateForm() {


        if (s4q42b.getText().toString().isEmpty() || s4q42b.getText().toString() == null) {
            s4q42b.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter complete name of deceased child", Toast.LENGTH_LONG).show();
            s4q42b.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type:42b empty");
            return false;
        } else {
            s4q42b.setError(null);
        }

        rdo_s4q42c = radio_s4q42c.getCheckedRadioButtonId();

        if (rdo_s4q42c == -1) {
            rdo_s4q42c_1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            radio_s4q42c.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 42c not selected");
            return false;
        } else {
            rdo_s4q42c_1.setError(null);
        }

        switch (rdo_s4q42c) {
            case R.id.RDO_s4q42c_1:
                var_s4q42c = "1";
                break;
            case R.id.RDO_s4q42c_2:
                var_s4q42c = "2";
                break;
        }

        if (s4q42d.getText().toString().isEmpty() || s4q42d.getText().toString() == null) {
            s4q42d.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter age in days", Toast.LENGTH_LONG).show();
            s4q42d.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type:42d empty");
            return false;
        } else {
            s4q42d.setError(null);

            if (Integer.parseInt(s4q42d.getText().toString()) > 29) {
                s4q42d.setError("Invalid:" + getString(R.string.baseline_s4q42d));
                Toast.makeText(getApplicationContext(), "Invalid: Range is 0 to 29 days" + getString(R.string.baseline_s4q42d), Toast.LENGTH_LONG).show();
                s4q42d.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type:42d invalid");
                return false;
            } else {
                s4q42d.setError(null);
            }
        }


        if (s4q42d1.getText().toString().isEmpty() || s4q42d1.getText().toString() == null) {
            s4q42d1.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter age in months", Toast.LENGTH_LONG).show();
            s4q42d1.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type:42d1 empty");
            return false;
        } else {
            s4q42d1.setError(null);
            if (Integer.parseInt(s4q42d1.getText().toString()) > 11) {
                s4q42d1.setError("Invalid:" + getString(R.string.baseline_s4q42d1));
                Toast.makeText(getApplicationContext(), "Invalid: Range is 0 to 11 months" + getString(R.string.baseline_s4q42d1), Toast.LENGTH_LONG).show();
                s4q42d1.requestFocus();
                return false;
            } else {
                s4q42d1.setError(null);
            }
        }

        if (s4q42d2.getText().toString().isEmpty() || s4q42d2.getText().toString() == null) {
            s4q42d2.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter age in years", Toast.LENGTH_LONG).show();
            s4q42d2.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type:42d2 empty");
            return false;
        } else {
            s4q42d2.setError(null);
            if (Integer.parseInt(s4q42d2.getText().toString()) > 4) {
                s4q42d2.setError("Invalid:" + getString(R.string.baseline_s4q42d2));
                Toast.makeText(getApplicationContext(), "Invalid: Range is 0 to 4 years" + getString(R.string.baseline_s4q42d2), Toast.LENGTH_LONG).show();
                s4q42d2.requestFocus();
                Log.d(TAG, "ValidateForm: 42d2 invalid");
                return false;
            } else {
                s4q42d2.setError(null);
            }
        }

        if (s4q42d_dod.getText().toString().isEmpty()) {
            s4q42d_dod.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            s4q42d_dod.requestFocus();

            Log.d(TAG, "ValidateForm: Error Type: 402h not selected ");
            return false;
        } else {
            s4q42d_dod.setError(null);
        }

        rdo_s4q42e = radio_s4q42e.getCheckedRadioButtonId();

        if (rdo_s4q42e == -1) {
            rdo_s4q42e_1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            radio_s4q42e.requestFocus();
            radio_s4q42e.setFocusable(true);
            radio_s4q42e.setFocusableInTouchMode(true);
            Log.d(TAG, "ValidateForm: Error Type:42e not selected");
            return false;
        } else {
            rdo_s4q42e_1.setError(null);
        }

        switch (rdo_s4q42e) {
            case R.id.RDO_s4q42e_1:
                var_s4q42e = "1";
                break;
            case R.id.RDO_s4q42e_2:
                var_s4q42e = "2";
                break;
            case R.id.RDO_s4q42e_3:
                var_s4q42e = "3";
                break;
            case R.id.RDO_s4q42e_4:
                var_s4q42e = "4";
                break;
            case R.id.RDO_s4q42e_5:
                var_s4q42e = "5";
                break;
            case R.id.RDO_s4q42e_6:
                var_s4q42e = "6";
                break;
            case R.id.RDO_s4q42e_7:
                var_s4q42e = "7";
                break;
            case R.id.RDO_s4q42e_8:
                var_s4q42e = "8";
                break;
            case R.id.RDO_s4q42e_9:
                var_s4q42e = "9";
                break;
            case R.id.RDO_s4q42e_10:
                var_s4q42e = "10";
                break;
        }


        if (var_s4q42e == "10") {
            if (s4q42eoth.getText().toString().isEmpty() || s4q42eoth.getText().toString() == null) {
                s4q42eoth.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please specify others", Toast.LENGTH_LONG).show();
                s4q42eoth.requestFocus();
                Log.d(TAG, "ValidateForm: Error Type:42eoth empty");
                return false;
            } else {
                s4q42eoth.setError(null);
            }
        }


        if (s4q42f.getText().toString().isEmpty() || s4q42f.getText().toString() == null) {
            s4q42f.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter caause of death", Toast.LENGTH_LONG).show();
            s4q42f.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type:42f empty");
            return false;
        } else {
            s4q42f.setError(null);
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}