package edu.aku.hassannaqvi.mnch_src.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
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
import edu.aku.hassannaqvi.mnch_src.R;
import edu.aku.hassannaqvi.mnch_src.core.SRCApp;
import edu.aku.hassannaqvi.mnch_src.core.SRCDBHelper;
import edu.aku.hassannaqvi.mnch_src.contract.Sec7ImContract;

public class Section7IMActivity extends Activity {

    private static final String TAG = Section7IMActivity.class.getSimpleName();

    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn07im01)
    EditText mn07im01;
    @BindView(R.id.mn07im02)
    EditText mn07im02;
    @BindView(R.id.mn07im03)
    RadioGroup mn07im03;
    @BindView(R.id.mn07im0301)
    RadioButton mn07im0301;
    @BindView(R.id.mn07im0302)
    RadioButton mn07im0302;
    @BindView(R.id.mnbcg)
    RadioGroup mnbcg;
    @BindView(R.id.mnbcg01)
    RadioButton mnbcg01;
    @BindView(R.id.mnbcg02)
    RadioButton mnbcg02;
    @BindView(R.id.mnbcgsrc)
    RadioGroup mnbcgsrc;
    @BindView(R.id.mnbcgsrc01)
    RadioButton mnbcgsrc01;
    @BindView(R.id.mnbcgsrc02)
    RadioButton mnbcgsrc02;
    @BindView(R.id.mnbcgsrc03)
    RadioButton mnbcgsrc03;
    @BindView(R.id.mnbcgscar)
    RadioGroup mnbcgscar;
    @BindView(R.id.mnbcgscar01)
    RadioButton mnbcgscar01;
    @BindView(R.id.mnbcgscar02)
    RadioButton mnbcgscar02;
    @BindView(R.id.mnopv0)
    RadioGroup mnopv0;
    @BindView(R.id.mnopv001)
    RadioButton mnopv001;
    @BindView(R.id.mnopv002)
    RadioButton mnopv002;
    @BindView(R.id.mnopv0src)
    RadioGroup mnopv0src;
    @BindView(R.id.mnopv0src01)
    RadioButton mnopv0src01;
    @BindView(R.id.mnopv0src02)
    RadioButton mnopv0src02;
    @BindView(R.id.mnopv0src03)
    RadioButton mnopv0src03;
    @BindView(R.id.mnp1)
    RadioGroup mnp1;
    @BindView(R.id.mnp101)
    RadioButton mnp101;
    @BindView(R.id.mnp102)
    RadioButton mnp102;
    @BindView(R.id.mnp1src)
    RadioGroup mnp1src;
    @BindView(R.id.mnp1src01)
    RadioButton mnp1src01;
    @BindView(R.id.mnp1src02)
    RadioButton mnp1src02;
    @BindView(R.id.mnp1src03)
    RadioButton mnp1src03;
    @BindView(R.id.mnopv1)
    RadioGroup mnopv1;
    @BindView(R.id.mnopv101)
    RadioButton mnopv101;
    @BindView(R.id.mnopv102)
    RadioButton mnopv102;
    @BindView(R.id.mnopv1src)
    RadioGroup mnopv1src;
    @BindView(R.id.mnopv1src01)
    RadioButton mnopv1src01;
    @BindView(R.id.mnopv1src02)
    RadioButton mnopv1src02;
    @BindView(R.id.mnopv1src03)
    RadioButton mnopv1src03;
    @BindView(R.id.mnpcv1)
    RadioGroup mnpcv1;
    @BindView(R.id.mnpcv101)
    RadioButton mnpcv101;
    @BindView(R.id.mnpcv102)
    RadioButton mnpcv102;
    @BindView(R.id.mnpcv1src)
    RadioGroup mnpcv1src;
    @BindView(R.id.mnpcv1src01)
    RadioButton mnpcv1src01;
    @BindView(R.id.mnpcv1src02)
    RadioButton mnpcv1src02;
    @BindView(R.id.mnpcv1src03)
    RadioButton mnpcv1src03;
    @BindView(R.id.mnp2)
    RadioGroup mnp2;
    @BindView(R.id.mnp201)
    RadioButton mnp201;
    @BindView(R.id.mnp202)
    RadioButton mnp202;
    @BindView(R.id.mnp2src)
    RadioGroup mnp2src;
    @BindView(R.id.mnp2src01)
    RadioButton mnp2src01;
    @BindView(R.id.mnp2src02)
    RadioButton mnp2src02;
    @BindView(R.id.mnp2src03)
    RadioButton mnp2src03;
    @BindView(R.id.mnopv2)
    RadioGroup mnopv2;
    @BindView(R.id.mnopv201)
    RadioButton mnopv201;
    @BindView(R.id.mnopv202)
    RadioButton mnopv202;
    @BindView(R.id.mnopv2src)
    RadioGroup mnopv2src;
    @BindView(R.id.mnopv2src01)
    RadioButton mnopv2src01;
    @BindView(R.id.mnopv2src02)
    RadioButton mnopv2src02;
    @BindView(R.id.mnopv2src03)
    RadioButton mnopv2src03;
    @BindView(R.id.mnpcv2)
    RadioGroup mnpcv2;
    @BindView(R.id.mnpcv201)
    RadioButton mnpcv201;
    @BindView(R.id.mnpcv202)
    RadioButton mnpcv202;
    @BindView(R.id.mnpcv2src)
    RadioGroup mnpcv2src;
    @BindView(R.id.mnpcv2src01)
    RadioButton mnpcv2src01;
    @BindView(R.id.mnpcv2src02)
    RadioButton mnpcv2src02;
    @BindView(R.id.mnpcv2src03)
    RadioButton mnpcv2src03;
    @BindView(R.id.mnp3)
    RadioGroup mnp3;
    @BindView(R.id.mnp301)
    RadioButton mnp301;
    @BindView(R.id.mnp302)
    RadioButton mnp302;
    @BindView(R.id.mnp3src)
    RadioGroup mnp3src;
    @BindView(R.id.mnp3src01)
    RadioButton mnp3src01;
    @BindView(R.id.mnp3src02)
    RadioButton mnp3src02;
    @BindView(R.id.mnp3src03)
    RadioButton mnp3src03;
    @BindView(R.id.mnopv3)
    RadioGroup mnopv3;
    @BindView(R.id.mnopv301)
    RadioButton mnopv301;
    @BindView(R.id.mnopv302)
    RadioButton mnopv302;
    @BindView(R.id.mnopv3src)
    RadioGroup mnopv3src;
    @BindView(R.id.mnopv3src01)
    RadioButton mnopv3src01;
    @BindView(R.id.mnopv3src02)
    RadioButton mnopv3src02;
    @BindView(R.id.mnopv3src03)
    RadioButton mnopv3src03;
    @BindView(R.id.mnipv)
    RadioGroup mnipv;
    @BindView(R.id.mnipv01)
    RadioButton mnipv01;
    @BindView(R.id.mnipv02)
    RadioButton mnipv02;
    @BindView(R.id.mnipvsrc)
    RadioGroup mnipvsrc;
    @BindView(R.id.mnipvsrc01)
    RadioButton mnipvsrc01;
    @BindView(R.id.mnipvsrc02)
    RadioButton mnipvsrc02;
    @BindView(R.id.mnipvsrc03)
    RadioButton mnipvsrc03;
    @BindView(R.id.mnpcv3)
    RadioGroup mnpcv3;
    @BindView(R.id.mnpcv301)
    RadioButton mnpcv301;
    @BindView(R.id.mnpcv302)
    RadioButton mnpcv302;
    @BindView(R.id.mnpcv3src)
    RadioGroup mnpcv3src;
    @BindView(R.id.mnpcv3src01)
    RadioButton mnpcv3src01;
    @BindView(R.id.mnpcv3src02)
    RadioButton mnpcv3src02;
    @BindView(R.id.mnpcv3src03)
    RadioButton mnpcv3src03;
    @BindView(R.id.mnm1)
    RadioGroup mnm1;
    @BindView(R.id.mnm101)
    RadioButton mnm101;
    @BindView(R.id.mnm102)
    RadioButton mnm102;
    @BindView(R.id.mnm1src)
    RadioGroup mnm1src;
    @BindView(R.id.mnm1src01)
    RadioButton mnm1src01;
    @BindView(R.id.mnm1src02)
    RadioButton mnm1src02;
    @BindView(R.id.mnm1src03)
    RadioButton mnm1src03;
    @BindView(R.id.mnm2)
    RadioGroup mnm2;
    @BindView(R.id.mnm201)
    RadioButton mnm201;
    @BindView(R.id.mnm202)
    RadioButton mnm202;
    @BindView(R.id.mnm2src)
    RadioGroup mnm2src;
    @BindView(R.id.mnm2src01)
    RadioButton mnm2src01;
    @BindView(R.id.mnm2src02)
    RadioButton mnm2src02;
    @BindView(R.id.mnm2src03)
    RadioButton mnm2src03;
    @BindView(R.id.mnis)
    RadioGroup mnis;
    @BindView(R.id.mnfi)
    RadioButton mnfi;
    @BindView(R.id.mnpi)
    RadioButton mnpi;
    @BindView(R.id.mnui)
    RadioButton mnui;

    @BindView(R.id.btn_Continue)
    Button btn_Continue;



    int counterIM = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section7_im);
        ButterKnife.bind(this);
        appHeader.setText(getString(R.string.sec7IM) + " (" + SRCApp.chCount + " of " + SRCApp.chTotal+")");

