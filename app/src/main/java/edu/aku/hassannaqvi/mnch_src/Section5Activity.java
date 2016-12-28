package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
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
    @BindView(R.id.mn0511)
    RadioGroup mn0511;
    @BindView(R.id.mn051101)
    RadioButton mn051101;
    @BindView(R.id.mn051102)
    RadioButton mn051102;
    @BindView(R.id.fldGrpmn0512)
    LinearLayout fldGrpmn0512;
    @BindView(R.id.mn051201)
    EditText mn051201;
    @BindView(R.id.mn051202)
    CheckBox mn051202;
    @BindView(R.id.mn051301)
    EditText mn051301;
    @BindView(R.id.mn051302)
    CheckBox mn051302;
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
    @BindView(R.id.mn0517a3077)
    RadioButton mn0517a3077;
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
    @BindView(R.id.mn0517b3077)
    RadioButton mn0517b3077;
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
    @BindView(R.id.mn0517c3077)
    RadioButton mn0517c3077;
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
    @BindView(R.id.mn0517d3077)
    RadioButton mn0517d3077;
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
    @BindView(R.id.mn0517e3077)
    RadioButton mn0517e3077;
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
    @BindView(R.id.mn0517f3077)
    RadioButton mn0517f3077;
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
    @BindView(R.id.mn0521)
    RadioGroup mn0521;
    @BindView(R.id.mn052101)
    RadioButton mn052101;
    @BindView(R.id.mn052102)
    RadioButton mn052102;
    @BindView(R.id.mn052103)
    RadioButton mn052103;
    @BindView(R.id.mn052104)
    RadioButton mn052104;
    @BindView(R.id.mn0522)
    RadioGroup mn0522;
    @BindView(R.id.mn052201)
    RadioButton mn052201;
    @BindView(R.id.mn052202)
    RadioButton mn052202;
    @BindView(R.id.mn052301)
    CheckBox mn052301;
    @BindView(R.id.mn052302)
    CheckBox mn052302;
    @BindView(R.id.mn052303)
    CheckBox mn052303;
    @BindView(R.id.mn052304)
    CheckBox mn052304;
    @BindView(R.id.mn052305)
    CheckBox mn052305;
    @BindView(R.id.mn052306)
    CheckBox mn052306;
    @BindView(R.id.mn052307)
    CheckBox mn052307;
    @BindView(R.id.mn052308)
    CheckBox mn052308;
    @BindView(R.id.mn052309)
    CheckBox mn052309;
    @BindView(R.id.mn052310)
    CheckBox mn052310;
    @BindView(R.id.mn052311)
    CheckBox mn052311;
    @BindView(R.id.mn052312)
    CheckBox mn052312;
    @BindView(R.id.mn052313)
    CheckBox mn052313;
    @BindView(R.id.mn052314)
    CheckBox mn052314;
    @BindView(R.id.mn052315)
    CheckBox mn052315;
    @BindView(R.id.mn052316)
    CheckBox mn052316;
    @BindView(R.id.mn052317)
    CheckBox mn052317;
    @BindView(R.id.mn052318)
    CheckBox mn052318;
    @BindView(R.id.mn052319)
    CheckBox mn052319;
    @BindView(R.id.mn052320)
    CheckBox mn052320;
    @BindView(R.id.mn052321)
    CheckBox mn052321;
    @BindView(R.id.mn052388)
    CheckBox mn052388;
    @BindView(R.id.mn052388x)
    EditText mn052388x;
    @BindView(R.id.mn0524)
    RadioGroup mn0524;
    @BindView(R.id.mn052401)
    RadioButton mn052401;
    @BindView(R.id.mn052402)
    RadioButton mn052402;
    @BindView(R.id.mn052403)
    RadioButton mn052403;
    @BindView(R.id.mn052404)
    RadioButton mn052404;
    @BindView(R.id.mn052405)
    RadioButton mn052405;
    @BindView(R.id.mn052406)
    RadioButton mn052406;
    @BindView(R.id.mn052407)
    RadioButton mn052407;
    @BindView(R.id.mn052477)
    RadioButton mn052477;
    @BindView(R.id.mn052488)
    RadioButton mn052488;
    @BindView(R.id.mn052488x)
    EditText mn052488x;
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
    @BindView(R.id.mn052507)
    RadioButton mn052507;
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
    @BindView(R.id.mn052688)
    CheckBox mn052688;
    @BindView(R.id.mn052688x)
    EditText mn052688x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5);
        ButterKnife.bind(this);


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

            if (!(mn051501.isChecked()
                    || mn051502.isChecked()
                    || mn051503.isChecked()
                    || mn051504.isChecked()
                    || mn051505.isChecked()
                    || mn051506.isChecked()
                    || mn051507.isChecked()
                    || mn051588.isChecked())) {
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
                    || mn051602.isChecked()
                    || mn051603.isChecked()
                    || mn051604.isChecked()
                    || mn051605.isChecked()
                    || mn051606.isChecked()
                    || mn051607.isChecked()
                    || mn051688.isChecked())) {
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


        } // Till Start of mn0519
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
