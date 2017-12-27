package edu.aku.hassannaqvi.mnch_src2.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mnch_src2.R;
import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;
import edu.aku.hassannaqvi.mnch_src2.core.SRCDBHelper;

public class EndingActivity extends Activity {

    private static final String TAG = Section8Activity.class.getSimpleName();

    @BindView(R.id.activity_ending)
    RelativeLayout activityEnding;
    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
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
    @BindView(R.id.fldGrpmn0823Reason)
    LinearLayout fldGrpmn0823Reason;
    @BindView(R.id.mn082302x)
    EditText mn082302x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        Boolean check = getIntent().getExtras().getBoolean("check");

        if (check) {
            mn082301.setEnabled(true);
            mn082302.setEnabled(false);
            mn082303.setEnabled(false);
            mn082304.setEnabled(false);
            } else {
                //fldGrpmn0823Reason.setVisibility(View.GONE);
            mn082301.setEnabled(false);
            mn082302.setEnabled(true);
            mn082303.setEnabled(true);
            mn082304.setEnabled(true);


            }


        mn0823.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (mn082302.isChecked()) {
                    fldGrpmn0823Reason.setVisibility(View.VISIBLE);
                } else {
                    fldGrpmn0823Reason.setVisibility(View.GONE);
                    mn082302x.setText(null);
                }
            }
        });


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
                Toast.makeText(this, "Saving Form", Toast.LENGTH_SHORT).show();
                SRCApp.mwCount = 0;
                SRCApp.curPreg = false;
                SRCApp.mdCount = 0;
                SRCApp.mdTotal = 0;
                SRCApp.cmCount = 0;
                SRCApp.cmTotal = 0;
                SRCApp.chCount = 0;
                SRCApp.chTotal = 0;
                SRCApp.hhno = null;
                SRCApp.village = null;
                SRCApp.uc = null;

                finish();

                Intent secNext = new Intent(this, MainActivity.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);

        int updcount = db.updateEnding();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        if (mn0823.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(Not Selected): " + getString(R.string.mn0823), Toast.LENGTH_LONG).show();
            mn082304.setError("Please Select One");    // Set Error on last radio button
            Log.i(TAG, "mn082304: This data is Required!");
            return false;
        } else {
            mn082304.setError(null);
        }


        if (mn082302.isChecked()) {

            if (mn082302x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mnother), Toast.LENGTH_LONG).show();
                mn082302x.setError("Please specify reason");    // Set Error on last radio button
                Log.i(TAG, "mn082302x: This data is Required!");
                return false;
            } else {
                mn082302x.setError(null);
            }
        }
        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();


        SRCApp.fc.setROW_MN823(mn082301.isChecked() ? "1" : mn082302.isChecked() ? "2" : mn082303.isChecked() ? "3" : mn082304.isChecked() ? "4" : "0");
        SRCApp.fc.setROW_MN823X(mn082302x.getText().toString());

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
