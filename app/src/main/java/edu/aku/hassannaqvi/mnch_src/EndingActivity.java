package edu.aku.hassannaqvi.mnch_src;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.RadioGroup;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EndingActivity extends Activity  {

    @BindView(R.id.activity_ending) RelativeLayout activityEnding;
    @BindView(R.id.mn0823) RadioGroup mn0823;
    @BindView(R.id.mn082301) RadioButton mn082301;
    @BindView(R.id.mn082302) RadioButton mn082302;
    @BindView(R.id.mn082303) RadioButton mn082303;
    @BindView(R.id.mn082304) RadioButton mn082304;
    @BindView(R.id.mn082302x) EditText mn082302x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

    }

}
