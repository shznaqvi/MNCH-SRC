package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

import java.util.ArrayList;
import java.util.Collection;


public class Section4bActivity extends Activity {

    private static final String TAG = "Sec4a";
    private static int mortalityCounter = 1;
    public int count = 0;
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
//    private RadioGroup childMortality;
//    private RadioButton md01;
//    private RadioButton md02;
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
                && (m > 11 || m < 0)){
            return true;
        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section4b);


        appHeader = (TextView) findViewById(R.id.app_header);
//        appHeader.setText("SRC - > Section4b");

        appHeader.setText(getString(R.string.sec4b) + " (" + SRCApp.cmCount + " of " + SRCApp.cmTotal + ")");

        lbl_hhhead = (TextView) findViewById(R.id.lbl_hhhead);
        lbl_hhhead1 = (TextView) findViewById(R.id.lbl_hhhead1);


        s4q42a = (Spinner) findViewById(R.id.s4q42a);
        s4q42b = (EditText) findViewById(R.id.s4q42b);
        radio_s4q42c = (RadioGroup) findViewById(R.id.radio_s4q42c);
        rdo_s4q42c_1 = (RadioButton) findViewById(R.id.RDO_s4q42c_1);
        rdo_s4q42c_2 = (RadioButton) findViewById(R.id.RDO_s4q42c_2);
        s4q42d = (EditText) findViewById(R.id.s4q42d);
        s4q42d1 = (EditText) findViewById(R.id.s4q42d1);
        s4q42d2 = (EditText) findViewById(R.id.s4q42d2);
        radio_s4q42e = (RadioGroup) findViewById(R.id.radio_s4q42e);
        rdo_s4q42e_1 = (RadioButton) findViewById(R.id.RDO_s4q42e_1);
        rdo_s4q42e_2 = (RadioButton) findViewById(R.id.RDO_s4q42e_2);
        rdo_s4q42e_3 = (RadioButton) findViewById(R.id.RDO_s4q42e_3);
        rdo_s4q42e_4 = (RadioButton) findViewById(R.id.RDO_s4q42e_4);
        rdo_s4q42e_5 = (RadioButton) findViewById(R.id.RDO_s4q42e_5);
        rdo_s4q42e_6 = (RadioButton) findViewById(R.id.RDO_s4q42e_6);
        rdo_s4q42e_7 = (RadioButton) findViewById(R.id.RDO_s4q42e_7);
        rdo_s4q42e_8 = (RadioButton) findViewById(R.id.RDO_s4q42e_8);
        rdo_s4q42e_9 = (RadioButton) findViewById(R.id.RDO_s4q42e_9);
        rdo_s4q42e_10 = (RadioButton) findViewById(R.id.RDO_s4q42e_10);
        s4q42eoth = (EditText) findViewById(R.id.s4q42eoth);

        s4q42f = (EditText) findViewById(R.id.s4q42f);

        vu_s4q42eoth = (LinearLayout) findViewById(R.id.vu_s4q42eoth);

        counter = 1;

        SRCDBHelper db = new SRCDBHelper(this);
        Collection<Members> members = db.getAll_Woman_Reproductive_Age();

        ArrayList<String> arr_members = new ArrayList<>();

        for (Members m : members) {
            arr_members.add(
                    m.getNME());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(Section4bActivity.this,
                android.R.layout.simple_spinner_item, arr_members);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s4q42a.setAdapter(adapter);


        radio_s4q42e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
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

//        childMortality = (RadioGroup) findViewById(R.id.childMortality);
//        md01 = (RadioButton) findViewById(R.id.md01);
//        md02 = (RadioButton) findViewById(R.id.md02);
//        md03 = (LinearLayout) findViewById(R.id.md03);
//        md04 = (LinearLayout) findViewById(R.id.md04);
//        childMortalityFlag = (LinearLayout) findViewById(R.id.childMortalityFlag);
//        countCMortality = (EditText) findViewById(R.id.countCMortality);

//        btnNext = (Button) findViewById(R.id.btnNext);
//        btnadd = (Button) findViewById(R.id.btnadd);
//        btncontinue = (Button) findViewById(R.id.btncontinue);
//
//        if (SRCApp.ChildMortality) {
//            childMortalityFlag.setVisibility(View.VISIBLE);
//        } else {
//            childMortalityFlag.setVisibility(View.GONE);
//            md03.setVisibility(View.GONE);
//            md04.setVisibility(View.VISIBLE);
//
//            btnNext.setEnabled(false);
//
//            btncontinue.setVisibility(View.GONE);
//        }

//        childMortality.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                md02.setError(null);
//
//                if (md01.isChecked()) {
//                    md03.setVisibility(View.VISIBLE);
//                } else {
//                    md03.setVisibility(View.GONE);
//                    countCMortality.setText(null);
//                }
//            }
//        });


//        CVars var = new CVars();
//
//
//        if (!SRCApp.ChildMortality) {
//            lbl_hhhead.setText(var.GetHHNO() + "-" + var.GetHHCode() + " " + "(" + "Deceased Child " + mortalityCounter + " of " + countCMortality.getText().toString() + ")");
//        } else {
//            lbl_hhhead.setText(var.GetHHNO() + "-" + var.GetHHCode());
//        }

    }

