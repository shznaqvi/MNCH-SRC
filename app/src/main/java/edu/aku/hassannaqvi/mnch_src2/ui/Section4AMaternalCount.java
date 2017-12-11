package edu.aku.hassannaqvi.mnch_src2.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mnch_src2.R;
import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;

public class Section4AMaternalCount extends Activity {

    public int count = 0;
    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.app_header1)
    TextView appHeader1;
    @BindView(R.id.lbl_hhhead)
    TextView lblHhhead;
    @BindView(R.id.tcount)
    TextView tcount;
    @BindView(R.id.maternalDeathFlag)
    LinearLayout maternalDeathFlag;
    @BindView(R.id.maternalDeath)
    RadioGroup maternalDeath;
    @BindView(R.id.md01)
    RadioButton md01;
    @BindView(R.id.md02)
    RadioButton md02;
    @BindView(R.id.md03)
    LinearLayout md03;
    @BindView(R.id.countMDeath)
    EditText countMDeath;
    @BindView(R.id.btncontinue)
    Button btncontinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section4_amaternal_count);
        ButterKnife.bind(this);

        if (SRCApp.MaternalDeath) {
            maternalDeathFlag.setVisibility(View.VISIBLE);

        } else {
            maternalDeathFlag.setVisibility(View.GONE);
            md03.setVisibility(View.GONE);

            btncontinue.setVisibility(View.GONE);
        }

        maternalDeath.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                md02.setError(null);

                if (md01.isChecked()) {
                    md03.setVisibility(View.VISIBLE);
                } else {
                    md03.setVisibility(View.GONE);
                    countMDeath.setText(null);
                }
            }
        });

        countMDeath.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                try {
                    count = Integer.parseInt(countMDeath.getText().toString());
                    if (count < 1 || count > 3) {
                        countMDeath.setError("Cant be less than 1 or greater than 3.");
                        countMDeath.requestFocus();
                    } else countMDeath.setError(null);
                } catch (NumberFormatException nfe) {

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    @OnClick(R.id.btncontinue)
    void onBtncontinueClick() {
        if (md01.isChecked() || md02.isChecked()) {

            if (md01.isChecked()) {
                if (!countMDeath.getText().toString().isEmpty() && Integer.parseInt(countMDeath.getText().toString()) > 0) {

                    SRCApp.MaternalDeath = false;

                    SRCApp.NoMaternalDeath = Integer.parseInt(countMDeath.getText().toString());

                    md03.setVisibility(View.GONE);
                    maternalDeathFlag.setVisibility(View.GONE);

                    btncontinue.setVisibility(View.GONE);

                    Intent sec4a_intent = new Intent(this, Section4Activity.class);
                    sec4a_intent.putExtra("myDataKey", countMDeath.getText().toString());
                    startActivity(sec4a_intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Error: Invalid", Toast.LENGTH_SHORT).show();
                    countMDeath.setError("Invalid");
                }
            } else {
                Intent sec4b_intent = new Intent(this, Section4bActivity.class);
                sec4b_intent.putExtra("myDataKey", countMDeath.getText().toString());
                startActivity(sec4b_intent);
            }
        } else {
            Toast.makeText(this, getString(R.string.maternalDeath), Toast.LENGTH_LONG).show();
            md02.setError("Error: Invalid");
        }

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}

