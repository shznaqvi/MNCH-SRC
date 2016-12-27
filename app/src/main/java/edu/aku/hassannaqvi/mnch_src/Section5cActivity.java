package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Section5cActivity extends Activity {

    @BindView(R.id.activity_section5c)
    FrameLayout activitySection5c;
    @BindView(R.id.section5cScrollView)
    ScrollView section5cScrollView;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0546)
    RadioGroup mn0546;
    @BindView(R.id.mn0546_1)
    RadioButton mn05461;
    @BindView(R.id.mn0546_2)
    RadioButton mn05462;
    @BindView(R.id.mn054788x)
    EditText mn054788x;
    @BindView(R.id.mn0548)
    RadioGroup mn0548;
    @BindView(R.id.mn054801)
    RadioButton mn054801;
    @BindView(R.id.mn054802)
    RadioButton mn054802;
    @BindView(R.id.mn054803)
    RadioButton mn054803;
    @BindView(R.id.mn054804)
    RadioButton mn054804;
    @BindView(R.id.mn054901)
    CheckBox mn054901;
    @BindView(R.id.mn054902)
    CheckBox mn054902;
    @BindView(R.id.mn054903)
    CheckBox mn054903;
    @BindView(R.id.mn054904)
    CheckBox mn054904;
    @BindView(R.id.mn054905)
    CheckBox mn054905;
    @BindView(R.id.mn054906)
    CheckBox mn054906;
    @BindView(R.id.mn054907)
    CheckBox mn054907;
    @BindView(R.id.mn054988)
    CheckBox mn054988;
    @BindView(R.id.mn054988x)
    EditText mn054988x;
    @BindView(R.id.mn055001)
    CheckBox mn055001;
    @BindView(R.id.mn055002)
    CheckBox mn055002;
    @BindView(R.id.mn055003)
    CheckBox mn055003;
    @BindView(R.id.mn055004)
    CheckBox mn055004;
    @BindView(R.id.mn055005)
    CheckBox mn055005;
    @BindView(R.id.mn055088)
    CheckBox mn055088;
    @BindView(R.id.mn055088x)
    EditText mn055088x;
    @BindView(R.id.mn0551)
    RadioGroup mn0551;
    @BindView(R.id.mn0551_1)
    RadioButton mn05511;
    @BindView(R.id.mn0551_2)
    RadioButton mn05512;
    @BindView(R.id.mn0551_99)
    RadioButton mn055199;
    @BindView(R.id.mn0554)
    RadioGroup mn0554;
    @BindView(R.id.mn055488x)
    EditText mn055488x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5c);
        ButterKnife.bind(this);

    }

}
