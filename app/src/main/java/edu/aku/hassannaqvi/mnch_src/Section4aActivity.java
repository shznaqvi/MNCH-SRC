package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Section4aActivity extends Activity {

    private static final String TAG = "Sec3";

    private EditText s4q42a;
    private EditText s4q42b;
    private RadioGroup radio_s4q42c;
    private RadioButton rdo_s4q42c_1;
    private RadioButton rdo_s4q42c_2;
    private int rdo_s4q42c;
    private EditText s4q42d;
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
    private int rdo_s4q42e;
    private EditText s4q42f;

    private String var_s4q42c;
    private String var_s4q42e;

    private int sno = 0;
    private int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section4a);


        s4q42a = (EditText) findViewById(R.id.s4q42a);
        s4q42b = (EditText) findViewById(R.id.s4q42b);
        radio_s4q42c = (RadioGroup) findViewById(R.id.radio_s4q42c);
        rdo_s4q42c_1 = (RadioButton) findViewById(R.id.RDO_s4q42c_1);
        rdo_s4q42c_2 = (RadioButton) findViewById(R.id.RDO_s4q42c_2);
        s4q42d = (EditText) findViewById(R.id.s4q42d);
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
        s4q42f = (EditText) findViewById(R.id.s4q42f);

        counter = 1;

    }


    public void AddChild(View view) {
        if (ValidateForm()) {

            if (SaveDraft()) {

                Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

                if (UpdateDB()) {

                } else {
                    Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }


    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);
        Long rowId = db.InsertRecord_Section3(SRCApp.sc3);
        return true;
    }

    private boolean SaveDraft() {

        CVars var = new CVars();

        SRCApp.sc4b.set_form_id(var.GetHHNO());
        SRCApp.sc4b.set_hhcode(var.GetHHCode());

        if (sno == 0) {
            SRCApp.sc4b.set_sno("1");
            sno = 1;
        } else {

            SRCDBHelper db = new SRCDBHelper(this);

            sno = db.getSNO2();
            SRCApp.sc4b.set_sno(String.valueOf(sno));
        }

        SRCApp.sc4b.set_s4q42a(s4q42a.getText().toString());
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
            case R.id.RDO_s4q41c_7:
                var_s4q42c = "7";
                break;
        }

        SRCApp.sc4b.set_s4q42c(var_s4q42c);

        SRCApp.sc4b.set_s4q42d(s4q42d.getText().toString());


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

    }

    public void gotoSection5(View view) {
        Intent sec4_intent = new Intent(this, Section5Activity.class);
        startActivity(sec4_intent);
    }


    private boolean ValidateForm() {

        if (s4q42a.getText().toString().isEmpty() || s4q42a.getText().toString() == null) {
            s4q42a.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
            s4q42a.requestFocus();
            return false;
        } else {
            s4q42a.setError(null);
        }

        if (s4q42b.getText().toString().isEmpty() || s4q42b.getText().toString() == null) {
            s4q42b.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
            s4q42b.requestFocus();
            return false;
        } else {
            s4q42b.setError(null);
        }

        rdo_s4q42c = radio_s4q42c.getCheckedRadioButtonId();

        if (rdo_s4q42c == -1) {
            rdo_s4q42c_1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
            radio_s4q42c.requestFocus();
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
            Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
            s4q42d.requestFocus();
            return false;
        } else {
            s4q42d.setError(null);
        }
        rdo_s4q42e = radio_s4q42e.getCheckedRadioButtonId();

        if (rdo_s4q42e == -1) {
            rdo_s4q42e_1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
            radio_s4q42e.requestFocus();
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
                var_s4q42e = "2";
                break;
            case R.id.RDO_s4q42e_4:
                var_s4q42e = "2";
                break;
            case R.id.RDO_s4q42e_5:
                var_s4q42e = "2";
                break;
            case R.id.RDO_s4q42e_6:
                var_s4q42e = "2";
                break;
            case R.id.RDO_s4q42e_7:
                var_s4q42e = "2";
                break;
            case R.id.RDO_s4q42e_8:
                var_s4q42e = "2";
                break;
            case R.id.RDO_s4q42e_9:
                var_s4q42e = "2";
                break;
            case R.id.RDO_s4q42e_10:
                var_s4q42e = "2";
                break;
        }

        if (s4q42f.getText().toString().isEmpty() || s4q42f.getText().toString() == null) {
            s4q42f.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
            s4q42f.requestFocus();
            return false;
        } else {
            s4q42f.setError(null);
        }

    }


}
