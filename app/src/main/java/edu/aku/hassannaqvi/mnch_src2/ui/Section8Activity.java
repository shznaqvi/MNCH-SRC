package edu.aku.hassannaqvi.mnch_src2.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
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
import edu.aku.hassannaqvi.mnch_src2.R;
import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;
import edu.aku.hassannaqvi.mnch_src2.core.SRCDBHelper;

public class Section8Activity extends Activity {

    private static final String TAG = Section8Activity.class.getSimpleName();

    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0801)
    RadioGroup mn0801;
    @BindView(R.id.mn080101)
    RadioButton mn080101;
    @BindView(R.id.mn080102)
    RadioButton mn080102;
    @BindView(R.id.mn080103)
    RadioButton mn080103;
    @BindView(R.id.mn080104)
    RadioButton mn080104;
    @BindView(R.id.mn080105)
    RadioButton mn080105;
    @BindView(R.id.mn080106)
    RadioButton mn080106;
    @BindView(R.id.mn080188)
    RadioButton mn080188;
    @BindView(R.id.mn080188x)
    EditText mn080188x;
    @BindView(R.id.mn0802a)
    RadioGroup mn0802a;
    @BindView(R.id.mn0802a01)
    RadioButton mn0802a01;
    @BindView(R.id.mn0802a02)
    RadioButton mn0802a02;
    @BindView(R.id.mn0802a03)
    RadioButton mn0802a03;
    @BindView(R.id.mn0802a04)
    RadioButton mn0802a04;
    @BindView(R.id.mn0802a05)
    RadioButton mn0802a05;
    @BindView(R.id.mn0802a06)
    RadioButton mn0802a06;
    @BindView(R.id.mn0802a07)
    RadioButton mn0802a07;
    @BindView(R.id.mn0802a08)
    RadioButton mn0802a08;
    @BindView(R.id.mn0802a88)
    RadioButton mn0802a88;
    @BindView(R.id.mn0802a88x)
    EditText mn0802a88x;
    @BindView(R.id.mn0802b)
    RadioGroup mn0802b;
    @BindView(R.id.mn0802b01)
    RadioButton mn0802b01;
    @BindView(R.id.mn0802b02)
    RadioButton mn0802b02;
    @BindView(R.id.mn0802b03)
    RadioButton mn0802b03;
    @BindView(R.id.mn0802b04)
    RadioButton mn0802b04;
    @BindView(R.id.mn0802b05)
    RadioButton mn0802b05;
    @BindView(R.id.mn0802b06)
    RadioButton mn0802b06;
    @BindView(R.id.mn0802b07)
    RadioButton mn0802b07;
    @BindView(R.id.mn0802b08)
    RadioButton mn0802b08;
    @BindView(R.id.mn0802b09)
    RadioButton mn0802b09;
    @BindView(R.id.mn0802b10)
    RadioButton mn0802b10;
    @BindView(R.id.mn0802b11)
    RadioButton mn0802b11;
    @BindView(R.id.mn0802b88)
    RadioButton mn0802b88;
    @BindView(R.id.mn0802b88x)
    EditText mn0802b88x;
    @BindView(R.id.mn0802c)
    RadioGroup mn0802c;
    @BindView(R.id.mn0802c01)
    RadioButton mn0802c01;
    @BindView(R.id.mn0802c02)
    RadioButton mn0802c02;
    @BindView(R.id.mn0802c03)
    RadioButton mn0802c03;
    @BindView(R.id.mn0802c04)
    RadioButton mn0802c04;
    @BindView(R.id.mn0802c05)
    RadioButton mn0802c05;
    @BindView(R.id.mn0802c06)
    RadioButton mn0802c06;
    @BindView(R.id.mn0802c07)
    RadioButton mn0802c07;
    @BindView(R.id.mn0802c08)
    RadioButton mn0802c08;
    @BindView(R.id.mn0802c09)
    RadioButton mn0802c09;
    @BindView(R.id.mn0802c88)
    RadioButton mn0802c88;
    @BindView(R.id.mn0802c88x)
    EditText mn0802c88x;
    @BindView(R.id.mn0803)
    RadioGroup mn0803;
    @BindView(R.id.mn080301)
    RadioButton mn080301;
    @BindView(R.id.mn080302)
    RadioButton mn080302;
    @BindView(R.id.mn080303)
    RadioButton mn080303;
    @BindView(R.id.mn0804)
    EditText mn0804;
    @BindView(R.id.mn0805)
    RadioGroup mn0805;
    @BindView(R.id.mn080501)
    RadioButton mn080501;
    @BindView(R.id.mn080502)
    RadioButton mn080502;
    @BindView(R.id.mn0806)
    RadioGroup mn0806;
    @BindView(R.id.mn080601)
    RadioButton mn080601;
    @BindView(R.id.mn080602)
    RadioButton mn080602;
    @BindView(R.id.mn080603)
    RadioButton mn080603;
    @BindView(R.id.mn080604)
    RadioButton mn080604;
    @BindView(R.id.mn080605)
    RadioButton mn080605;
    @BindView(R.id.mn080606)
    RadioButton mn080606;
    @BindView(R.id.mn080607)
    RadioButton mn080607;
    @BindView(R.id.mn080608)
    RadioButton mn080608;
    @BindView(R.id.mn080609)
    RadioButton mn080609;
    @BindView(R.id.mn080610)
    RadioButton mn080610;
    @BindView(R.id.mn080611)
    RadioButton mn080611;
    @BindView(R.id.mn080688)
    RadioButton mn080688;
    @BindView(R.id.mn080688x)
    EditText mn080688x;
    @BindView(R.id.mn0807)
    RadioGroup mn0807;
    @BindView(R.id.mn080701)
    RadioButton mn080701;
    @BindView(R.id.mn080702)
    RadioButton mn080702;
    @BindView(R.id.mn080703)
    RadioButton mn080703;
    @BindView(R.id.mn080704)
    RadioButton mn080704;
    @BindView(R.id.mn080705)
    RadioButton mn080705;
    @BindView(R.id.mn080706)
    RadioButton mn080706;
    @BindView(R.id.mn080707)
    RadioButton mn080707;
    @BindView(R.id.mn080708)
    RadioButton mn080708;
    @BindView(R.id.mn080709)
    RadioButton mn080709;
    @BindView(R.id.mn080710)
    RadioButton mn080710;
    @BindView(R.id.mn080711)
    RadioButton mn080711;
    @BindView(R.id.mn080712)
    RadioButton mn080712;
    @BindView(R.id.mn080713)
    RadioButton mn080713;
    @BindView(R.id.mn080714)
    RadioButton mn080714;
    @BindView(R.id.mn080715)
    RadioButton mn080715;
    @BindView(R.id.mn080788)
    RadioButton mn080788;
    @BindView(R.id.mn080788x)
    EditText mn080788x;
    @BindView(R.id.mn0808)
    RadioGroup mn0808;
    @BindView(R.id.mn080801)
    RadioButton mn080801;
    @BindView(R.id.mn080802)
    RadioButton mn080802;
    @BindView(R.id.mn080803)
    RadioButton mn080803;
    @BindView(R.id.mn080804)
    RadioButton mn080804;
    @BindView(R.id.mn080805)
    RadioButton mn080805;
    @BindView(R.id.mn080806)
    RadioButton mn080806;
    @BindView(R.id.mn080807)
    RadioButton mn080807;
    @BindView(R.id.mn080808)
    RadioButton mn080808;
    @BindView(R.id.mn080809)
    RadioButton mn080809;
    @BindView(R.id.mn080810)
    RadioButton mn080810;
    @BindView(R.id.mn080811)
    RadioButton mn080811;
    @BindView(R.id.mn080812)
    RadioButton mn080812;
    @BindView(R.id.mn080813)
    RadioButton mn080813;
    @BindView(R.id.mn080814)
    RadioButton mn080814;
    @BindView(R.id.mn080815)
    RadioButton mn080815;
    @BindView(R.id.mn080888)
    RadioButton mn080888;
    @BindView(R.id.mn080888x)
    EditText mn080888x;
    @BindView(R.id.mn0809)
    RadioGroup mn0809;
    @BindView(R.id.mn080901)
    RadioButton mn080901;
    @BindView(R.id.mn080902)
    RadioButton mn080902;
    @BindView(R.id.fldGrpmn0810)
    LinearLayout fldGrpmn0810;
    @BindView(R.id.mn0810)
    EditText mn0810;
    @BindView(R.id.mn0811)
    RadioGroup mn0811;
    @BindView(R.id.mn081101)
    RadioButton mn081101;
    @BindView(R.id.mn081102)
    RadioButton mn081102;
    @BindView(R.id.mn081103)
    RadioButton mn081103;
    @BindView(R.id.mn081104)
    RadioButton mn081104;
    @BindView(R.id.mn0812)
    RadioGroup mn0812;
    @BindView(R.id.mn081201)
    RadioButton mn081201;
    @BindView(R.id.mn081202)
    RadioButton mn081202;
    @BindView(R.id.mn081301)
    CheckBox mn081301;
    @BindView(R.id.mn081302)
    CheckBox mn081302;
    @BindView(R.id.mn081303)
    CheckBox mn081303;
    @BindView(R.id.mn081304)
    CheckBox mn081304;
    @BindView(R.id.mn081305)
    CheckBox mn081305;
    @BindView(R.id.mn081306)
    CheckBox mn081306;
    @BindView(R.id.mn081388)
    CheckBox mn081388;
    @BindView(R.id.mn081388x)
    EditText mn081388x;
    @BindView(R.id.mn0814)
    RadioGroup mn0814;
    @BindView(R.id.mn081401)
    RadioButton mn081401;
    @BindView(R.id.mn081402)
    RadioButton mn081402;
    @BindView(R.id.mn081403)
    RadioButton mn081403;
    @BindView(R.id.mn081404)
    RadioButton mn081404;
    @BindView(R.id.mn081405)
    RadioButton mn081405;
    @BindView(R.id.mn081406)
    RadioButton mn081406;
    @BindView(R.id.mn081407)
    RadioButton mn081407;
    @BindView(R.id.mn081408)
    RadioButton mn081408;
    @BindView(R.id.mn081409)
    RadioButton mn081409;
    @BindView(R.id.mn081410)
    RadioButton mn081410;
    @BindView(R.id.mn081411)
    RadioButton mn081411;
    @BindView(R.id.mn081488)
    RadioButton mn081488;
    @BindView(R.id.mn081488x)
    EditText mn081488x;
    @BindView(R.id.mn0815)
    RadioGroup mn0815;
    @BindView(R.id.mn081501)
    RadioButton mn081501;
    @BindView(R.id.mn081502)
    RadioButton mn081502;
    @BindView(R.id.fldGrpmn0816)
    LinearLayout fldGrpmn0816;
    @BindView(R.id.mn0816)
    EditText mn0816;
    @BindView(R.id.mn0817)
    RadioGroup mn0817;
    @BindView(R.id.mn081701)
    RadioButton mn081701;
    @BindView(R.id.mn081702)
    RadioButton mn081702;
    @BindView(R.id.mn0818)
    RadioGroup mn0818;
    @BindView(R.id.mn081801)
    RadioButton mn081801;
    @BindView(R.id.mn081802)
    RadioButton mn081802;
    @BindView(R.id.mn0819)
    RadioGroup mn0819;
    @BindView(R.id.mn081901)
    RadioButton mn081901;
    @BindView(R.id.mn081902)
    RadioButton mn081902;
    @BindView(R.id.mn0820)
    RadioGroup mn0820;
    @BindView(R.id.mn082001)
    RadioButton mn082001;
    @BindView(R.id.mn082002)
    RadioButton mn082002;
    @BindView(R.id.fldGrpmn0821)
    LinearLayout fldGrpmn0821;
    @BindView(R.id.mn082101)
    EditText mn082101;
    @BindView(R.id.mn082102)
    EditText mn082102;
    //    @BindView(R.id.mn0821)
