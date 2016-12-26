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

public class Section5bActivity extends Activity {

    @BindView(R.id.activity_section5b)
    FrameLayout activitySection5b;
    @BindView(R.id.section5bScrollView)
    ScrollView section5bScrollView;
    @BindView(R.id.app_header)
    TextView appHeader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5b);
        ButterKnife.bind(this);

    }

}
