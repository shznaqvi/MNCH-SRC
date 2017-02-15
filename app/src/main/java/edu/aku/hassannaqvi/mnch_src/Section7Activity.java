package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
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

public class Section7Activity extends Activity implements RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {

    private static final String TAG = Section7Activity.class.getSimpleName();


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
    RadioButton mn07031;
    @BindView(R.id.mn070302)
    RadioButton mn07032;
    @BindView(R.id.mn0704)
    RadioGroup mn0704;
    @BindView(R.id.mn070401)
    RadioButton mn07041;
    @BindView(R.id.mn070402)
    RadioButton mn07042;
    @BindView(R.id.mn0705)
    RadioGroup mn0705;
    @BindView(R.id.mn070501)
    RadioButton mn07051;
    @BindView(R.id.mn070502)
    RadioButton mn07052;
    @BindView(R.id.mn0706)
    RadioGroup mn0706;
    @BindView(R.id.mn070601)
    RadioButton mn07061;
    @BindView(R.id.mn070602)
    RadioButton mn07062;
    @BindView(R.id.mn070699)
    RadioButton mn070699;
    @BindView(R.id.mn0707)
    RadioGroup mn0707;
    @BindView(R.id.mn070701)
    RadioButton mn07071;
    @BindView(R.id.mn070702)
    RadioButton mn07072;
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
    RadioButton mn07091;
    @BindView(R.id.mn070902)
    RadioButton mn07092;
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
    //    @BindView(R.id.mn071102x)
//    EditText mn071102x;
    @BindView(R.id.mn071103)
    RadioButton mn071103;
    //    @BindView(R.id.mn071103x)
//    EditText mn071103x;
    @BindView(R.id.mn0712)
    RadioGroup mn0712;
    @BindView(R.id.mn071201)
    RadioButton mn07121;
    @BindView(R.id.mn071202)
    RadioButton mn07122;
    @BindView(R.id.mn071299)
    RadioButton mn071299;
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
    RadioButton mn07151;
    @BindView(R.id.mn071502)
    RadioButton mn07152;
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
    @BindView(R.id.mn0719)
    RadioGroup mn0719;
    @BindView(R.id.mn071901)
    RadioButton mn0701901;
    @BindView(R.id.mn071902)
    RadioButton mn0701902;
    @BindView(R.id.mn071903)
    RadioButton mn0701903;
    @BindView(R.id.mn071904)
    RadioButton mn0701904;
    @BindView(R.id.mn071905)
    RadioButton mn0701905;
    @BindView(R.id.mn071906)
    RadioButton mn0701906;
    @BindView(R.id.mn071907)
    RadioButton mn0701907;
    @BindView(R.id.mn071988)
    RadioButton mn071988;
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
    RadioButton mn07211;
    @BindView(R.id.mn072102)
    RadioButton mn07212;
    @BindView(R.id.mn072201)
    EditText mn072201;
    @BindView(R.id.mn072202)
    EditText mn072202;
    @BindView(R.id.mn072203)
    EditText mn072203;

    @BindView(R.id.fldGrpmn07078)
    LinearLayout fldGrpmn07078;
    @BindView(R.id.mn07088)
    LinearLayout mn07088;
    @BindView(R.id.mn07010Grp)
    LinearLayout mn07010Grp;
    @BindView(R.id.mn07013Grp)
    LinearLayout mn07013Grp;
    @BindView(R.id.mn07016BigGrp)
    LinearLayout mn07016BigGrp;
    @BindView(R.id.mn07019Grp)
    LinearLayout mn07019Grp;
    @BindView(R.id.mn07019BigGrp)
    LinearLayout mn07019BigGrp;
    @BindView(R.id.mn07022Grp)
    LinearLayout mn07022Grp;
    @BindView(R.id.mn07014Grp)
    LinearLayout mn07014Grp;
    @BindView(R.id.mn071102x)
    EditText mn071102x;
    @BindView(R.id.mn071103x)
    EditText mn071103x;

