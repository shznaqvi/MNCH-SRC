package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class Section6Activity extends Activity {

    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0601)
    RadioGroup mn0601;
    @BindView(R.id.mn060101)
    RadioButton mn060101;
    @BindView(R.id.mn060102)
    RadioButton mn060102;
    @BindView(R.id.fldGrpmn0602)
    LinearLayout fldGrpmn0602;
    @BindView(R.id.mn060201)
    CheckBox mn060201;
    @BindView(R.id.mn060202)
    CheckBox mn060202;
    @BindView(R.id.mn060203)
    CheckBox mn060203;
    @BindView(R.id.mn060204)
    CheckBox mn060204;
    @BindView(R.id.mn060288)
    CheckBox mn060288;
    @BindView(R.id.mn060288x)
    EditText mn060288x;
    @BindView(R.id.mn060301)
    CheckBox mn060301;
    @BindView(R.id.mn060302)
    CheckBox mn060302;
    @BindView(R.id.mn060303)
    CheckBox mn060303;
    @BindView(R.id.mn060304)
    CheckBox mn060304;
    @BindView(R.id.mn060305)
    CheckBox mn060305;
    @BindView(R.id.mn060388)
    CheckBox mn060388;
    @BindView(R.id.mn060388x)
    EditText mn060388x;
    @BindView(R.id.mn0604)
    RadioGroup mn0604;
    @BindView(R.id.mn060401)
    RadioButton mn060401;
    @BindView(R.id.mn060402)
    RadioButton mn060402;
    @BindView(R.id.mn060403)
    RadioButton mn060403;
    @BindView(R.id.mn060404)
    RadioButton mn060404;
    @BindView(R.id.mn060405)
    RadioButton mn060405;
    @BindView(R.id.mn060488)
    RadioButton mn060488;
    @BindView(R.id.mn060488x)
    EditText mn060488x;
    @BindView(R.id.mn0605)
    RadioGroup mn0605;
    @BindView(R.id.mn060501)
    RadioButton mn060501;
    @BindView(R.id.mn060502)
    RadioButton mn060502;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section6);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }

    @OnLongClick(R.id.btn_End)
    boolean onBtnEndLongClick() {

        return true;
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }

    @OnLongClick(R.id.btn_Continue)
    boolean onBtnContinueLongClick() {

        return true;
    }
}
