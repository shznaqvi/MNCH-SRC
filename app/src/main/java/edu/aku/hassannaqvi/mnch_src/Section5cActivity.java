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

public class Section5cActivity extends Activity {
    private static final String TAG = Section5cActivity.class.getSimpleName();

    @BindView(R.id.activity_section5c)
    FrameLayout activitySection5c;
    @BindView(R.id.section5cScrollView)
    ScrollView section5cScrollView;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0546)
    RadioGroup mn0546;
    @BindView(R.id.mn054601)
    RadioButton mn054601;
    @BindView(R.id.mn054602)
    RadioButton mn054602;
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
    @BindView(R.id.mn055101)
    RadioButton mn055101;
    @BindView(R.id.mn055102)
    RadioButton mn055102;
    @BindView(R.id.mn055199)
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
    //@BindView(R.id.mn055207) CheckBox mn055207;
    //@BindView(R.id.mn055208) CheckBox mn055208;
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
    @BindView(R.id.fldGrpmn0555)
    LinearLayout fldGrpmn0555;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5c);
        ButterKnife.bind(this);

        appHeader.setText("SRC - > Section 5C");

        // ============= Q 5.46 Skip Pattern =================

        mn0546.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn054601.isChecked()) {
                    fldGrpmn0547.setVisibility(View.VISIBLE);

                } else {
                    fldGrpmn0547.setVisibility(View.GONE);
                    mn054701.setChecked(false);
                    mn054702.setChecked(false);
                    mn054703.setChecked(false);
                    mn054704.setChecked(false);
                    mn054705.setChecked(false);
                    mn054706.setChecked(false);
                    mn054707.setChecked(false);
                    mn054777.setChecked(false);
                    mn054788.setChecked(false);
                    mn054788x.setText(null);
                    mn0548.clearCheck();
                    mn054901.setChecked(false);
                    mn054902.setChecked(false);
                    mn054903.setChecked(false);
                    mn054904.setChecked(false);
                    mn054905.setChecked(false);
                    mn054906.setChecked(false);
                    mn054907.setChecked(false);
                    mn054908.setChecked(false);
                    mn054909.setChecked(false);
                    mn054988.setChecked(false);
                    mn054988x.setText(null);
                    mn055001.setChecked(false);
                    mn055002.setChecked(false);
                    mn055003.setChecked(false);
                    mn055004.setChecked(false);
                    mn055005.setChecked(false);
                    mn055088.setChecked(false);
                    mn055088x.setText(null);

                }
            }

        });

        // ============= Q 5.51 Skip Pattern =================

        mn0551.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn055101.isChecked()) {
                    fldGrpmn0552.setVisibility(View.VISIBLE);

                } else {
                    fldGrpmn0552.setVisibility(View.GONE);
                    mn055201.setChecked(false);
                    mn055202.setChecked(false);
                    mn055203.setChecked(false);
                    mn055204.setChecked(false);
                    mn055205.setChecked(false);
                    mn055206.setChecked(false);
                    mn055288.setChecked(false);
                    mn055288x.setText(null);
                    mn055301.setChecked(false);
                    mn055302.setChecked(false);
                    mn055303.setChecked(false);
                    mn055304.setChecked(false);
                    mn055305.setChecked(false);
                    mn055306.setChecked(false);
                    mn055307.setChecked(false);
                    mn055377.setChecked(false);
                    mn055388.setChecked(false);
                    mn055388x.setText(null);
                    mn0554.clearCheck();
                    mn055501.setChecked(false);
                    mn055502.setChecked(false);
                    mn055503.setChecked(false);
                    mn055504.setChecked(false);
                    mn055505.setChecked(false);
                    mn055506.setChecked(false);
                    mn055588.setChecked(false);
                    mn055588x.setText(null);


                }
            }
        });

        // ============= Q 5.53 Skip Pattern =================
        mn055377.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmn0554.setVisibility(View.GONE);
                    fldGrpmn0555.setVisibility(View.VISIBLE);
                    mn0554.clearCheck();
                } else {
                    fldGrpmn0555.setVisibility(View.GONE);
                    fldGrpmn0554.setVisibility(View.VISIBLE);
                    mn055501.setChecked(false);
                    mn055502.setChecked(false);
                    mn055503.setChecked(false);
                    mn055504.setChecked(false);
                    mn055505.setChecked(false);
                    mn055506.setChecked(false);
                    mn055588.setChecked(false);
                    mn055588x.setText(null);

                }
            }
        });


        //  =========================== Q 5.47 Others ================================
        mn054788.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn054788x.setVisibility(View.VISIBLE);
                    mn054788x.requestFocus();
                } else {
                    mn054788x.setVisibility(View.GONE);
                    mn054788x.setText(null);

                }
            }
        });
        //  =========================== Q 5.49 Others ================================
        mn054988.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn054988x.setVisibility(View.VISIBLE);
                    mn054988x.requestFocus();
                } else {
                    mn054988x.setVisibility(View.GONE);
                    mn054988x.setText(null);

                }
            }
        });

        //  =========================== Q 5.50 Others ================================
        mn055088.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn055088x.setVisibility(View.VISIBLE);
                    mn055088x.requestFocus();
                } else {
                    mn055088x.setVisibility(View.GONE);
                    mn055088x.setText(null);

                }
            }
        });

        //  =========================== Q 5.52 Others ================================
        mn055288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn055288x.setVisibility(View.VISIBLE);
                    mn055288x.requestFocus();
                } else {
                    mn055288x.setVisibility(View.GONE);
                    mn055288x.setText(null);

                }
            }
        });

        //  =========================== Q 5.53 Others ================================
        mn055388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn055388x.setVisibility(View.VISIBLE);
                    mn055388x.requestFocus();
                } else {
                    mn055388x.setVisibility(View.GONE);
                    mn055388x.setText(null);

                }
            }
        });

        //  =========================== Q 5.55 Others ================================
        mn055588.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn055588x.setVisibility(View.VISIBLE);
                    mn055588x.requestFocus();
                } else {
                    mn055588x.setVisibility(View.GONE);
                    mn055588x.setText(null);

                }
            }
        });

        //  ============================= Q 5.54 Others ==============================
        mn0554.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn055488.getId()) {

                    mn055488x.setVisibility(View.VISIBLE);
                    mn055488x.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mn055488x.getWindowToken(), 0);

                } else {

                    mn055488x.setVisibility(View.GONE);
                    mn055488x.setText(null);
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

        // Radio Group
        s5c.put("mn0546", mn054601.isChecked() ? "1" : mn054602.isChecked() ? "2" : "0");

        // Checkbox
        s5c.put("mn054701", mn054701.isChecked() ? "1" : "0");
        s5c.put("mn054702", mn054702.isChecked() ? "1" : "0");
        s5c.put("mn054703", mn054703.isChecked() ? "1" : "0");
        s5c.put("mn054704", mn054704.isChecked() ? "1" : "0");
        s5c.put("mn054705", mn054705.isChecked() ? "1" : "0");
        s5c.put("mn054706", mn054706.isChecked() ? "1" : "0");
        s5c.put("mn054707", mn054707.isChecked() ? "1" : "0");
        s5c.put("mn054708", mn054777.isChecked() ? "1" : "0");
        s5c.put("mn054788", mn054788.isChecked() ? "1" : "0");
        //Edit Text
        s5c.put("mn054788x", mn054788x.getText().toString());


        // Radio Group
        s5c.put("mn0548", mn054801.isChecked() ? "1" : mn054802.isChecked() ? "2" : mn054803.isChecked() ? "3"
                : mn054804.isChecked() ? "4" : "0");

        // Checkbox
        s5c.put("mn054901", mn054901.isChecked() ? "1" : "0");
        s5c.put("mn054902", mn054902.isChecked() ? "1" : "0");
        s5c.put("mn054903", mn054903.isChecked() ? "1" : "0");
        s5c.put("mn054904", mn054904.isChecked() ? "1" : "0");
        s5c.put("mn054905", mn054905.isChecked() ? "1" : "0");
        s5c.put("mn054906", mn054906.isChecked() ? "1" : "0");
        s5c.put("mn054907", mn054907.isChecked() ? "1" : "0");
        s5c.put("mn054908", mn054908.isChecked() ? "1" : "0");
        s5c.put("mn054909", mn054909.isChecked() ? "1" : "0");
        s5c.put("mn054988", mn054988.isChecked() ? "1" : "0");
        s5c.put("mn054988x", mn054988x.getText().toString());

        // Checkbox
        s5c.put("mn055001", mn055001.isChecked() ? "1" : "0");
        s5c.put("mn055002", mn055002.isChecked() ? "1" : "0");
        s5c.put("mn055003", mn055003.isChecked() ? "1" : "0");
        s5c.put("mn055004", mn055004.isChecked() ? "1" : "0");
        s5c.put("mn055005", mn055005.isChecked() ? "1" : "0");
        s5c.put("mn055088", mn055088.isChecked() ? "1" : "0");
        s5c.put("mn055088x", mn055088x.getText().toString());

        // Radio Group
        s5c.put("mn0551", mn055101.isChecked() ? "1" : mn055102.isChecked() ? "2" : mn055199.isChecked() ? "99" : "0");

        // Checkbox
        s5c.put("mn055201", mn055201.isChecked() ? "1" : "0");
        s5c.put("mn055202", mn055202.isChecked() ? "1" : "0");
        s5c.put("mn055203", mn055203.isChecked() ? "1" : "0");
        s5c.put("mn055204", mn055204.isChecked() ? "1" : "0");
        s5c.put("mn055205", mn055205.isChecked() ? "1" : "0");
        s5c.put("mn055206", mn055206.isChecked() ? "1" : "0");
        s5c.put("mn055288", mn055288.isChecked() ? "1" : "0");
        s5c.put("mn055288x", mn055288x.getText().toString());

        // Checkbox
        s5c.put("mn055301", mn055301.isChecked() ? "1" : "0");
        s5c.put("mn055302", mn055302.isChecked() ? "1" : "0");
        s5c.put("mn055303", mn055303.isChecked() ? "1" : "0");
        s5c.put("mn055304", mn055304.isChecked() ? "1" : "0");
        s5c.put("mn055305", mn055305.isChecked() ? "1" : "0");
        s5c.put("mn055306", mn055306.isChecked() ? "1" : "0");
        s5c.put("mn055307", mn055307.isChecked() ? "1" : "0");
        s5c.put("mn055308", mn055377.isChecked() ? "1" : "0");
        s5c.put("mn055388", mn055388.isChecked() ? "1" : "0");
        s5c.put("mn055388x", mn055388x.getText().toString());

        // Radio Group
        s5c.put("mn0554", mn055401.isChecked() ? "1" : mn055402.isChecked() ? "2" : mn055403.isChecked() ? "3"
                : mn055404.isChecked() ? "4" : mn055405.isChecked() ? "5" : mn055477.isChecked() ? "77"
                : mn055404.isChecked() ? "88" : "0");
        s5c.put("mn055488x", mn055488x.getText().toString());

        // Checkbox
        s5c.put("mn055501", mn055501.isChecked() ? "1" : "0");
        s5c.put("mn055502", mn055502.isChecked() ? "1" : "0");
        s5c.put("mn055503", mn055503.isChecked() ? "1" : "0");
        s5c.put("mn055504", mn055504.isChecked() ? "1" : "0");
        s5c.put("mn055505", mn055505.isChecked() ? "1" : "0");
        s5c.put("mn055506", mn055506.isChecked() ? "1" : "0");
        s5c.put("mn055588", mn055588.isChecked() ? "1" : "0");
        s5c.put("mn055588x", mn055588x.getText().toString());

        SRCApp.fc.setROW_S5c(String.valueOf(s5c));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ============ Q 5.46 =======================
        // RadioGroup
        if (mn0546.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0546), Toast.LENGTH_LONG).show();
            mn054602.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0546: This data is Required!");
            return false;
        } else {
            mn054602.setError(null);
        }

        // Skip check 5.46
        if (mn054601.isChecked()) {
            //  CheckBox
            if (!(mn054701.isChecked() || mn054702.isChecked() || mn054703.isChecked() || mn054704.isChecked()
                    || mn054705.isChecked() || mn054706.isChecked() || mn054707.isChecked()
                    || mn054777.isChecked() || mn054788.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0547), Toast.LENGTH_LONG).show();
                mn054788.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0547: This data is Required!");
                return false;
            } else {
                mn054788.setError(null);
            }

            // Others / EditText Q 5.47
            if (mn054788.isChecked() && mn054788x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0547) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn054788x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0547: This data is Required!");
                return false;
            } else {
                mn054788x.setError(null);
            }

            // RadioGroup
            if (mn0548.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0548), Toast.LENGTH_LONG).show();
                mn054804.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mn0548: This data is Required!");
                return false;
            } else {
                mn054804.setError(null);
            }


            //  CheckBox
            if (!(mn054901.isChecked() || mn054902.isChecked() || mn054903.isChecked() || mn054904.isChecked()
                    || mn054905.isChecked() || mn054906.isChecked() || mn054907.isChecked()
                    || mn054908.isChecked() || mn054909.isChecked() || mn054788.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0549), Toast.LENGTH_LONG).show();
                mn054988.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0549: This data is Required!");
                return false;
            } else {
                mn054988.setError(null);
            }

            // Others / EditText Q 5.49
            if (mn054988.isChecked() && mn054988x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0549) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn054988x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0549: This data is Required!");
                return false;
            } else {
                mn054988x.setError(null);
            }

            //  CheckBox
            if (!(mn055001.isChecked() || mn055002.isChecked() || mn055003.isChecked() || mn055004.isChecked()
                    || mn055005.isChecked() || mn055088.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0550), Toast.LENGTH_LONG).show();
                mn055088.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0550: This data is Required!");
                return false;
            } else {
                mn055088.setError(null);
            }
            // Others / EditText Q 5.50
            if (mn055088.isChecked() && mn055088x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0550) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn055088x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0550: This data is Required!");
                return false;
            } else {
                mn055088x.setError(null);
            }


        }

        // ============ Q 5.51 =======================
        // RadioGroup
        if (mn0551.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0551), Toast.LENGTH_LONG).show();
            mn055102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0551: This data is Required!");
            return false;
        } else {
            mn055102.setError(null);
        }

        // Skip check 5.51
        if (mn055101.isChecked()) {
            //  CheckBox
            if (!(mn055201.isChecked() || mn055202.isChecked() || mn055203.isChecked() || mn055204.isChecked()
                    || mn055205.isChecked() || mn055206.isChecked() || mn055288.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0552), Toast.LENGTH_LONG).show();
                mn055288.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0552: This data is Required!");
                return false;
            } else {
                mn055288.setError(null);
            }

            // Others / EditText Q 5.52
            if (mn055288.isChecked() && mn055288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0552) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn055288x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0552: This data is Required!");
                return false;
            } else {
                mn055288x.setError(null);
            }


            //  CheckBox
            if (!(mn055301.isChecked() || mn055302.isChecked() || mn055303.isChecked() || mn055304.isChecked()
                    || mn055305.isChecked() || mn055306.isChecked() || mn055307.isChecked() || mn055377.isChecked()
                    || mn055388.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0553), Toast.LENGTH_LONG).show();
                mn055388.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0553: This data is Required!");
                return false;
            } else {
                mn055388.setError(null);
            }

            if (mn0554.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0554), Toast.LENGTH_LONG).show();
                mn055488.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mn0554: This data is Required!");
                return false;
            } else {
                mn055488.setError(null);
            }

            // Others / EditText Q 5.53
            if (mn055388.isChecked() && mn055388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0553) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn055388x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0553: This data is Required!");
                return false;
            } else {
                mn055388x.setError(null);
            }

            // Others / EditText Q 5.54
            if (mn055488.isChecked() && mn055488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0554) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn055488x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0554: This data is Required!");
                return false;
            } else {
                mn055488x.setError(null);
            }
        } else {
            mn055201.setChecked(false);
            mn055202.setChecked(false);
            mn055203.setChecked(false);
            mn055204.setChecked(false);
            mn055205.setChecked(false);
            mn055206.setChecked(false);
            mn055288.setChecked(false);
            mn055288x.setText(null);
            mn055301.setChecked(false);
            mn055302.setChecked(false);
            mn055303.setChecked(false);
            mn055304.setChecked(false);
            mn055305.setChecked(false);
            mn055306.setChecked(false);
            mn055307.setChecked(false);
            mn055377.setChecked(false);
            mn055388.setChecked(false);
            mn055388x.setText(null);
            mn0554.clearCheck();
        }

        // Skip check 5.53
        if (mn055377.isChecked()) {
            //  CheckBox
            if (!(mn055501.isChecked() || mn055502.isChecked() || mn055503.isChecked() || mn055504.isChecked()
                    || mn055505.isChecked() || mn055506.isChecked() || mn055588.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0555), Toast.LENGTH_LONG).show();
                mn055588.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0555: This data is Required!");
                return false;
            } else {
                mn055588.setError(null);
            }
            // Others / EditText Q 5.53
            if (mn055588.isChecked() && mn055588x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0555) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn055588x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0555: This data is Required!");
                return false;
            } else {
                mn055588x.setError(null);
            }
        } else {
            if (!(mn055401.isChecked() || mn055402.isChecked() || mn055403.isChecked() || mn055404.isChecked()
                    || mn055405.isChecked() || mn055477.isChecked() || mn055488.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0554), Toast.LENGTH_LONG).show();
                mn055488.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0555: This data is Required!");
                return false;

            }
        }


        return true;

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
