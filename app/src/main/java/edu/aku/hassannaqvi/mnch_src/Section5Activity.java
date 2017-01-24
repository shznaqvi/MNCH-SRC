package edu.aku.hassannaqvi.mnch_src;

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

public class Section5Activity extends Activity {

    private static final String TAG = Section5Activity.class.getSimpleName();
    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0501)
    RadioGroup mn0501;
    @BindView(R.id.mn050101)
    RadioButton mn050101;
    @BindView(R.id.mn050102)
    RadioButton mn050102;
    @BindView(R.id.fldGrpmn0502)
    LinearLayout fldGrpmn0502;
    @BindView(R.id.mn0502)
    RadioGroup mn0502;
    @BindView(R.id.mn050201)
    RadioButton mn050201;
    @BindView(R.id.mn050202)
    RadioButton mn050202;
    @BindView(R.id.fldGrpmn0503)
    LinearLayout fldGrpmn0503;
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
    @BindView(R.id.mn050401)
    RadioButton mn050401;
    @BindView(R.id.mn050402)
    RadioButton mn050402;
    @BindView(R.id.fldGrpmn0505)
    LinearLayout fldGrpmn0505;
    @BindView(R.id.mn0505)
    RadioGroup mn0505;
    @BindView(R.id.mn050501)
    RadioButton mn050501;
    @BindView(R.id.mn050502)
    RadioButton mn050502;
    @BindView(R.id.mn0506)
    RadioGroup mn0506;
    @BindView(R.id.mn050601)
    RadioButton mn050601;
    @BindView(R.id.mn050602)
    RadioButton mn050602;
    @BindView(R.id.fldGrpmn0507)
    LinearLayout fldGrpmn0507;
    @BindView(R.id.mn050701)
    CheckBox mn050701;
    @BindView(R.id.mn050702)
    CheckBox mn050702;
    @BindView(R.id.mn050703)
    CheckBox mn050703;
    @BindView(R.id.mn050704)
    CheckBox mn050704;
    @BindView(R.id.mn0508)
    RadioGroup mn0508;
    @BindView(R.id.mn050801)
    RadioButton mn050801;
    @BindView(R.id.mn050802)
    RadioButton mn050802;
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
    @BindView(R.id.mn050988)
    CheckBox mn050988;
    @BindView(R.id.mn050988x)
    EditText mn050988x;
    @BindView(R.id.fldGrpmn051001)
    LinearLayout fldGrpmn051001;
    @BindView(R.id.mn051001)
    EditText mn051001;
    @BindView(R.id.fldGrpmn051002)
    LinearLayout fldGrpmn051002;
    @BindView(R.id.mn051002)
    EditText mn051002;
    @BindView(R.id.fldGrpmn051003)
    LinearLayout fldGrpmn051003;
    @BindView(R.id.mn051003)
    EditText mn051003;
    @BindView(R.id.fldGrpmn051004)
    LinearLayout fldGrpmn051004;
    @BindView(R.id.mn051004)
    EditText mn051004;
    @BindView(R.id.mn0511)
    RadioGroup mn0511;
    @BindView(R.id.mn051101)
    RadioButton mn051101;
    @BindView(R.id.mn051102)
    RadioButton mn051102;
    @BindView(R.id.fldGrpmn0512)
    LinearLayout fldGrpmn0512;
//    @BindView(R.id.mn0512)
//    RadioGroup mn0512;
    @BindView(R.id.mn051201)
    EditText mn051201;
    @BindView(R.id.mn051202)
    CheckBox mn051202;
//    @BindView(R.id.mn051201x)
//    EditText mn051201x;
//    @BindView(R.id.mn0513)
//    RadioGroup mn0513;
    @BindView(R.id.mn051301)
    EditText mn051301;
    @BindView(R.id.mn051302)
    CheckBox mn051302;