//        counterIM = Integer.parseInt(getIntent().getExtras().getString("IMChild"));

     /*   CVars var = new CVars();

        if (SRCApp.chTotal > 1) {
            btn_Continue.setText("Next Section");

            appHeader.setText("Section 7IM Child:" + (var.getIMChild() - (SRCApp.chTotal - 1)) + " out of " + var.getIMChild());

        }else {
            btn_Continue.setText("Section 8");

            appHeader.setText("Section 7IM Child:"+ var.getIMChild() + " out of "+ var.getIMChild());
        }

        if (SRCApp.chTotal < 1) {
            finish();
            startActivity(new Intent(this, Section8Activity.class));
        }*/

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Closing Section", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, EndingActivity.class);
                endSec.putExtra("check", false);
                startActivity(endSec);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        Toast.makeText(this, "Processing Section G", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                if (SRCApp.chCount < SRCApp.chTotal) {
                    Intent sec7_intent = new Intent(this, Section7IMActivity.class);
                    SRCApp.chCount++;
                    startActivity(sec7_intent);
                } else {
                    Intent sec8_intent = new Intent(this, Section8Activity.class);
                    SRCApp.chCount = 0;
                    SRCApp.chTotal = 0;
                    startActivity(sec8_intent);
                }

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        Long rowId;
        SRCDBHelper db = new SRCDBHelper(this);

        rowId = db.addSec7Im(SRCApp.sec7im);

        SRCApp.sec7im.set_ID(rowId);

        if (rowId != null) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            SRCApp.sec7im.setROW_UID((SRCApp.sec7im.getROW_DEVID() + SRCApp.sec7im.get_ID()));
            db.updateS7ImUID();
            Toast.makeText(this, "Current Form No: " + SRCApp.sec7im.getROW_UID(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        SRCApp.sec7im = new Sec7ImContract();

        SharedPreferences sharedPref = getSharedPreferences("tagName", MODE_PRIVATE);
        SRCApp.sec7im.setTagID(sharedPref.getString("tagName", null));
        SRCApp.sec7im.setVersion(SRCApp.versionName + "." + SRCApp.versionCode);

        SRCApp.sec7im.setROW_DEVID(Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID));
        SRCApp.sec7im.setROW_USERID(SRCApp.fc.getROW_USERID());
        SRCApp.sec7im.setROW_UUID(SRCApp.fc.getROW_UUID());
        SRCApp.sec7im.setROW_ENTRYDATE(SRCApp.fc.getROW_ENTRYDATE());
        SRCApp.sec7im.setHousehold(SRCApp.fc.getROW_S1Q101());
        SRCApp.sec7im.setROW_GPS_LAT(SRCApp.fc.getROW_GPS_LAT());
        SRCApp.sec7im.setROW_GPS_LNG(SRCApp.fc.getROW_GPS_LNG());
        SRCApp.sec7im.setROW_GPS_ACC(SRCApp.fc.getROW_GPS_ACC());
        SRCApp.sec7im.setROW_GPS_DT(SRCApp.fc.getROW_GPS_DT());


        JSONObject s7im = new JSONObject();

        s7im.put("mn07im01", mn07im01.getText().toString());
        s7im.put("mn07im02", mn07im02.getText().toString());
        s7im.put("mn07im03", mn07im0301.isChecked() ? "1" : mn07im0302.isChecked() ? "2" : "default");
        s7im.put("mnbcg", mnbcg01.isChecked() ? "1" : mnbcg02.isChecked() ? "2" : "default");
        s7im.put("mnbcgsrc", mnbcgsrc01.isChecked() ? "1" : mnbcgsrc02.isChecked() ? "2" : "default");
        s7im.put("mnbcgscar", mnbcgscar01.isChecked() ? "1" : mnbcgscar02.isChecked() ? "2" : "default");
        s7im.put("mnopv0", mnopv001.isChecked() ? "1" : mnopv002.isChecked() ? "2" : "default");
        s7im.put("mnopv0src", mnopv0src01.isChecked() ? "1" : mnopv0src02.isChecked() ? "2" : "default");
        s7im.put("mnp1", mnp101.isChecked() ? "1" : mnp102.isChecked() ? "2" : "default");
        s7im.put("mnp1src", mnp1src01.isChecked() ? "1" : mnp1src02.isChecked() ? "2" : "default");
        s7im.put("mnopv1", mnopv101.isChecked() ? "1" : mnopv102.isChecked() ? "2" : "default");
        s7im.put("mnopv1src", mnopv1src01.isChecked() ? "1" : mnopv1src02.isChecked() ? "2" : "default");
        s7im.put("mnopv2", mnopv201.isChecked() ? "1" : mnopv202.isChecked() ? "2" : "default");
        s7im.put("mnopv2src", mnopv2src01.isChecked() ? "1" : mnopv2src02.isChecked() ? "2" : "default");
        s7im.put("mnopv3", mnopv301.isChecked() ? "1" : mnopv302.isChecked() ? "2" : "default");
        s7im.put("mnopv3src", mnopv3src01.isChecked() ? "1" : mnopv3src02.isChecked() ? "2" : "default");
        s7im.put("mnp2", mnp201.isChecked() ? "1" : mnp202.isChecked() ? "2" : "default");
        s7im.put("mnp2src", mnp2src01.isChecked() ? "1" : mnp2src02.isChecked() ? "2" : "default");
        s7im.put("mnp3", mnp301.isChecked() ? "1" : mnp302.isChecked() ? "2" : "default");
        s7im.put("mnp3src", mnp3src01.isChecked() ? "1" : mnp3src02.isChecked() ? "2" : "default");
        s7im.put("mnpcv1", mnpcv101.isChecked() ? "1" : mnpcv102.isChecked() ? "2" : "default");
        s7im.put("mnpcv1src", mnpcv1src01.isChecked() ? "1" : mnpcv1src02.isChecked() ? "2" : "default");
        s7im.put("mnpcv2", mnpcv201.isChecked() ? "1" : mnpcv202.isChecked() ? "2" : "default");
        s7im.put("mnpcv2src", mnpcv2src01.isChecked() ? "1" : mnpcv2src02.isChecked() ? "2" : "default");
        s7im.put("mnpcv3", mnpcv301.isChecked() ? "1" : mnpcv302.isChecked() ? "2" : "default");
        s7im.put("mnpcv3src", mnpcv3src01.isChecked() ? "1" : mnpcv3src02.isChecked() ? "2" : "default");
        s7im.put("mnipv", mnipv01.isChecked() ? "1" : mnipv02.isChecked() ? "2" : "default");
        s7im.put("mnipvsrc", mnipvsrc01.isChecked() ? "1" : mnipvsrc02.isChecked() ? "2" : "default");
        s7im.put("mnm1", mnm101.isChecked() ? "1" : mnm102.isChecked() ? "2" : "default");
        s7im.put("mnm1src", mnm1src01.isChecked() ? "1" : mnm1src02.isChecked() ? "2" : "default");
        s7im.put("mnm2", mnm201.isChecked() ? "1" : mnm202.isChecked() ? "2" : "default");
        s7im.put("mnm2src", mnm2src01.isChecked() ? "1" : mnm2src02.isChecked() ? "2" : "default");
        s7im.put("mnis", mnfi.isChecked() ? "1" : mnpi.isChecked() ? "2" : mnui.isChecked() ? "3" : "default");


        SRCApp.sec7im.setROW_7IM(String.valueOf(s7im));


        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {

        if (mn07im01.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn07im01), Toast.LENGTH_LONG).show();
            mn07im01.setError("This data is Required!");
            Log.i(TAG, "mn07im01: This data is Required!");
            return false;
        } else {
            mn07im01.setError(null);
        }

        if (mn07im02.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn07im02), Toast.LENGTH_LONG).show();
            mn07im02.setError("This data is Required!");
            Log.i(TAG, "mn07im02: This data is Required!");
            return false;
        } else {
            mn07im02.setError(null);
        }

        if (Integer.parseInt(mn07im02.getText().toString()) > 59 || Integer.parseInt(mn07im02.getText().toString()) < 0) {
            Toast.makeText(this, "Invalid: " + getString(R.string.mn07im02), Toast.LENGTH_LONG).show();
            mn07im02.setError("Invalid: Range 0 - 59!");
            Log.i(TAG, "mn07im02: Invalid: Range 0 - 59!");
            return false;
        } else {
            mn07im02.setError(null);
        }

        if (mn07im03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn07im03), Toast.LENGTH_LONG).show();
            mn07im0302.setError("This data is Required!");
            Log.i(TAG, "mn07im03: This data is Required!");
            return false;
        } else {
            mn07im0302.setError(null);
        }

        if (mnbcg.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnbcg), Toast.LENGTH_LONG).show();
            mnbcg02.setError("This data is Required!");
            Log.i(TAG, "mnbcg: This data is Required!");
            return false;
        } else {
            mnbcg02.setError(null);
        }

        if (mnbcgsrc.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnbcgsrc), Toast.LENGTH_LONG).show();
            mnbcgsrc02.setError("This data is Required!");
            Log.i(TAG, "mnbcgsrc: This data is Required!");
            return false;
        } else {
            mnbcgsrc02.setError(null);
        }

        if (mnbcgscar.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnbcgscar), Toast.LENGTH_LONG).show();
            mnbcgscar02.setError("This data is Required!");
            Log.i(TAG, "mnbcgscar: This data is Required!");
            return false;
        } else {
            mnbcgscar02.setError(null);
        }

        if (mnopv0.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnopv0), Toast.LENGTH_LONG).show();
            mnopv002.setError("This data is Required!");
            Log.i(TAG, "mnopv0: This data is Required!");
            return false;
        } else {
            mnopv002.setError(null);
        }

        if (mnopv0src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnopv0src), Toast.LENGTH_LONG).show();
            mnopv0src03.setError("This data is Required!");
            Log.i(TAG, "mnopv0src: This data is Required!");
            return false;
        } else {
            mnopv0src03.setError(null);
        }

        if (mnp1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnp1), Toast.LENGTH_LONG).show();
            mnp102.setError("This data is Required!");
            Log.i(TAG, "mnp1: This data is Required!");
            return false;
        } else {
            mnp102.setError(null);
        }

        if (mnp1src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnp1src), Toast.LENGTH_LONG).show();
            mnp1src03.setError("This data is Required!");
            Log.i(TAG, "mnp1src: This data is Required!");
            return false;
        } else {
            mnp1src03.setError(null);
        }
        if (mnopv1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnopv1), Toast.LENGTH_LONG).show();
            mnopv102.setError("This data is Required!");
            Log.i(TAG, "mnopv1: This data is Required!");
            return false;
        } else {
            mnopv102.setError(null);
        }
        if (mnopv1src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnopv1src), Toast.LENGTH_LONG).show();
            mnopv1src03.setError("This data is Required!");
            Log.i(TAG, "mnopv1src: This data is Required!");
            return false;
        } else {
            mnopv1src03.setError(null);
        }
        if (mnpcv1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnpcv1), Toast.LENGTH_LONG).show();
            mnpcv102.setError("This data is Required!");
            Log.i(TAG, "mnpcv1: This data is Required!");
            return false;
        } else {
            mnpcv102.setError(null);
        }
        if (mnpcv1src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnpcv1src), Toast.LENGTH_LONG).show();
            mnpcv1src03.setError("This data is Required!");
            Log.i(TAG, "mnpcv1src: This data is Required!");
            return false;
        } else {
            mnpcv1src03.setError(null);
        }

        if (mnp2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnp2), Toast.LENGTH_LONG).show();
            mnp202.setError("This data is Required!");
            Log.i(TAG, "mnp2: This data is Required!");
            return false;
        } else {
            mnp202.setError(null);
        }
        if (mnp2src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnp2src), Toast.LENGTH_LONG).show();
            mnp2src03.setError("This data is Required!");
            Log.i(TAG, "mnp2src: This data is Required!");
            return false;
        } else {
            mnp2src03.setError(null);
        }
        if (mnopv2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnopv2), Toast.LENGTH_LONG).show();
            mnopv202.setError("This data is Required!");
            Log.i(TAG, "mnopv2: This data is Required!");
            return false;
        } else {
            mnopv202.setError(null);
        }
        if (mnopv2src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnopv2src), Toast.LENGTH_LONG).show();
            mnopv2src03.setError("This data is Required!");
            Log.i(TAG, "mnopv2src: This data is Required!");
            return false;
        } else {
            mnopv2src03.setError(null);
        }
        if (mnpcv2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnpcv2), Toast.LENGTH_LONG).show();
            mnpcv202.setError("This data is Required!");
            Log.i(TAG, "mnpcv2: This data is Required!");
            return false;
        } else {
            mnpcv202.setError(null);
        }
        if (mnpcv2src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnpcv2src), Toast.LENGTH_LONG).show();
            mnpcv2src03.setError("This data is Required!");
            Log.i(TAG, "mnpcv2src: This data is Required!");
            return false;
        } else {
            mnpcv2src03.setError(null);
        }

        if (mnp3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnp3), Toast.LENGTH_LONG).show();
            mnp302.setError("This data is Required!");
            Log.i(TAG, "mnp3: This data is Required!");
            return false;
        } else {
            mnp302.setError(null);
        }
        if (mnp3src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnp3src), Toast.LENGTH_LONG).show();
            mnp3src03.setError("This data is Required!");
            Log.i(TAG, "mnp3src: This data is Required!");
            return false;
        } else {
            mnp3src03.setError(null);
        }
        if (mnopv3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnopv3), Toast.LENGTH_LONG).show();
            mnopv302.setError("This data is Required!");
            Log.i(TAG, "mnopv3: This data is Required!");
            return false;
        } else {
            mnopv302.setError(null);
        }
        if (mnopv3src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnopv3src), Toast.LENGTH_LONG).show();
            mnopv3src03.setError("This data is Required!");
            Log.i(TAG, "mnopv3src: This data is Required!");
            return false;
        } else {
            mnopv3src03.setError(null);
        }
        if (mnipv.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnipv), Toast.LENGTH_LONG).show();
            mnipv02.setError("This data is Required!");
            Log.i(TAG, "mnipv: This data is Required!");
            return false;
        } else {
            mnipv02.setError(null);
        }
        if (mnipvsrc.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnipvsrc), Toast.LENGTH_LONG).show();
            mnipvsrc03.setError("This data is Required!");
            Log.i(TAG, "mnipvsrc: This data is Required!");
            return false;
        } else {
            mnipvsrc03.setError(null);
        }
        if (mnpcv3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnpcv3), Toast.LENGTH_LONG).show();
            mnpcv302.setError("This data is Required!");
            Log.i(TAG, "mnpcv3: This data is Required!");
            return false;
        } else {
            mnpcv302.setError(null);
        }
        if (mnpcv3src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnpcv3src), Toast.LENGTH_LONG).show();
            mnpcv3src03.setError("This data is Required!");
            Log.i(TAG, "mnpcv3src: This data is Required!");
            return false;
        } else {
            mnpcv3src03.setError(null);
        }

        if (mnm1.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnm1), Toast.LENGTH_LONG).show();
            mnm102.setError("This data is Required!");
            Log.i(TAG, "mnm1: This data is Required!");
            return false;
        } else {
            mnm102.setError(null);
        }
        if (mnm1src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnm1src), Toast.LENGTH_LONG).show();
            mnm1src03.setError("This data is Required!");
            Log.i(TAG, "mnm1src: This data is Required!");
            return false;
        } else {
            mnm1src03.setError(null);
        }

        if (mnm2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnm2), Toast.LENGTH_LONG).show();
            mnm202.setError("This data is Required!");
            Log.i(TAG, "mnm2: This data is Required!");
            return false;
        } else {
            mnm202.setError(null);
        }
        if (mnm2src.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnm2src), Toast.LENGTH_LONG).show();
            mnm2src03.setError("This data is Required!");
            Log.i(TAG, "mnm2src: This data is Required!");
            return false;
        } else {
            mnm2src03.setError(null);
        }

        if (mnis.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnis), Toast.LENGTH_LONG).show();
            mnui.setError("This data is Required!");
            Log.i(TAG, "mnis: This data is Required!");
            return false;
        } else {
            mnui.setError(null);
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