    private String dob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section7);
        ButterKnife.bind(this);

        appHeader.setText("SRC - > Section 7");
        mn0701.setMaxDate(new Date().getTime());
        mn0701.setMinDate((new Date().getTime() - ((SRCApp.MILLISECONDS_IN_YEAR) + SRCApp.MILLISECONDS_IN_DAY)));

        dob = new SimpleDateFormat("dd-MM-yyyy").format(mn0701.getCalendarView().getDate());

        mn0713.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (mn071301.isChecked()) {
                    mn071302x.setVisibility(View.GONE);
                    //mn071302x.setEnabled(false);
                    mn071302x.setText(null);
                    mn071301x.setVisibility(View.VISIBLE);
                } else {
                    mn071301x.setVisibility(View.GONE);
                    //mn071301x.setEnabled(false);
                    mn071301x.setText(null);
                    mn071302x.setVisibility(View.VISIBLE);
                }
            }
        });

        mn072004.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mn072001.setEnabled(false);
                    mn072001.setChecked(false);
                    mn072002.setEnabled(false);
                    mn072002.setChecked(false);
                    mn072003.setEnabled(false);
                    mn072003.setChecked(false);

                } else {
                    mn072001.setEnabled(true);
                    mn072002.setEnabled(true);
                    mn072003.setEnabled(true);

                }
            }
        });

        mn071777.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mn071701.setEnabled(false);
                    mn071701.setChecked(false);
                    mn071702.setEnabled(false);
                    mn071702.setChecked(false);
                    mn071703.setEnabled(false);
                    mn071703.setChecked(false);
                    mn071704.setEnabled(false);
                    mn071704.setChecked(false);
                    mn071705.setEnabled(false);
                    mn071705.setChecked(false);
                    mn071706.setEnabled(false);
                    mn071706.setChecked(false);
                    mn071707.setEnabled(false);
                    mn071707.setChecked(false);
                    mn071708.setEnabled(false);
                    mn071708.setChecked(false);
                    mn071709.setEnabled(false);
                    mn071709.setChecked(false);
                    mn071788.setEnabled(false);
                    mn071788.setChecked(false);
                    mn071788x.setText(null);
                } else {
                    mn071701.setEnabled(true);
                    mn071702.setEnabled(true);
                    mn071703.setEnabled(true);
                    mn071704.setEnabled(true);
                    mn071705.setEnabled(true);
                    mn071706.setEnabled(true);
                    mn071707.setEnabled(true);
                    mn071708.setEnabled(true);
                    mn071709.setEnabled(true);
                    mn071788.setEnabled(true);
                }
            }
        });

        mn0711.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (mn071102.isChecked()) {
                    mn071102x.setVisibility(View.VISIBLE);

                } else if (mn071103.isChecked()) {
                    mn071103x.setVisibility(View.VISIBLE);
                    mn071102x.setVisibility(View.GONE);
                    mn071102x.setText(null);
                } else {
                    mn071102x.setVisibility(View.GONE);
                    mn071102x.setText(null);
                    mn071103x.setVisibility(View.GONE);
                    mn071103x.setText(null);
                }
            }
        });


        mn0706.setOnCheckedChangeListener(this);
        mn0707.setOnCheckedChangeListener(this);
        mn0708.setOnCheckedChangeListener(this);
        mn0709.setOnCheckedChangeListener(this);
        mn0712.setOnCheckedChangeListener(this);
        mn0715.setOnCheckedChangeListener(this);
        mn0718.setOnCheckedChangeListener(this);
        mn0719.setOnCheckedChangeListener(this);
        mn0721.setOnCheckedChangeListener(this);