//    @BindView(R.id.mn051301x)
//    EditText mn051301x;
    @BindView(R.id.mn051401)
    CheckBox mn051401;
    @BindView(R.id.mn051402)
    CheckBox mn051402;
    @BindView(R.id.mn051403)
    CheckBox mn051403;
    @BindView(R.id.mn051404)
    CheckBox mn051404;
    @BindView(R.id.mn051405)
    CheckBox mn051405;
    @BindView(R.id.mn051406)
    CheckBox mn051406;
    @BindView(R.id.mn051407)
    CheckBox mn051407;
    @BindView(R.id.mn051477)
    CheckBox mn051477;
    @BindView(R.id.mn051488)
    CheckBox mn051488;
    @BindView(R.id.mn051488x)
    EditText mn051488x;
    @BindView(R.id.mn051501)
    CheckBox mn051501;
    @BindView(R.id.mn051502)
    CheckBox mn051502;
    @BindView(R.id.mn051503)
    CheckBox mn051503;
    @BindView(R.id.mn051504)
    CheckBox mn051504;
    @BindView(R.id.mn051505)
    CheckBox mn051505;
    @BindView(R.id.mn051506)
    CheckBox mn051506;
    @BindView(R.id.mn051507)
    CheckBox mn051507;
    @BindView(R.id.mn051508)
    CheckBox mn051508;
    @BindView(R.id.mn051588)
    CheckBox mn051588;
    @BindView(R.id.mn051588x)
    EditText mn051588x;
    @BindView(R.id.mn051601)
    CheckBox mn051601;
    @BindView(R.id.mn051602)
    CheckBox mn051602;
    @BindView(R.id.mn051603)
    CheckBox mn051603;
    @BindView(R.id.mn051604)
    CheckBox mn051604;
    @BindView(R.id.mn051605)
    CheckBox mn051605;
    @BindView(R.id.mn051606)
    CheckBox mn051606;
    @BindView(R.id.mn051607)
    CheckBox mn051607;
    @BindView(R.id.mn051608)
    CheckBox mn051608;
    @BindView(R.id.mn051609)
    CheckBox mn051609;
    @BindView(R.id.mn051610)
    CheckBox mn051610;
    @BindView(R.id.mn051688)
    CheckBox mn051688;
    @BindView(R.id.mn051688x)
    EditText mn051688x;
    @BindView(R.id.mn0517a1)
    RadioGroup mn0517a1;
    @BindView(R.id.mn0517a101)
    RadioButton mn0517a101;
    @BindView(R.id.mn0517a102)
    RadioButton mn0517a102;
    @BindView(R.id.mn0517a2d)
    EditText mn0517a2d;
    @BindView(R.id.mn0517a2m)
    EditText mn0517a2m;
    @BindView(R.id.mn0517a3)
    RadioGroup mn0517a3;
    @BindView(R.id.mn0517a301)
    RadioButton mn0517a301;
    @BindView(R.id.mn0517a302)
    RadioButton mn0517a302;
    @BindView(R.id.mn0517a303)
    RadioButton mn0517a303;
    @BindView(R.id.mn0517a304)
    RadioButton mn0517a304;
    @BindView(R.id.mn0517a305)
    RadioButton mn0517a305;
    @BindView(R.id.mn0517a306)
    RadioButton mn0517a306;
    @BindView(R.id.mn0517a307)
    RadioButton mn0517a307;
    @BindView(R.id.mn0517a377)
    RadioButton mn0517a377;
    @BindView(R.id.mn0517b1)
    RadioGroup mn0517b1;
    @BindView(R.id.mn0517b101)
    RadioButton mn0517b101;
    @BindView(R.id.mn0517b102)
    RadioButton mn0517b102;
    @BindView(R.id.mn0517b2d)
    EditText mn0517b2d;
    @BindView(R.id.mn0517b2m)
    EditText mn0517b2m;
    @BindView(R.id.mn0517b3)
    RadioGroup mn0517b3;
    @BindView(R.id.mn0517b301)
    RadioButton mn0517b301;
    @BindView(R.id.mn0517b302)
    RadioButton mn0517b302;
    @BindView(R.id.mn0517b303)
    RadioButton mn0517b303;
    @BindView(R.id.mn0517b304)
    RadioButton mn0517b304;
    @BindView(R.id.mn0517b305)
    RadioButton mn0517b305;
    @BindView(R.id.mn0517b306)
    RadioButton mn0517b306;
    @BindView(R.id.mn0517b307)
    RadioButton mn0517b307;
    @BindView(R.id.mn0517b377)
    RadioButton mn0517b377;
    @BindView(R.id.mn0517c1)
    RadioGroup mn0517c1;
    @BindView(R.id.mn0517c101)
    RadioButton mn0517c101;
    @BindView(R.id.mn0517c102)
    RadioButton mn0517c102;
    @BindView(R.id.mn0517c2d)
    EditText mn0517c2d;
    @BindView(R.id.mn0517c2m)
    EditText mn0517c2m;
    @BindView(R.id.mn0517c3)
    RadioGroup mn0517c3;
    @BindView(R.id.mn0517c301)
    RadioButton mn0517c301;
    @BindView(R.id.mn0517c302)
    RadioButton mn0517c302;
    @BindView(R.id.mn0517c303)
    RadioButton mn0517c303;
    @BindView(R.id.mn0517c304)
    RadioButton mn0517c304;
    @BindView(R.id.mn0517c305)
    RadioButton mn0517c305;
    @BindView(R.id.mn0517c306)
    RadioButton mn0517c306;
    @BindView(R.id.mn0517c307)
    RadioButton mn0517c307;
    @BindView(R.id.mn0517c377)
    RadioButton mn0517c377;
    @BindView(R.id.mn0517d1)
    RadioGroup mn0517d1;
    @BindView(R.id.mn0517d101)
    RadioButton mn0517d101;
    @BindView(R.id.mn0517d102)
    RadioButton mn0517d102;
    @BindView(R.id.mn0517d2d)
    EditText mn0517d2d;
    @BindView(R.id.mn0517d2m)
    EditText mn0517d2m;
    @BindView(R.id.mn0517d3)
    RadioGroup mn0517d3;
    @BindView(R.id.mn0517d301)
    RadioButton mn0517d301;
    @BindView(R.id.mn0517d302)
    RadioButton mn0517d302;
    @BindView(R.id.mn0517d303)
    RadioButton mn0517d303;
    @BindView(R.id.mn0517d304)
    RadioButton mn0517d304;
    @BindView(R.id.mn0517d305)
    RadioButton mn0517d305;
    @BindView(R.id.mn0517d306)
    RadioButton mn0517d306;
    @BindView(R.id.mn0517d307)
    RadioButton mn0517d307;
    @BindView(R.id.mn0517d377)
    RadioButton mn0517d377;
    @BindView(R.id.mn0517e1)
    RadioGroup mn0517e1;
    @BindView(R.id.mn0517e101)
    RadioButton mn0517e101;
    @BindView(R.id.mn0517e102)
    RadioButton mn0517e102;
    @BindView(R.id.mn0517e2d)
    EditText mn0517e2d;
    @BindView(R.id.mn0517e2m)
    EditText mn0517e2m;
    @BindView(R.id.mn0517e3)
    RadioGroup mn0517e3;
    @BindView(R.id.mn0517e301)
    RadioButton mn0517e301;
    @BindView(R.id.mn0517e302)
    RadioButton mn0517e302;
    @BindView(R.id.mn0517e303)
    RadioButton mn0517e303;
    @BindView(R.id.mn0517e304)
    RadioButton mn0517e304;
    @BindView(R.id.mn0517e305)
    RadioButton mn0517e305;
    @BindView(R.id.mn0517e306)
    RadioButton mn0517e306;
    @BindView(R.id.mn0517e307)
    RadioButton mn0517e307;
    @BindView(R.id.mn0517e377)
    RadioButton mn0517e377;
    @BindView(R.id.mn0517f1)
    RadioGroup mn0517f1;
    @BindView(R.id.mn0517f101)
    RadioButton mn0517f101;
    @BindView(R.id.mn0517f102)
    RadioButton mn0517f102;
    @BindView(R.id.mn0517f2d)
    EditText mn0517f2d;
    @BindView(R.id.mn0517f2m)
    EditText mn0517f2m;
    @BindView(R.id.mn0517f3)
    RadioGroup mn0517f3;
    @BindView(R.id.mn0517f301)
    RadioButton mn0517f301;
    @BindView(R.id.mn0517f302)
    RadioButton mn0517f302;
    @BindView(R.id.mn0517f303)
    RadioButton mn0517f303;
    @BindView(R.id.mn0517f304)
    RadioButton mn0517f304;
    @BindView(R.id.mn0517f305)
    RadioButton mn0517f305;
    @BindView(R.id.mn0517f306)
    RadioButton mn0517f306;
    @BindView(R.id.mn0517f307)
    RadioButton mn0517f307;
    @BindView(R.id.mn0517f377)
    RadioButton mn0517f377;
    @BindView(R.id.mn051801)
    CheckBox mn051801;
    @BindView(R.id.mn051802)
    CheckBox mn051802;
    @BindView(R.id.mn051803)
    CheckBox mn051803;
    @BindView(R.id.mn051804)
    CheckBox mn051804;
    @BindView(R.id.mn051805)
    CheckBox mn051805;
    @BindView(R.id.mn051806)
    CheckBox mn051806;
    @BindView(R.id.mn051807)
    CheckBox mn051807;
    @BindView(R.id.mn051808)
    CheckBox mn051808;
    @BindView(R.id.mn051809)
    CheckBox mn051809;
    @BindView(R.id.mn051888)
    CheckBox mn051888;
    @BindView(R.id.mn051888x)
    EditText mn051888x;
    @BindView(R.id.fldGrpmn0519)
    LinearLayout fldGrpmn0519;
    @BindView(R.id.mn051901)
    CheckBox mn051901;
    @BindView(R.id.mn051902)
    CheckBox mn051902;
    @BindView(R.id.mn051903)
    CheckBox mn051903;
    @BindView(R.id.mn051904)
    CheckBox mn051904;
    @BindView(R.id.mn051905)
    CheckBox mn051905;
    @BindView(R.id.mn051906)
    CheckBox mn051906;
    @BindView(R.id.mn051988)
    CheckBox mn051988;
    @BindView(R.id.mn051988x)
    EditText mn051988x;
    @BindView(R.id.mn0520)
    RadioGroup mn0520;
    @BindView(R.id.mn052001)
    RadioButton mn052001;
    @BindView(R.id.mn052002)
    RadioButton mn052002;
    @BindView(R.id.fldGrpmn0521)
    LinearLayout fldGrpmn0521;
    @BindView(R.id.fldGrpmn0522)
    LinearLayout fldGrpmn0522;
    @BindView(R.id.mn0521)
    RadioGroup mn0521;
    @BindView(R.id.mn052101)
    RadioButton mn052101;
    @BindView(R.id.mn052102)
    RadioButton mn052102;
    @BindView(R.id.mn0522)
    RadioGroup mn0522;
    @BindView(R.id.mn052201)
    RadioButton mn052201;
    @BindView(R.id.mn052202)
    RadioButton mn052202;
    @BindView(R.id.mn052203)
    RadioButton mn052203;
    @BindView(R.id.mn052204)
    RadioButton mn052204;
    @BindView(R.id.mn0523)
    RadioGroup mn0523;
    @BindView(R.id.mn052301)
    RadioButton mn052301;
    @BindView(R.id.mn052302)
    RadioButton mn052302;
    @BindView(R.id.fldGrpmn0524)
    LinearLayout fldGrpmn0524;
    @BindView(R.id.mn0524)
    RadioGroup mn0524;
    @BindView(R.id.mn052401)
    RadioButton mn052401;
    @BindView(R.id.mn052402)
    RadioButton mn052402;
    @BindView(R.id.fldGrpmn0525)
    LinearLayout fldGrpmn0525;
    @BindView(R.id.mn0525)
    RadioGroup mn0525;
    @BindView(R.id.mn052501)
    RadioButton mn052501;
    @BindView(R.id.mn052502)
    RadioButton mn052502;
    @BindView(R.id.mn052503)
    RadioButton mn052503;
    @BindView(R.id.mn052504)
    RadioButton mn052504;
    @BindView(R.id.mn052505)
    RadioButton mn052505;
    @BindView(R.id.mn052506)
    RadioButton mn052506;
    @BindView(R.id.mn052588)
    RadioButton mn052588;
    @BindView(R.id.mn052588x)
    EditText mn052588x;
    @BindView(R.id.mn052601)
    CheckBox mn052601;
    @BindView(R.id.mn052602)
    CheckBox mn052602;
    @BindView(R.id.mn052603)
    CheckBox mn052603;
    @BindView(R.id.mn052604)
    CheckBox mn052604;
    @BindView(R.id.mn052605)
    CheckBox mn052605;
    @BindView(R.id.mn052606)
    CheckBox mn052606;
    @BindView(R.id.mn052607)
    CheckBox mn052607;
    @BindView(R.id.mn052608)
    CheckBox mn052608;
    @BindView(R.id.mn052609)
    CheckBox mn052609;
    @BindView(R.id.mn052610)
    CheckBox mn052610;
    @BindView(R.id.mn052611)
    CheckBox mn052611;
    @BindView(R.id.mn052612)
    CheckBox mn052612;
    @BindView(R.id.mn052613)
    CheckBox mn052613;
    @BindView(R.id.mn052614)
    CheckBox mn052614;
    @BindView(R.id.mn052615)
    CheckBox mn052615;
    @BindView(R.id.mn052688)
    CheckBox mn052688;
    @BindView(R.id.mn052688x)
    EditText mn052688x;
    @BindView(R.id.mn0527)
    RadioGroup mn0527;
    @BindView(R.id.mn052701)
    RadioButton mn052701;
    @BindView(R.id.mn052702)
    RadioButton mn052702;
    @BindView(R.id.mn052703)
    RadioButton mn052703;
    @BindView(R.id.mn052704)
    RadioButton mn052704;
    @BindView(R.id.mn052705)
    RadioButton mn052705;
    @BindView(R.id.mn052706)
    RadioButton mn052706;
    @BindView(R.id.mn052707)
    RadioButton mn052707;
    @BindView(R.id.mn052777)
    RadioButton mn052777;
    @BindView(R.id.mn052788)
    RadioButton mn052788;
    @BindView(R.id.mn052788x)
    EditText mn052788x;
    @BindView(R.id.fldGrpmn0528)
    LinearLayout fldGrpmn0528;
    @BindView(R.id.mn0528)
    RadioGroup mn0528;
    @BindView(R.id.mn052801)
    RadioButton mn052801;
    @BindView(R.id.mn052802)
    RadioButton mn052802;
    @BindView(R.id.mn052803)
    RadioButton mn052803;
    @BindView(R.id.mn052804)
    RadioButton mn052804;
    @BindView(R.id.mn052805)
    RadioButton mn052805;
    @BindView(R.id.mn052806)
    RadioButton mn052806;
    @BindView(R.id.mn052807)
    RadioButton mn052807;
    @BindView(R.id.mn052877)
    RadioButton mn052877;
    @BindView(R.id.mn052888)
    RadioButton mn052888;
    @BindView(R.id.mn052888x)
    EditText mn052888x;
    @BindView(R.id.mn052901)
    CheckBox mn052901;
    @BindView(R.id.mn052902)
    CheckBox mn052902;
    @BindView(R.id.mn052903)
    CheckBox mn052903;
    @BindView(R.id.mn052904)
    CheckBox mn052904;
    @BindView(R.id.mn052905)
    CheckBox mn052905;
    @BindView(R.id.mn052906)
    CheckBox mn052906;
    @BindView(R.id.mn052988)
    CheckBox mn052988;
    @BindView(R.id.mn052988x)
    EditText mn052988x;
    @BindView(R.id.fldGrpmn0517a1)
    LinearLayout fldGrpmn0517a1;
    @BindView(R.id.fldGrpmn0517b1)
    LinearLayout fldGrpmn0517b1;
    @BindView(R.id.fldGrpmn0517c1)
    LinearLayout fldGrpmn0517c1;
    @BindView(R.id.fldGrpmn0517d1)
    LinearLayout fldGrpmn0517d1;
    @BindView(R.id.fldGrpmn0517e1)
    LinearLayout fldGrpmn0517e1;
    @BindView(R.id.fldGrpmn0517f1)
    LinearLayout fldGrpmn0517f1;
    @BindView(R.id.fldGrpmn0509)
    LinearLayout fldGrpmn0509;
    @BindView(R.id.fldGrpmn0515)
    LinearLayout fldGrpmn0515;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5);
        ButterKnife.bind(this);

        appHeader.setText("SRC - > Section 5A");

        mn0501.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn050101.isChecked()) {
                    fldGrpmn0502.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0502.setVisibility(View.GONE);
                    mn0502.clearCheck();
                    mn0503.clearCheck();

                }
            }
        });
        mn0502.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn050201.isChecked()) {
                    fldGrpmn0503.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0503.setVisibility(View.GONE);
                    mn0503.clearCheck();

                }
            }
        });
        mn0504.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn050401.isChecked()) {
                    fldGrpmn0505.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0505.setVisibility(View.GONE);
                    mn0505.clearCheck();

                }
            }
        });
        mn0506.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn050601.isChecked()) {
                    fldGrpmn0507.setVisibility(View.VISIBLE);
                    // Skip 5.10 options on 5.07 selection

                } else {
                    fldGrpmn0507.setVisibility(View.GONE);
                    // CheckBoxes
                    mn050701.setChecked(false);
                    mn050702.setChecked(false);
                    mn050703.setChecked(false);
                    mn050704.setChecked(false);
                    // RadioGroup
                    mn0508.clearCheck();
                    // CheckBoxes
                    mn050901.setChecked(false);
                    mn050902.setChecked(false);
                    mn050903.setChecked(false);
                    mn050904.setChecked(false);
                    mn050905.setChecked(false);
                    mn050906.setChecked(false);
                    mn050907.setChecked(false);
                    mn050988.setChecked(false);
                    mn050988x.setText(null);
                    mn051001.setText(null);
                    mn051002.setText(null);
                    mn051003.setText(null);
                    mn051004.setText(null);
                }
            }
        });

        mn050701.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmn051001.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn051001.setVisibility(View.GONE);
                    mn051001.setText(null);
                }
            }
        });
        mn050702.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmn051002.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn051002.setVisibility(View.GONE);
                    mn051002.setText(null);
                }
            }
        });
        mn050703.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmn051003.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn051003.setVisibility(View.GONE);
                    mn051003.setText(null);
                }
            }
        });
        mn050704.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmn051004.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn051004.setVisibility(View.GONE);
                    mn051004.setText(null);
                }
            }
        });
        mn050988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn050988x.setVisibility(View.VISIBLE);
                } else {
                    mn050988x.setVisibility(View.GONE);
                    mn050988x.setText(null);

                }
            }
        });

        mn0508.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn050801.isChecked()) {
                    fldGrpmn0509.setVisibility(View.GONE);
                    mn050901.setChecked(false);
                    mn050902.setChecked(false);
                    mn050903.setChecked(false);
                    mn050904.setChecked(false);
                    mn050905.setChecked(false);
                    mn050906.setChecked(false);
                    mn050907.setChecked(false);
                    mn050988.setChecked(false);
                    mn050988x.setText(null);
                } else {
                    fldGrpmn0509.setVisibility(View.VISIBLE);
                }
            }
        });

        mn0511.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn051101.isChecked()) {
                    fldGrpmn0512.setVisibility(View.VISIBLE);
                    fldGrpmn0519.setVisibility(View.GONE);
                    mn051901.setChecked(false);
                    mn051902.setChecked(false);
                    mn051903.setChecked(false);
                    mn051904.setChecked(false);
                    mn051905.setChecked(false);
                    mn051906.setChecked(false);
                    mn051988.setChecked(false);
                    mn051988x.setText(null);
                } else {
                    fldGrpmn0519.setVisibility(View.VISIBLE);
                    fldGrpmn0512.setVisibility(View.GONE);
                    mn051201.setText(null);
                    mn051202.setChecked(false);
                    mn051301.setText(null);
                    mn051302.setChecked(false);
                    mn051401.setChecked(false);
                    mn051402.setChecked(false);
                    mn051403.setChecked(false);
                    mn051404.setChecked(false);
                    mn051405.setChecked(false);
                    mn051406.setChecked(false);
                    mn051407.setChecked(false);
                    mn051477.setChecked(false);
                    mn051488.setChecked(false);
                    mn051488x.setText(null);
                    mn051501.setChecked(false);
                    mn051502.setChecked(false);
                    mn051503.setChecked(false);
                    mn051504.setChecked(false);
                    mn051505.setChecked(false);
                    mn051506.setChecked(false);
                    mn051507.setChecked(false);
                    mn051508.setChecked(false);
                    mn051588.setChecked(false);
                    mn051588x.setText(null);
                    mn051601.setChecked(false);
                    mn051602.setChecked(false);
                    mn051603.setChecked(false);
                    mn051604.setChecked(false);
                    mn051605.setChecked(false);
                    mn051606.setChecked(false);
                    mn051607.setChecked(false);
                    mn051608.setChecked(false);
                    mn051609.setChecked(false);
                    mn051610.setChecked(false);
                    mn051688.setChecked(false);
                    mn051688x.setText(null);
                    mn0517a1.clearCheck();
                    mn0517a2d.setText(null);
                    mn0517a2m.setText(null);
                    mn0517a3.clearCheck();
                    mn0517b1.clearCheck();
                    mn0517b2d.setText(null);
                    mn0517b2m.setText(null);
                    mn0517b3.clearCheck();
                    mn0517c1.clearCheck();
                    mn0517c2d.setText(null);
                    mn0517c2m.setText(null);
                    mn0517c3.clearCheck();
                    mn0517d1.clearCheck();
                    mn0517d2d.setText(null);
                    mn0517d2m.setText(null);
                    mn0517d3.clearCheck();
                    mn0517e1.clearCheck();
                    mn0517e2d.setText(null);
                    mn0517e2m.setText(null);
                    mn0517e3.clearCheck();
                    mn0517f1.clearCheck();
                    mn0517f2d.setText(null);
                    mn0517f2m.setText(null);
                    mn0517f3.clearCheck();
                    mn051801.setChecked(false);
                    mn051802.setChecked(false);
                    mn051803.setChecked(false);
                    mn051804.setChecked(false);
                    mn051805.setChecked(false);
                    mn051806.setChecked(false);
                    mn051807.setChecked(false);
                    mn051808.setChecked(false);
                    mn051809.setChecked(false);
                    mn051888.setChecked(false);
                    mn051888x.setText(null);
                }
            }
        });
        mn051202.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn051201.setEnabled(false);
                    mn051201.setVisibility(View.GONE);
                    mn051201.setText(null);
                } else {
                    mn051201.setEnabled(true);
                    mn051201.setVisibility(View.VISIBLE);
                }
            }
        });

        mn051302.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn051301.setEnabled(false);
                    mn051301.setVisibility(View.GONE);
                    mn051301.setText(null);
                } else {
                    mn051301.setEnabled(true);
                    mn051301.setVisibility(View.VISIBLE);
                }
            }
        });

        mn051477.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn051401.setEnabled(false);
                    mn051402.setEnabled(false);
                    mn051403.setEnabled(false);
                    mn051404.setEnabled(false);
                    mn051405.setEnabled(false);
                    mn051406.setEnabled(false);
                    mn051488.setEnabled(false);
                    mn051488x.setText(null);
                } else {
                    mn051401.setEnabled(true);
                    mn051402.setEnabled(true);
                    mn051403.setEnabled(true);
                    mn051404.setEnabled(true);
                    mn051405.setEnabled(true);
                    mn051406.setEnabled(true);
                    mn051488.setEnabled(true);
                }
            }
        });

        mn051488.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn051488x.setVisibility(View.VISIBLE);
                } else {
                    mn051488x.setVisibility(View.GONE);
                    mn051488x.setText(null);
                }
            }
        });


        mn051588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn051588x.setVisibility(View.VISIBLE);
                } else {
                    mn051588x.setVisibility(View.GONE);
                    mn051588x.setText(null);
                }
            }
        });

        mn051688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn051688x.setVisibility(View.VISIBLE);
                } else {
                    mn051688x.setVisibility(View.GONE);
                    mn051688x.setText(null);
                }
            }
        });

        mn051888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn051888x.setVisibility(View.VISIBLE);
                } else {
                    mn051888x.setVisibility(View.GONE);
                    mn051888x.setText(null);
                }
            }
        });

        mn051988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn051988x.setVisibility(View.VISIBLE);
                } else {
                    mn051988x.setVisibility(View.GONE);
                    mn051988x.setText(null);
                }
            }
        });
        mn0520.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn052001.isChecked()) {
                    fldGrpmn0521.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0521.setVisibility(View.GONE);
                    mn0521.clearCheck();
                    mn0522.clearCheck();
                }
            }
        });
        mn0521.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn052101.isChecked()) {
                    fldGrpmn0522.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0522.setVisibility(View.GONE);
                    mn0522.clearCheck();
                }
            }
        });
        mn0523.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn052301.isChecked()) {
                    fldGrpmn0524.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0524.setVisibility(View.GONE);
                    mn0524.clearCheck();
                    mn0525.clearCheck();
                    mn052588x.setText(null);
                    mn052601.setChecked(false);
                    mn052602.setChecked(false);
                    mn052603.setChecked(false);
                    mn052604.setChecked(false);
                    mn052605.setChecked(false);
                    mn052606.setChecked(false);
                    mn052607.setChecked(false);
                    mn052608.setChecked(false);
                    mn052609.setChecked(false);
                    mn052610.setChecked(false);
                    mn052611.setChecked(false);
                    mn052612.setChecked(false);
                    mn052613.setChecked(false);
                    mn052614.setChecked(false);
                    mn052615.setChecked(false);
                    mn052688.setChecked(false);
                    mn052688x.setText(null);
                    mn0527.clearCheck();
                    mn052788x.setText(null);
                    mn0528.clearCheck();
                    mn052888x.setText(null);
                    mn052901.setChecked(false);
                    mn052902.setChecked(false);
                    mn052903.setChecked(false);
                    mn052904.setChecked(false);
                    mn052905.setChecked(false);
                    mn052906.setChecked(false);
                    mn052988.setChecked(false);
                    mn052988x.setText(null);

                }
            }
        });
        mn0524.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn052401.isChecked()) {
                    fldGrpmn0525.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0525.setVisibility(View.GONE);
                    mn0525.clearCheck();
                }
            }
        });

        mn052588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn052588x.setVisibility(View.VISIBLE);
                } else {
                    mn052588x.setVisibility(View.GONE);
                    mn052588x.setText(null);
                }
            }
        });

        mn052688.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn052688x.setVisibility(View.VISIBLE);
                } else {
                    mn052688x.setVisibility(View.GONE);
                    mn052688x.setText(null);
                }
            }
        });

        mn052788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn052788x.setVisibility(View.VISIBLE);
                } else {
                    mn052788x.setVisibility(View.GONE);
                    mn052788x.setText(null);
                }
            }
        });
        mn052888.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn052888x.setVisibility(View.VISIBLE);
                } else {
                    mn052888x.setVisibility(View.GONE);
                    mn052888x.setText(null);
                }
            }
        });

        mn052988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn052988x.setVisibility(View.VISIBLE);
                } else {
                    mn052988x.setVisibility(View.GONE);
                    mn052988x.setText(null);
                }
            }
        });


        // ===================== Q 5.17 Skip Check ====================

        mn0517a1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn0517a101.isChecked()) {
                    fldGrpmn0517a1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0517a1.setVisibility(View.GONE);
                    mn0517a2d.setText(null);
                    mn0517a2m.setText(null);
                    mn0517a3.clearCheck();

                }
            }
        });

        mn0517b1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn0517b101.isChecked()) {
                    fldGrpmn0517b1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0517b1.setVisibility(View.GONE);
                    mn0517b2d.setText(null);
                    mn0517b2m.setText(null);
                    mn0517b3.clearCheck();

                }
            }
        });

        mn0517c1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn0517c101.isChecked()) {
                    fldGrpmn0517c1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0517c1.setVisibility(View.GONE);
                    mn0517c2d.setText(null);
                    mn0517c2m.setText(null);
                    mn0517c3.clearCheck();

                }
            }
        });

        mn0517d1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn0517d101.isChecked()) {
                    fldGrpmn0517d1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0517d1.setVisibility(View.GONE);
                    mn0517d2d.setText(null);
                    mn0517d2m.setText(null);
                    mn0517d3.clearCheck();

                }
            }
        });

        mn0517e1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn0517e101.isChecked()) {
                    fldGrpmn0517e1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0517e1.setVisibility(View.GONE);
                    mn0517e2d.setText(null);
                    mn0517e2m.setText(null);
                    mn0517e3.clearCheck();

                }
            }
        });

        mn0517f1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn0517f101.isChecked()) {
                    fldGrpmn0517f1.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0517f1.setVisibility(View.GONE);
                    mn0517f2d.setText(null);
                    mn0517f2m.setText(null);
                    mn0517f3.clearCheck();

                }
            }
        });


        mn051477.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    fldGrpmn0515.setVisibility(View.GONE);
                    fldGrpmn0519.setVisibility(View.VISIBLE);

                    mn051501.setChecked(false);
                    mn051502.setChecked(false);
                    mn051503.setChecked(false);
                    mn051504.setChecked(false);
                    mn051505.setChecked(false);
                    mn051506.setChecked(false);
                    mn051507.setChecked(false);
                    mn051508.setChecked(false);
                    mn051588.setChecked(false);
                    mn051588x.setText(null);
                    mn051601.setChecked(false);
                    mn051602.setChecked(false);
                    mn051603.setChecked(false);
                    mn051604.setChecked(false);
                    mn051605.setChecked(false);
                    mn051606.setChecked(false);
                    mn051607.setChecked(false);
                    mn051608.setChecked(false);
                    mn051609.setChecked(false);
                    mn051610.setChecked(false);
                    mn051688.setChecked(false);
                    mn051688x.setText(null);
                    mn0517a1.clearCheck();
                    mn0517a2d.setText(null);
                    mn0517a2m.setText(null);
                    mn0517a3.clearCheck();
                    mn0517b1.clearCheck();
                    mn0517b2d.setText(null);
                    mn0517b2m.setText(null);
                    mn0517b3.clearCheck();
                    mn0517c1.clearCheck();
                    mn0517c2d.setText(null);
                    mn0517c2m.setText(null);
                    mn0517c3.clearCheck();
                    mn0517d1.clearCheck();
                    mn0517d2d.setText(null);
                    mn0517d2m.setText(null);
                    mn0517d3.clearCheck();
                    mn0517e1.clearCheck();
                    mn0517e2d.setText(null);
                    mn0517e2m.setText(null);
                    mn0517e3.clearCheck();
                    mn0517f1.clearCheck();
                    mn0517f2d.setText(null);
                    mn0517f2m.setText(null);
                    mn0517f3.clearCheck();
                    mn051801.setChecked(false);
                    mn051802.setChecked(false);
                    mn051803.setChecked(false);
                    mn051804.setChecked(false);
                    mn051805.setChecked(false);
                    mn051806.setChecked(false);
                    mn051807.setChecked(false);
                    mn051808.setChecked(false);
                    mn051809.setChecked(false);
                    mn051888.setChecked(false);
                    mn051888x.setText(null);

                }
                else {
                    fldGrpmn0515.setVisibility(View.VISIBLE);
                    fldGrpmn0519.setVisibility(View.GONE);

                    mn051901.setChecked(false);
                    mn051902.setChecked(false);
                    mn051903.setChecked(false);
                    mn051904.setChecked(false);
                    mn051905.setChecked(false);
                    mn051906.setChecked(false);
                    mn051988.setChecked(false);
                    mn051988x.setText(null);

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

                Intent secNext = new Intent(this, Section5bActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);

        int updcount = db.updateS5();

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

        JSONObject s5 = new JSONObject();


        // RadioGroup
        s5.put("mn0501", mn050101.isChecked() ? "1" : mn050102.isChecked() ? "2" : "0");
        s5.put("mn0502", mn050201.isChecked() ? "1" : mn050202.isChecked() ? "2" : "0");
        s5.put("mn0503", mn050301.isChecked() ? "1" : mn050302.isChecked() ? "2" : mn050303.isChecked() ? "3" : "0");
        s5.put("mn0504", mn050401.isChecked() ? "1" : mn050402.isChecked() ? "2" : "0");
        s5.put("mn0504", mn050401.isChecked() ? "1" : mn050402.isChecked() ? "2" : "0");
        s5.put("mn0505", mn050501.isChecked() ? "1" : mn050502.isChecked() ? "2" : "0");
        s5.put("mn0506", mn050601.isChecked() ? "1" : mn050602.isChecked() ? "2" : "0");
        // CheckBox
        s5.put("mn050701", mn050701.isChecked() ? "1" : "0");
        s5.put("mn050702", mn050702.isChecked() ? "2" : "0");
        s5.put("mn050703", mn050703.isChecked() ? "3" : "0");
        s5.put("mn050704", mn050704.isChecked() ? "4" : "0");
        // RadioGroup
        s5.put("mn0508", mn050801.isChecked() ? "1" : mn050802.isChecked() ? "2" : "0");
        // CheckBox
        s5.put("mn050901", mn050901.isChecked() ? "1" : "0");
        s5.put("mn050902", mn050902.isChecked() ? "2" : "0");
        s5.put("mn050903", mn050903.isChecked() ? "3" : "0");
        s5.put("mn050904", mn050904.isChecked() ? "4" : "0");
        s5.put("mn050905", mn050905.isChecked() ? "5" : "0");
        s5.put("mn050906", mn050906.isChecked() ? "6" : "0");
        s5.put("mn050907", mn050907.isChecked() ? "7" : "0");
        s5.put("mn050988", mn050988.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn050988x", mn050988x.getText().toString());
        s5.put("mn051001", mn051001.getText().toString());
        s5.put("mn051002", mn051002.getText().toString());
        s5.put("mn051003", mn051003.getText().toString());
        s5.put("mn051004", mn051004.getText().toString());
        // RadioGroup
        s5.put("mn0511", mn051101.isChecked() ? "1" : mn051102.isChecked() ? "2" : "0");
        s5.put("mn051201", mn051201.getText().toString());
        s5.put("mn051202", mn051202.isChecked() ? "2" : "0");
        s5.put("mn051301", mn051301.getText().toString());
        s5.put("mn051302", mn051302.isChecked() ? "2" : "0");
// CheckBox
        s5.put("mn051401", mn051401.isChecked() ? "1" : "0");
        s5.put("mn051402", mn051402.isChecked() ? "2" : "0");
        s5.put("mn051403", mn051403.isChecked() ? "3" : "0");
        s5.put("mn051404", mn051404.isChecked() ? "4" : "0");
        s5.put("mn051405", mn051405.isChecked() ? "5" : "0");
        s5.put("mn051406", mn051406.isChecked() ? "6" : "0");
        s5.put("mn051407", mn051407.isChecked() ? "7" : "0");
        s5.put("mn051477", mn051477.isChecked() ? "77" : "0");
        s5.put("mn051488", mn051488.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn051488x", mn051488x.getText().toString());
        // CheckBox
        s5.put("mn051501", mn051501.isChecked() ? "1" : "0");
        s5.put("mn051502", mn051502.isChecked() ? "2" : "0");
        s5.put("mn051503", mn051503.isChecked() ? "3" : "0");
        s5.put("mn051504", mn051504.isChecked() ? "4" : "0");
        s5.put("mn051505", mn051505.isChecked() ? "5" : "0");
        s5.put("mn051506", mn051506.isChecked() ? "6" : "0");
        s5.put("mn051507", mn051507.isChecked() ? "7" : "0");
        s5.put("mn051577", mn051508.isChecked() ? "8" : "0");
        s5.put("mn051588", mn051588.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn051588x", mn051588x.getText().toString());
        // CheckBox
        s5.put("mn051601", mn051601.isChecked() ? "1" : "0");
        s5.put("mn051602", mn051602.isChecked() ? "2" : "0");
        s5.put("mn051603", mn051603.isChecked() ? "3" : "0");
        s5.put("mn051604", mn051604.isChecked() ? "4" : "0");
        s5.put("mn051605", mn051605.isChecked() ? "5" : "0");
        s5.put("mn051606", mn051606.isChecked() ? "6" : "0");
        s5.put("mn051607", mn051607.isChecked() ? "7" : "0");
        s5.put("mn051608", mn051608.isChecked() ? "8" : "0");
        s5.put("mn051609", mn051609.isChecked() ? "9" : "0");
        s5.put("mn051610", mn051610.isChecked() ? "10" : "0");
        s5.put("mn051688", mn051688.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn051688x", mn051688x.getText().toString());
        s5.put("mn0517a1", mn0517a101.isChecked() ? "1" : mn0517a102.isChecked() ? "2" : "0");
        s5.put("mn0517a2d", mn0517a2d.getText().toString());
        s5.put("mn0517a2m", mn0517a2m.getText().toString());
        // RadioGroup
        s5.put("mn0517a1", mn0517a301.isChecked() ? "1"
                : mn0517a302.isChecked() ? "2"
                : mn0517a303.isChecked() ? "3"
                : mn0517a304.isChecked() ? "4"
                : mn0517a305.isChecked() ? "5"
                : mn0517a306.isChecked() ? "6"
                : mn0517a307.isChecked() ? "7"
                : mn0517a377.isChecked() ? "77"
                : "0");
        s5.put("mn0517b1", mn0517b101.isChecked() ? "1" : mn0517b102.isChecked() ? "2" : "0");
        s5.put("mn0517b2d", mn0517b2d.getText().toString());
        s5.put("mn0517b2m", mn0517b2m.getText().toString());
        // RadioGroup
        s5.put("mn0517b1", mn0517b301.isChecked() ? "1"
                : mn0517b302.isChecked() ? "2"
                : mn0517b303.isChecked() ? "3"
                : mn0517b304.isChecked() ? "4"
                : mn0517b305.isChecked() ? "5"
                : mn0517b306.isChecked() ? "6"
                : mn0517b307.isChecked() ? "7"
                : mn0517b377.isChecked() ? "77"
                : "0");
        s5.put("mn0517c1", mn0517c101.isChecked() ? "1" : mn0517c102.isChecked() ? "2" : "0");
        s5.put("mn0517c2d", mn0517c2d.getText().toString());
        s5.put("mn0517c2m", mn0517c2m.getText().toString());
        // RadioGroup
        s5.put("mn0517c1", mn0517c301.isChecked() ? "1"
                : mn0517c302.isChecked() ? "2"
                : mn0517c303.isChecked() ? "3"
                : mn0517c304.isChecked() ? "4"
                : mn0517c305.isChecked() ? "5"
                : mn0517c306.isChecked() ? "6"
                : mn0517c307.isChecked() ? "7"
                : mn0517c377.isChecked() ? "77"
                : "0");
        s5.put("mn0517d1", mn0517d101.isChecked() ? "1" : mn0517d102.isChecked() ? "2" : "0");
        s5.put("mn0517d2d", mn0517d2d.getText().toString());
        s5.put("mn0517d2m", mn0517d2m.getText().toString());
        // RadioGroup
        s5.put("mn0517d1", mn0517d301.isChecked() ? "1"
                : mn0517d302.isChecked() ? "2"
                : mn0517d303.isChecked() ? "3"
                : mn0517d304.isChecked() ? "4"
                : mn0517d305.isChecked() ? "5"
                : mn0517d306.isChecked() ? "6"
                : mn0517d307.isChecked() ? "7"
                : mn0517d377.isChecked() ? "77"
                : "0");
        s5.put("mn0517e1", mn0517e101.isChecked() ? "1" : mn0517e102.isChecked() ? "2" : "0");
        s5.put("mn0517e2d", mn0517e2d.getText().toString());
        s5.put("mn0517e2m", mn0517e2m.getText().toString());
        // RadioGroup
        s5.put("mn0517e1", mn0517e301.isChecked() ? "1"
                : mn0517e302.isChecked() ? "2"
                : mn0517e303.isChecked() ? "3"
                : mn0517e304.isChecked() ? "4"
                : mn0517e305.isChecked() ? "5"
                : mn0517e306.isChecked() ? "6"
                : mn0517e307.isChecked() ? "7"
                : mn0517e377.isChecked() ? "77"
                : "0");
        s5.put("mn0517f1", mn0517f101.isChecked() ? "1" : mn0517f102.isChecked() ? "2" : "0");
        s5.put("mn0517f2d", mn0517f2d.getText().toString());
        s5.put("mn0517f2m", mn0517f2m.getText().toString());
        // RadioGroup
        s5.put("mn0517f1", mn0517f301.isChecked() ? "1"
                : mn0517f302.isChecked() ? "2"
                : mn0517f303.isChecked() ? "3"
                : mn0517f304.isChecked() ? "4"
                : mn0517f305.isChecked() ? "5"
                : mn0517f306.isChecked() ? "6"
                : mn0517f307.isChecked() ? "7"
                : mn0517f377.isChecked() ? "77"
                : "0");
        // CheckBox
        s5.put("mn051801", mn051801.isChecked() ? "1" : "0");
        s5.put("mn051802", mn051802.isChecked() ? "2" : "0");
        s5.put("mn051803", mn051803.isChecked() ? "3" : "0");
        s5.put("mn051804", mn051804.isChecked() ? "4" : "0");
        s5.put("mn051805", mn051805.isChecked() ? "5" : "0");
        s5.put("mn051806", mn051806.isChecked() ? "6" : "0");
        s5.put("mn051807", mn051807.isChecked() ? "7" : "0");
        s5.put("mn051808", mn051808.isChecked() ? "8" : "0");
        s5.put("mn051809", mn051809.isChecked() ? "9" : "0");
        s5.put("mn051888", mn051888.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn051888x", mn051888x.getText().toString());
        // CheckBox
        s5.put("mn051901", mn051901.isChecked() ? "1" : "0");
        s5.put("mn051902", mn051902.isChecked() ? "2" : "0");
        s5.put("mn051903", mn051903.isChecked() ? "3" : "0");
        s5.put("mn051904", mn051904.isChecked() ? "4" : "0");
        s5.put("mn051905", mn051905.isChecked() ? "5" : "0");
        s5.put("mn051906", mn051906.isChecked() ? "6" : "0");
        s5.put("mn051988", mn051988.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn051988x", mn051988x.getText().toString());
        s5.put("mn0520", mn052001.isChecked() ? "1" : mn052002.isChecked() ? "2" : "0");
        s5.put("mn0521", mn052101.isChecked() ? "1" : mn052102.isChecked() ? "2" : "0");
        s5.put("mn0522", mn052201.isChecked() ? "1"
                : mn052202.isChecked() ? "2"
                : mn052203.isChecked() ? "3"
                : mn052204.isChecked() ? "4"
                : "0");
        s5.put("mn0523", mn052301.isChecked() ? "1" : mn052302.isChecked() ? "2" : "0");
        s5.put("mn0524", mn052401.isChecked() ? "1" : mn052402.isChecked() ? "2" : "0");
        // CheckBox
        s5.put("mn052501", mn052501.isChecked() ? "1" : "0");
        s5.put("mn052502", mn052502.isChecked() ? "2" : "0");
        s5.put("mn052503", mn052503.isChecked() ? "3" : "0");
        s5.put("mn052504", mn052504.isChecked() ? "4" : "0");
        s5.put("mn052505", mn052505.isChecked() ? "5" : "0");
        s5.put("mn052506", mn052506.isChecked() ? "6" : "0");
        s5.put("mn052588", mn052588.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn052588x", mn052588x.getText().toString());
        // CheckBox
        s5.put("mn052601", mn052601.isChecked() ? "1" : "0");
        s5.put("mn052602", mn052602.isChecked() ? "2" : "0");
        s5.put("mn052603", mn052603.isChecked() ? "3" : "0");
        s5.put("mn052604", mn052604.isChecked() ? "4" : "0");
        s5.put("mn052605", mn052605.isChecked() ? "5" : "0");
        s5.put("mn052606", mn052606.isChecked() ? "6" : "0");
        s5.put("mn052607", mn052607.isChecked() ? "7" : "0");
        s5.put("mn052608", mn052608.isChecked() ? "8" : "0");
        s5.put("mn052609", mn052609.isChecked() ? "9" : "0");
        s5.put("mn052610", mn052610.isChecked() ? "10" : "0");
        s5.put("mn052611", mn052611.isChecked() ? "11" : "0");
        s5.put("mn052612", mn052612.isChecked() ? "12" : "0");
        s5.put("mn052613", mn052613.isChecked() ? "13" : "0");
        s5.put("mn052614", mn052614.isChecked() ? "14" : "0");
        s5.put("mn052615", mn052615.isChecked() ? "15" : "0");
        s5.put("mn052688", mn052688.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn052688x", mn052688x.getText().toString());
        // CheckBox
        s5.put("mn052701", mn052701.isChecked() ? "1" : "0");
        s5.put("mn052702", mn052702.isChecked() ? "2" : "0");
        s5.put("mn052703", mn052703.isChecked() ? "3" : "0");
        s5.put("mn052704", mn052704.isChecked() ? "4" : "0");
        s5.put("mn052705", mn052705.isChecked() ? "5" : "0");
        s5.put("mn052706", mn052706.isChecked() ? "6" : "0");
        s5.put("mn052707", mn052707.isChecked() ? "7" : "0");
        s5.put("mn052777", mn052777.isChecked() ? "77" : "0");
        s5.put("mn052788", mn052788.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn052788x", mn052788x.getText().toString());
        // CheckBox
        s5.put("mn052801", mn052801.isChecked() ? "1" : "0");
        s5.put("mn052802", mn052802.isChecked() ? "2" : "0");
        s5.put("mn052803", mn052803.isChecked() ? "3" : "0");
        s5.put("mn052804", mn052804.isChecked() ? "4" : "0");
        s5.put("mn052805", mn052805.isChecked() ? "5" : "0");
        s5.put("mn052806", mn052806.isChecked() ? "6" : "0");
        s5.put("mn052807", mn052807.isChecked() ? "7" : "0");
        s5.put("mn052877", mn052877.isChecked() ? "77" : "0");
        s5.put("mn052888", mn052888.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn052888x", mn052888x.getText().toString());
        // CheckBox
        s5.put("mn052901", mn052901.isChecked() ? "1" : "0");
        s5.put("mn052902", mn052902.isChecked() ? "2" : "0");
        s5.put("mn052903", mn052903.isChecked() ? "3" : "0");
        s5.put("mn052904", mn052904.isChecked() ? "4" : "0");
        s5.put("mn052905", mn052905.isChecked() ? "5" : "0");
        s5.put("mn052906", mn052906.isChecked() ? "6" : "0");
        s5.put("mn052988", mn052988.isChecked() ? "88" : "0");
        // EditText
        s5.put("mn052988x", mn052988x.getText().toString());

        SRCApp.fc.setROW_S5(String.valueOf(s5));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // RadioGroup
        if (mn0501.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0501), Toast.LENGTH_LONG).show();
            mn050102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0501: This data is Required!");
            return false;
        } else {
            mn050102.setError(null);
        }

        // Skip Check 5.01
        if (mn050101.isChecked()) {
            if (mn0502.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0502), Toast.LENGTH_LONG).show();
                mn050202.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0502: This data is Required!");
                return false;
            } else {
                mn050202.setError(null);
            }
            // Skip Check 5.02
            if (mn050201.isChecked()) {
                if (mn0503.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0503), Toast.LENGTH_LONG).show();
                    mn050303.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0503: This data is Required!");
                    return false;
                } else {
                    mn050303.setError(null);
                }
            }
        }
        if (mn0504.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0504), Toast.LENGTH_LONG).show();
            mn050402.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0504: This data is Required!");
            return false;
        } else {
            mn050402.setError(null);
        }
        // Skip Check 5.04
        if (mn050401.isChecked()) {
            if (mn0505.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0505), Toast.LENGTH_LONG).show();
                mn050502.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0505: This data is Required!");
                return false;
            } else {
                mn050502.setError(null);
            }
        }
        if (mn0506.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0506), Toast.LENGTH_LONG).show();
            mn050602.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0506: This data is Required!");
            return false;
        } else {
            mn050602.setError(null);
        }
        // Skip check 5.06
        if (mn050601.isChecked()) {
            //  CheckBox
            if (!(mn050701.isChecked() || mn050702.isChecked() || mn050703.isChecked() || mn050704.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0507), Toast.LENGTH_LONG).show();
                mn050704.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0507: This data is Required!");
                return false;
            } else {
                mn050704.setError(null);
            }

            if (mn0508.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0508), Toast.LENGTH_LONG).show();
                mn050802.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0508: This data is Required!");
                return false;
            } else {
                mn050802.setError(null);
            }

            if(mn050802.isChecked()) {

                if (!(mn050901.isChecked()
                        || mn050902.isChecked()
                        || mn050903.isChecked()
                        || mn050904.isChecked()
                        || mn050905.isChecked()
                        || mn050906.isChecked()
                        || mn050907.isChecked()
                        || mn050988.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0509), Toast.LENGTH_LONG).show();
                    mn050988.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0509: This data is Required!");
                    return false;
                } else {
                    mn050988.setError(null);
                }
                // Others / EditText
                if (mn050988.isChecked() && mn050988x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0509) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                    mn050988x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0509: This data is Required!");
                    return false;
                } else {
                    mn050988x.setError(null);
                }

            }

            // EditText (condition: 5.07)
            if (mn050701.isChecked() && mn051001.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn051001), Toast.LENGTH_LONG).show();
                mn051001.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn051001: This data is Required!");
                return false;
            } else {
                mn051001.setError(null);
            }
            // EditText (condition: 5.07)
            if (mn050702.isChecked() && mn051002.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn051002), Toast.LENGTH_LONG).show();
                mn051002.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn051002: This data is Required!");
                return false;
            } else {
                mn051002.setError(null);
            }
            // EditText (condition: 5.07)
            if (mn050703.isChecked() && mn051003.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn051003), Toast.LENGTH_LONG).show();
                mn051003.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn051003: This data is Required!");
                return false;
            } else {
                mn051003.setError(null);
            }
            // EditText (condition: 5.07)
            if (mn050704.isChecked() && mn051004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn051004), Toast.LENGTH_LONG).show();
                mn051004.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn051004: This data is Required!");
                return false;
            } else {
                mn051004.setError(null);
            }
        }
        // RadioGroup
        if (mn0511.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0511), Toast.LENGTH_LONG).show();
            mn051102.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0511: This data is Required!");
            return false;
        } else {
            mn051102.setError(null);
        }
        // Skip Check 5.11
        if (mn051101.isChecked()) {
            // EditText + CheckBox
            if (mn051201.getText().toString().isEmpty() && !mn051202.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0512), Toast.LENGTH_LONG).show();
                mn051201.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0512: This data is Required!");
                return false;
            } else {
                mn051201.setError(null);
            }
            // EditText + CheckBox
            if (mn051301.getText().toString().isEmpty() && !mn051302.isChecked()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0513), Toast.LENGTH_LONG).show();
                mn051301.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0513: This data is Required!");
                return false;
            } else {
                mn051301.setError(null);
            }

            if (!(mn051401.isChecked()
                    || mn051402.isChecked()
                    || mn051403.isChecked()
                    || mn051404.isChecked()
                    || mn051405.isChecked()
                    || mn051406.isChecked()
                    || mn051407.isChecked()
                    || mn051488.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0514), Toast.LENGTH_LONG).show();
                mn051488.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0514: This data is Required!");
                return false;
            } else {
                mn051488.setError(null);
            }
            // Others / EditText
            if (mn051488.isChecked() && mn051488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0514) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn051488x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0514: This data is Required!");
                return false;
            } else {
                mn051488x.setError(null);
            }

            if(mn051477.isChecked() || mn051488.isChecked()) {
                if (!(mn051501.isChecked()
                        && mn051502.isChecked()
                        && mn051503.isChecked()
                        && mn051504.isChecked()
                        && mn051505.isChecked()
                        && mn051506.isChecked()
                        && mn051507.isChecked()
                        && mn051588.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0515), Toast.LENGTH_LONG).show();
                    mn051588.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0515: This data is Required!");
                    return false;
                } else {
                    mn051588.setError(null);
                }
                // Others / EditText
                if (mn051588.isChecked() && mn051588x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0515) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                    mn051588x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0515: This data is Required!");
                    return false;
                } else {
                    mn051588x.setError(null);
                }

                if (!(mn051601.isChecked()
                        && mn051602.isChecked()
                        && mn051603.isChecked()
                        && mn051604.isChecked()
                        && mn051605.isChecked()
                        && mn051606.isChecked()
                        && mn051607.isChecked()
                        && mn051688.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0516), Toast.LENGTH_LONG).show();
                    mn051688.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0516: This data is Required!");
                    return false;
                } else {
                    mn051688.setError(null);
                }
                // Others / EditText
                if (mn051688.isChecked() && mn051688x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0516) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                    mn051688x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0516: This data is Required!");
                    return false;
                } else {
                    mn051688x.setError(null);
                }

                if (mn0517a1.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517), Toast.LENGTH_LONG).show();
                    mn0517a102.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0511: This data is Required!");
                    return false;
                } else {
                    mn0517a102.setError(null);
                }

                if (mn0517a101.isChecked()) {
                    if (mn0517a2d.getText().toString().isEmpty() || mn0517a2d.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517vitd) + " - " + getString(R.string.mn0517dura), Toast.LENGTH_LONG).show();
                        mn0517a2d.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517a: This data is Required!");
                        return false;
                    } else {
                        mn0517a2d.setError(null);
                    }
                    if (mn0517a3.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517vitd) + " - " + getString(R.string.mn0517src), Toast.LENGTH_LONG).show();
                        mn0517a377.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517a: This data is Required!");
                        return false;
                    } else {
                        mn0517a377.setError(null);
                    }
                }

                if (mn0517a101.isChecked()) {
                    if (mn0517b2d.getText().toString().isEmpty() || mn0517b2d.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517iron) + " - " + getString(R.string.mn0517dura), Toast.LENGTH_LONG).show();
                        mn0517b2d.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517b: This data is Required!");
                        return false;
                    } else {
                        mn0517b2d.setError(null);
                    }
                    if (mn0517b3.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517iron) + " - " + getString(R.string.mn0517src), Toast.LENGTH_LONG).show();
                        mn0517b377.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517b: This data is Required!");
                        return false;
                    } else {
                        mn0517b377.setError(null);
                    }
                }

                if (mn0517c101.isChecked()) {
                    if (mn0517c2d.getText().toString().isEmpty() || mn0517c2d.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517folic) + " - " + getString(R.string.mn0517dura), Toast.LENGTH_LONG).show();
                        mn0517c2d.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517c: This data is Required!");
                        return false;
                    } else {
                        mn0517c2d.setError(null);
                    }
                    if (mn0517c3.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517folic) + " - " + getString(R.string.mn0517src), Toast.LENGTH_LONG).show();
                        mn0517c377.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517c: This data is Required!");
                        return false;
                    } else {
                        mn0517c377.setError(null);
                    }
                }

                if (mn0517d101.isChecked()) {
                    if (mn0517d2d.getText().toString().isEmpty() || mn0517d2d.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517micro) + " - " + getString(R.string.mn0517dura), Toast.LENGTH_LONG).show();
                        mn0517d2d.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517d: This data is Required!");
                        return false;
                    } else {
                        mn0517d2d.setError(null);
                    }
                    if (mn0517d3.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517micro) + " - " + getString(R.string.mn0517src), Toast.LENGTH_LONG).show();
                        mn0517d377.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517d: This data is Required!");
                        return false;
                    } else {
                        mn0517d377.setError(null);
                    }
                }

                if (mn0517e101.isChecked()) {
                    if (mn0517e2d.getText().toString().isEmpty() || mn0517e2d.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517calcium) + " - " + getString(R.string.mn0517dura), Toast.LENGTH_LONG).show();
                        mn0517e2d.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517e: This data is Required!");
                        return false;
                    } else {
                        mn0517e2d.setError(null);
                    }
                    if (mn0517e3.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517calcium) + " - " + getString(R.string.mn0517src), Toast.LENGTH_LONG).show();
                        mn0517e377.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517e: This data is Required!");
                        return false;
                    } else {
                        mn0517e377.setError(null);
                    }
                }

                if (mn0517f101.isChecked()) {
                    if (mn0517f2d.getText().toString().isEmpty() || mn0517f2d.getText().toString().isEmpty()) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517ovit) + " - " + getString(R.string.mn0517dura), Toast.LENGTH_LONG).show();
                        mn0517f2d.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517f: This data is Required!");
                        return false;
                    } else {
                        mn0517f2d.setError(null);
                    }
                    if (mn0517f3.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0517ovit) + " - " + getString(R.string.mn0517src), Toast.LENGTH_LONG).show();
                        mn0517f377.setError("This data is Required!");    // Set Error on last radio button
                        Log.i(TAG, "mn0517f: This data is Required!");
                        return false;
                    } else {
                        mn0517f377.setError(null);
                    }
                }

                if (!(mn051801.isChecked()
                        && mn051802.isChecked()
                        && mn051803.isChecked()
                        && mn051804.isChecked()
                        && mn051805.isChecked()
                        && mn051806.isChecked()
                        && mn051807.isChecked()
                        && mn051808.isChecked()
                        && mn051888.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0518), Toast.LENGTH_LONG).show();
                    mn051888.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0518: This data is Required!");
                    return false;
                } else {
                    mn051888.setError(null);
                }
                // Others / EditText
                if (mn051888.isChecked() && mn051888x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0518) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                    mn051888x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0518: This data is Required!");
                    return false;
                } else {
                    mn051888x.setError(null);
                }
            }

        } // Skip Till Start of mn0519

        if(!mn051101.isChecked()) {
            if (!(mn051901.isChecked()
                    || mn051902.isChecked()
                    || mn051903.isChecked()
                    || mn051904.isChecked()
                    || mn051905.isChecked()
                    || mn051906.isChecked()
                    || mn051988.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0519), Toast.LENGTH_LONG).show();
                mn051988.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0519: This data is Required!");
                return false;
            } else {
                mn051988.setError(null);
            }
        }
        // Others / EditText
        if (mn051988.isChecked() && mn051988x.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0519) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
            mn051988x.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0519: This data is Required!");
            return false;
        } else {
            mn051988x.setError(null);
        }

        // RadioGroup
        if (mn0520.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0520), Toast.LENGTH_LONG).show();
            mn052002.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0520: This data is Required!");
            return false;
        } else {
            mn052002.setError(null);
        }

        // Skip Check 5.22
        if (mn052001.isChecked()) {

            // RadioGroup
            if (mn0521.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0521), Toast.LENGTH_LONG).show();
                mn052102.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0521: This data is Required!");
                return false;
            } else {
                mn052102.setError(null);
            }

            // Skip Check 5.21
            if (mn052101.isChecked()) {
                // RadioGroup
                if (mn0522.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0522), Toast.LENGTH_LONG).show();
                    mn052202.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0522: This data is Required!");
                    return false;
                } else {
                    mn052202.setError(null);
                }
            }
        }

        // RadioGroup
        if (mn0523.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0523), Toast.LENGTH_LONG).show();
            mn052302.setError("This data is Required!");    // Set Error on last radio button
            Log.i(TAG, "mn0523: This data is Required!");
            return false;
        } else {
            mn052302.setError(null);
        }

        // Skip Check 5.23
        if (mn052301.isChecked()) {
            // RadioGroup
            if (mn0524.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0524), Toast.LENGTH_LONG).show();
                mn052402.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0524: This data is Required!");
                return false;
            } else {
                mn052402.setError(null);
            }

            // Skip Check 5.24
            if (mn052401.isChecked()) {
                if (!(mn052601.isChecked()
                        || mn052602.isChecked()
                        || mn052603.isChecked()
                        || mn052604.isChecked()
                        || mn052605.isChecked()
                        || mn052606.isChecked()
                        || mn052607.isChecked()
                        || mn052608.isChecked()
                        || mn052609.isChecked()
                        || mn052610.isChecked()
                        || mn052611.isChecked()
                        || mn052612.isChecked()
                        || mn052613.isChecked()
                        || mn052614.isChecked()
                        || mn052615.isChecked()
                        || mn052688.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0526), Toast.LENGTH_LONG).show();
                    mn052688.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0526: This data is Required!");
                    return false;
                } else {
                    mn052688.setError(null);
                }
                // Others / EditText
                if (mn052688.isChecked() && mn052688x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0526) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                    mn052688x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0526: This data is Required!");
                    return false;
                } else {
                    mn052688x.setError(null);
                }
            } else {
                if (!(mn052501.isChecked()
                        && mn052502.isChecked()
                        && mn052503.isChecked()
                        && mn052504.isChecked()
                        && mn052505.isChecked()
                        && mn052506.isChecked()
                        && mn052588.isChecked())) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0525), Toast.LENGTH_LONG).show();
                    mn052588.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0525: This data is Required!");
                    return false;
                } else {
                    mn052588.setError(null);
                }
                // Others / EditText
                if (mn052588.isChecked() && mn052588x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0525) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                    mn052588x.setError("This data is Required!");    // Set Error on last radio button
                    Log.i(TAG, "mn0525: This data is Required!");
                    return false;
                } else {
                    mn052588x.setError(null);
                }
            } // Skip till start of 5.27

            if (!(mn052701.isChecked()
                    || mn052702.isChecked()
                    || mn052703.isChecked()
                    || mn052704.isChecked()
                    || mn052705.isChecked()
                    || mn052706.isChecked()
                    || mn052707.isChecked()
                    || mn052777.isChecked()
                    || mn052788.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0527), Toast.LENGTH_LONG).show();
                mn052788.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0527: This data is Required!");
                return false;
            } else {
                mn052788.setError(null);
            }
            // Others / EditText
            if (mn052788.isChecked() && mn052788x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0527) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn052788x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0527: This data is Required!");
                return false;
            } else {
                mn052788x.setError(null);
            }

            if (!(mn052801.isChecked()
                    || mn052802.isChecked()
                    || mn052803.isChecked()
                    || mn052804.isChecked()
                    || mn052805.isChecked()
                    || mn052806.isChecked()
                    || mn052807.isChecked()
                    || mn052877.isChecked()
                    || mn052888.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0528), Toast.LENGTH_LONG).show();
                mn052888.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0528: This data is Required!");
                return false;
            } else {
                mn052888.setError(null);
            }
            // Others / EditText
            if (mn052888.isChecked() && mn052888x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0528) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn052888x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0528: This data is Required!");
                return false;
            } else {
                mn052888x.setError(null);
            }


        } else {
            if (!(mn052901.isChecked()
                    || mn052902.isChecked()
                    || mn052903.isChecked()
                    || mn052904.isChecked()
                    || mn052905.isChecked()
                    || mn052906.isChecked()
                    || mn052988.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0529), Toast.LENGTH_LONG).show();
                mn052988.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0529: This data is Required!");
                return false;
            } else {
                mn052988.setError(null);
            }
            // Others / EditText
            if (mn052988.isChecked() && mn052988x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0529) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn052988x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0529: This data is Required!");
                return false;
            } else {
                mn052988x.setError(null);
            }
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
