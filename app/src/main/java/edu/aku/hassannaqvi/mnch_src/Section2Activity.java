package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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

public class Section2Activity extends Activity {

    private static final String TAG = "Sec2";
    String var_s2q203 = "";
    String var_s2q205 = "";
    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView app_header;
    @BindView(R.id.lbl_s2q201)
    TextView lblS2q201;
    @BindView(R.id.s2q201)
    EditText s2q201;
    @BindView(R.id.lbl_s2q202)
    TextView lblS2q202;
    @BindView(R.id.s2q202)
    EditText s2q202;
    @BindView(R.id.lbl_s2q203)
    TextView lblS2q203;
    @BindView(R.id.radio_s2q203)
    RadioGroup radioS2q203;
    @BindView(R.id.RDO_s2q203_1)
    RadioButton rDOS2q2031;
    @BindView(R.id.RDO_s2q203_2)
    RadioButton rDOS2q2032;
    @BindView(R.id.lbl_s2q204)
    TextView lblS2q204;
    @BindView(R.id.s2q204)
    EditText s2q204;
    @BindView(R.id.lbl_s2q205)
    TextView lblS2q205;
    @BindView(R.id.radio_s2q205)
    RadioGroup radioS2q205;
    @BindView(R.id.RDO_s2q205_1)
    RadioButton rDOS2q2051;
    @BindView(R.id.RDO_s2q205_2)
    RadioButton rDOS2q2052;
    @BindView(R.id.RDO_s2q205_3)
    RadioButton rDOS2q2053;
    @BindView(R.id.RDO_s2q205_4)
    RadioButton rDOS2q2054;
    @BindView(R.id.RDO_s2q205_5)
    RadioButton rDOS2q2055;
    @BindView(R.id.RDO_s2q205_6)
    RadioButton rDOS2q2056;
    @BindView(R.id.RDO_s2q205_7)
    RadioButton rDOS2q2057;
    @BindView(R.id.RDO_s2q205_8)
    RadioButton rDOS2q2058;
    @BindView(R.id.RDO_s2q205_9)
    RadioButton rDOS2q2059;
    @BindView(R.id.RDO_s2q205_10)
    RadioButton rDOS2q20510;
    @BindView(R.id.RDO_s2q205_11)
    RadioButton rDOS2q20511;
    @BindView(R.id.RDO_s2q205_12)
    RadioButton rDOS2q20512;
    @BindView(R.id.RDO_s2q205_88)
    RadioButton rDOS2q20588;
    @BindView(R.id.vu_s2q205oth)
    LinearLayout vuS2q205oth;
    @BindView(R.id.lbl_s2q205ot)
    TextView lblS2q205ot;
    @BindView(R.id.s2q205oth)
    EditText s2q205oth;
    @BindView(R.id.lbl_s2q206)
    TextView lblS2q206;
    @BindView(R.id.lbl_s2q206a)
    TextView lblS2q206a;
    @BindView(R.id.s2q206a)
    EditText s2q206a;
    @BindView(R.id.lbl_s2q206b)
    TextView lblS2q206b;
    @BindView(R.id.s2q206b)
    EditText s2q206b;
    @BindView(R.id.lbl_s2q206c)
    TextView lblS2q206c;
    @BindView(R.id.s2q206c)
    EditText s2q206c;
    @BindView(R.id.lbl_s2q206d)
    TextView lblS2q206d;
    @BindView(R.id.s2q206d)
    EditText s2q206d;
    @BindView(R.id.lbl_s2q206e)
    TextView lblS2q206e;
    @BindView(R.id.s2q206e)
    EditText s2q206e;
    @BindView(R.id.lbl_s2q206f)
    TextView lblS2q206f;
    @BindView(R.id.s2q206f)
    EditText s2q206f;
    @BindView(R.id.lbl_s2q206g)
    TextView lblS2q206g;
    @BindView(R.id.s2q206g)
    EditText s2q206g;
    @BindView(R.id.lbl_s2q206h)
    TextView lblS2q206h;
    @BindView(R.id.s2q206h)
    EditText s2q206h;
    @BindView(R.id.s2q206i)
    EditText s2q206i;
    @BindView(R.id.s2q206ja)
    RadioGroup s2q206ja;
    @BindView(R.id.s2q206ja01)
    RadioButton s2q206ja01;
    @BindView(R.id.s2q206ja02)
    RadioButton s2q206ja02;
    @BindView(R.id.s2q206j)
    EditText s2q206j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section2);
        ButterKnife.bind(this);

        app_header.setText("SRC - > Section2");

        s2q206ja.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (s2q206ja01.isChecked()) {
                    s2q206j.setVisibility(View.VISIBLE);
                } else {
                    s2q206j.setVisibility(View.GONE);
                    s2q206j.setText(null);
                }
            }
        });