//    RadioGroup mn0821;
    @BindView(R.id.mn082199)
    CheckBox mn082199;
    @BindView(R.id.mn082201)
    EditText mn082201;
    @BindView(R.id.mn082202)
    EditText mn082202;
    @BindView(R.id.mn082203)
    EditText mn082203;
    @BindView(R.id.mn082204)
    EditText mn082204;
    @BindView(R.id.mn082205)
    EditText mn082205;
    @BindView(R.id.mn082206)
    EditText mn082206;
    @BindView(R.id.mn082207)
    EditText mn082207;
    @BindView(R.id.mn082208)
    EditText mn082208;
    @BindView(R.id.mn082209)
    EditText mn082209;
    @BindView(R.id.mn082210)
    EditText mn082210;
    @BindView(R.id.mn082211)
    EditText mn082211;
    @BindView(R.id.mn082212)
    EditText mn082212;
    @BindView(R.id.mn082213)
    EditText mn082213;
    @BindView(R.id.mn082214)
    EditText mn082214;
    @BindView(R.id.mn082215)
    EditText mn082215;
    @BindView(R.id.mn082216)
    EditText mn082216;
    @BindView(R.id.mn082217)
    EditText mn082217;
    @BindView(R.id.mn082218)
    EditText mn082218;
    @BindView(R.id.mn082219)
    EditText mn082219;
    @BindView(R.id.mn082220)
    EditText mn082220;
    @BindView(R.id.fldGrpmn0812)
    LinearLayout fldGrpmn0812;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section8);
        ButterKnife.bind(this);

        appHeader.setText("SRC - > Section 8");


        // ============== 8.12 ============

        mn0812.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn081201.isChecked()) {
                    fldGrpmn0812.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0812.setVisibility(View.GONE);
                    mn081301.setChecked(false);
                    mn081302.setChecked(false);
                    mn081303.setChecked(false);
                    mn081304.setChecked(false);
                    mn081305.setChecked(false);
                    mn081306.setChecked(false);
                    mn081388.setChecked(false);
                    mn081388x.setText(null);
                }
            }
        });


        // ============= Q 8.09 Skip Pattern =================

        mn0809.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn080901.isChecked()) {
                    fldGrpmn0810.setVisibility(View.VISIBLE);

                } else {
                    fldGrpmn0810.setVisibility(View.GONE);
                    mn0810.setText(null);
                    mn0811.clearCheck();
                }
            }
        });

        // ============= Q 8.15 Skip Pattern =================

        mn0815.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn081501.isChecked()) {
                    fldGrpmn0816.setVisibility(View.VISIBLE);

                } else {
                    fldGrpmn0816.setVisibility(View.GONE);
                    mn0816.setText(null);

                }
            }
        });

        // ============= Q 8.20 Skip Pattern =================

        mn0820.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn082001.isChecked()) {
                    fldGrpmn0821.setVisibility(View.VISIBLE);

                } else {
                    fldGrpmn0821.setVisibility(View.GONE);
                    mn082101.setText(null);
                    mn082102.setText(null);
//                    mn0821.clearCheck();
                    mn082199.setChecked(false);
                }
            }
        });

        mn082199.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mn082101.setText(null);
                mn082102.setText(null);
                if (isChecked) {
                    mn082101.setVisibility(View.GONE);
                    mn082102.setVisibility(View.GONE);
                } else {
                    mn082101.setVisibility(View.VISIBLE);
                    mn082102.setVisibility(View.VISIBLE);
                }
            }
        });


        //  ============================= Q 8.01 Others ==============================
        mn0801.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn080188.getId()) {

                    mn080188x.setVisibility(View.VISIBLE);
                    mn080188x.requestFocus();

                } else {

                    mn080188x.setVisibility(View.GONE);
                    mn080188x.setText(null);
                }
            }
        });

        //  ============================= Q 8.02(a) Others ==============================
        mn0802a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn0802a88.getId()) {

                    mn0802a88x.setVisibility(View.VISIBLE);
                    mn0802a88x.requestFocus();

                } else {

                    mn0802a88x.setVisibility(View.GONE);
                    mn0802a88x.setText(null);
                }
            }
        });

        //  ============================= Q 8.02(b) Others ==============================
        mn0802b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn0802b88.getId()) {

                    mn0802b88x.setVisibility(View.VISIBLE);
                    mn0802b88x.requestFocus();

                } else {

                    mn0802b88x.setVisibility(View.GONE);
                    mn0802b88x.setText(null);
                }
            }
        });

        //  ============================= Q 8.02(c) Others ==============================
        mn0802c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn0802c88.getId()) {

                    mn0802c88x.setVisibility(View.VISIBLE);
                    mn0802c88x.requestFocus();

                } else {

                    mn0802c88x.setVisibility(View.GONE);
                    mn0802c88x.setText(null);
                }
            }
        });

        //  ============================= Q 8.06 Others ==============================
        mn0806.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn080688.getId()) {

                    mn080688x.setVisibility(View.VISIBLE);
                    mn080688x.requestFocus();

                } else {

                    mn080688x.setVisibility(View.GONE);
                    mn080688x.setText(null);
                }
            }
        });

        //  ============================= Q 8.07 Others ==============================
        mn0807.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn080788.getId()) {

                    mn080788x.setVisibility(View.VISIBLE);
                    mn080788x.requestFocus();

                } else {

                    mn080788x.setVisibility(View.GONE);
                    mn080788x.setText(null);
                }
            }
        });

        //  ============================= Q 8.08 Others ==============================
        mn0808.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn080888.getId()) {

                    mn080888x.setVisibility(View.VISIBLE);
                    mn080888x.requestFocus();

                } else {

                    mn080888x.setVisibility(View.GONE);
                    mn080888x.setText(null);
                }
            }
        });

        //  =========================== Q 8.13 Others ================================
        mn081388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn081388x.setVisibility(View.VISIBLE);
                    mn081388x.requestFocus();
                } else {
                    mn081388x.setVisibility(View.GONE);
                    mn081388x.setText(null);

                }
            }
        });

        //  ============================= Q 8.14 Others ==============================
        mn0814.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn081488.getId()) {

                    mn081488x.setVisibility(View.VISIBLE);
                    mn081488x.requestFocus();

                } else {

                    mn081488x.setVisibility(View.GONE);
                    mn081488x.setText(null);
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
        endSec.putExtra("check", false);
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
                if (SaveDraft()) {

                    if (UpdateDB()) {
                        Toast.makeText(this, "Saving Form", Toast.LENGTH_SHORT).show();

                        finish();

                        startActivity(new Intent(this, EndingActivity.class).putExtra("check", true));
                    } else {
                        Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);

        int updcount = db.updateS8();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject s8 = new JSONObject();

        s8.put("mn0801", mn080101.isChecked() ? "1" : mn080102.isChecked() ? "2" : mn080103.isChecked() ? "3"
                : mn080104.isChecked() ? "4" : mn080105.isChecked() ? "5" : mn080106.isChecked() ? "6"
                : mn080188.isChecked() ? "88" : "0");
        s8.put("mn080188x", mn080188x.getText().toString());
        s8.put("mn0802a", mn0802a01.isChecked() ? "1" : mn0802a02.isChecked() ? "2" : mn0802a03.isChecked() ? "3"
                : mn0802a04.isChecked() ? "4" : mn0802a05.isChecked() ? "5" : mn0802a06.isChecked() ? "6"
                : mn0802a07.isChecked() ? "7" : mn0802a08.isChecked() ? "8" : mn0802a88.isChecked() ? "88" : "0");
        s8.put("mn0802a88x", mn0802a88x.getText().toString());
        s8.put("mn0802b", mn0802b01.isChecked() ? "1" : mn0802b02.isChecked() ? "2" : mn0802b03.isChecked() ? "3"
                : mn0802b04.isChecked() ? "4" : mn0802b05.isChecked() ? "5" : mn0802b06.isChecked() ? "6"
                : mn0802b07.isChecked() ? "7" : mn0802b08.isChecked() ? "8" : mn0802b09.isChecked() ? "9"
                : mn0802b10.isChecked() ? "10" : mn0802b11.isChecked() ? "11" : mn0802b88.isChecked() ? "88" : "0");
        s8.put("mn0802b88x", mn0802b88x.getText().toString());
        s8.put("mn0802c", mn0802c01.isChecked() ? "1" : mn0802c02.isChecked() ? "2" : mn0802c03.isChecked() ? "3"
                : mn0802c04.isChecked() ? "4" : mn0802c05.isChecked() ? "5" : mn0802c06.isChecked() ? "6"
                : mn0802c07.isChecked() ? "7" : mn0802c08.isChecked() ? "8" : mn0802c09.isChecked() ? "9"
                : mn0802b88.isChecked() ? "88" : "0");
        s8.put("mn0802c88x", mn0802b88x.getText().toString());
        s8.put("mn0803", mn080301.isChecked() ? "1" : mn080302.isChecked() ? "2" : mn080303.isChecked() ? "3" : "0");
        s8.put("mn0804", mn0804.getText().toString());
        s8.put("mn0805", mn080501.isChecked() ? "1" : mn080502.isChecked() ? "2" : "0");
        s8.put("mn0806", mn080601.isChecked() ? "1" : mn080602.isChecked() ? "2" : mn080603.isChecked() ? "3"
                : mn080604.isChecked() ? "4" : mn080605.isChecked() ? "5" : mn080606.isChecked() ? "6"
                : mn080607.isChecked() ? "7" : mn080608.isChecked() ? "8" : mn080609.isChecked() ? "9"
                : mn080610.isChecked() ? "10" : mn080611.isChecked() ? "11" : mn080688.isChecked() ? "88" : "0");
        s8.put("mn080688x", mn080688x.getText().toString());
        s8.put("mn0807", mn080701.isChecked() ? "1" : mn080702.isChecked() ? "2" : mn080703.isChecked() ? "3"
                : mn080704.isChecked() ? "4" : mn080705.isChecked() ? "5" : mn080706.isChecked() ? "6"
                : mn080707.isChecked() ? "7" : mn080708.isChecked() ? "8" : mn080709.isChecked() ? "9"
                : mn080710.isChecked() ? "10" : mn080711.isChecked() ? "11" : mn080712.isChecked() ? "12"
                : mn080713.isChecked() ? "13" : mn080714.isChecked() ? "14" : mn080715.isChecked() ? "15"
                : mn080788.isChecked() ? "88" : "0");
        s8.put("mn080788x", mn080788x.getText().toString());
        s8.put("mn0808", mn080801.isChecked() ? "1" : mn080802.isChecked() ? "2" : mn080803.isChecked() ? "3"
                : mn080804.isChecked() ? "4" : mn080805.isChecked() ? "5" : mn080806.isChecked() ? "6"
                : mn080807.isChecked() ? "7" : mn080808.isChecked() ? "8" : mn080809.isChecked() ? "9"
                : mn080810.isChecked() ? "10" : mn080811.isChecked() ? "11" : mn080812.isChecked() ? "12"
                : mn080813.isChecked() ? "13" : mn080814.isChecked() ? "14" : mn080815.isChecked() ? "15"
                : mn080888.isChecked() ? "88" : "0");
        s8.put("mn080888x", mn080888x.getText().toString());
        s8.put("mn0809", mn080901.isChecked() ? "1" : mn080902.isChecked() ? "2" : "0");
        s8.put("mn0810", mn0810.getText().toString());
        s8.put("mn0811", mn081101.isChecked() ? "1" : mn081102.isChecked() ? "2" : mn081103.isChecked() ? "3"
                : mn081104.isChecked() ? "4" : "0");
        s8.put("mn0812", mn081201.isChecked() ? "1" : mn081202.isChecked() ? "2" : "0");
        s8.put("mn081301", mn081301.isChecked() ? "1" : "0");
        s8.put("mn081302", mn081302.isChecked() ? "2" : "0");
        s8.put("mn081303", mn081303.isChecked() ? "3" : "0");
        s8.put("mn081304", mn081304.isChecked() ? "4" : "0");
        s8.put("mn081305", mn081305.isChecked() ? "5" : "0");
        s8.put("mn081306", mn081306.isChecked() ? "6" : "0");
        s8.put("mn081388", mn081388.isChecked() ? "88" : "0");
        s8.put("mn081388x", mn081388x.getText().toString());
        s8.put("mn0814", mn081401.isChecked() ? "1" : mn081402.isChecked() ? "2" : mn081403.isChecked() ? "3"
                : mn081404.isChecked() ? "4" : mn081405.isChecked() ? "5" : mn081406.isChecked() ? "6"
                : mn081407.isChecked() ? "7" : mn081408.isChecked() ? "8" : mn081409.isChecked() ? "9"
                : mn081410.isChecked() ? "10" : mn081411.isChecked() ? "11" : mn081488.isChecked() ? "88" : "0");
        s8.put("mn081488x", mn081488x.getText().toString());
        s8.put("mn0815", mn081501.isChecked() ? "1" : mn081502.isChecked() ? "2" : "0");
        s8.put("mn0816", mn0816.getText().toString());
        s8.put("mn0817", mn081701.isChecked() ? "1" : mn081702.isChecked() ? "2" : "0");
        s8.put("mn0818", mn081801.isChecked() ? "1" : mn081802.isChecked() ? "2" : "0");
        s8.put("mn0819", mn081901.isChecked() ? "1" : mn081902.isChecked() ? "2" : "0");
        s8.put("mn0820", mn082001.isChecked() ? "1" : mn082002.isChecked() ? "2" : "0");
        s8.put("mn082101", mn082101.getText().toString());
        s8.put("mn082102", mn082102.getText().toString());
        s8.put("mn082199", mn082199.isChecked() ? "99" : "0");
        s8.put("mn082201", mn082201.getText().toString());
        s8.put("mn082202", mn082202.getText().toString());
        s8.put("mn082203", mn082203.getText().toString());
        s8.put("mn082204", mn082204.getText().toString());
        s8.put("mn082205", mn082205.getText().toString());
        s8.put("mn082206", mn082206.getText().toString());
        s8.put("mn082207", mn082207.getText().toString());
        s8.put("mn082208", mn082208.getText().toString());
        s8.put("mn082209", mn082209.getText().toString());
        s8.put("mn082210", mn082210.getText().toString());
        s8.put("mn082211", mn082211.getText().toString());
        s8.put("mn082212", mn082212.getText().toString());
        s8.put("mn082213", mn082213.getText().toString());
        s8.put("mn082214", mn082214.getText().toString());
        s8.put("mn082215", mn082215.getText().toString());
        s8.put("mn082216", mn082216.getText().toString());
        s8.put("mn082217", mn082217.getText().toString());
        s8.put("mn082218", mn082218.getText().toString());
        s8.put("mn082219", mn082219.getText().toString());
        s8.put("mn082220", mn082220.getText().toString());


        SRCApp.fc.setROW_S8(String.valueOf(s8));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        return true;
    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ============ Q 8.01 =======================
        // RadioGroup
        if (mn0801.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0801), Toast.LENGTH_LONG).show();
            mn080188.setError("This data is Required!");    // Set Error on last radio button
            mn080188.requestFocus();
            mn080188.setFocusableInTouchMode(true);
            mn080188.setFocusable(true);
            Log.i(TAG, "mn0801: This data is Required!");
            return false;
        } else {
            mn080188.setError(null);
        }

        // Others / EditText Q 8.01
        if (mn080188.isChecked() && mn080188x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0801) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn080188x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0801: This data is Required!");
            mn080188x.requestFocus();
            return false;
        } else {
            mn080188x.setError(null);
        }

        // ============ Q 8.02(a) =======================
        // RadioGroup
        if (mn0802a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0802a), Toast.LENGTH_LONG).show();
            mn0802a88.setError("This data is Required!");    // Set Error on last radio button
            mn0802a88.requestFocus();
            mn0802a88.setFocusable(true);
            mn0802a88.setFocusableInTouchMode(true);
            Log.i(TAG, "mn0802a: This data is Required!");
            return false;
        } else {
            mn0802a88.setError(null);
        }

        // Others / EditText Q 8.02 (a)
        if (mn0802a88.isChecked() && mn0802a88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0802a) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn0802a88x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0802a: This data is Required!");
            mn0802a88x.requestFocus();

            return false;
        } else {
            mn0802a88x.setError(null);
        }

        // ============ Q 8.02(b) =======================
        // RadioGroup
        if (mn0802b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0802b), Toast.LENGTH_LONG).show();
            mn0802b88.setError("This data is Required!");    // Set Error on last radio button
            mn0802b88.setFocusableInTouchMode(true);
            mn0802b88.setFocusable(true);
            mn0802b88.requestFocus();
            Log.i(TAG, "mn0802b: This data is Required!");
            return false;
        } else {
            mn0802b88.setError(null);
        }

        // Others / EditText Q 8.02 (b)
        if (mn0802b88.isChecked() && mn0802b88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0802b) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn0802b88x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0802b: This data is Required!");
            mn0802b88x.requestFocus();

            return false;
        } else {
            mn0802b88x.setError(null);
        }

        // ============ Q 8.02(c) =======================
        // RadioGroup
        if (mn0802c.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0802c), Toast.LENGTH_LONG).show();
            mn0802c88.setError("This data is Required!");    // Set Error on last radio button
            mn0802c88.requestFocus();
            mn0802c88.setFocusable(true);
            mn0802c88.setFocusableInTouchMode(true);
            Log.i(TAG, "mn0802c: This data is Required!");
            return false;
        } else {
            mn0802c88.setError(null);
        }

        // Others / EditText Q 8.02 (c)
        if (mn0802c88.isChecked() && mn0802c88x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0802c) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn0802c88x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0802c: This data is Required!");
            mn0802c88x.requestFocus();
            return false;
        } else {
            mn0802c88x.setError(null);
        }

        // ============ Q 8.03 =======================
        // RadioGroup
        if (mn0803.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0803), Toast.LENGTH_LONG).show();
            mn080303.setError("This data is Required!");    // Set Error on last radio button
            mn080303.setFocusableInTouchMode(true);
            mn080303.setFocusable(true);
            mn080303.requestFocus();
            Log.i(TAG, "mn0803: This data is Required!");
            return false;
        } else {
            mn080303.setError(null);
        }

        // ============== Q 8.04 =================
        if (mn0804.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0804) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn0804.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0804: This data is Required!");
            mn0804.requestFocus();
            return false;
        } else {
            mn0804.setError(null);
        }

        if ((Integer.parseInt(mn0804.getText().toString()) < 1) || (Integer.parseInt(mn0804.getText().toString()) > 20)) {
            Toast.makeText(this, "Range is 0 - 20 Rooms", Toast.LENGTH_LONG).show();
            mn0804.setError("Range is 0 - 20 Rooms.. Check Again");// Set Error on last radio button
            mn0804.requestFocus();
            return false;

        } else {
            mn0804.setError(null);
        }
        // ============ Q 8.05 =======================
        // RadioGroup
        if (mn0805.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0805), Toast.LENGTH_LONG).show();
            mn080502.setError("This data is Required!");    // Set Error on last radio button
            mn080502.requestFocus();
            mn080502.setFocusable(true);
            mn080502.setFocusableInTouchMode(true);
            Log.i(TAG, "mn0805: This data is Required!");
            return false;
        } else {
            mn080502.setError(null);
        }

        // ============ Q 8.06 =======================
        // RadioGroup
        if (mn0806.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0806), Toast.LENGTH_LONG).show();
            mn080688.setError("This data is Required!");    // Set Error on last radio button
            mn080688.requestFocus();
            mn080688.setFocusableInTouchMode(true);
            mn080688.setFocusable(true);
            Log.i(TAG, "mn0806: This data is Required!");
            return false;
        } else {
            mn080688.setError(null);
        }

        // Others / EditText Q 8.06
        if (mn080688.isChecked() && mn080688x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0806) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn080688x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0806: This data is Required!");
            mn080688x.requestFocus();
            return false;
        } else {
            mn080688x.setError(null);
        }
        if (mn0807.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0807), Toast.LENGTH_LONG).show();
            mn080788.setError("This data is Required!");    // Set Error on last radio button
            mn080788.requestFocus();
            mn080788.setFocusable(true);
            mn080788.setFocusableInTouchMode(true);
            Log.i(TAG, "mn0808: This data is Required!");
            return false;
        } else {
            mn080788.setError(null);
        }

        // ============ Q 8.08 =======================
        // RadioGroup
        if (mn0808.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0808), Toast.LENGTH_LONG).show();
            mn080888.setError("This data is Required!");    // Set Error on last radio button
            mn080888.setFocusableInTouchMode(true);
            mn080888.setFocusable(true);
            mn080888.requestFocus();
            Log.i(TAG, "mn0808: This data is Required!");
            return false;
        } else {
            mn080888.setError(null);
        }

        // Others / EditText Q 8.08
        if (mn080888.isChecked() && mn080888x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0808) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn080888x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0808: This data is Required!");
            mn080888x.requestFocus();
            return false;
        } else {
            mn080888x.setError(null);
        }

        // ============ Q 8.09 =======================
        // RadioGroup
        if (mn0809.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0809), Toast.LENGTH_LONG).show();
            mn080902.setError("This data is Required!");    // Set Error on last radio button
            mn080902.requestFocus();
            mn080902.setFocusable(true);
            mn080902.setFocusableInTouchMode(true);
            Log.i(TAG, "mn0809: This data is Required!");
            return false;
        } else {
            mn080902.setError(null);
        }

        // ============ Q 8.09 to 8.11 Skip Check =======================

        if (mn080901.isChecked()) {
            if (mn0810.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0810) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn0810.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0810: This data is Required!");
                mn0810.requestFocus();
                return false;
            } else {
                mn0810.setError(null);
            }

            if ((Integer.parseInt(mn0810.getText().toString()) < 1) || (Integer.parseInt(mn0810.getText().toString()) > 180)) {
                Toast.makeText(this, "Range is 1 - 180 Minutes", Toast.LENGTH_LONG).show();
                mn0810.setError("Range is 1 - 180 Minutes.. Check Again");// Set Error on last radio button
                mn0810.requestFocus();
                return false;

            } else {
                mn0810.setError(null);
            }

            if (mn0811.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0811), Toast.LENGTH_LONG).show();
                mn081104.setError("This data is Required!");    // Set Error on last radio button
                mn081104.requestFocus();
                mn081104.setFocusableInTouchMode(true);
                mn081104.setFocusable(true);
                Log.i(TAG, "mn0811: This data is Required!");
                return false;
            } else {
                mn081104.setError(null);
            }


        }

        // ======================== Q 8.12 ==================
        if (mn0812.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0812) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn081202.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0812: This data is Required!");
            mn081202.requestFocus();
            mn081202.setFocusable(true);
            mn081202.setFocusableInTouchMode(true);
            return false;
        } else {
            mn081202.setError(null);
        }

        // ==================== Q 8.13 =========================
        if (mn081201.isChecked()) {
            if (!(mn081301.isChecked() || mn081302.isChecked() || mn081303.isChecked() || mn081304.isChecked()
                    || mn081304.isChecked() || mn081305.isChecked() || mn081306.isChecked() || mn081388.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0813), Toast.LENGTH_LONG).show();
                mn081388.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0813: This data is Required!");
                mn081388.requestFocus();
                return false;
            } else {
                mn081388.setError(null);
            }
        }

        // =================== Edit Text / Q 8.13 Others =================
        if (mn081388.isChecked() && mn081388x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0813), Toast.LENGTH_LONG).show();
            mn081388x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0813: This data is Required!");
            mn081388x.requestFocus();
            return false;
        } else {
            mn081388x.setError(null);
        }

        // ======================== Q 8.14 ==================
        if (mn0814.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0814) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn081488.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0814: This data is Required!");
            mn081488.requestFocus();
            mn081488.setFocusableInTouchMode(true);
            mn081488.setFocusable(true);
            return false;
        } else {
            mn081488.setError(null);
        }
        // =================== Edit Text / Q 8.14 Others =================
        if (mn081488.isChecked() && mn081488x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0814), Toast.LENGTH_LONG).show();
            mn081488x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0814: This data is Required!");
            mn081488x.requestFocus();

            return false;
        } else {
            mn081488x.setError(null);
        }

        // ============ Q 8.15 =======================
        // RadioGroup
        if (mn0815.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0815), Toast.LENGTH_LONG).show();
            mn081502.setError("This data is Required!");    // Set Error on last radio button
            mn081502.requestFocus();
            mn081502.setFocusable(true);
            mn081502.setFocusableInTouchMode(true);
            Log.i(TAG, "mn0815: This data is Required!");
            return false;
        } else {
            mn081502.setError(null);
        }

        // ============= Skip Check Q 8.15 ===============

        if (mn081501.isChecked()) {
            if (mn0816.getText().toString().isEmpty()) {
                Toast.makeText(this, "Empty(Require): " + getString(R.string.mn0816), Toast.LENGTH_LONG).show();
                mn0816.setError("This data is required!");
                mn0816.requestFocus();
                return false;

            } else {
                mn0816.setError(null);
            }
            if ((Integer.parseInt(mn0816.getText().toString()) < 1) || (Integer.parseInt(mn0816.getText().toString()) > 20)) {
                Toast.makeText(this, "Range is 1 - 20", Toast.LENGTH_LONG).show();
                mn0816.setError("Range is 1 - 20 .. Check Again");// Set Error on last radio button
                Log.d(TAG, "formValidation: 0816 not selected");
                mn0816.requestFocus();
                return false;

            } else {
                mn0816.setError(null);
            }

        }

        // ============ Q 8.17 =======================
        // RadioGroup
        if (mn0817.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0817), Toast.LENGTH_LONG).show();
            mn081702.setError("This data is Required!");    // Set Error on last radio button
            mn081702.requestFocus();
            mn081702.setFocusableInTouchMode(true);
            mn081702.setFocusable(true);
            Log.i(TAG, "mn0817: This data is Required!");
            return false;
        } else {
            mn081702.setError(null);
        }

        // ============ Q 8.18 =======================
        // RadioGroup
        if (mn0818.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0818), Toast.LENGTH_LONG).show();
            mn081802.setError("This data is Required!");    // Set Error on last radio button
            mn081802.requestFocus();
            mn081802.setFocusable(true);
            mn081802.setFocusableInTouchMode(true);
            Log.i(TAG, "mn0818: This data is Required!");
            return false;
        } else {
            mn081802.setError(null);
        }

        // ============ Q 8.19 =======================
        // RadioGroup
        if (mn0819.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0819), Toast.LENGTH_LONG).show();
            mn081902.setError("This data is Required!");    // Set Error on last radio button
            mn081902.setFocusableInTouchMode(true);
            mn081902.setFocusable(true);
            mn081902.requestFocus();

            Log.i(TAG, "mn0819: This data is Required!");
            return false;
        } else {
            mn081902.setError(null);
        }

        // ============ Q 8.20 =======================
        // RadioGroup
        if (mn0820.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0820), Toast.LENGTH_LONG).show();
            mn082002.setError("This data is Required!");    // Set Error on last radio button
            mn082002.requestFocus();
            mn082002.setFocusable(true);
            mn082002.setFocusableInTouchMode(true);
            Log.i(TAG, "mn0820: This data is Required!");
            return false;
        } else {
            mn082002.setError(null);
        }

        // =========== Skip Check Q 8.20 =============

        if (mn082001.isChecked()) {
            if (!(mn082199.isChecked())) {
                if (mn082101.getText().toString().isEmpty() && mn082102.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0821), Toast.LENGTH_LONG).show();
                    mn082199.setError("This data is Required!");    // Set Error on last radio button
                    mn082199.requestFocus();
                    Log.i(TAG, "mn0821: This data is Required!");
                    return false;
                } else {
                    mn082199.setError(null);
                }
                if (!mn082101.getText().toString().isEmpty() && Integer.valueOf(mn082102.getText().toString()) == 0) {
                    if ((Integer.parseInt(mn082101.getText().toString()) < 1) || (Integer.parseInt(mn082101.getText().toString()) > 999)) {
                        Toast.makeText(this, "Range is 0 - 999 acre", Toast.LENGTH_LONG).show();
                        mn082101.setError("Range is 0 - 999 .. Check Again");// Set Error on last radio button
                        mn082101.requestFocus();
                        return false;

                    } else {
                        mn082101.setError(null);
                    }
                }
                if (!mn082102.getText().toString().isEmpty() && Integer.valueOf(mn082101.getText().toString()) == 0) {
                    if ((Integer.parseInt(mn082102.getText().toString()) < 1) || (Integer.parseInt(mn082102.getText().toString()) > 999)) {
                        Toast.makeText(this, "Range is 0 - 999 ", Toast.LENGTH_LONG).show();
                        mn082102.setError("Range is 0 - 999 .. Check Again");// Set Error on last radio button
                        mn082102.requestFocus();
                        return false;

                    } else {
                        mn082102.setError(null);
                    }
                }
            }
        }

        if (mn082201.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082201), Toast.LENGTH_LONG).show();
            mn082201.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082201.requestFocus();
            Log.i(TAG, "mn082201: This data is Required!");
            return false;
        } else {
            mn082201.setError(null);
        }

        if (mn082202.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082202), Toast.LENGTH_LONG).show();
            mn082202.setError("This data is Required! or Place 0");    // Set Error on last radio button
            mn082202.requestFocus();
            Log.i(TAG, "mn082202: This data is Required!");
            return false;
        } else {
            mn082202.setError(null);
        }

        if (mn082203.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082203), Toast.LENGTH_LONG).show();
            mn082203.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082203.requestFocus();
            Log.i(TAG, "mn082203: This data is Required!");
            return false;
        } else {
            mn082203.setError(null);
        }

        if (mn082204.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082204), Toast.LENGTH_LONG).show();
            mn082204.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082204.requestFocus();
            Log.i(TAG, "mn082204: This data is Required!");
            return false;
        } else {
            mn082204.setError(null);
        }

        if (mn082205.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082205), Toast.LENGTH_LONG).show();
            mn082205.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082205.requestFocus();
            Log.i(TAG, "mn082205: This data is Required!");
            return false;
        } else {
            mn082205.setError(null);
        }

        if (mn082206.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082206), Toast.LENGTH_LONG).show();
            mn082206.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082206.requestFocus();
            Log.i(TAG, "mn082206: This data is Required!");
            return false;
        } else {
            mn082206.setError(null);
        }

        if (mn082207.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082207), Toast.LENGTH_LONG).show();
            mn082207.setError("This data is Required! Or type 'none'");    // Set Error on last radio button
            mn082207.requestFocus();
            Log.i(TAG, "mn082207: This data is Required!");
            return false;
        } else {
            mn082207.setError(null);
        }

        if (mn082208.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082208), Toast.LENGTH_LONG).show();
            mn082208.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082208.requestFocus();
            Log.i(TAG, "mn082208: This data is Required!");
            return false;
        } else {
            mn082208.setError(null);
        }

        if (mn082209.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082209), Toast.LENGTH_LONG).show();
            mn082209.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082209.requestFocus();
            Log.i(TAG, "mn082209: This data is Required!");
            return false;
        } else {
            mn082209.setError(null);
        }

        if (mn082210.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082210), Toast.LENGTH_LONG).show();
            mn082210.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082210.requestFocus();
            Log.i(TAG, "mn082210: This data is Required!");
            return false;
        } else {
            mn082210.setError(null);
        }

        if (mn082211.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082211), Toast.LENGTH_LONG).show();
            mn082211.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082211.requestFocus();
            Log.i(TAG, "mn082211: This data is Required!");
            return false;
        } else {
            mn082211.setError(null);
        }

        if (mn082212.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082212), Toast.LENGTH_LONG).show();
            mn082212.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082212.requestFocus();
            Log.i(TAG, "mn082212: This data is Required!");
            return false;
        } else {
            mn082212.setError(null);
        }

        if (mn082213.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082213), Toast.LENGTH_LONG).show();
            mn082213.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082213.requestFocus();
            Log.i(TAG, "mn082213: This data is Required!");
            return false;
        } else {
            mn082213.setError(null);
        }

        if (mn082214.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082214), Toast.LENGTH_LONG).show();
            mn082214.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082214.requestFocus();
            Log.i(TAG, "mn082214: This data is Required!");
            return false;
        } else {
            mn082214.setError(null);
        }

        if (mn082215.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082215), Toast.LENGTH_LONG).show();
            mn082215.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082215.requestFocus();
            Log.i(TAG, "mn082215: This data is Required!");
            return false;
        } else {
            mn082215.setError(null);
        }

        if (mn082216.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082216), Toast.LENGTH_LONG).show();
            mn082216.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082216.requestFocus();
            Log.i(TAG, "mn082216: This data is Required!");
            return false;
        } else {
            mn082216.setError(null);
        }

        if (mn082217.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082217), Toast.LENGTH_LONG).show();
            mn082217.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082217.requestFocus();
            Log.i(TAG, "mn082217: This data is Required!");
            return false;
        } else {
            mn082217.setError(null);
        }

        if (mn082218.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082218), Toast.LENGTH_LONG).show();
            mn082218.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082218.requestFocus();
            Log.i(TAG, "mn082218: This data is Required!");
            return false;
        } else {
            mn082218.setError(null);
        }

        if (mn082219.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082219), Toast.LENGTH_LONG).show();
            mn082219.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082219.requestFocus();
            Log.i(TAG, "mn082219: This data is Required!");
            return false;
        } else {
            mn082219.setError(null);
        }

        if (mn082220.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn082220), Toast.LENGTH_LONG).show();
            mn082220.setError("This data is Required! Or Place 0");    // Set Error on last radio button
            mn082220.requestFocus();
            Log.i(TAG, "mn082220: This data is Required!");
            return false;
        } else {
            mn082220.setError(null);
        }


        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }


}
