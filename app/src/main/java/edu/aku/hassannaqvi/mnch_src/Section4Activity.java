package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Section4Activity extends Activity {

    private static final String TAG = "Sec4";

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
    private RadioButton rdo_s4q41c_7;
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

    private TextView lbl_hhhead;

    private int rdo_s4q41d;
    private EditText s4q41e;

    private LinearLayout vu_s4q41doth;

    private String var_s4q41c;
    private String var_s4q41d;


    private TextView app_header;

    private int counter = 0;
    private int sno = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section4);

        app_header = (TextView) findViewById(R.id.app_header);
        app_header.setText("SRC - > Section4");

        s4q41a = (EditText) findViewById(R.id.s4q41a);
        s4q41b = (EditText) findViewById(R.id.s4q41b);
        s4q41b1 = (EditText) findViewById(R.id.s4q41b1);
        s4q41b2 = (EditText) findViewById(R.id.s4q41b2);

        s4q41doth = (EditText) findViewById(R.id.s4q41doth);

        counter = 1;

        radio_s4q41c = (RadioGroup) findViewById(R.id.radio_s4q41c);
        rdo_s4q41c_1 = (RadioButton) findViewById(R.id.RDO_s4q41c_1);
        rdo_s4q41c_2 = (RadioButton) findViewById(R.id.RDO_s4q41c_2);
        rdo_s4q41c_3 = (RadioButton) findViewById(R.id.RDO_s4q41c_3);
        rdo_s4q41c_4 = (RadioButton) findViewById(R.id.RDO_s4q41c_4);
        rdo_s4q41c_5 = (RadioButton) findViewById(R.id.RDO_s4q41c_5);
        rdo_s4q41c_6 = (RadioButton) findViewById(R.id.RDO_s4q41c_6);
        rdo_s4q41c_7 = (RadioButton) findViewById(R.id.RDO_s4q41c_7);
        radio_s4q41d = (RadioGroup) findViewById(R.id.radio_s4q41d);
        rdo_s4q41d_1 = (RadioButton) findViewById(R.id.RDO_s4q41d_1);
        rdo_s4q41d_2 = (RadioButton) findViewById(R.id.RDO_s4q41d_2);
        rdo_s4q41d_3 = (RadioButton) findViewById(R.id.RDO_s4q41d_3);
        rdo_s4q41d_4 = (RadioButton) findViewById(R.id.RDO_s4q41d_4);
        rdo_s4q41d_5 = (RadioButton) findViewById(R.id.RDO_s4q41d_5);
        rdo_s4q41d_6 = (RadioButton) findViewById(R.id.RDO_s4q41d_6);
        rdo_s4q41d_7 = (RadioButton) findViewById(R.id.RDO_s4q41d_7);
        rdo_s4q41d_8 = (RadioButton) findViewById(R.id.RDO_s4q41d_8);
        rdo_s4q41d_9 = (RadioButton) findViewById(R.id.RDO_s4q41d_9);
        rdo_s4q41d_10 = (RadioButton) findViewById(R.id.RDO_s4q41d_10);
        s4q41e = (EditText) findViewById(R.id.s4q41e);

        vu_s4q41doth = (LinearLayout) findViewById(R.id.vu_s4q41doth);


        lbl_hhhead = (TextView) findViewById(R.id.lbl_hhhead);

        CVars var = new CVars();
        lbl_hhhead.setText(var.GetHHNO() + "-" + var.GetHHCode());


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

    }


    public void AddWoman(View view) {
        if (ValidateForm()) {

            if (SaveDraft()) {

                Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

                if (UpdateDB()) {

                    ClearFields();
                    counter = counter + 1;

                    s4q41a.requestFocus();

                } else {
                    Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }


    public void gotoSection5(View view) {
        Intent sec4_intent = new Intent(this, Section5Activity.class);
        startActivity(sec4_intent);
    }


    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);
        Long rowId = db.InsertRecord_Section4a(SRCApp.sc4a);
        return true;
    }


    private void ClearFields() {
        s4q41a.setText("");
        s4q41b.setText("");
        s4q41b1.setText("");
        s4q41b2.setText("");
        radio_s4q41c.clearCheck();
        radio_s4q41d.clearCheck();
        s4q41e.setText("");
    }

    private boolean SaveDraft() {

        SRCApp.sc4a = new Section4Contract();

        CVars var = new CVars();

        SRCApp.sc4a.set_FORM_ID(var.GetHHNO());
        SRCApp.sc4a.set_HHCODE(var.GetHHCode());


        if (sno == 0) {
            SRCApp.sc4a.set_SNO("1");
            sno = 1;
        } else {

            SRCDBHelper db = new SRCDBHelper(this);

            sno = db.getSNO1();
            SRCApp.sc4a.set_SNO(String.valueOf(sno));
        }

        SRCApp.sc4a.set_s4q41a(s4q41a.getText().toString());
        SRCApp.sc4a.set_s4q41b(s4q41b.getText().toString());

        SRCApp.sc4a.set_s4q41b1(s4q41b1.getText().toString());
        SRCApp.sc4a.set_s4q41b2(s4q41b2.getText().toString());


        rdo_s4q41c = radio_s4q41c.getCheckedRadioButtonId();

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
            case R.id.RDO_s4q41c_7:
                var_s4q41c = "7";
                break;
        }

        SRCApp.sc4a.set_s4q41c(var_s4q41c);
        rdo_s4q41d = radio_s4q41d.getCheckedRadioButtonId();

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

        SRCApp.sc4a.set_s4q41d(var_s4q41d);
        SRCApp.sc4a.set_s4q41e(s4q41e.getText().toString());

        return true;
    }

    private boolean ValidateForm() {
        if (s4q41a.getText().toString().isEmpty() || s4q41a.getText().toString() == null) {
            s4q41a.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify name of deceased mother name ", Toast.LENGTH_LONG).show();
            s4q41a.requestFocus();
            return false;
        } else {
            s4q41a.setError(null);
        }


        if (s4q41b.getText().toString().isEmpty() || s4q41b.getText().toString() == null) {
            s4q41b.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify days ", Toast.LENGTH_LONG).show();
            s4q41b.requestFocus();
            return false;
        } else {
            s4q41b.setError(null);
        }


        if (s4q41b1.getText().toString().isEmpty() || s4q41b1.getText().toString() == null) {
            s4q41b1.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify months ", Toast.LENGTH_LONG).show();
            s4q41b1.requestFocus();
            return false;
        } else {
            s4q41b1.setError(null);
        }


        if (s4q41b2.getText().toString().isEmpty() || s4q41b2.getText().toString() == null) {
            s4q41b2.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify years ", Toast.LENGTH_LONG).show();
            s4q41b2.requestFocus();
            return false;
        } else {
            s4q41b2.setError(null);
        }


        rdo_s4q41c = radio_s4q41c.getCheckedRadioButtonId();

        if (rdo_s4q41c == -1) {
            rdo_s4q41c_1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            radio_s4q41c.requestFocus();
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
            case R.id.RDO_s4q41c_7:
                var_s4q41c = "7";
                break;
        }

        rdo_s4q41d = radio_s4q41d.getCheckedRadioButtonId();

        if (rdo_s4q41d == -1) {
            rdo_s4q41d_1.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            radio_s4q41d.requestFocus();
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

        if (var_s4q41d == "10") {
            if (s4q41doth.getText().toString().isEmpty() || s4q41doth.getText().toString() == null) {
                s4q41doth.setError(getString(R.string.txterr));
                Toast.makeText(getApplicationContext(), "Please specify others ", Toast.LENGTH_LONG).show();
                s4q41doth.requestFocus();
                return false;
            } else {
                s4q41doth.setError(null);
            }
        }


        if (s4q41e.getText().toString().isEmpty() || s4q41e.getText().toString() == null) {
            s4q41e.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify cause of death ", Toast.LENGTH_LONG).show();
            s4q41e.requestFocus();
            return false;
        } else {
            s4q41e.setError(null);
        }

        return true;
    }


}