//        Checked Cases

        mn071088.setOnCheckedChangeListener(this);
        mn071488.setOnCheckedChangeListener(this);
        mn071688.setOnCheckedChangeListener(this);
        mn071788.setOnCheckedChangeListener(this);
        mn070299.setOnCheckedChangeListener(this);



    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement

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
        //TODO implement

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                Intent secNext = new Intent(this, Section7IMActivity.class);
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
        s7.put("mn0703", mn07031.isChecked() ? "1" : mn07032.isChecked() ? "2" : "0");
        s7.put("mn0704", mn07041.isChecked() ? "1" : mn07042.isChecked() ? "2" : "0");
        s7.put("mn0705", mn07051.isChecked() ? "1" : mn07052.isChecked() ? "2" : "0");
        s7.put("mn0706", mn07061.isChecked() ? "1" : mn07062.isChecked() ? "2" : mn070699.isChecked() ? "99" : "0");
        s7.put("mn0707", mn07071.isChecked() ? "1" : mn07072.isChecked() ? "2" : "0");
        s7.put("mn0708", mn070801.isChecked() ? "1" : mn070802.isChecked() ? "2" : mn070803.isChecked() ? "3"
                : mn070804.isChecked() ? "4" : mn070805.isChecked() ? "5" : mn070806.isChecked() ? "6"
                : mn070888.isChecked() ? "88" : mn070899.isChecked() ? "99" : "0");
        s7.put("mn070888x", mn070888x.getText().toString());
        s7.put("mn0709", mn07091.isChecked() ? "1" : mn07092.isChecked() ? "2" : "0");
        //Check Box
        s7.put("mn071001", mn071001.isChecked() ? "1" : "0");
        s7.put("mn071002", mn071002.isChecked() ? "2" : "0");
        s7.put("mn071003", mn071003.isChecked() ? "3" : "0");
        s7.put("mn071004", mn071004.isChecked() ? "4" : "0");
        s7.put("mn071005", mn071005.isChecked() ? "5" : "0");
        s7.put("mn071006", mn071006.isChecked() ? "6" : "0");
        s7.put("mn071007", mn071088.isChecked() ? "88" : "0");
        s7.put("mn071088x", mn071088x.getText().toString());
        s7.put("mn0711", mn071101.isChecked() ? "1" : mn071102.isChecked() ? "2" : mn071103.isChecked() ? "3" : "0");
