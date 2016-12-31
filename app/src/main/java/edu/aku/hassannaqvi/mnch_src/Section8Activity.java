package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
    @BindView(R.id.mn0821)
    RadioGroup mn0821;
    @BindView(R.id.mn082199)
    RadioButton mn082199;
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
    @BindView(R.id.mn0823)
    RadioGroup mn0823;
    @BindView(R.id.mn082301)
    RadioButton mn082301;
    @BindView(R.id.mn082302)
    RadioButton mn082302;
    @BindView(R.id.mn082303)
    RadioButton mn082303;
    @BindView(R.id.mn082304)
    RadioButton mn082304;
    @BindView(R.id.mn082302x)
    EditText mn082302x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section8);
        ButterKnife.bind(this);

        appHeader.setText("SRC - > Section 8");

        // ============= Q 5.09 Skip Pattern =================

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
                    mn0821.clearCheck();
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
        endSec.putExtra("complete", false);
        startActivity(endSec);
           /* } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        } */

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

    private void SaveDraft() throws JSONException {
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
        s8.put("mn081302", mn081302.isChecked() ? "1" : "0");
        s8.put("mn081303", mn081303.isChecked() ? "1" : "0");
        s8.put("mn081304", mn081304.isChecked() ? "1" : "0");
        s8.put("mn081305", mn081305.isChecked() ? "1" : "0");
        s8.put("mn081306", mn081306.isChecked() ? "1" : "0");
        s8.put("mn081388", mn081388.isChecked() ? "1" : "0");
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
        s8.put("mn0823", mn082301.isChecked() ? "1" : mn082302.isChecked() ? "2" : mn082303.isChecked() ? "3"
                : mn082304.isChecked() ? "4" : "0");
        s8.put("mn082302x", mn082302x.getText().toString());

        SRCApp.fc.setROW_S8(String.valueOf(s8));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {


        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }



}
