package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Section5bActivity extends Activity {

    private static final String TAG = Section5bActivity.class.getSimpleName();

    @BindView(R.id.activity_section5b)
    FrameLayout activitySection5b;
    @BindView(R.id.section5bScrollView)
    ScrollView section5bScrollView;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0530)
    RadioGroup mn0530;
    @BindView(R.id.mn053001)
    RadioButton mn053001;
    @BindView(R.id.mn053002)
    RadioButton mn053002;
    @BindView(R.id.mn053003)
    RadioButton mn053003;
    @BindView(R.id.mn053004)
    RadioButton mn053004;
    @BindView(R.id.mn053005)
    RadioButton mn053005;
    @BindView(R.id.mn053006)
    RadioButton mn053006;
    @BindView(R.id.mn053007)
    RadioButton mn053007;
    @BindView(R.id.mn053008)
    RadioButton mn053008;
    @BindView(R.id.mn053088)
    RadioButton mn053088;
    @BindView(R.id.mn053088x)
    EditText mn053088x;
    @BindView(R.id.fldGrpmn0531)
    LinearLayout fldGrpmn0531;
    @BindView(R.id.mn0531)
    RadioGroup mn0531;
    @BindView(R.id.mn053101)
    RadioButton mn053101;
    @BindView(R.id.mn053102)
    RadioButton mn053102;
    @BindView(R.id.mn0532)
    RadioGroup mn0532;
    @BindView(R.id.mn053201)
    RadioButton mn053201;
    @BindView(R.id.mn053202)
    RadioButton mn053202;
    @BindView(R.id.mn053203)
    RadioButton mn053203;
    @BindView(R.id.mn053204)
    RadioButton mn053204;
    @BindView(R.id.mn053205)
    RadioButton mn053205;
    @BindView(R.id.mn053206)
    RadioButton mn053206;
    @BindView(R.id.mn053288)
    RadioButton mn053288;
    @BindView(R.id.mn053288x)
    EditText mn053288x;
    @BindView(R.id.mn053301)
    CheckBox mn053301;
    @BindView(R.id.mn053302)
    CheckBox mn053302;
    @BindView(R.id.mn053303)
    CheckBox mn053303;
    @BindView(R.id.mn053304)
    CheckBox mn053304;
    @BindView(R.id.mn053305)
    CheckBox mn053305;
    @BindView(R.id.mn053306)
    CheckBox mn053306;
    @BindView(R.id.mn053307)
    CheckBox mn053307;
    @BindView(R.id.mn053308)
    CheckBox mn053308;
    @BindView(R.id.mn053388)
    CheckBox mn053388;
    @BindView(R.id.mn053388x)
    EditText mn053388x;
    @BindView(R.id.mn0534)
    RadioGroup mn0534;
    @BindView(R.id.mn053401)
    RadioButton mn053401;
    @BindView(R.id.mn053402)
    RadioButton mn053402;
    @BindView(R.id.mn053403)
    RadioButton mn053403;
    @BindView(R.id.mn053404)
    RadioButton mn053404;
    @BindView(R.id.mn053488)
    RadioButton mn053488;
    @BindView(R.id.mn053488x)
    EditText mn053488x;
    @BindView(R.id.mn0535)
    RadioGroup mn0535;
    @BindView(R.id.mn053501)
    RadioButton mn053501;
    @BindView(R.id.mn053502)
    RadioButton mn053502;
    @BindView(R.id.mn053601)
    CheckBox mn053601;
    @BindView(R.id.mn053602)
    CheckBox mn053602;
    @BindView(R.id.mn053603)
    CheckBox mn053603;
    @BindView(R.id.mn053604)
    CheckBox mn053604;
    @BindView(R.id.mn053605)
    CheckBox mn053605;
    @BindView(R.id.mn053606)
    CheckBox mn053606;
    @BindView(R.id.mn053688)
    CheckBox mn053688;
    @BindView(R.id.mn053688x)
    EditText mn053688x;
    @BindView(R.id.mn0537)
    RadioGroup mn0537;
    @BindView(R.id.mn053701)
    RadioButton mn053701;
    @BindView(R.id.mn053702)
    RadioButton mn053702;
    @BindView(R.id.mn0538)
    RadioGroup mn0538;
    @BindView(R.id.mn053801)
    RadioButton mn053801;
    @BindView(R.id.mn053802)
    RadioButton mn053802;
    @BindView(R.id.mn053803)
    RadioButton mn053803;
    @BindView(R.id.mn053804)
    RadioButton mn053804;
    @BindView(R.id.mn053805)
    RadioButton mn053805;
    @BindView(R.id.mn053806)
    RadioButton mn053806;
    @BindView(R.id.mn053888)
    RadioButton mn053888;
    @BindView(R.id.mn053888x)
    EditText mn053888x;
    @BindView(R.id.mn0539)
    RadioGroup mn0539;
    @BindView(R.id.mn053901)
    RadioButton mn053901;
    @BindView(R.id.mn053902)
    RadioButton mn053902;
    @BindView(R.id.mn053903)
    RadioButton mn053903;
    @BindView(R.id.mn0540)
    RadioGroup mn0540;
    @BindView(R.id.mn054001)
    RadioButton mn054001;
    @BindView(R.id.mn054002)
    RadioButton mn054002;
    @BindView(R.id.fldGrpmn0541)
    LinearLayout fldGrpmn0541;
    @BindView(R.id.mn0541)
    RadioGroup mn0541;
    @BindView(R.id.mn054101)
    RadioButton mn054101;
    @BindView(R.id.mn054102)
    RadioButton mn054102;
    @BindView(R.id.mn054201)
    CheckBox mn054201;
    @BindView(R.id.mn054202)
    CheckBox mn054202;
    @BindView(R.id.mn054203)
    CheckBox mn054203;
    @BindView(R.id.mn054204)
    CheckBox mn054204;
    @BindView(R.id.mn054205)
    CheckBox mn054205;
    @BindView(R.id.mn054288)
    CheckBox mn054288;
    @BindView(R.id.mn054288x)
    EditText mn054288x;
    @BindView(R.id.mn0543)
    RadioGroup mn0543;
    @BindView(R.id.mn054301)
    RadioButton mn054301;
    @BindView(R.id.mn054302)
    RadioButton mn054302;
    @BindView(R.id.mn054303)
    RadioButton mn054303;
    @BindView(R.id.mn054304)
    RadioButton mn054304;
    @BindView(R.id.mn054305)
    RadioButton mn054305;
    @BindView(R.id.mn054306)
    RadioButton mn054306;
    @BindView(R.id.mn054307)
    RadioButton mn054307;
    @BindView(R.id.mn054377)
    RadioButton mn054377;
    @BindView(R.id.mn054388)
    RadioButton mn054388;
    @BindView(R.id.mn054388x)
    EditText mn054388x;
    @BindView(R.id.fldGrpmn0544)
    LinearLayout fldGrpmn0544;
    @BindView(R.id.mn0544)
    RadioGroup mn0544;
    @BindView(R.id.mn054401)
    RadioButton mn054401;
    @BindView(R.id.mn054402)
    RadioButton mn054402;
    @BindView(R.id.mn054403)
    RadioButton mn054403;
    @BindView(R.id.mn054404)
    RadioButton mn054404;
    @BindView(R.id.mn054405)
    RadioButton mn054405;
    @BindView(R.id.mn054406)
    RadioButton mn054406;
    @BindView(R.id.mn054407)
    RadioButton mn054407;
    //@BindView(R.id.mn054477)
    //RadioButton mn054477;
    @BindView(R.id.mn054488)
    RadioButton mn054488;
    @BindView(R.id.mn054488x)
    EditText mn054488x;
    @BindView(R.id.mn0545)
    RadioGroup mn0545;
    @BindView(R.id.mn054501)
    RadioButton mn054501;
    @BindView(R.id.mn054502)
    RadioButton mn054502;
    @BindView(R.id.mn054503)
    RadioButton mn054503;
    @BindView(R.id.mn054504)
    RadioButton mn054504;
    @BindView(R.id.mn054505)
    RadioButton mn054505;
    @BindView(R.id.mn054506)
    RadioButton mn054506;
    @BindView(R.id.mn054588)
    RadioButton mn054588;
    @BindView(R.id.mn054588x)
    EditText mn054588x;
    @BindView(R.id.fldGrpmn0532)
    LinearLayout fldGrpmn0532;
    @BindView(R.id.fldGrpmn0536)
    LinearLayout fldGrpmn0536;
    @BindView(R.id.lbl_hhhead1)
    TextView lbl_hhhdead1;
    @BindView(R.id.fldGrpmn0545)
    LinearLayout fldGrpmn0545;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5b);
        ButterKnife.bind(this);

        appHeader.setText("SRC - > Section 5B");

        // ================ 5.32======================

        mn053307.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn053301.setEnabled(false);
                    mn053301.setChecked(false);
                    mn053302.setEnabled(false);
                    mn053302.setChecked(false);
                    mn053303.setEnabled(false);
                    mn053303.setChecked(false);
                    mn053304.setEnabled(false);
                    mn053304.setChecked(false);
                    mn053305.setEnabled(false);
                    mn053305.setChecked(false);
                    mn053306.setEnabled(false);
                    mn053306.setChecked(false);
                    mn053308.setEnabled(false);
                    mn053308.setChecked(false);
                    mn053388.setEnabled(false);
                    mn053388.setChecked(false);
                    mn053388x.setEnabled(false);

                } else {
                    mn053301.setEnabled(true);
                    mn053302.setEnabled(true);
                    mn053303.setEnabled(true);
                    mn053304.setEnabled(true);
                    mn053305.setEnabled(true);
                    mn053306.setEnabled(true);
                    mn053307.setEnabled(true);
                    mn053308.setEnabled(true);
                    mn053388.setEnabled(true);
                    mn053388x.setEnabled(true);
                }
            }
        });

        // ============= Q 5.30 Skip Pattern =================

        mn0530.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn053001.getId()) {
                    fldGrpmn0531.setVisibility(View.GONE);
                    fldGrpmn0532.setVisibility(View.VISIBLE);
                    mn0531.clearCheck();

                } else {

                    fldGrpmn0531.setVisibility(View.VISIBLE);
                    fldGrpmn0532.setVisibility(View.GONE);
                    mn0532.clearCheck();
                    mn053288x.setText(null);


                }

                if (checkedId == mn053088.getId()) {

                    mn053088x.setVisibility(View.VISIBLE);
                    mn053088x.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mn053088x.getWindowToken(), 0);

                } else {

                    mn053088x.setVisibility(View.GONE);
                    mn053088x.setText(null);
                }
            }
        });


        // ================================== Q 5.32 Others =========================
        mn0532.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn053288.getId()) {

                    mn053288x.setVisibility(View.VISIBLE);
                    mn053288x.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mn053288x.getWindowToken(), 0);

                } else {

                    mn053288x.setVisibility(View.GONE);
                    mn053288x.setText(null);
                }
            }
        });

        // =========================== Q 5.34 Others ============================
        mn0534.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn053488.getId()) {

                    mn053488x.setVisibility(View.VISIBLE);
                    mn053488x.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mn053488x.getWindowToken(), 0);

                } else {

                    mn053488x.setVisibility(View.GONE);
                    mn053488x.setText(null);
                }
            }
        });

        // ============================ Q 5.38 Others ==================================
        mn0538.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn053888.getId()) {

                    mn053888x.setVisibility(View.VISIBLE);
                    mn053888x.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mn053888x.getWindowToken(), 0);

                } else {

                    mn053888x.setVisibility(View.GONE);
                    mn053888x.setText(null);
                }
            }
        });

        // ==================================== Q 5.40 Skip Pattern ====================
        mn0540.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn054001.isChecked()) {
                    fldGrpmn0541.setVisibility(View.VISIBLE);
                    fldGrpmn0544.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0541.setVisibility(View.GONE);
                    fldGrpmn0544.setVisibility(View.GONE);
                    // Check Box
                    mn054201.setChecked(false);
                    mn054202.setChecked(false);
                    mn054203.setChecked(false);
                    mn054204.setChecked(false);
                    mn054205.setChecked(false);
                    mn054288.setChecked(false);
                    mn054288x.setText(null);
                    // Radio
                    mn0541.clearCheck();
                    mn0543.clearCheck();
                    mn0544.clearCheck();
                    mn0545.clearCheck();

                }
            }
        });

        // ============================= Q 5.43 Skip Pattern ========================
        mn0543.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn054377.isChecked()) {
                    fldGrpmn0544.setVisibility(View.GONE);
                    fldGrpmn0545.setVisibility(View.VISIBLE);
                    mn0544.clearCheck();
                    mn054488x.setText(null);
                } else {
                    fldGrpmn0544.setVisibility(View.VISIBLE);
                    fldGrpmn0545.setVisibility(View.GONE);
                    mn0545.clearCheck();
                }

                if (checkedId == mn054388.getId()) {

                    mn054388x.setVisibility(View.VISIBLE);
                    mn054388x.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mn054388x.getWindowToken(), 0);

                } else {

                    mn054388x.setVisibility(View.GONE);
                    mn054388x.setText(null);
                }
            }
        });


        // =============================== Q 5.44 Others ========================
        mn0544.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn054488.getId()) {

                    mn054488x.setVisibility(View.VISIBLE);
                    mn054488x.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mn054488x.getWindowToken(), 0);

                } else {

                    mn054488x.setVisibility(View.GONE);
                    mn054488x.setText(null);
                }
            }
        });

        //  ============================= Q 5.45 Others ==============================
        mn0545.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn054588.getId()) {

                    mn054588x.setVisibility(View.VISIBLE);
                    mn054588x.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mn054588x.getWindowToken(), 0);

                } else {

                    mn054588x.setVisibility(View.GONE);
                    mn054588x.setText(null);
                }
            }
        });

        //  =========================== Q 5.33 Others ================================
        mn053388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn053388x.setVisibility(View.VISIBLE);
                    mn053388x.requestFocus();
                } else {
                    mn053388x.setVisibility(View.GONE);
                    mn053388x.setText(null);

                }
            }
        });


        //==================================== Q 5.42 others ==============================
        mn054288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn054288x.setVisibility(View.VISIBLE);
                    mn054288x.requestFocus();
                } else {
                    mn054288x.setVisibility(View.GONE);
                    mn054288x.setText(null);

                }
            }
        });

        // ============================= Q 5.35 Skip Pattern ========================
        mn0535.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn053501.isChecked()) {
                    fldGrpmn0536.setVisibility(View.VISIBLE);

                } else {
                    fldGrpmn0536.setVisibility(View.GONE);
                    // Check Boxes
                    mn053601.setChecked(false);
                    mn053602.setChecked(false);
                    mn053603.setChecked(false);
                    mn053604.setChecked(false);
                    mn053605.setChecked(false);
                    mn053606.setChecked(false);
                    mn053688.setChecked(false);

                    // Edit Text
                    mn053688x.setText(null);

                }
            }
        });

        // ============================ Q 5.36 Others ======================================
        mn053688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn053688x.setVisibility(View.VISIBLE);
                    mn053688x.requestFocus();
                } else {
                    mn053688x.setVisibility(View.GONE);
                    mn053688x.setText(null);

                }
            }
        });


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Not Processing This Section", Toast.LENGTH_SHORT).show();
       /* if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {*/
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent secNext = new Intent(this, Section5cActivity.class);
                secNext.putExtra("check", false);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);

        int updcount = db.updateS5b();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject s5b = new JSONObject();

        // Radio Group
        s5b.put("mn0530", mn053001.isChecked() ? "1" : mn053002.isChecked() ? "2" : mn053003.isChecked() ? "3"
                : mn053004.isChecked() ? "4" : mn053005.isChecked() ? "5" : mn053006.isChecked() ? "6"
                : mn053007.isChecked() ? "7" : mn053008.isChecked() ? "8" : mn053088.isChecked() ? "88" : "0");
        // Edit Text
        s5b.put("mn053088x", mn053088x.getText().toString());

        // Radio Group
        s5b.put("mn0531", mn053101.isChecked() ? "1" : mn053102.isChecked() ? "2" : "0");

        s5b.put("mn0532", mn053201.isChecked() ? "1" : mn053202.isChecked() ? "2" : mn053203.isChecked() ? "3"
                : mn053204.isChecked() ? "4" : mn053205.isChecked() ? "5" : mn053206.isChecked() ? "6"
                : mn053288.isChecked() ? "88" : "0");

        //Edit Text
        s5b.put("mn053288x", mn053288x.getText().toString());

        // Checkbox
        s5b.put("mn053301", mn053301.isChecked() ? "1" : "0");
        s5b.put("mn053302", mn053302.isChecked() ? "2" : "0");
        s5b.put("mn053303", mn053303.isChecked() ? "3" : "0");
        s5b.put("mn053304", mn053304.isChecked() ? "4" : "0");
        s5b.put("mn053305", mn053305.isChecked() ? "5" : "0");
        s5b.put("mn053306", mn053306.isChecked() ? "6" : "0");
        s5b.put("mn053307", mn053307.isChecked() ? "7" : "0");
        s5b.put("mn053308", mn053308.isChecked() ? "8" : "0");
        s5b.put("mn053388", mn053388.isChecked() ? "88" : "0");

        //Edit Text
        s5b.put("mn053388x", mn053388x.getText().toString());

        // Radio Group
        s5b.put("mn0534", mn053401.isChecked() ? "1" : mn053402.isChecked() ? "2" : mn053403.isChecked() ? "3"
                : mn053404.isChecked() ? "4" : mn053488.isChecked() ? "88" : "0");

        //Edit Text
        s5b.put("mn053488x", mn053488x.getText().toString());

        // Radio
        s5b.put("mn0535", mn053501.isChecked() ? "1" : mn053502.isChecked() ? "2" : "0");

        // Checkbox
        s5b.put("mn053601", mn053601.isChecked() ? "1" : "0");
        s5b.put("mn053602", mn053602.isChecked() ? "2" : "0");
        s5b.put("mn053603", mn053603.isChecked() ? "3" : "0");
        s5b.put("mn053604", mn053604.isChecked() ? "4" : "0");
        s5b.put("mn053605", mn053605.isChecked() ? "5" : "0");
        s5b.put("mn053606", mn053606.isChecked() ? "6" : "0");
        s5b.put("mn053607", mn053688.isChecked() ? "88" : "0");

        //Edit Text
        s5b.put("mn053688x", mn053688x.getText().toString());


        //Radio Group
        s5b.put("mn0537", mn053701.isChecked() ? "1" : mn053702.isChecked() ? "2" : "0");

        s5b.put("mn0538", mn053801.isChecked() ? "1" : mn053802.isChecked() ? "2" : mn053803.isChecked() ? "3"
                : mn053804.isChecked() ? "4" : mn053805.isChecked() ? "5" : mn053806.isChecked() ? "6"
                : mn053888.isChecked() ? "88" : "0");

        //Edit Text
        s5b.put("mn053888x", mn053888x.getText().toString());

        // Radio Group
        s5b.put("mn0539", mn053901.isChecked() ? "1" : mn053902.isChecked() ? "2" : mn053903.isChecked() ? "3" : "0");
        s5b.put("mn0540", mn054001.isChecked() ? "1" : mn054002.isChecked() ? "2" : "0");
        s5b.put("mn0541", mn054101.isChecked() ? "1" : mn054102.isChecked() ? "2" : "0");

        // Checkbox
        s5b.put("mn054201", mn054201.isChecked() ? "1" : "0");
        s5b.put("mn054202", mn054202.isChecked() ? "2" : "0");
        s5b.put("mn054203", mn054203.isChecked() ? "3" : "0");
        s5b.put("mn054204", mn054204.isChecked() ? "4" : "0");
        s5b.put("mn054205", mn054205.isChecked() ? "5" : "0");
        s5b.put("mn054206", mn054288.isChecked() ? "88" : "0");

        //Edit Text
        s5b.put("mn054288x", mn054288x.getText().toString());


        // Radio Group
        s5b.put("mn0543", mn054301.isChecked() ? "1" : mn054302.isChecked() ? "2" : mn054303.isChecked() ? "3"
                : mn054304.isChecked() ? "4" : mn054305.isChecked() ? "5" : mn054306.isChecked() ? "6"
                : mn054307.isChecked() ? "7" : mn054377.isChecked() ? "77" : mn054388.isChecked() ? "88" : "0");
        //Edit Text
        s5b.put("mn054388x", mn054388x.getText().toString());

        // Radio Group
        s5b.put("mn0544", mn054401.isChecked() ? "1" : mn054402.isChecked() ? "2" : mn054403.isChecked() ? "3"
                : mn054404.isChecked() ? "4" : mn054405.isChecked() ? "5" : mn054406.isChecked() ? "6"
                : mn054407.isChecked() ? "7" : mn054488.isChecked() ? "88" : "0");

        //Edit Text
        s5b.put("mn054488x", mn054488x.getText().toString());

        // Radio Group
        s5b.put("mn0545", mn054501.isChecked() ? "1" : mn054502.isChecked() ? "2" : mn054503.isChecked() ? "3"
                : mn054504.isChecked() ? "4" : mn054505.isChecked() ? "5" : mn054506.isChecked() ? "6"
                : mn054588.isChecked() ? "88" : "0");
        //Edit Text
        s5b.put("mn054588x", mn054588x.getText().toString());

        SRCApp.fc.setROW_S5b(String.valueOf(s5b));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ============ Q 5.30 =======================
        // RadioGroup
        if (mn0530.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0530), Toast.LENGTH_LONG).show();
            mn053088.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0530: This data is Required!");
            return false;
        } else {
            mn053088.setError(null);
        }

        // Others / EditText Q 5.30
        if (mn053088.isChecked() && mn053088x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0530) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn053088x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0530: This data is Required!");
            return false;
        } else {
            mn053088x.setError(null);
        }

        // Skip Check 5.30 Go to 5.31
        if (mn053002.isChecked() || mn053003.isChecked() || mn053004.isChecked() || mn053005.isChecked()
                || mn053006.isChecked() || mn053007.isChecked() || mn053088.isChecked()) {
            if (mn0531.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0531), Toast.LENGTH_LONG).show();
                mn053102.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0531: This data is Required!");
                return false;
            } else {
                mn053102.setError(null);
            }
        }
        // Skip Check 5.30 Go to 5.32
        if (mn053001.isChecked()) {
            if (mn0532.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0532), Toast.LENGTH_LONG).show();
                mn053288.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0532: This data is Required!");
                return false;
            } else {
                mn053288.setError(null);
            }

            if (mn053288.isChecked() && mn053288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0532), Toast.LENGTH_LONG).show();
                mn053288x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0532: This data is Required!");
                return false;
            } else {
                mn053288x.setError(null);
            }
        }

        //======================== Q 5.33 =====================
        //  CheckBox
        if (!(mn053301.isChecked() || mn053302.isChecked() || mn053303.isChecked() || mn053304.isChecked()
                || mn053305.isChecked() || mn053306.isChecked() || mn053306.isChecked() || mn053307.isChecked()
                || mn053308.isChecked() || mn053388.isChecked())) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0533), Toast.LENGTH_LONG).show();
            mn053388.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0533: This data is Required!");
            return false;
        } else {
            mn053388.setError(null);
        }


        // Others / EditText Q 5.33
        if (mn053388.isChecked() && mn053388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0533) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn053388x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0533: This data is Required!");
            return false;
        } else {
            mn053388x.setError(null);
        }


        //================================= Q 5.34 =============================
        // RadioGroup
        if (mn0534.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0534), Toast.LENGTH_LONG).show();
            mn053488.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0534: This data is Required!");
            return false;
        } else {
            mn053488.setError(null);
        }

        // Others / EditText Q 5.34
        if (mn053488.isChecked() && mn053488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0534) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn053488x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0534: This data is Required!");
            return false;
        } else {
            mn053488x.setError(null);
        }

        // ========================== Q 5.35 ======================
        // RadioGroup
        if (mn0535.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0535), Toast.LENGTH_LONG).show();
            mn053502.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0535: This data is Required!");
            return false;
        } else {
            mn053502.setError(null);
        }

        // Skip check 5.35
        if (mn053501.isChecked()) {
            //  CheckBox
            if (!(mn053601.isChecked() || mn053602.isChecked() || mn053603.isChecked() || mn053604.isChecked()
                    || mn053605.isChecked() || mn053606.isChecked() || mn053688.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0536), Toast.LENGTH_LONG).show();
                mn053688.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0536: This data is Required!");
                return false;
            } else {
                mn053688.setError(null);
            }
        }

        // Others / EditText Q 5.36
        if (mn053688.isChecked() && mn053688x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0536) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn053688x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0536: This data is Required!");
            return false;
        } else {
            mn053688x.setError(null);
        }

        // ============================== Q 5.37=====================
        // RadioGroup
        if (mn0537.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0537), Toast.LENGTH_LONG).show();
            mn053702.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0537: This data is Required!");
            return false;
        } else {
            mn053702.setError(null);
        }

        // ===================== Q 5.38 ===========================
        // RadioGroup
        if (mn0538.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0538), Toast.LENGTH_LONG).show();
            mn053888.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0538: This data is Required!");
            return false;
        } else {
            mn053888.setError(null);
        }

        // Others / EditText Q 5.38
        if (mn053888.isChecked() && mn053888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0538) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn053888x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0538: This data is Required!");
            return false;
        } else {
            mn053888x.setError(null);
        }

        // ===================== Q 5.39 ===========================
        // RadioGroup
        if (mn0539.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0539), Toast.LENGTH_LONG).show();
            mn053903.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0539: This data is Required!");
            return false;
        } else {
            mn053903.setError(null);
        }

        // ===================== Q 5.40 ===========================
        // RadioGroup
        if (mn0540.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0540), Toast.LENGTH_LONG).show();
            mn054002.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0539: This data is Required!");
            return false;
        } else {
            mn054002.setError(null);
        }

        // Skip check 5.40
        if (mn054001.isChecked()) {
            //  Radio
            if (mn0541.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0541), Toast.LENGTH_LONG).show();
                mn054102.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mn0541: This data is Required!");
                return false;
            } else {
                mn054102.setError(null);
            }
            // Skip Check 5.42 Check Box
            if (!(mn054201.isChecked() || mn054202.isChecked() || mn054203.isChecked() || mn054204.isChecked()
                    || mn054205.isChecked() || mn054288.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0542), Toast.LENGTH_LONG).show();
                mn054288.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0542: This data is Required!");
                return false;
            } else {
                mn054288.setError(null);
            }

            // Others / EditText Q 5.42
            if (mn054288.isChecked() && mn054288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0542) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn054288x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0542: This data is Required!");
                return false;
            } else {
                mn054288x.setError(null);
            }

            //  Skip Check 5.43 Radio
            if (mn0543.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0543), Toast.LENGTH_LONG).show();
                mn054302.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mn0543: This data is Required!");
                return false;
            } else {
                mn054302.setError(null);
            }

            // Others / EditText Q 5.43
            if (mn054388.isChecked() && mn054388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0543) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn054388x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0543: This data is Required!");
                return false;
            } else {
                mn054388x.setError(null);
            }

            //  Skip Check 5.44 Radio

            if(!mn054377.isChecked()) {
                if (mn0544.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0544), Toast.LENGTH_LONG).show();
                    mn054488.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mn0544: This data is Required!");
                    return false;
                } else {
                    mn054488.setError(null);
                }

                // Others / EditText Q 5.44
                if (mn054488.isChecked() && mn054488x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0544) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                    mn054488x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0544: This data is Required!");
                    return false;
                } else {
                    mn054488x.setError(null);
                }
            }

            //  Skip Check 5.45 Radio
            if (mn054377.isChecked()) {
                if (mn0545.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0545), Toast.LENGTH_LONG).show();
                    mn054588.setError("This data is Required!");    // Set Error on last radio button

                    Log.i(TAG, "mn0545: This data is Required!");
                    return false;
                }
            } else {
                mn054588.setError(null);
            }

                // Others / EditText Q 5.45
                if (mn054588.isChecked() && mn054588x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0545) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                    mn054588x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0545: This data is Required!");
                    return false;
                } else {
                    mn054588x.setError(null);
                }
            }


        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