//        s7.put("mn071102x", mn071102x.getText().toString());
//        s7.put("mn071103x", mn071103x.getText().toString());
        s7.put("mn0712", mn07121.isChecked() ? "1" : mn07122.isChecked() ? "2" : mn071299.isChecked() ? "99" : "0");
        s7.put("mn0713", mn071301.isChecked() ? "1" : mn071302.isChecked() ? "2" : "0");
        s7.put("mn071301x", mn071301x.getText().toString());
        s7.put("mn071302x", mn071302x.getText().toString());
        s7.put("mn071401", mn071401.isChecked() ? "1" : "0");
        s7.put("mn071402", mn071402.isChecked() ? "2" : "0");
        s7.put("mn071403", mn071403.isChecked() ? "3" : "0");
        s7.put("mn071404", mn071404.isChecked() ? "4" : "0");
        s7.put("mn071405", mn071405.isChecked() ? "5" : "0");
        s7.put("mn071406", mn071406.isChecked() ? "6" : "0");
        s7.put("mn071488", mn071488.isChecked() ? "88" : "0");
        s7.put("mn071488x", mn071488x.getText().toString());
        s7.put("mn0715", mn07151.isChecked() ? "1" : mn07152.isChecked() ? "2" : "0");

        s7.put("mn071601", mn071601.isChecked() ? "1" : "0");
        s7.put("mn071602", mn071602.isChecked() ? "2" : "0");
        s7.put("mn071603", mn071603.isChecked() ? "3" : "0");
        s7.put("mn071604", mn071604.isChecked() ? "4" : "0");
        s7.put("mn071605", mn071605.isChecked() ? "5" : "0");
        s7.put("mn071606", mn071606.isChecked() ? "6" : "0");
        s7.put("mn071607", mn071607.isChecked() ? "7" : "0");
        s7.put("mn071608", mn071608.isChecked() ? "8" : "0");
        s7.put("mn071609", mn071609.isChecked() ? "9" : "0");
        s7.put("mn071688", mn071688.isChecked() ? "88" : "0");
        s7.put("mn071688x", mn071688x.getText().toString());
        s7.put("mn071701", mn071701.isChecked() ? "1" : "0");
        s7.put("mn071702", mn071702.isChecked() ? "2" : "0");
        s7.put("mn071703", mn071703.isChecked() ? "3" : "0");
        s7.put("mn071704", mn071704.isChecked() ? "4" : "0");
        s7.put("mn071705", mn071705.isChecked() ? "5" : "0");
        s7.put("mn071706", mn071706.isChecked() ? "6" : "0");
        s7.put("mn071707", mn071707.isChecked() ? "7" : "0");
        s7.put("mn071708", mn071708.isChecked() ? "8" : "0");
        s7.put("mn071709", mn071709.isChecked() ? "9" : "0");
        s7.put("mn071777", mn071777.isChecked() ? "77" : "0");
        s7.put("mn071788", mn071788.isChecked() ? "88" : "0");
        s7.put("mn071788x", mn071788x.getText().toString());
        s7.put("mn0718", mn071801.isChecked() ? "1" : mn071802.isChecked() ? "2" : mn071803.isChecked() ? "3" : "0");
        s7.put("mn0719", mn0701901.isChecked() ? "1" : mn0701902.isChecked() ? "2" : mn0701903.isChecked() ? "3"
                : mn0701904.isChecked() ? "4" : mn0701905.isChecked() ? "5" : mn0701906.isChecked() ? "6"
                : mn0701907.isChecked() ? "7" : mn071988.isChecked() ? "88" : "0");
        s7.put("mn071988x", mn071988x.getText().toString());
        s7.put("mn072001", mn072001.isChecked() ? "1" : "0");
        s7.put("mn072002", mn072002.isChecked() ? "2" : "0");
        s7.put("mn072003", mn072003.isChecked() ? "3" : "0");
        s7.put("mn072004", mn072004.isChecked() ? "4" : "0");
        s7.put("mn0721", mn07211.isChecked() ? "1" : mn07212.isChecked() ? "2" : "0");
        s7.put("mn072201", mn072201.getText().toString());
        s7.put("mn072202", mn072202.getText().toString());
        s7.put("mn072203", mn072203.getText().toString());

        SRCApp.fc.setROW_S7(String.valueOf(s7));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }


    public boolean ValidateForm() {

//        7.02

        if (mn070202.getText().toString().isEmpty()) {
            Toast.makeText(this, "This data is Required", Toast.LENGTH_SHORT).show();
            mn070202.setError("This data is Required");
            Log.d(TAG, "ValidateForm: 702");
            return false;
        } else {
            mn070202.setError(null);
        }

        if (!mn070202.getText().toString().isEmpty()) {
            if (Integer.parseInt(mn070202.getText().toString()) < 1000 || Integer.parseInt(mn070202.getText().toString()) > 9000) {
                Toast.makeText(this, "" + "Weight must be between 1000 - 9000 gm.", Toast.LENGTH_SHORT).show();
                mn070202.setError("Weight must be between 1000 - 9000 gm.");
                Log.d(TAG, "ValidateForm: 702");
                return false;
            } else {
                mn070202.setError(null);
            }
        }

        if (mn070201.getText().toString().isEmpty()) {
            Toast.makeText(this, "This data is Required", Toast.LENGTH_SHORT).show();
            mn070201.setError("This data is Required");
            Log.d(TAG, "ValidateForm: 702");
            return false;
        } else {
            mn070201.setError(null);
        }

        if (!mn070201.getText().toString().isEmpty()) {

            if (Double.parseDouble(mn070201.getText().toString()) < 1 || Double.parseDouble(mn070201.getText().toString()) > 9) {
                Toast.makeText(this, "" + "Weight can not be less than 1 - 9 kg.. check again", Toast.LENGTH_SHORT).show();
                mn070201.setError("Weight can not be less than 1 - 9 kg");
                Log.d(TAG, "ValidateForm: 702");
                return false;
            } else {
                mn070201.setError(null);
            }
        }

        if (!(mn070299.isChecked())) {
            if (mn070201.getText().toString().isEmpty() && mn070202.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mn0702), Toast.LENGTH_SHORT).show();
                mn070201.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 702");
                return false;
            } else {
                mn070201.setError(null);
            }
        } else {
            mn070201.setError(null);
        }

//        7.03

        if (mn0703.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0703), Toast.LENGTH_SHORT).show();
            mn07031.setError("This is inValid");
            Log.d(TAG, "ValidateForm: 703");
            return false;
        } else {
            mn07031.setError(null);
        }

//        7.04

        if (mn0704.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0704), Toast.LENGTH_SHORT).show();
            mn07041.setError("This is inValid");
            Log.d(TAG, "ValidateForm: 704");

            return false;
        } else {
            mn07041.setError(null);
        }

//        7.05

        if (mn0705.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0705), Toast.LENGTH_SHORT).show();
            mn07051.setError("This is inValid");
            Log.d(TAG, "ValidateForm: 705");

            return false;
        } else {
            mn07051.setError(null);
        }

