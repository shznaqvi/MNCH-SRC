package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.DatePicker;
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

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Section7Activity extends Activity {

    private static final String TAG = Section7Activity.class.getSimpleName();
    public String dob;
    @BindView(R.id.activity_section7)
    FrameLayout activitySection7;
    @BindView(R.id.scrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0701)
    DatePicker mn0701;
    @BindView(R.id.mn070201)
    EditText mn070201;
    @BindView(R.id.mn070202)
    EditText mn070202;
    @BindView(R.id.mn070299)
    CheckBox mn070299;
    @BindView(R.id.mn0703)
    RadioGroup mn0703;
    @BindView(R.id.mn070301)
    RadioButton mn070301;
    @BindView(R.id.mn070302)
    RadioButton mn070302;
    @BindView(R.id.mn0704)
    RadioGroup mn0704;
    @BindView(R.id.mn070401)
    RadioButton mn070401;
    @BindView(R.id.mn070402)
    RadioButton mn070402;
    @BindView(R.id.mn0705)
    RadioGroup mn0705;
    @BindView(R.id.mn070501)
    RadioButton mn070501;
    @BindView(R.id.mn070502)
    RadioButton mn070502;
    @BindView(R.id.fldGrpmn0707)
    LinearLayout fldGrpmn0707;
    @BindView(R.id.mn0706)
    RadioGroup mn0706;
    @BindView(R.id.mn070601)
    RadioButton mn070601;
    @BindView(R.id.mn070602)
    RadioButton mn070602;
    @BindView(R.id.mn070699)
    RadioButton mn070699;
    @BindView(R.id.mn0707)
    RadioGroup mn0707;
    @BindView(R.id.mn070701)
    RadioButton mn070701;
    @BindView(R.id.mn070702)
    RadioButton mn070702;
    @BindView(R.id.fldGrpmn0708)
    LinearLayout fldGrpmn0708;
    @BindView(R.id.mn0708)
    RadioGroup mn0708;
    @BindView(R.id.mn070801)
    RadioButton mn070801;
    @BindView(R.id.mn070802)
    RadioButton mn070802;
    @BindView(R.id.mn070803)
    RadioButton mn070803;
    @BindView(R.id.mn070804)
    RadioButton mn070804;
    @BindView(R.id.mn070805)
    RadioButton mn070805;
    @BindView(R.id.mn070806)
    RadioButton mn070806;
    @BindView(R.id.mn070899)
    RadioButton mn070899;
    @BindView(R.id.mn070888)
    RadioButton mn070888;
    @BindView(R.id.mn070888x)
    EditText mn070888x;
    @BindView(R.id.mn0709)
    RadioGroup mn0709;
    @BindView(R.id.mn070901)
    RadioButton mn070901;
    @BindView(R.id.mn070902)
    RadioButton mn070902;
    @BindView(R.id.fldGrpmn0710)
    LinearLayout fldGrpmn0710;
    @BindView(R.id.mn071001)
    CheckBox mn071001;
    @BindView(R.id.mn071002)
    CheckBox mn071002;
    @BindView(R.id.mn071003)
    CheckBox mn071003;
    @BindView(R.id.mn071004)
    CheckBox mn071004;
    @BindView(R.id.mn071005)
    CheckBox mn071005;
    @BindView(R.id.mn071006)
    CheckBox mn071006;
    @BindView(R.id.mn071088)
    CheckBox mn071088;
    @BindView(R.id.mn071088x)
    EditText mn071088x;
    @BindView(R.id.mn0711)
    RadioGroup mn0711;
    @BindView(R.id.mn071101)
    RadioButton mn071101;
    @BindView(R.id.mn071102)
    RadioButton mn071102;
    @BindView(R.id.mn071102x)
    EditText mn071102x;
    @BindView(R.id.mn071103)
    RadioButton mn071103;
    @BindView(R.id.mn071103x)
    EditText mn071103x;
    @BindView(R.id.mn0712)
    RadioGroup mn0712;
    @BindView(R.id.mn071201)
    RadioButton mn071201;
    @BindView(R.id.mn071202)
    RadioButton mn071202;
    @BindView(R.id.mn071299)
    RadioButton mn071299;
    @BindView(R.id.fldGrpmn0713)
    LinearLayout fldGrpmn0713;
    @BindView(R.id.mn0713)
    RadioGroup mn0713;
    @BindView(R.id.mn071301)
    RadioButton mn071301;
    @BindView(R.id.mn071301x)
    EditText mn071301x;
    @BindView(R.id.mn071302)
    RadioButton mn071302;
    @BindView(R.id.mn071302x)
    EditText mn071302x;
    @BindView(R.id.mn071401)
    CheckBox mn071401;
    @BindView(R.id.mn071402)
    CheckBox mn071402;
    @BindView(R.id.mn071403)
    CheckBox mn071403;
    @BindView(R.id.mn071404)
    CheckBox mn071404;
    @BindView(R.id.mn071405)
    CheckBox mn071405;
    @BindView(R.id.mn071406)
    CheckBox mn071406;
    @BindView(R.id.mn071488)
    CheckBox mn071488;
    @BindView(R.id.mn071488x)
    EditText mn071488x;
    @BindView(R.id.mn0715)
    RadioGroup mn0715;
    @BindView(R.id.mn071501)
    RadioButton mn071501;
    @BindView(R.id.mn071502)
    RadioButton mn071502;
    @BindView(R.id.fldGrpmn0716)
    LinearLayout fldGrpmn0716;
    @BindView(R.id.mn071601)
    CheckBox mn071601;
    @BindView(R.id.mn071602)
    CheckBox mn071602;
    @BindView(R.id.mn071603)
    CheckBox mn071603;
    @BindView(R.id.mn071604)
    CheckBox mn071604;
    @BindView(R.id.mn071605)
    CheckBox mn071605;
    @BindView(R.id.mn071606)
    CheckBox mn071606;
    @BindView(R.id.mn071607)
    CheckBox mn071607;
    @BindView(R.id.mn071608)
    CheckBox mn071608;
    @BindView(R.id.mn071609)
    CheckBox mn071609;
    @BindView(R.id.mn071688)
    CheckBox mn071688;
    @BindView(R.id.mn071688x)
    EditText mn071688x;
    @BindView(R.id.mn071701)
    CheckBox mn071701;
    @BindView(R.id.mn071702)
    CheckBox mn071702;
    @BindView(R.id.mn071703)
    CheckBox mn071703;
    @BindView(R.id.mn071704)
    CheckBox mn071704;
    @BindView(R.id.mn071705)
    CheckBox mn071705;
    @BindView(R.id.mn071706)
    CheckBox mn071706;
    @BindView(R.id.mn071707)
    CheckBox mn071707;
    @BindView(R.id.mn071708)
    CheckBox mn071708;
    @BindView(R.id.mn071709)
    CheckBox mn071709;
    @BindView(R.id.mn071777)
    CheckBox mn071777;
    @BindView(R.id.mn071788)
    CheckBox mn071788;
    @BindView(R.id.mn071788x)
    EditText mn071788x;
    @BindView(R.id.mn0718)
    RadioGroup mn0718;
    @BindView(R.id.mn071801)
    RadioButton mn071801;
    @BindView(R.id.mn071802)
    RadioButton mn071802;
    @BindView(R.id.mn071803)
    RadioButton mn071803;
    @BindView(R.id.fldGrpmn0801)
    LinearLayout fldGrpmn0801;
    @BindView(R.id.fldGrpmn0719)
    LinearLayout fldGrpmn0719;
    @BindView(R.id.mn071901)
    CheckBox mn071901;
    @BindView(R.id.mn071902)
    CheckBox mn071902;
    @BindView(R.id.mn071903)
    CheckBox mn071903;
    @BindView(R.id.mn071904)
    CheckBox mn071904;
    @BindView(R.id.mn071905)
    CheckBox mn071905;
    @BindView(R.id.mn071906)
    CheckBox mn071906;
    @BindView(R.id.mn071907)
    CheckBox mn071907;
    @BindView(R.id.mn071988)
    CheckBox mn071988;
    @BindView(R.id.mn071988x)
    EditText mn071988x;
    @BindView(R.id.mn072001)
    CheckBox mn072001;
    @BindView(R.id.mn072002)
    CheckBox mn072002;
    @BindView(R.id.mn072003)
    CheckBox mn072003;
    @BindView(R.id.mn072004)
    CheckBox mn072004;
    @BindView(R.id.mn0721)
    RadioGroup mn0721;
    @BindView(R.id.mn072101)
    RadioButton mn072101;
    @BindView(R.id.mn072102)
    RadioButton mn072102;
    @BindView(R.id.fldGrpmn0722)
    LinearLayout fldGrpmn0722;
    @BindView(R.id.mn072201)
    EditText mn072201;
    @BindView(R.id.mn072202)
    EditText mn072202;
    @BindView(R.id.mn072203)
    EditText mn072203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section7);
        ButterKnife.bind(this);

        appHeader.setText("SRC - > Section 6");
        mn0701.setMaxDate(new Date().getTime());
        dob = new SimpleDateFormat("dd-MM-yyyy").format(mn0701.getCalendarView().getDate());


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

                Intent secNext = new Intent(this, Section8Activity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);

        int updcount = db.updateS7();

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

        JSONObject s7 = new JSONObject();

        s7.put("mn0701", dob);
        s7.put("mn070201", mn070201.getText().toString());
        s7.put("mn070202", mn070202.getText().toString());
        s7.put("mn070299", mn070299.isChecked() ? "99" : "0");
        s7.put("mn0703", mn070301.isChecked() ? "1" : mn070302.isChecked() ? "2" : "0");
        s7.put("mn0704", mn070401.isChecked() ? "1" : mn070402.isChecked() ? "2" : "0");
        s7.put("mn0705", mn070501.isChecked() ? "1" : mn070502.isChecked() ? "2" : "0");
        s7.put("mn0706", mn070601.isChecked() ? "1" : mn070602.isChecked() ? "2" : mn070699.isChecked() ? "99" : "0");
        s7.put("mn0707", mn070701.isChecked() ? "1" : mn070702.isChecked() ? "2" : "0");
        s7.put("mn0708", mn070801.isChecked() ? "1" : mn070802.isChecked() ? "2" : mn070803.isChecked() ? "3"
                : mn070804.isChecked() ? "4" : mn070805.isChecked() ? "5" : mn070806.isChecked() ? "6"
                : mn070888.isChecked() ? "88" : mn070899.isChecked() ? "99" : "0");
        s7.put("mn070888x", mn070888x.getText().toString());
        s7.put("mn0709", mn070901.isChecked() ? "1" : mn070902.isChecked() ? "2" : "0");
        s7.put("mn0710", mn071001.isChecked() ? "1" : "0");
        s7.put("mn0710", mn071002.isChecked() ? "1" : "0");
        s7.put("mn0710", mn071003.isChecked() ? "1" : "0");
        s7.put("mn0710", mn071004.isChecked() ? "1" : "0");
        s7.put("mn0710", mn071005.isChecked() ? "1" : "0");
        s7.put("mn0710", mn071006.isChecked() ? "1" : "0");
        s7.put("mn0710", mn071088.isChecked() ? "1" : "0");
        s7.put("mn071088x", mn071088x.getText().toString());
        s7.put("mn0711", mn071101.isChecked() ? "1" : mn071102.isChecked() ? "2" : mn071103.isChecked() ? "3" : "0");
        s7.put("mn071102x", mn071102x.getText().toString());
        s7.put("mn071103x", mn071103x.getText().toString());
        s7.put("mn0712", mn071201.isChecked() ? "1" : mn071202.isChecked() ? "2" : mn071299.isChecked() ? "99" : "0");
        s7.put("mn0713", mn071301.isChecked() ? "1" : mn071302.isChecked() ? "2" : "0");
        s7.put("mn071301x", mn071301x.getText().toString());
        s7.put("mn071302x", mn071302x.getText().toString());
        s7.put("mn0714", mn071401.isChecked() ? "1" : "0");
        s7.put("mn0714", mn071402.isChecked() ? "1" : "0");
        s7.put("mn0714", mn071403.isChecked() ? "1" : "0");
        s7.put("mn0714", mn071404.isChecked() ? "1" : "0");
        s7.put("mn0714", mn071405.isChecked() ? "1" : "0");
        s7.put("mn0714", mn071406.isChecked() ? "1" : "0");
        s7.put("mn0714", mn071488.isChecked() ? "1" : "0");
        s7.put("mn0715", mn071501.isChecked() ? "1" : mn071502.isChecked() ? "2" : "0");
        s7.put("mn0716", mn071601.isChecked() ? "1" : "0");
        s7.put("mn0716", mn071602.isChecked() ? "1" : "0");
        s7.put("mn0716", mn071603.isChecked() ? "1" : "0");
        s7.put("mn0716", mn071604.isChecked() ? "1" : "0");
        s7.put("mn0716", mn071605.isChecked() ? "1" : "0");
        s7.put("mn0716", mn071606.isChecked() ? "1" : "0");
        s7.put("mn0716", mn071607.isChecked() ? "1" : "0");
        s7.put("mn0716", mn071608.isChecked() ? "1" : "0");
        s7.put("mn0716", mn071609.isChecked() ? "1" : "0");
        s7.put("mn0716", mn071688.isChecked() ? "1" : "0");
        s7.put("mn071688x", mn071688x.getText().toString());
        s7.put("mn0717", mn071701.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071702.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071703.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071703.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071704.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071705.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071706.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071707.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071708.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071709.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071777.isChecked() ? "1" : "0");
        s7.put("mn0717", mn071788.isChecked() ? "1" : "0");
        s7.put("mn071788x", mn071788x.getText().toString());
        s7.put("mn0718", mn071801.isChecked() ? "1" : mn071802.isChecked() ? "2" : mn071803.isChecked() ? "3" : "0");
        s7.put("mn0719", mn071901.isChecked() ? "1" : mn071902.isChecked() ? "2" : mn071903.isChecked() ? "3"
                : mn071904.isChecked() ? "4" : mn071905.isChecked() ? "5" : mn071906.isChecked() ? "6"
                : mn071907.isChecked() ? "7" : mn071988.isChecked() ? "88" : "0");
        s7.put("mn071988x", mn071988x.getText().toString());
        s7.put("mn0720", mn072001.isChecked() ? "1" : "0");
        s7.put("mn0720", mn072002.isChecked() ? "1" : "0");
        s7.put("mn0720", mn072003.isChecked() ? "1" : "0");
        s7.put("mn0720", mn072004.isChecked() ? "1" : "0");
        s7.put("mn0721", mn072101.isChecked() ? "1" : mn072102.isChecked() ? "2" : "0");
        s7.put("mn072201", mn072201.getText().toString());
        s7.put("mn072202", mn072202.getText().toString());
        s7.put("mn072203", mn072203.getText().toString());

        SRCApp.fc.setROW_S7(String.valueOf(s7));

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
