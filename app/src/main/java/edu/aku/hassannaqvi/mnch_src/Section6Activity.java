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

public class Section6Activity extends Activity {

    private static final String TAG = Section6Activity.class.getSimpleName();

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
    @BindView(R.id.fldGrpmn0604)
    LinearLayout fldGrpmn0604;
    @BindView(R.id.lbl_hhhead1)
    TextView lbl_hhhdead1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section6);
        ButterKnife.bind(this);

        appHeader.setText("SRC - > Section 6");

        // ================ Q 6.02===========

        mn060305.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    fldGrpmn0604.setVisibility(View.VISIBLE);
                    mn060301.setEnabled(false);
                    mn060301.setChecked(false);
                    mn060302.setEnabled(false);
                    mn060302.setChecked(false);
                    mn060303.setEnabled(false);
                    mn060303.setChecked(false);
                    mn060304.setEnabled(false);
                    mn060304.setChecked(false);
                    mn060388.setEnabled(false);
                    mn060388.setChecked(false);
                    mn060388x.setEnabled(false);
                    mn060388x.setText(null);
                } else {
                    fldGrpmn0604.setVisibility(View.GONE);
                    mn0604.clearCheck();
                    mn060301.setEnabled(true);
                    mn060302.setEnabled(true);
                    mn060303.setEnabled(true);
                    mn060304.setEnabled(true);
                    mn060388.setEnabled(true);
                    mn060388x.setEnabled(true);

                }
            }
        });