/*    public void AddChild(View view) {
        if (ValidateForm()) {

            if (SaveDraft()) {

                Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

                if (UpdateDB()) {

                    ClearFields();

                    vu_s4q42eoth.setVisibility(View.GONE);
                    s4q42a.requestFocus();

                    SRCApp.NoChildMortality-=1 ;

                    if (mortalityCounter < Integer.parseInt(countCMortality.getText().toString())) {
                        mortalityCounter++;
                    }

                    CVars var = new CVars();
                    lbl_hhhead.setText(var.GetHHNO() + "-" + var.GetHHCode() + " " + "(" + "Child Mortality " + mortalityCounter + " of " + countCMortality.getText().toString() + ")");
                    s4q42b.requestFocus();

                    if(SRCApp.NoChildMortality > 1){
                        btnNext.setVisibility(View.GONE);
                        btnadd.setVisibility(View.VISIBLE);
                    }else {
                        btnNext.setVisibility(View.VISIBLE);
                        btnadd.setVisibility(View.GONE);
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }*/

    public void NextSection(View view) {

        if (ValidateForm()) {

            if (SaveDraft()) {

                Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

                if (UpdateDB()) {

                    if (SRCApp.cmCount < SRCApp.cmTotal) {
                        Intent sec4b_intent = new Intent(this, Section4bActivity.class);
                        SRCApp.cmCount++;
                        startActivity(sec4b_intent);
                    } else {
                        Intent sec5_intent = new Intent(this, Section5Activity.class);
                        sec5_intent.putExtra("check", false);
                        startActivity(sec5_intent);
                    }

                } else {
                    Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private void ClearFields() {
        s4q42b.setText("");
        radio_s4q42c.clearCheck();
        s4q42d.setText("");
        s4q42d1.setText("");
        s4q42d2.setText("");
        radio_s4q42e.clearCheck();
        s4q42eoth.setText("");
        s4q42f.setText("");
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

    private boolean SaveDraft() {

        SRCApp.sc4b = new Sec4bContract();

        CVars var = new CVars();

        SRCApp.sc4b.setROW_FORM_ID(var.GetHHNO());
        SRCApp.sc4b.setROW_HHCODE(var.GetHHCode());


        if (sno == 0) {
            SRCApp.sc4b.setROW_SNO("1");
            sno = 1;
        } else {

            SRCDBHelper db = new SRCDBHelper(this);

            sno = db.getSNO2();
            SRCApp.sc4b.setROW_SNO(String.valueOf(sno));
        }

        SRCDBHelper db = new SRCDBHelper(this);

        String val;
        if (s4q42a.getSelectedItem().toString() != "NA") {
            val = db.getID_Woman_Reproductive_Age(s4q42a.getSelectedItem().toString());
        } else {
            val = "99";
        }
        SRCApp.sc4b.set_s4q42a(val);
        SRCApp.sc4b.set_s4q42b(s4q42b.getText().toString());

        rdo_s4q42c = radio_s4q42c.getCheckedRadioButtonId();

        switch (rdo_s4q42c) {
            case R.id.RDO_s4q41c_1:
                var_s4q42c = "1";
                break;
            case R.id.RDO_s4q41c_2:
                var_s4q42c = "2";
                break;
            case R.id.RDO_s4q41c_3:
                var_s4q42c = "3";
                break;
            case R.id.RDO_s4q41c_4:
                var_s4q42c = "4";
                break;
            case R.id.RDO_s4q41c_5:
                var_s4q42c = "5";
                break;
            case R.id.RDO_s4q41c_6:
                var_s4q42c = "6";
                break;
        }

        SRCApp.sc4b.set_s4q42c(var_s4q42c);

        SRCApp.sc4b.set_s4q42d(s4q42d.getText().toString());
        SRCApp.sc4b.set_s4q42d1(s4q42d1.getText().toString());
        SRCApp.sc4b.set_s4q42d2(s4q42d2.getText().toString());


        rdo_s4q42e = radio_s4q42e.getCheckedRadioButtonId();

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


        SRCApp.sc4b.set_s4q42e(var_s4q42e);
        SRCApp.sc4b.set_s4q42f(s4q42f.getText().toString());

        return true;
    }

    public void gotoSection5(View view) {

        if (SRCApp.NoChildMortality == 1) {
            if (ValidateForm()) {

                if (SaveDraft()) {

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
                Toast.makeText(getApplicationContext(), "Invalid:" + getString(R.string.baseline_s4q42d), Toast.LENGTH_LONG).show();
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
                Toast.makeText(getApplicationContext(), "Invalid:" + getString(R.string.baseline_s4q42d1), Toast.LENGTH_LONG).show();
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
                Toast.makeText(getApplicationContext(), "Invalid:" + getString(R.string.baseline_s4q42d2), Toast.LENGTH_LONG).show();
                s4q42d2.requestFocus();
                Log.d(TAG, "ValidateForm: 42d2 invalid");
                return false;
            } else {
                s4q42d2.setError(null);
            }
        }

        rdo_s4q42e = radio_s4q42e.getCheckedRadioButtonId();

        if (rdo_s4q42e == -1) {
            rdo_s4q42e_1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            radio_s4q42e.requestFocus();
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