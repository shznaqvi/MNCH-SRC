package edu.aku.hassannaqvi.mnch_src;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Section7Activity extends Activity implements RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {

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
    @BindView(R.id.mn0702_99)
    CheckBox mn070299;
    @BindView(R.id.mn0703)
    RadioGroup mn0703;
    @BindView(R.id.mn0703_1)
    RadioButton mn07031;
    @BindView(R.id.mn0703_2)
    RadioButton mn07032;
    @BindView(R.id.mn0704)
    RadioGroup mn0704;
    @BindView(R.id.mn0704_1)
    RadioButton mn07041;
    @BindView(R.id.mn0704_2)
    RadioButton mn07042;
    @BindView(R.id.mn0705)
    RadioGroup mn0705;
    @BindView(R.id.mn0705_1)
    RadioButton mn07051;
    @BindView(R.id.mn0705_2)
    RadioButton mn07052;
    @BindView(R.id.mn0706)
    RadioGroup mn0706;
    @BindView(R.id.mn0706_1)
    RadioButton mn07061;
    @BindView(R.id.mn0706_2)
    RadioButton mn07062;
    @BindView(R.id.mn0706_99)
    RadioButton mn070699;
    @BindView(R.id.mn0707)
    RadioGroup mn0707;
    @BindView(R.id.mn0707_1)
    RadioButton mn07071;
    @BindView(R.id.mn0707_2)
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
    @BindView(R.id.mn0709_1)
    RadioButton mn07091;
    @BindView(R.id.mn0709_2)
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
    EditText mn071102x;
    @BindView(R.id.mn071103)
    RadioButton mn071103;
    //    @BindView(R.id.mn071103x)
    EditText mn071103x;
    @BindView(R.id.mn0712)
    RadioGroup mn0712;
    @BindView(R.id.mn0712_1)
    RadioButton mn07121;
    @BindView(R.id.mn0712_2)
    RadioButton mn07122;
    @BindView(R.id.mn0712_99)
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
    @BindView(R.id.mn0715_1)
    RadioButton mn07151;
    @BindView(R.id.mn0715_2)
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
    @BindView(R.id.mn0701901)
    RadioButton mn0701901;
    @BindView(R.id.mn0701902)
    RadioButton mn0701902;
    @BindView(R.id.mn0701903)
    RadioButton mn0701903;
    @BindView(R.id.mn0701904)
    RadioButton mn0701904;
    @BindView(R.id.mn0701905)
    RadioButton mn0701905;
    @BindView(R.id.mn0701906)
    RadioButton mn0701906;
    //    @BindView(R.id.mn0701907)
    RadioButton mn0701907;
    @BindView(R.id.mn0701988)
    RadioButton mn0701988;
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
    @BindView(R.id.mn0721_1)
    RadioButton mn07211;
    @BindView(R.id.mn0721_2)
    RadioButton mn07212;
    @BindView(R.id.mn072201)
    EditText mn072201;
    @BindView(R.id.mn072202)
    EditText mn072202;
    @BindView(R.id.mn072203)
    EditText mn072203;

    @BindView(R.id.mn07078)
    LinearLayout mn07078;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section7);
        ButterKnife.bind(this);

        mn0706.setOnCheckedChangeListener(this);
        mn0707.setOnCheckedChangeListener(this);
        mn0708.setOnCheckedChangeListener(this);
        mn0709.setOnCheckedChangeListener(this);
        mn0712.setOnCheckedChangeListener(this);
        mn0715.setOnCheckedChangeListener(this);
        mn0718.setOnCheckedChangeListener(this);
        mn0721.setOnCheckedChangeListener(this);

//        Checked Cases

        mn071088.setOnCheckedChangeListener(this);
        mn071488.setOnCheckedChangeListener(this);
        mn071688.setOnCheckedChangeListener(this);
        mn071788.setOnCheckedChangeListener(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement

        if (ValidateForm()) {

//            if (SaveDraft()) {

            Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

//                if (UpdateDB()) {
//                    Intent sec3_intent = new Intent(this, Section3Activity.class);
//                    startActivity(sec3_intent);
//                } else {
//                    Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
//                }
        }
    }

    public boolean ValidateForm() {

//        7.02

        if (!mn070299.isChecked()) {
            if (mn070201.getText().toString().isEmpty() && mn070202.getText().toString().isEmpty()) {
                Toast.makeText(this, "" + getString(R.string.mn0702), Toast.LENGTH_SHORT).show();
                mn070201.setError("This is inValid");
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
            return false;
        } else {
            mn07031.setError(null);
        }

//        7.04

        if (mn0704.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0704), Toast.LENGTH_SHORT).show();
            mn07041.setError("This is inValid");
            return false;
        } else {
            mn07041.setError(null);
        }

//        7.05

        if (mn0705.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0705), Toast.LENGTH_SHORT).show();
            mn07051.setError("This is inValid");
            return false;
        } else {
            mn07051.setError(null);
        }

//        7.06

        if (mn0706.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0706), Toast.LENGTH_SHORT).show();
            mn070699.setError("This is inValid");
            return false;
        } else {
            mn070699.setError(null);
        }

        if (!mn07061.isChecked()) {

//        7.07

            if (mn0707.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mn0707), Toast.LENGTH_SHORT).show();
                mn07072.setError("This is inValid");
                return false;
            } else {
                mn07072.setError(null);
            }

//        7.08

            if (mn07071.isChecked()) {
                if (mn0708.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "" + getString(R.string.mn0708), Toast.LENGTH_SHORT).show();
                    mn070888.setError("This is inValid");
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
                return false;
            } else {
                mn071088.setError(null);
            }

            if(mn071088.isChecked() && mn071088x.getText().toString().isEmpty()){
                Toast.makeText(this, "" + getString(R.string.mn0710), Toast.LENGTH_SHORT).show();
                mn071088x.setError("This is inValid");
                return false;
            } else {
                mn071088x.setError(null);
            }
        }

