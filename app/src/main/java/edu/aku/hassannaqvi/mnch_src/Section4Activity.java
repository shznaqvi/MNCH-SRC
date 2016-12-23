package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
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

    private int rdo_s4q41d;
    private EditText s4q41e;

    private LinearLayout vu_s4q41doth;

    private String var_s4q41c;
    private String var_s4q41d;


    private TextView app_header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section4);

        app_header = (TextView) findViewById(R.id.app_header);
        app_header.setText("SRC - > Section4");

        s4q41a = (EditText) findViewById(R.id.s4q41a);
        s4q41b = (EditText) findViewById(R.id.s4q41b);
        s4q41doth = (EditText) findViewById(R.id.s4q41doth);

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


    public void gotoSection5(View view) {

        if (ValidateForm()) {

        }
    }


    private void SaveDraft() {

        SRCApp.sc4 = new Section4Contract();

        SRCApp.sc4.set_s4q41a(s4q41a.getText().toString());
        SRCApp.sc4.set_s4q41b(s4q41b.getText().toString());
        rdo_s4q41c = radio_s4q41c.getCheckedRadioButtonId();

        switch (rdo_s4q41c) {
            case R.id.RDO_s4q41c_1:
                var_s4q41c = "1";
                break;
            case R.id.RDO_s4q41c_2:
                var_s4q41c = "2";
                break;
            case R.id.RDO_s4q41c_3:
                var_s4q41c = "2";
                break;
            case R.id.RDO_s4q41c_4:
                var_s4q41c = "2";
                break;
            case R.id.RDO_s4q41c_5:
                var_s4q41c = "2";
                break;
            case R.id.RDO_s4q41c_6:
                var_s4q41c = "2";
                break;
            case R.id.RDO_s4q41c_7:
                var_s4q41c = "2";
                break;
        }

        SRCApp.sc4.set_s4q41c(var_s4q41c);
        rdo_s4q41d = radio_s4q41d.getCheckedRadioButtonId();

        switch (rdo_s4q41d) {
            case R.id.RDO_s4q41d_1:
                var_s4q41d = "1";
                break;
            case R.id.RDO_s4q41d_2:
                var_s4q41d = "2";
                break;
            case R.id.RDO_s4q41d_3:
                var_s4q41d = "2";
                break;
            case R.id.RDO_s4q41d_4:
                var_s4q41d = "2";
                break;
            case R.id.RDO_s4q41d_5:
                var_s4q41d = "2";
                break;
            case R.id.RDO_s4q41d_6:
                var_s4q41d = "2";
                break;
            case R.id.RDO_s4q41d_7:
                var_s4q41d = "2";
                break;
            case R.id.RDO_s4q41d_8:
                var_s4q41d = "2";
                break;
            case R.id.RDO_s4q41d_9:
                var_s4q41d = "2";
                break;
            case R.id.RDO_s4q41d_10:
                var_s4q41d = "2";
                break;
        }

        SRCApp.sc4.set_s4q41d(var_s4q41d);
        SRCApp.sc4.set_s4q41e(s4q41e.getText().toString());
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