// ============= Q 6.01 Skip Pattern =================

        mn0601.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn060101.isChecked()) {
                    fldGrpmn0602.setVisibility(View.VISIBLE);

                } else {
                    fldGrpmn0602.setVisibility(View.GONE);
                    mn060201.setChecked(false);
                    mn060202.setChecked(false);
                    mn060203.setChecked(false);
                    mn060204.setChecked(false);
                    mn060288.setChecked(false);
                    mn060288x.setText(null);
                    mn060301.setChecked(false);
                    mn060302.setChecked(false);
                    mn060303.setChecked(false);
                    mn060304.setChecked(false);
                    mn060305.setChecked(false);
                    mn060388.setChecked(false);
                    mn060388x.setText(null);
                    mn0605.clearCheck();
                }
            }
        });

        //  =========================== Q 6.02 Others ================================
        mn060288.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn060288x.setVisibility(View.VISIBLE);
                    mn060288x.requestFocus();
                } else {
                    mn060288x.setVisibility(View.GONE);
                    mn060288x.setText(null);

                }
            }
        });

        //  =========================== Q 6.03 Others ================================
        mn060388.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mn060388x.setVisibility(View.VISIBLE);
                    mn060388x.requestFocus();
                } else {
                    mn060388x.setVisibility(View.GONE);
                    mn060388x.setText(null);

                }
            }
        });



        // =============================== Q 6.04 Others ========================
        mn0604.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == mn060488.getId()) {

                    mn060488x.setVisibility(View.VISIBLE);
                    mn060488x.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(mn060488x.getWindowToken(), 0);

                } else {

                    mn060488x.setVisibility(View.GONE);
                    mn060488x.setText(null);
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

//                Intent secNext = new Intent(this, Section7Activity.class);
//                startActivity(secNext);

                CVars var = new CVars();
                if (var.getNeonatesChild() != 0) {
                    startActivity(new Intent(this, Section7Activity.class));
                }
                else if (var.getIMChild() != 0){
                    startActivity(new Intent(this, Section7ImActivity.class));
                }
                else {
                    startActivity(new Intent(this, Section8Activity.class));
                }


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);

        int updcount = db.updateS6();

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

        JSONObject s6 = new JSONObject();

        // Radio Group
        s6.put("mn0601", mn060101.isChecked() ? "1" : mn060102.isChecked() ? "2" : "0");

        // Checkbox
        s6.put("mn060201", mn060201.isChecked() ? "1" : "0");
        s6.put("mn060202", mn060202.isChecked() ? "1" : "0");
        s6.put("mn060203", mn060203.isChecked() ? "1" : "0");
        s6.put("mn060204", mn060204.isChecked() ? "1" : "0");
        s6.put("mn060288", mn060288.isChecked() ? "1" : "0");
        s6.put("mn060288x", mn060288x.getText().toString());

        // Checkbox
        s6.put("mn060301", mn060301.isChecked() ? "1" : "0");
        s6.put("mn060302", mn060302.isChecked() ? "1" : "0");
        s6.put("mn060303", mn060303.isChecked() ? "1" : "0");
        s6.put("mn060304", mn060304.isChecked() ? "1" : "0");
        s6.put("mn060305", mn060305.isChecked() ? "1" : "0");
        s6.put("mn060388", mn060388.isChecked() ? "1" : "0");
        s6.put("mn060388x", mn060388x.getText().toString());

        // Radio Group
        s6.put("mn0604", mn060401.isChecked() ? "1" : mn060402.isChecked() ? "2" : mn060403.isChecked() ? "3"
                : mn060404.isChecked() ? "4" : mn060405.isChecked() ? "5" : mn060488.isChecked() ? "6" : "0");
        s6.put("mn060488x", mn060488x.getText().toString());

        // Radio Group
        s6.put("mn0605", mn060501.isChecked() ? "1" : mn060502.isChecked() ? "2" : "0");

        SRCApp.fc.setROW_S6(String.valueOf(s6));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {

        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ============ Q 6.01 =======================
        // RadioGroup
        if (mn0601.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0601), Toast.LENGTH_LONG).show();
            mn060102.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0601: This data is Required!");
            return false;
        } else {
            mn060102.setError(null);
        }

        // Skip check 6.01
        if (mn060101.isChecked()) {
            //  6.02 CheckBox
            if (!(mn060201.isChecked() || mn060202.isChecked() || mn060203.isChecked() || mn060204.isChecked()
                    || mn060204.isChecked() || mn060288.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0602), Toast.LENGTH_LONG).show();
                mn060288.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0602: This data is Required!");
                return false;
            } else {
                mn060288.setError(null);
            }
            // Others / EditText Q 6.02
            if (mn060288.isChecked() && mn060288x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0602) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn060288x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0602: This data is Required!");
                return false;
            } else {
                mn060288x.setError(null);
            }

            //  6.03 CheckBox
            if (!(mn060301.isChecked() || mn060302.isChecked() || mn060303.isChecked() || mn060304.isChecked()
                    || mn060304.isChecked() || mn060305.isChecked() || mn060388.isChecked())) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0603), Toast.LENGTH_LONG).show();
                mn060388.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0603: This data is Required!");
                return false;
            } else {
                mn060388.setError(null);
            }
            // Others / EditText Q 6.03
            if (mn060388.isChecked() && mn060388x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0603) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn060388x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0603: This data is Required!");
                return false;
            } else {
                mn060388x.setError(null);
            }

            if (mn0605.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0605), Toast.LENGTH_LONG).show();
                mn060502.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mn0605: This data is Required!");
                return false;
            } else {
                mn060502.setError(null);
            }

        } else {
            mn060201.setChecked(false);
            mn060202.setChecked(false);
            mn060203.setChecked(false);
            mn060204.setChecked(false);
            mn060288.setChecked(false);
            mn060288x.setText(null);
            mn060301.setChecked(false);
            mn060302.setChecked(false);
            mn060303.setChecked(false);
            mn060304.setChecked(false);
            mn060305.setChecked(false);
            mn060388.setChecked(false);
            mn060388x.setText(null);
            mn0604.clearCheck();
            mn0605.clearCheck();
        }

        // ========= Q 6.03 Skip check============

        if (mn060305.isChecked()) {
            //  6.04 Radio
            if (mn0604.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0604), Toast.LENGTH_LONG).show();
                mn060488.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0604: This data is Required!");
                return false;
            } else {
                mn060488.setError(null);
            }
            // Others / EditText Q 6.04
            if (mn060488.isChecked() && mn060488x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0604) + " - " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn060388x.setError("This data is Required!");    // Set Error on last radio button
                Log.i(TAG, "mn0604: This data is Required!");
                return false;
            } else {
                mn060488x.setError(null);
            }

        } else {
            mn0604.clearCheck();
        }

        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