//        7.06

        if (mn0706.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0706), Toast.LENGTH_SHORT).show();
            mn070699.setError("This is inValid");
            Log.d(TAG, "ValidateForm: 706");

            return false;
        } else {
            mn070699.setError(null);
        }

        if (!mn07061.isChecked()) {

//        7.07

            if (mn0707.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mn0707), Toast.LENGTH_SHORT).show();
                mn07072.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 707");

                return false;
            } else {
                mn07072.setError(null);
            }

//        7.08

            if (mn07071.isChecked()) {
                if (mn0708.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "" + getString(R.string.mn0708), Toast.LENGTH_SHORT).show();
                    mn070888.setError("This is inValid");
                    Log.d(TAG, "ValidateForm: 708");

                    return false;
                } else {
                    mn070888.setError(null);
                }
            }
        }

//        7.09

        if (mn0709.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0709), Toast.LENGTH_SHORT).show();
            mn07092.setError("This is inValid");
            Log.d(TAG, "ValidateForm: 709");

            return false;
        } else {
            mn07092.setError(null);
        }

//        7.10

        if (mn07092.isChecked()) {
            if (!mn071001.isChecked() && !mn071002.isChecked() && !mn071003.isChecked() && !mn071004.isChecked()
                    && !mn071005.isChecked() && !mn071006.isChecked() && !mn071088.isChecked()) {
                Toast.makeText(this, "" + getString(R.string.mn0710), Toast.LENGTH_SHORT).show();
                mn071088.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 709");

                return false;
            } else {
                mn071088.setError(null);
            }

            if (mn071088.isChecked() && mn071088x.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mn0710), Toast.LENGTH_SHORT).show();
                mn071088x.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 710");

                return false;
            } else {
                mn071088x.setError(null);
            }
        }

//        7.11

        if (mn0711.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0711), Toast.LENGTH_LONG).show();
            mn071103.setError("This data is Required!");    // Set Error on last radio button
            Log.d(TAG, "ValidateForm: 711");

            return false;
        } else {
            mn071103.setError(null);
        }

        if (mn071102.isChecked()) {
            if (mn071102x.getText().toString().isEmpty()) {
                Toast.makeText(this, "This data is Required", Toast.LENGTH_SHORT).show();
                mn071102x.setError("This data is Required");
                Log.d(TAG, "ValidateForm: 711");

                return false;
            } else {
                mn071102x.setError(null);
            }

            if ((Integer.parseInt(mn071102x.getText().toString()) < 0) || (Integer.parseInt(mn071102x.getText().toString()) > 23)) {
                Toast.makeText(this, "" + "Range is 0 - 23 hours", Toast.LENGTH_SHORT).show();
                mn071102x.setError("Range is 0 - 23 hours");
                Log.d(TAG, "ValidateForm: 711");

                return false;
            } else {
                mn071102x.setError(null);
            }
        }

        if (mn071103.isChecked()) {
            if (mn071103x.getText().toString().isEmpty()) {
                Toast.makeText(this, "This data is Required", Toast.LENGTH_SHORT).show();
                mn071103x.setError("This data is Required");
                Log.d(TAG, "ValidateForm: 711");

                return false;
            } else {
                mn071103x.setError(null);
            }

            if ((Integer.parseInt(mn071103x.getText().toString()) < 0) || (Integer.parseInt(mn071103x.getText().toString()) > 180)) {
                Toast.makeText(this, "" + "Range is 0 - 180 days", Toast.LENGTH_SHORT).show();
                mn071103x.setError("Range is 0 - 180 days");
                Log.d(TAG, "ValidateForm: 711");

                return false;
            } else {
                mn071103x.setError(null);
            }
        }

//        7.12

        if (mn0712.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0712), Toast.LENGTH_SHORT).show();
            mn07121.setError("This is inValid");
            Log.d(TAG, "ValidateForm: 712");

            return false;
        } else {
            mn07121.setError(null);
        }