//        7.11

        if (mn0711.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0711), Toast.LENGTH_SHORT).show();
            mn071101.setError("This is inValid");
            return false;
        } else {
            mn071101.setError(null);
        }

//        7.12

        if (mn0712.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0712), Toast.LENGTH_SHORT).show();
            mn07121.setError("This is inValid");
            return false;
        } else {
            mn07121.setError(null);
        }

//        7.13

        if (mn07121.isChecked()) {
            if (mn0713.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mn0713), Toast.LENGTH_SHORT).show();
                mn071301.setError("This is inValid");
                return false;
            } else {
                mn071301.setError(null);
            }
        }

//        7.14

        if (!mn071401.isChecked() && !mn071402.isChecked() && !mn071403.isChecked() && !mn071404.isChecked()
                && !mn071405.isChecked() && !mn071406.isChecked() && !mn071488.isChecked()) {
            Toast.makeText(this, "" + getString(R.string.mn0714), Toast.LENGTH_SHORT).show();
            mn071488.setError("This is inValid");
            return false;
        } else {
            mn071488.setError(null);
        }

        if(mn071488.isChecked() && mn071488x.getText().toString().isEmpty()){
            Toast.makeText(this, "" + getString(R.string.mn0714), Toast.LENGTH_SHORT).show();
            mn071488x.setError("This is inValid");
            return false;
        } else {
            mn071488x.setError(null);
        }

//        7.15

        if (mn0715.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mn0715), Toast.LENGTH_SHORT).show();
            mn07151.setError("This is inValid");
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
                return false;
            } else {
                mn071688.setError(null);
            }

            if(mn071688.isChecked() && mn071688x.getText().toString().isEmpty()){
                Toast.makeText(this, "" + getString(R.string.mn0716), Toast.LENGTH_SHORT).show();
                mn071688x.setError("This is inValid");
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
                return false;
            } else {
                mn071788.setError(null);
            }

            if(mn071788.isChecked() && mn071788x.getText().toString().isEmpty()){
                Toast.makeText(this, "" + getString(R.string.mn0717), Toast.LENGTH_SHORT).show();
                mn071788x.setError("This is inValid");
                return false;
            } else {
                mn071788x.setError(null);
            }

//        7.18

            if (mn0718.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mn0718), Toast.LENGTH_SHORT).show();
                mn071801.setError("This is inValid");
                return false;
            } else {
                mn071801.setError(null);
            }

        }

//        7.19

        if (mn07151.isChecked()) {

            if (mn071802.isChecked()) {

                if (mn0719.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(this, "" + getString(R.string.mn0719), Toast.LENGTH_SHORT).show();
                    mn0701901.setError("This is inValid");
                    return false;
                } else {
                    mn0701901.setError(null);
                }

                if (mn0701988.isChecked() && mn071988x.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Empty:" + getString(R.string.mn0719), Toast.LENGTH_SHORT).show();
                    mn0701988.setError("This is inValid");
                    return false;
                } else {
                    mn0701988.setError(null);
                }

            }
        }

        if (mn07152.isChecked() || mn071801.isChecked()) {

//        7.20

            if (!mn072001.isChecked() && !mn072002.isChecked() && !mn072003.isChecked() && !mn072004.isChecked()) {
                Toast.makeText(this, "" + getString(R.string.mn0720), Toast.LENGTH_SHORT).show();
                mn072001.setError("This is inValid");
                return false;
            } else {
                mn072001.setError(null);
            }

//        7.21

            if (mn0721.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "" + getString(R.string.mn0721), Toast.LENGTH_SHORT).show();
                mn07211.setError("This is inValid");
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
                mn07078.setVisibility(View.GONE);
                mn070888x.setText(null);
            } else {
                mn07078.setVisibility(View.VISIBLE);
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
                mn071088x.setText(null);
            } else {
                mn07010Grp.setVisibility(View.VISIBLE);
                mn071088x.setText(null);
            }
        } else if (group.getId() == R.id.mn0712) {
            if (!mn07121.isChecked()) {
                mn07013Grp.setVisibility(View.GONE);
            } else {
                mn07013Grp.setVisibility(View.VISIBLE);
            }
        } else if (group.getId() == R.id.mn0715) {

            if (mn07152.isChecked()) {
                mn07016BigGrp.setVisibility(View.GONE);
            } else {
                mn07016BigGrp.setVisibility(View.VISIBLE);
            }

            mn071688x.setText(null);
            mn071788x.setText(null);
            mn071988x.setText(null);
        } else if (group.getId() == R.id.mn0718) {
            if (mn071801.isChecked()) {
                mn07019Grp.setVisibility(View.GONE);
                mn07019BigGrp.setVisibility(View.VISIBLE);

                mn071688x.setText(null);
            } else if (mn071803.isChecked()) {
                mn07019Grp.setVisibility(View.GONE);
                mn07019BigGrp.setVisibility(View.GONE);

                mn071688x.setText(null);
            } else {
                mn07019Grp.setVisibility(View.VISIBLE);
                mn07019BigGrp.setVisibility(View.VISIBLE);
            }
        } else if (group.getId() == R.id.mn0721) {
            if (mn07212.isChecked()) {
                mn07022Grp.setVisibility(View.GONE);
            } else {
                mn07022Grp.setVisibility(View.VISIBLE);
            }
        }

        if (group.getId() == R.id.mn0708) {
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
    }
}
