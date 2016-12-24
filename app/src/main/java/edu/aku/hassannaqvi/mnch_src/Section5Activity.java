package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Section5Activity extends Activity {

    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0501)
    RadioGroup mn0501;
    @BindView(R.id.mn0501_1)
    RadioButton mn05011;
    @BindView(R.id.mn0501_2)
    RadioButton mn05012;
    @BindView(R.id.mn0502)
    RadioGroup mn0502;
    @BindView(R.id.mn0502_1)
    RadioButton mn05021;
    @BindView(R.id.mn0502_2)
    RadioButton mn05022;
    @BindView(R.id.mn0503)
    RadioGroup mn0503;
    @BindView(R.id.mn050301)
    RadioButton mn050301;
    @BindView(R.id.mn050302)
    RadioButton mn050302;
    @BindView(R.id.mn050303)
    RadioButton mn050303;
    @BindView(R.id.mn0504)
    RadioGroup mn0504;
    @BindView(R.id.mn0504_1)
    RadioButton mn05041;
    @BindView(R.id.mn0504_2)
    RadioButton mn05042;
    @BindView(R.id.mn0505)
    RadioGroup mn0505;
    @BindView(R.id.mn0505_1)
    RadioButton mn05051;
    @BindView(R.id.mn0505_2)
    RadioButton mn05052;
    @BindView(R.id.mn0506)
    RadioGroup mn0506;
    @BindView(R.id.mn0506_1)
    RadioButton mn05061;
    @BindView(R.id.mn0506_2)
    RadioButton mn05062;
    @BindView(R.id.mn0507)
    RadioGroup mn0507;
    @BindView(R.id.mn050701)
    RadioButton mn050701;
    @BindView(R.id.mn050702)
    RadioButton mn050702;
    @BindView(R.id.mn050703)
    RadioButton mn050703;
    @BindView(R.id.mn050704)
    RadioButton mn050704;
    @BindView(R.id.mn0508)
    RadioGroup mn0508;
    @BindView(R.id.mn0508_1)
    RadioButton mn05081;
    @BindView(R.id.mn0508_2)
    RadioButton mn05082;
    @BindView(R.id.mn050901)
    CheckBox mn050901;
    @BindView(R.id.mn050902)
    CheckBox mn050902;
    @BindView(R.id.mn050903)
    CheckBox mn050903;
    @BindView(R.id.mn050904)
    CheckBox mn050904;
    @BindView(R.id.mn050905)
    CheckBox mn050905;
    @BindView(R.id.mn050906)
    CheckBox mn050906;
    @BindView(R.id.mn050907)
    CheckBox mn050907;
    @BindView(R.id.mn0509088)
    CheckBox mn0509088;
    @BindView(R.id.mn0509088x)
    EditText mn0509088x;
    @BindView(R.id.mn0510)
    RadioGroup mn0510;
    @BindView(R.id.mn051001)
    RadioButton mn051001;
    @BindView(R.id.mn051002)
    RadioButton mn051002;
    @BindView(R.id.mn051003)
    RadioButton mn051003;
    @BindView(R.id.mn051004)
    RadioButton mn051004;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5);
        ButterKnife.bind(this);

    }

}