//        7.13

        if (mn07121.isChecked()) {
            if (mn0713.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mn0713), Toast.LENGTH_SHORT).show();
                mn071302.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 713");

                return false;
            } else {
                mn071302.setError(null);
            }

            if (mn071301.isChecked()){
                if (mn071301x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "This data is Required", Toast.LENGTH_SHORT).show();
                    mn071301x.setError("This data is Required");
                    Log.d(TAG, "ValidateForm: 713-01");

                    return false;
                } else {
                    mn071301x.setError(null);
                }

                if (Integer.parseInt(mn071301x.getText().toString()) < 1 || Integer.parseInt(mn071301x.getText().toString()) > 29) {
                    Toast.makeText(this, "This is inValid", Toast.LENGTH_SHORT).show();
                    mn071301x.setError("This is inValid");
                    Log.d(TAG, "ValidateForm: 713-01");

                    return false;
                } else {
                    mn071301x.setError(null);
                }
            }
            if (mn071302.isChecked()){
                if (mn071302x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "This data is Required", Toast.LENGTH_SHORT).show();
                    mn071302x.setError("This data is Required");
                    Log.d(TAG, "ValidateForm: 713-02");

                    return false;
                } else {
                    mn071302x.setError(null);
                }

                if (Integer.parseInt(mn071302x.getText().toString()) < 1 || Integer.parseInt(mn071302x.getText().toString()) > 24) {
                    Toast.makeText(this, "This is inValid", Toast.LENGTH_SHORT).show();
                    mn071302x.setError("This is inValid");
                    Log.d(TAG, "ValidateForm: 713-02");

                    return false;
                } else {
                    mn071302x.setError(null);
                }
            }
        }

//        7.14

        if (!mn07121.isChecked()) {
            if (!mn071401.isChecked() && !mn071402.isChecked() && !mn071403.isChecked() && !mn071404.isChecked()
                    && !mn071405.isChecked() && !mn071406.isChecked() && !mn071488.isChecked()) {
                Toast.makeText(this, "" + getString(R.string.mn0714), Toast.LENGTH_SHORT).show();
                mn071488.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 714");

                return false;
            } else {
                mn071488.setError(null);
            }

            if (mn071488.isChecked() && mn071488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mn0714), Toast.LENGTH_SHORT).show();
                mn071488x.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 714");

                return false;
            } else {
                mn071488x.setError(null);
            }
        }

//        7.15

        if (mn0715.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0715), Toast.LENGTH_SHORT).show();
            mn07151.setError("This is inValid");
            Log.d(TAG, "ValidateForm: 715");

            return false;
        } else {
            mn07151.setError(null);
        }

        if (mn07151.isChecked()) {
//        7.16

            if (!mn071601.isChecked() && !mn071602.isChecked() && !mn071603.isChecked() && !mn071604.isChecked()
                    && !mn071605.isChecked() && !mn071606.isChecked() && !mn071607.isChecked() && !mn071608.isChecked() &&
                    !mn071609.isChecked() && !mn071688.isChecked()) {
                Toast.makeText(this, "" + getString(R.string.mn0716), Toast.LENGTH_SHORT).show();
                mn071688.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 716");

                return false;
            } else {
                mn071688.setError(null);
            }

            if (mn071688.isChecked() && mn071688x.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mn0716), Toast.LENGTH_SHORT).show();
                mn071688x.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 716");

                return false;
            } else {
                mn071688x.setError(null);
            }


//        7.17

            if (!mn071701.isChecked() && !mn071702.isChecked() && !mn071703.isChecked() && !mn071704.isChecked()
                    && !mn071705.isChecked() && !mn071706.isChecked() && !mn071707.isChecked() && !mn071708.isChecked() &&
                    !mn071709.isChecked() && !mn071777.isChecked() && !mn071788.isChecked()) {
                Toast.makeText(this, "" + getString(R.string.mn0717), Toast.LENGTH_SHORT).show();
                mn071788.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 717");

                return false;
            } else {
                mn071788.setError(null);
            }

            if (mn071788.isChecked() && mn071788x.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mn0717), Toast.LENGTH_SHORT).show();
                mn071788x.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 717");

                return false;
            } else {
                mn071788x.setError(null);
            }