//        s2q208.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                try {
//                    count = Integer.parseInt(s2q208.getText().toString());
//                    if (count < 1 || count > 5) {
//                        s2q208.setError("Cant be less than 1 or greater than 5.");
//                        s2q208.requestFocus();
//                    } else s2q208.setError(null);
//                } catch (NumberFormatException nfe) {
//
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

//        End Mortality


        radioS2q205.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == rDOS2q20588.getId()) {

                    vuS2q205oth.setVisibility(View.VISIBLE);
                    s2q205oth.requestFocus();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(s2q205oth.getWindowToken(), 0);

                } else {

                    vuS2q205oth.setVisibility(View.GONE);
                    s2q205oth.setText("");
                }
            }
        });

        // Check for gender

        radioS2q203.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rDOS2q20512.setChecked(false);

                if (rDOS2q2032.isChecked()) {
                    rDOS2q20512.setEnabled(true);
                } else {
                    rDOS2q20512.setEnabled(false);
                }
            }
        });

//        radioS2q203.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId == rDOS2q2031.getId()) {
//
//                    rDOS2q20512.setEnabled(false);
//
//
//                } else {
//
//                    rDOS2q20512.setEnabled(true);
//
//                }
//            }
//        });

        // schooling
        s2q204.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Check for schooling
                String education = s2q204.getText().toString();
                int edu = 0;
                try {
                    edu = Integer.parseInt(education);
                    if (edu == 91 || edu == 92) {
                        rDOS2q2051.setEnabled(false);
                    } else {
                        rDOS2q2051.setEnabled(true);
                    }

                } catch (NumberFormatException nfe) {

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //age
        s2q202.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Check on Age
                String age = s2q202.getText().toString();
                int age1 = 0;
                try {
                    age1 = Integer.parseInt(age);
                    if (age1 < 18 || age1 > 99) {
                        s2q202.setError("Age of Respondent should be 18 to 99 years");
                        //Toast.makeText(getApplicationContext(), "Please Correct the age \r\n", Toast.LENGTH_LONG).show();
                        s2q202.requestFocus();
                    } else {
                        s2q202.setError(null);
                    }

                    if (age1 < 50) {
                        rDOS2q20511.setEnabled(false);
                    } else {
                        rDOS2q20511.setEnabled(true);
                    }
                } catch (NumberFormatException nfe) {

                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        s2q206a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int totalMembers = 0;
                try {
                    totalMembers = Integer.parseInt(s2q206a.getText().toString());


                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                }

                if (totalMembers == 0) {
                    s2q206a.requestFocus();
                    s2q206a.setError("Required field...");

                } else {
                    s2q206a.setError(null);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // Total male in home
        s2q206b.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int totalMembers = 0;
                int mm = 0;

                try {
                    totalMembers = Integer.parseInt(s2q206a.getText().toString());
                    mm = Integer.parseInt(s2q206b.getText().toString());

                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                }

                if (mm > totalMembers) {
                    s2q206a.requestFocus();
                    s2q206a.setError("Total members are " + totalMembers + " Check again");
                } else {
                    s2q206a.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // Total female in home
        s2q206c.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int totalMembers = 0;
                int fm = 0;

                try {
                    totalMembers = Integer.parseInt(s2q206a.getText().toString());
                    fm = Integer.parseInt(s2q206c.getText().toString());

                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                }


                if (fm > totalMembers) {
                    s2q206a.requestFocus();
                    s2q206a.setError("Total members are " + totalMembers + " Check again");
                } else {
                    s2q206a.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // Check on unmarried woman

        s2q206g.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int fm = 0;
                int unmarriedfm = 0;

                try {
                    fm = Integer.parseInt(s2q206c.getText().toString());
                    unmarriedfm = Integer.parseInt(s2q206g.getText().toString());

                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                }

                if (unmarriedfm > fm) {
                    s2q206c.requestFocus();
                    s2q206c.setError("Total women are " + fm + " Check Again");
                } else {
                    s2q206c.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        s2q206h.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int fm = 0;
                int marriedfm = 0;


                try {
                    fm = Integer.parseInt(s2q206c.getText().toString());
                    marriedfm = Integer.parseInt(s2q206h.getText().toString());

                } catch (NumberFormatException nfe) {
                    nfe.printStackTrace();
                }

                //total = (mm+ fm + child0_28 + child1_5 + child5_14 + unmarriedfm + marriedfm);


                if (marriedfm > fm) {
                    s2q206c.requestFocus();
                    s2q206c.setError("Total women are " + fm + " Check again!");
                } else {
                    s2q206c.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    private EditText getS2q201() {
        return (EditText) findViewById(R.id.s2q201);
    }

    private EditText getS2q202() {
        return (EditText) findViewById(R.id.s2q202);
    }

    private EditText getS2q204() {
        return (EditText) findViewById(R.id.s2q204);
    }

    private EditText getS2q205oth() {
        return (EditText) findViewById(R.id.s2q205oth);
    }

    private EditText getS2q206a() {
        return (EditText) findViewById(R.id.s2q206a);
    }

    private EditText getS2q206b() {
        return (EditText) findViewById(R.id.s2q206b);
    }

    private EditText getS2q206c() {
        return (EditText) findViewById(R.id.s2q206c);
    }

    private EditText getS2q206d() {
        return (EditText) findViewById(R.id.s2q206d);
    }

    private EditText getS2q206e() {
        return (EditText) findViewById(R.id.s2q206e);
    }

    private EditText getS2q206f() {
        return (EditText) findViewById(R.id.s2q206f);
    }

    private EditText getS2q206g() {
        return (EditText) findViewById(R.id.s2q206g);
    }

    private EditText getS2q206h() {
        return (EditText) findViewById(R.id.s2q206h);
    }


    public void NextSection(View view) {

        if (ValidateForm()) {

            try {
                if (SaveDraft()) {

                    Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

                    if (UpdateDB()) {
                        if (SRCApp.mwCount < SRCApp.mwras) {
                            Intent sec3_intent = new Intent(this, Section3Activity.class);
                            SRCApp.mwCount++;
                            SRCApp.curPreg = false;
                            startActivity(sec3_intent);
                        } else if (SRCApp.mdCount < SRCApp.mdTotal) {
                            Intent sec4_intent = new Intent(this, Section4Activity.class);
                            SRCApp.mdCount++;
                            startActivity(sec4_intent);
                        } else if (SRCApp.cmCount < SRCApp.cmTotal) {
                            Intent sec4b_intent = new Intent(this, Section4bActivity.class);
                            SRCApp.cmCount++;
                            startActivity(sec4b_intent);
                        } else {
                            Intent sec5_intent = new Intent(this, Section5Activity.class);
                            startActivity(sec5_intent);
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }


    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);

        int updcount = db.updateS2();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean SaveDraft() throws JSONException {
        JSONObject s2 = new JSONObject();
        s2.put("s2q201", s2q201.getText().toString());
        s2.put("s2q202", s2q202.getText().toString());

        switch (radioS2q203.getCheckedRadioButtonId()) {
            case R.id.RDO_s2q203_1:
                var_s2q203 = "1";
                break;
            case R.id.RDO_s2q203_2:
                var_s2q203 = "2";
                break;
        }

        s2.put("s2q203", var_s2q203);
        s2.put("s2q204", s2q204.getText().toString());

        switch (radioS2q205.getCheckedRadioButtonId()) {
            case R.id.RDO_s2q205_1:
                var_s2q205 = "1";
                break;
            case R.id.RDO_s2q205_2:
                var_s2q205 = "2";
                break;
            case R.id.RDO_s2q205_3:
                var_s2q205 = "3";
                break;
            case R.id.RDO_s2q205_4:
                var_s2q205 = "4";
                break;
            case R.id.RDO_s2q205_5:
                var_s2q205 = "5";
                break;
            case R.id.RDO_s2q205_6:
                var_s2q205 = "6";
                break;

            case R.id.RDO_s2q205_7:
                var_s2q205 = "7";
                break;
            case R.id.RDO_s2q205_8:
                var_s2q205 = "8";
                break;
            case R.id.RDO_s2q205_9:
                var_s2q205 = "9";
                break;
            case R.id.RDO_s2q205_10:
                var_s2q205 = "10";
                break;
            case R.id.RDO_s2q205_11:
                var_s2q205 = "11";
                break;
            case R.id.RDO_s2q205_12:
                var_s2q205 = "12";
                break;
            case R.id.RDO_s2q205_88:
                var_s2q205 = "88";
                break;
        }

        s2.put("s2q205", var_s2q205);
        s2.put("s2q205oth", s2q205oth.getText().toString());
        s2.put("s2q206a", s2q206a.getText().toString());
        s2.put("s2q206b", s2q206b.getText().toString());
        s2.put("s2q206c", s2q206c.getText().toString());
        s2.put("s2q206d", s2q206d.getText().toString());
        s2.put("s2q206e", s2q206e.getText().toString());
        s2.put("s2q206f", s2q206f.getText().toString());
        s2.put("s2q206g", s2q206g.getText().toString());
        s2.put("s2q206h", s2q206h.getText().toString());
        s2.put("s2q206i", s2q206i.getText().toString());
        s2.put("s2q206j", s2q206j.getText().toString());

        SRCApp.mwras = Integer.parseInt(s2q206h.getText().toString());
        SRCApp.chTotal = Integer.parseInt(s2q206d.getText().toString()) + Integer.parseInt(s2q206e.getText().toString());

        SRCApp.mdTotal = Integer.parseInt(s2q206i.getText().toString());
        if (!s2q206j.getText().toString().isEmpty()) {
            SRCApp.cmTotal = Integer.parseInt(s2q206j.getText().toString());
        }
//
//            CVars var = new CVars();
//            if (!s2q206h.getText().toString().isEmpty()) {
//                var.StoreReporductionAgeWoman(Integer.parseInt(s2q206h.getText().toString()));
//            } else {
//                var.StoreReporductionAgeWoman(Integer.parseInt("0"));
//            }
//
//            if (!s2q206d.getText().toString().isEmpty()) {
//                var.setNeonatesChild(Integer.parseInt(s2q206d.getText().toString()));
//            } else {
//                var.setNeonatesChild(Integer.parseInt("0"));
//            }
//
//            if (!s2q206e.getText().toString().isEmpty()) {
//                var.setIMChild(var.getNeonatesChild() + Integer.parseInt(s2q206e.getText().toString()));
//
//                SRCApp.chTotal = var.getIMChild();
//            }
//            else {
//                var.setIMChild(var.getNeonatesChild());
//
//                SRCApp.chTotal = var.getIMChild();
//            }


        SRCApp.fc.setROW_S2(String.valueOf(s2));
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();


        return true;
    }


    private boolean ValidateForm() {
        //Toast.makeText(getApplicationContext(), "Validating Form", Toast.LENGTH_SHORT).show();

        if (getS2q201().getText().toString().isEmpty()) {
            s2q201.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter household head name \r\n", Toast.LENGTH_LONG).show();
            s2q201.requestFocus();
            Log.d(TAG, "ValidateForm: ErrorType: 201 empty ");
            return false;
        } else {
            s2q201.setError(null);
        }

        if (getS2q202().getText().toString().isEmpty()) {
            s2q202.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter household head age \r\n", Toast.LENGTH_LONG).show();
            s2q202.requestFocus();
            Log.d(TAG, "ValidateForm:ErrorType: 202 empty");
            return false;
        } else {
            s2q202.setError(null);
        }


        if (radioS2q203.getCheckedRadioButtonId() == -1) {
            rDOS2q2031.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS2q2031.requestFocus();
            Log.d(TAG, "ValidateForm: ErrorType: 203 not selected ");
            return false;
        } else {
            rDOS2q2031.setError(null);
        }


        if (getS2q204().getText().toString().isEmpty()) {
            s2q204.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter years of schooling head of household \r\n", Toast.LENGTH_LONG).show();
            s2q204.requestFocus();
            Log.d(TAG, "ValidateForm: ErrorType: 204 empty");
            return false;
        } else {
            s2q204.setError(null);
        }

        if (Integer.parseInt(getS2q204().getText().toString()) == 0) {
            s2q204.setError("Invalid years of schooling");
            Toast.makeText(getApplicationContext(), "Invalid years of schooling head of household \r\n", Toast.LENGTH_LONG).show();
            s2q204.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 204 invalid");
            return false;
        } else {
            s2q204.setError(null);
        }


        if (radioS2q205.getCheckedRadioButtonId() == -1) {
            rDOS2q2051.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS2q2051.requestFocus();
            Log.d(TAG, "ValidateForm:  Error Type: 205 not selected ");
            return false;
        } else {
            rDOS2q2051.setError(null);
        }

/*
        switch (rdos2q205) {
            case R.id.RDO_s2q205_1:
                var_s2q205 = "1";
                break;

            case R.id.RDO_s2q205_2:
                var_s2q205 = "2";
                break;

            case R.id.RDO_s2q205_3:
                var_s2q205 = "3";
                break;

            case R.id.RDO_s2q205_4:
                var_s2q205 = "4";
                break;

            case R.id.RDO_s2q205_5:
                var_s2q205 = "5";
                break;

            case R.id.RDO_s2q205_6:
                var_s2q205 = "6";
                break;

            case R.id.RDO_s2q205_7:
                var_s2q205 = "7";
                break;

            case R.id.RDO_s2q205_8:
                var_s2q205 = "8";
                break;

            case R.id.RDO_s2q205_9:
                var_s2q205 = "9";
                break;

            case R.id.RDO_s2q205_10:
                var_s2q205 = "10";
                break;

            case R.id.RDO_s2q205_11:
                var_s2q205 = "11";
                break;

            case R.id.RDO_s2q205_12:
                var_s2q205 = "12";
                break;

            case R.id.RDO_s2q205_88:
                var_s2q205 = "88";
                break;
        }*/


        if (var_s2q205.equals("88") && getS2q205oth().getText().toString().isEmpty()) {
            s2q205oth.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify occupation if others \r\n", Toast.LENGTH_LONG).show();
            s2q205oth.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 205 empty ");
            return false;
        } else {
            s2q205oth.setError(null);
        }

        if (getS2q206a().getText().toString().isEmpty()) {
            s2q206a.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter total number of members \r\n", Toast.LENGTH_LONG).show();
            s2q206a.requestFocus();
            Log.d(TAG, "ValidateForm:Error Type: 206a empty ");
            return false;
        } else {
            s2q206a.setError(null);
        }

        if (Integer.parseInt(s2q206a.getText().toString()) < 2) {
            s2q206a.setError("Member greater than 1");
            Toast.makeText(getApplicationContext(), "Total number of members greater than 1 \r\n", Toast.LENGTH_LONG).show();
            s2q206a.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 206a invalid");
            return false;
        } else {
            s2q206a.setError(null);
        }

        if (Integer.parseInt(s2q202.getText().toString()) < 18 ||
                Integer.parseInt(s2q202.getText().toString()) > 99) {
            Toast.makeText(getApplicationContext(), "Head of household age must be between 18 - 99 \r\n", Toast.LENGTH_LONG).show();
            s2q202.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 202 invalid");
            return false;
        }


        if (Integer.parseInt(s2q204.getText().toString()) < 0
                && Integer.parseInt(s2q204.getText().toString()) != 91
                && Integer.parseInt(s2q204.getText().toString()) != 92
                || Integer.parseInt(s2q204.getText().toString()) > 16
                && Integer.parseInt(s2q204.getText().toString()) != 91
                && Integer.parseInt(s2q204.getText().toString()) != 92) {
            Toast.makeText(getApplicationContext(), "Years of schooling of head of household must be 0 - 16 or 91 or 92 \r\n", Toast.LENGTH_LONG).show();
            s2q204.requestFocus();
            Log.d(TAG, "ValidateForm: Error Type: 204 not selected");
            return false;
        }


        int totalMembers = 0;
        int total = 0;
        int mm = 0;
        int fm = 0;
        int child0_28 = 0;
        int child1_5 = 0;
        int child5_14 = 0;
        int unmarriedfm = 0;
        int marriedfm = 0;
        int totalWomen = 0;
        int totalM = 0;


        try {
            totalMembers = Integer.parseInt(s2q206a.getText().toString().equals("") ? "0" : s2q206a.getText().toString());
            mm = Integer.parseInt(s2q206b.getText().toString().equals("") ? "0" : s2q206b.getText().toString());
            fm = Integer.parseInt(s2q206c.getText().toString().equals("") ? "0" : s2q206c.getText().toString());
            child0_28 = Integer.parseInt(s2q206d.getText().toString().equals("") ? "0" : s2q206d.getText().toString());
            child1_5 = Integer.parseInt(s2q206e.getText().toString().equals("") ? "0" : s2q206e.getText().toString());
            child5_14 = Integer.parseInt(s2q206f.getText().toString().equals("") ? "0" : s2q206f.getText().toString());
            unmarriedfm = Integer.parseInt(s2q206g.getText().toString().equals("") ? "0" : s2q206g.getText().toString());
            marriedfm = Integer.parseInt(s2q206h.getText().toString().equals("") ? "0" : s2q206h.getText().toString());


        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }

        total = (mm + fm);
        totalWomen = (marriedfm + unmarriedfm);
        totalM = (child0_28 + child1_5 + child5_14 + marriedfm + unmarriedfm);

        if (total > totalMembers || total != totalMembers) {
            s2q206a.requestFocus();
            s2q206a.setError("Total members are " + totalMembers + " Check all values again!");
            Log.d(TAG, "ValidateForm: Error Type: 206a not selected");
            return false;
        } else {
            s2q206a.setError(null);

        }

        if (fm > 0 && totalWomen > fm) {
            //s2q206g.requestFocus();
            s2q206g.setError("Total women are " + fm + " Please mention women are married or unmarried");
            Toast.makeText(getApplicationContext(), "Check values of total women, married and unmarried women \r\n", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ValidateForm: Error Type: 206g invalid ");
            return false;
        } else {
            s2q206g.setError(null);
        }

        if (totalM > totalMembers) {
            //s2q206g.requestFocus();
            s2q206a.setError("Total Members are " + totalMembers + " Please check again1");
            Toast.makeText(getApplicationContext(), "Total Members are less... Check Again \r\n", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ValidateForm:Error Type: 206a not selected ");
            return false;
        } else {
            s2q206a.setError(null);
        }

        if (s2q206d.getText().toString().isEmpty()) {
            s2q206d.setError("Please enter 0 or any number ");
            Toast.makeText(getApplicationContext(), "Please Enter 0 or any number \r\n", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ValidateForm:Error Type: 206d empty ");
            return false;
        } else {
            s2q206d.setError(null);

        }

        if (s2q206e.getText().toString().isEmpty()) {
            s2q206e.setError("Please enter 0 or any number ");
            Toast.makeText(getApplicationContext(), "Please Enter 0 or any number \r\n", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ValidateForm: Error Type:206e empty ");
            return false;
        } else {
            s2q206e.setError(null);

        }

        if (s2q206f.getText().toString().isEmpty()) {
            s2q206f.setError("Please enter 0 or any number ");
            Toast.makeText(getApplicationContext(), "Please Enter 0 or any number \r\n", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ValidateForm: Error Type: 206f empty");
            return false;
        } else {
            s2q206f.setError(null);

        }

        if (s2q206g.getText().toString().isEmpty()) {
            s2q206g.setError("Please enter 0 or any number ");
            Toast.makeText(getApplicationContext(), "Please Enter 0 or any number \r\n", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ValidateForm: Error Type: 206g empty");
            return false;
        } else {
            s2q206g.setError(null);

        }

        if (s2q206h.getText().toString().isEmpty() || Integer.parseInt(s2q206h.getText().toString()) == 0) {
            s2q206h.setError("Please enter 1 or any number ");
            Toast.makeText(getApplicationContext(), "Please Enter 1 or any number \r\n", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ValidateForm: Error Type: 206h empty");
            return false;
        } else {
            s2q206h.setError(null);

        }

        if (s2q206i.getText().toString().isEmpty()) {
            s2q206i.setError("Please enter 0 or any number ");
            Toast.makeText(getApplicationContext(), "Please Enter 0 or any number \r\n", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ValidateForm: ErrorType:206i empty ");
            return false;
        } else {
            s2q206i.setError(null);
        }
        if (Integer.parseInt(s2q206i.getText().toString()) < 0 || Integer.parseInt(s2q206i.getText().toString()) > 3) {
            s2q206i.setError("Invalid Range 1-3");
            Toast.makeText(getApplicationContext(), "Invalid Range 1-3 \r\n", Toast.LENGTH_LONG).show();
            Log.d(TAG, "ValidateForm: ErrorType:206i invalid ");
            return false;
        } else {
            s2q206i.setError(null);
        }

        if (s2q206ja.getCheckedRadioButtonId() == -1) {
            s2q206ja02.setError(getString(R.string.s2q206ja));
            Toast.makeText(getApplicationContext(), getString(R.string.s2q206ja), Toast.LENGTH_LONG).show();
            s2q206ja02.requestFocus();
            Log.d(TAG, "ValidateForm:  Error Type: 206 not selected ");
            return false;
        } else {
            s2q206ja02.setError(null);
        }

        if (s2q206ja01.isChecked()) {
            if (s2q206j.getText().toString().isEmpty()) {
                s2q206j.setError("Please enter 0 or any number ");
                Toast.makeText(getApplicationContext(), "Please Enter 0 or any number \r\n", Toast.LENGTH_LONG).show();
                Log.d(TAG, "ValidateForm: ErrorType:206j empty");
                return false;
            } else {
                s2q206j.setError(null);

            }

            if (Integer.parseInt(s2q206j.getText().toString()) < 1 || Integer.parseInt(s2q206j.getText().toString()) > 5) {
                s2q206j.setError("Invalid Range 1-5");
                Toast.makeText(getApplicationContext(), "Invalid Range 1-5 \r\n", Toast.LENGTH_LONG).show();
                Log.d(TAG, "ValidateForm: ErrorType:206j invalid");
                return false;
            } else {
                s2q206j.setError(null);

            }
        }


        return true;
    }

    public void endInterview(View view) {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
//        if (ValidateForm()) {
//            try {
//                if (SaveDraft()) {
//                    if (UpdateDB()) {
                        Intent end_intent = new Intent(this, EndingActivity.class);
                        end_intent.putExtra("check", false);
                        startActivity(end_intent);
//                    } else {
//                        Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}
