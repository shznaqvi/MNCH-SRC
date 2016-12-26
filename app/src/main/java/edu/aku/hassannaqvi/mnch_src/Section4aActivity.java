package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Section4aActivity extends Activity {

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

    }
}
