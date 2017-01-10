package edu.aku.hassannaqvi.mnch_src;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EndingActivity extends Activity  {

    private static final String TAG = Section8Activity.class.getSimpleName();

    @BindView(R.id.activity_ending) RelativeLayout activityEnding;
    @BindView(R.id.mn0823) RadioGroup mn0823;
    @BindView(R.id.mn082301) RadioButton mn082301;
    @BindView(R.id.mn082302) RadioButton mn082302;
    @BindView(R.id.mn082303) RadioButton mn082303;
    @BindView(R.id.mn082304) RadioButton mn082304;
    @BindView(R.id.mn082302x) EditText mn082302x;
    @BindView(R.id.btn_End) Button btn_End;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

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

                finish();

                Intent secNext = new Intent(this, MainPage.class);
                startActivity(secNext);
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

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

    private boolean formValidation() {
        Toast.makeText(this, "Validating This Section ", Toast.LENGTH_SHORT).show();

        // ============ Q 8.23 =======================
        // RadioGroup
        if (mn0823.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0823), Toast.LENGTH_LONG).show();
            mn082304.setError("This data is Required!");    // Set Error on last radio button

            Log.i(TAG, "mn0823: This data is Required!");
            return false;
        } else {
            mn082304.setError(null);
        }

        // =========== Skip Check Q 8.23 =============

        if (mn082302.isChecked()) {
            mn082302x.setEnabled(true);
            if (mn082302x.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mn0823), Toast.LENGTH_LONG).show();
                mn082302x.setError("This data is Required!");    // Set Error on last radio button

                Log.i(TAG, "mn0823: This data is Required!");
                return false;
            } else {
                mn082302x.setError(null);
            }

        } else {
            mn082302x.setEnabled(false);
            mn082302x.setText(null);
            mn082302x.setError(null);
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject s8 = new JSONObject();

        s8.put("mn0823", mn082301.isChecked() ? "1" : mn082302.isChecked() ? "2" : mn082303.isChecked() ? "3"
                : mn082304.isChecked() ? "4" : "0");
        s8.put("mn082302x", mn082302x.getText().toString());

        SRCApp.fc.setROW_S8(String.valueOf(s8));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}
