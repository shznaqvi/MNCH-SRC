package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
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
    @BindView(R.id.fldGrpmn0547)
    LinearLayout fldGrpmn0547;
    @BindView(R.id.mn054701)
    CheckBox mn054701;
    @BindView(R.id.mn054702)
    CheckBox mn054702;
    @BindView(R.id.mn054703)
    CheckBox mn054703;
    @BindView(R.id.mn054704)
    CheckBox mn054704;
    @BindView(R.id.mn054705)
    CheckBox mn054705;
    @BindView(R.id.mn054706)
    CheckBox mn054706;
    @BindView(R.id.mn054707)
    CheckBox mn054707;
    @BindView(R.id.mn054777)
    CheckBox mn054777;
    @BindView(R.id.mn054788)
    CheckBox mn054788;
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
    @BindView(R.id.mn054908)
    CheckBox mn054908;
    @BindView(R.id.mn054909)
    CheckBox mn054909;
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
    @BindView(R.id.fldGrpmn0552)
    LinearLayout fldGrpmn0552;
    @BindView(R.id.mn055201)
    CheckBox mn055201;
    @BindView(R.id.mn055202)
    CheckBox mn055202;
    @BindView(R.id.mn055203)
    CheckBox mn055203;
    @BindView(R.id.mn055204)
    CheckBox mn055204;
    @BindView(R.id.mn055205)
    CheckBox mn055205;
    @BindView(R.id.mn055206)
    CheckBox mn055206;
    @BindView(R.id.mn055207)
    CheckBox mn055207;
    @BindView(R.id.mn055208)
    CheckBox mn055208;
    @BindView(R.id.mn055288)
    CheckBox mn055288;
    @BindView(R.id.mn055288x)
    EditText mn055288x;
    @BindView(R.id.mn055301)
    CheckBox mn055301;
    @BindView(R.id.mn055302)
    CheckBox mn055302;
    @BindView(R.id.mn055303)
    CheckBox mn055303;
    @BindView(R.id.mn055304)
    CheckBox mn055304;
    @BindView(R.id.mn055305)
    CheckBox mn055305;
    @BindView(R.id.mn055306)
    CheckBox mn055306;
    @BindView(R.id.mn055307)
    CheckBox mn055307;
    @BindView(R.id.mn055377)
    CheckBox mn055377;
    @BindView(R.id.mn055388)
    CheckBox mn055388;
    @BindView(R.id.mn055388x)
    EditText mn055388x;
    @BindView(R.id.fldGrpmn0554)
    LinearLayout fldGrpmn0554;
    @BindView(R.id.mn0554)
    RadioGroup mn0554;
    @BindView(R.id.mn055401)
    RadioButton mn055401;
    @BindView(R.id.mn055402)
    RadioButton mn055402;
    @BindView(R.id.mn055403)
    RadioButton mn055403;
    @BindView(R.id.mn055404)
    RadioButton mn055404;
    @BindView(R.id.mn055405)
    RadioButton mn055405;
    @BindView(R.id.mn055477)
    RadioButton mn055477;
    @BindView(R.id.mn055488)
    RadioButton mn055488;
    @BindView(R.id.mn055488x)
    EditText mn055488x;
    @BindView(R.id.mn055501)
    CheckBox mn055501;
    @BindView(R.id.mn055502)
    CheckBox mn055502;
    @BindView(R.id.mn055503)
    CheckBox mn055503;
    @BindView(R.id.mn055504)
    CheckBox mn055504;
    @BindView(R.id.mn055505)
    CheckBox mn055505;
    @BindView(R.id.mn055506)
    CheckBox mn055506;
    @BindView(R.id.mn055588)
    CheckBox mn055588;
    @BindView(R.id.mn055588x)
    EditText mn055588x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5c);
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

                Intent secNext = new Intent(this, Section6Activity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);

        int updcount = db.updateS5c();

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

        JSONObject s5c = new JSONObject();

        // TODO JSON

        SRCApp.fc.setROW_S5(String.valueOf(s5c));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // TODO Form Validation

        return true;
    }
}