//        7.18

            if (mn0718.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mn0718), Toast.LENGTH_SHORT).show();
                mn071801.setError("This is inValid");
                Log.d(TAG, "ValidateForm: 718");

                return false;
            } else {
                mn071801.setError(null);
            }



            if (mn071802.isChecked()) {

                if (mn0719.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "" + getString(R.string.mn0719), Toast.LENGTH_SHORT).show();
                    mn0701901.setError("This is inValid");
                    Log.d(TAG, "ValidateForm: 719 not selected");
                    return false;
                } else {
                    mn0701901.setError(null);
                }

                if (mn071988.isChecked() && mn071988x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Empty:" + getString(R.string.mn0719), Toast.LENGTH_SHORT).show();
                    mn071988.setError("This is inValid");
                    Log.d(TAG, "ValidateForm:  719 empty");
                    return false;
                } else {
                    mn071988.setError(null);
                }

            }
        }

        if (mn07152.isChecked()) {

//        7.20

                if (!mn072001.isChecked() && !mn072002.isChecked() && !mn072003.isChecked() && !mn072004.isChecked()) {
                    Toast.makeText(this, "" + getString(R.string.mn0720), Toast.LENGTH_SHORT).show();
                    mn072001.setError("This is inValid");
                    Log.d(TAG, "ValidateForm:72001  ");
                    return false;
                } else {
                    mn072001.setError(null);
                }
//        7.21
                if (mn0721.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "" + getString(R.string.mn0721), Toast.LENGTH_SHORT).show();
                    mn07211.setError("This is inValid");
                    Log.d(TAG, "ValidateForm: 721 not selected");
                    return false;
                } else {
                    mn07211.setError(null);
                }
//      7.22
            if (mn07211.isChecked()) {
                    if (mn072201.getText().toString().isEmpty() && mn072202.getText().toString().isEmpty()
                            && mn072203.getText().toString().isEmpty()) {

                        Toast.makeText(this, "" + getString(R.string.mn0722), Toast.LENGTH_SHORT).show();
                        mn072201.setError("This is inValid");
                        Log.d(TAG, "ValidateForm: 722 invalid");
                        return false;
                    } else {
                        mn072201.setError(null);
                    }
                }
        }


        return true;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if (group.getId() == R.id.mn0706) {

            if (mn07061.isChecked()) {
                fldGrpmn07078.setVisibility(View.GONE);
                mn0707.clearCheck();
                mn070888x.setText(null);
            } else {
                fldGrpmn07078.setVisibility(View.VISIBLE);
                mn070888x.setText(null);
            }
        } else if (group.getId() == R.id.mn0707) {
            if (mn07072.isChecked()) {
                mn07088.setVisibility(View.GONE);
                mn070888x.setText(null);
            } else {
                mn07088.setVisibility(View.VISIBLE);
                mn070888x.setText(null);
            }
        } else if (group.getId() == R.id.mn0709) {
            if (mn07091.isChecked()) {
                mn07010Grp.setVisibility(View.GONE);
                mn071001.setChecked(false);
                mn071002.setChecked(false);
                mn071003.setChecked(false);
                mn071004.setChecked(false);
                mn071005.setChecked(false);
                mn071006.setChecked(false);
                mn071088.setChecked(false);
                mn071088x.setText(null);
            } else {
                mn07010Grp.setVisibility(View.VISIBLE);

            }
        } else if (group.getId() == R.id.mn0712) {
            if (!(mn07121.isChecked())) {
                mn07013Grp.setVisibility(View.GONE);
                mn07014Grp.setVisibility(View.VISIBLE);
                mn0713.clearCheck();
                mn071301x.setText(null);
                mn071302x.setText(null);
            } else {
                mn07013Grp.setVisibility(View.VISIBLE);
                mn07014Grp.setVisibility(View.GONE);
                mn071401.setChecked(false);
                mn071402.setChecked(false);
                mn071403.setChecked(false);
                mn071404.setChecked(false);
                mn071405.setChecked(false);
                mn071406.setChecked(false);
                mn071488.setChecked(false);
                mn071488x.setText(null);

            }
        } else if (group.getId() == R.id.mn0715) {

            if (mn07152.isChecked()) {
                mn07016BigGrp.setVisibility(View.GONE);
                mn071601.setChecked(false);
                mn071602.setChecked(false);
                mn071603.setChecked(false);
                mn071604.setChecked(false);
                mn071605.setChecked(false);
                mn071606.setChecked(false);
                mn071607.setChecked(false);
                mn071608.setChecked(false);
                mn071609.setChecked(false);
                mn071688.setChecked(false);
                mn071688x.setText(null);
                mn071701.setChecked(false);
                mn071702.setChecked(false);
                mn071703.setChecked(false);
                mn071704.setChecked(false);
                mn071705.setChecked(false);
                mn071706.setChecked(false);
                mn071707.setChecked(false);
                mn071708.setChecked(false);
                mn071709.setChecked(false);
                mn071777.setChecked(false);
                mn071788.setChecked(false);
                mn071788x.setText(null);
                mn0718.clearCheck();
                mn0719.clearCheck();
                mn071988x.setText(null);
            } else {
                mn07016BigGrp.setVisibility(View.VISIBLE);
            }


        } else if (group.getId() == R.id.mn0718) {
            if (mn071801.isChecked()) {
                mn07019Grp.setVisibility(View.GONE);
                mn0719.clearCheck();
                mn071988x.setText(null);
                mn07019BigGrp.setVisibility(View.VISIBLE);
            } else if (mn071803.isChecked()) {
                mn07019Grp.setVisibility(View.GONE);
                mn07019BigGrp.setVisibility(View.GONE);
                mn0719.clearCheck();
                mn071988x.setText(null);
                mn072001.setChecked(false);
                mn072002.setChecked(false);
                mn072003.setChecked(false);
                mn072004.setChecked(false);
                mn0721.clearCheck();
                mn072201.setText(null);
                mn072202.setText(null);
                mn072203.setText(null);
            } else {
                mn07019Grp.setVisibility(View.VISIBLE);
                mn07019BigGrp.setVisibility(View.VISIBLE);
            }
        } else if (group.getId() == R.id.mn0719) {
            if (mn071988.isChecked()) {
                mn071988x.setVisibility(View.VISIBLE);
            } else {
                mn071988x.setVisibility(View.GONE);
                mn071988x.setText(null);
            }
        }else if (group.getId() == R.id.mn0721) {
            if (mn07212.isChecked()) {
                mn07022Grp.setVisibility(View.GONE);
            } else {
                mn07022Grp.setVisibility(View.VISIBLE);
            }
        } else if (group.getId() == R.id.mn0708) {
            if (mn070888.isChecked()) {
                mn070888x.setVisibility(View.VISIBLE);
                mn070888x.setText(null);
            } else {
                mn070888x.setVisibility(View.GONE);
                mn070888x.setText(null);
            }
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton v, boolean b) {

        if (v.getId() == R.id.mn071088) {
            if (b) {
                mn071088x.setVisibility(View.VISIBLE);
                mn071088x.setText(null);
            } else {
                mn071088x.setVisibility(View.GONE);
                mn071088x.setText(null);
            }
        }

        if (v.getId() == R.id.mn071488) {
            if (b) {
                mn071488x.setVisibility(View.VISIBLE);
                mn071488x.setText(null);
            } else {
                mn071488x.setVisibility(View.GONE);
                mn071488x.setText(null);
            }
        }

        if (v.getId() == R.id.mn071688) {
            if (b) {
                mn071688x.setVisibility(View.VISIBLE);
                mn071688x.setText(null);
            } else {
                mn071688x.setVisibility(View.GONE);
                mn071688x.setText(null);
            }
        }

        if (v.getId() == R.id.mn071788) {
            if (b) {
                mn071788x.setVisibility(View.VISIBLE);
                mn071788x.setText(null);
            } else {
                mn071788x.setVisibility(View.GONE);
                mn071788x.setText(null);
            }
        }
        if (v.getId() == R.id.mn072004) {
            if (mn072004.isChecked()) {
                mn072001.setEnabled(false);
                mn072001.setChecked(false);
                mn072002.setEnabled(false);
                mn072002.setChecked(false);
                mn072003.setEnabled(false);
                mn072003.setChecked(false);
            } else {
                mn072001.setEnabled(true);
                mn072002.setEnabled(true);
                mn072003.setEnabled(true);
            }
        }
        if (v.getId() == R.id.mn070299) {

            mn070201.setText(null);
            mn070202.setText(null);

            if (mn070299.isChecked()) {
                mn070201.setVisibility(View.GONE);
                mn070202.setVisibility(View.GONE);
            } else {
                mn070201.setVisibility(View.VISIBLE);
                mn070202.setVisibility(View.VISIBLE);
            }
        }
    }
}
