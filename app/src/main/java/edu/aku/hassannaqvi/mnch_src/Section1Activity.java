package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Section1Activity extends Activity implements TextWatcher {

    private static final String TAG = "Sec1";
    public static JSONObject s1;
    String var_s1q103 = "";
    String var_s1q111 = "";
    String var_s1q112 = "";
    @BindView(R.id.btnnext)
    Button btnNext;
    @BindView(R.id.radio_s1q112)
    RadioGroup radioS1q112;
    @BindView(R.id.RDO_s1q112_1)
    RadioButton rDOS1q1121;
    @BindView(R.id.RDO_s1q112_2)
    RadioButton rDOS1q1122;
    private TextView appheader;
    private ScrollView activitySection1;
    private TextView lblFormid;
    private TextView lblS1q101;
    private TextView lblS1q102;
    private TextView lblS1q103;
    private RadioGroup radioS1q103;
    private RadioButton rDOS1q1031;
    private RadioButton rDOS1q1032;
    private TextView lblS1q104;
    private TextView lblS1q105;
    private TextView lblS1q106a;
    private TextView lblS1q106b;
    //private TextView lblS1q107;
    private TextView lblS1q108;
    private TextView lblS1q110;
    private TextView lblS1q111;
    private RadioGroup radioS1q111;
    private RadioButton rDOS1q1111;
    private RadioButton rDOS1q1112;
    private RadioButton rDOS1q1113;
    private RadioButton rDOS1q1114;
    private TextView lblS1q111oth;
    private TextView lblS1q112;
    private EditText s1q102;
    private EditText formid;
    private Spinner s1q101;
    private EditText s1q104;
    private Spinner s1q105;
    private Spinner s1q106a;
    private EditText s1q106b;
    //private EditText s1q107;
    private EditText s1q108;
    private EditText s1q108b;
    private DatePicker s1q110;
    private EditText s1q111oth;
    private LinearLayout vu_s1q112;
    private int rdo_s1q103;
    private int rdo_s1q111;
    private int rdo_s1q112;
    private AlertDialog.Builder alert;
    private String spDateT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section1);

        ButterKnife.bind(this);

        SRCApp.DEVID = Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID);

        appheader = (TextView) findViewById(R.id.app_header);
        appheader.setText("SRC - > Section1");

        s1q110 = (DatePicker) findViewById(R.id.s1q110);
        //s1q110.updateDate(s1q110.getDayOfMonth(), s1q110.getMonth(), s1q110.getYear());
        s1q110.setMaxDate(new Date().getTime());

        lblFormid = (TextView) findViewById(R.id.lbl_formid);
        lblS1q101 = (TextView) findViewById(R.id.lbl_s1q101);
        lblS1q102 = (TextView) findViewById(R.id.lbl_s1q102);
        lblS1q103 = (TextView) findViewById(R.id.lbl_s1q103);
        radioS1q103 = (RadioGroup) findViewById(R.id.radio_s1q103);
        rDOS1q1031 = (RadioButton) findViewById(R.id.RDO_s1q103_1);
        rDOS1q1032 = (RadioButton) findViewById(R.id.RDO_s1q103_2);
        lblS1q104 = (TextView) findViewById(R.id.lbl_s1q104);
        lblS1q105 = (TextView) findViewById(R.id.lbl_s1q105);
        lblS1q106a = (TextView) findViewById(R.id.lbl_s1q106a);
        //lblS1q106b = (TextView) findViewById(R.id.lbl_s1q106b);
        //lblS1q107 = (TextView) findViewById(R.id.lbl_s1q107);
        lblS1q108 = (TextView) findViewById(R.id.lbl_s1q108);
        lblS1q110 = (TextView) findViewById(R.id.lbl_s1q110);
        //lblS1q111 = (TextView) findViewById(R.id.lbl_s1q111);
        //radioS1q111 = (RadioGroup) findViewById(R.id.radio_s1q111);
        //rDOS1q1111 = (RadioButton) findViewById(R.id.RDO_s1q111_1);
        //rDOS1q1112 = (RadioButton) findViewById(R.id.RDO_s1q111_2);
        //rDOS1q1113 = (RadioButton) findViewById(R.id.RDO_s1q111_3);
        //rDOS1q1114 = (RadioButton) findViewById(R.id.RDO_s1q111_4);
        //lblS1q111oth = (TextView) findViewById(R.id.lbl_s1q111oth);
        //s1q111oth = (EditText) findViewById(R.id.s1q111oth);
        lblS1q112 = (TextView) findViewById(R.id.lbl_s1q112);
        radioS1q112 = (RadioGroup) findViewById(R.id.radio_s1q112);
        rDOS1q1121 = (RadioButton) findViewById(R.id.RDO_s1q112_1);
        rDOS1q1122 = (RadioButton) findViewById(R.id.RDO_s1q112_2);

        formid = (EditText) findViewById(R.id.formid);
        s1q101 = (Spinner) findViewById(R.id.s1q101);


        s1q102 = (EditText) findViewById(R.id.s1q102);

        s1q104 = (EditText) findViewById(R.id.s1q104);
        s1q105 = (Spinner) findViewById(R.id.s1q105);
        s1q106a = (Spinner) findViewById(R.id.s1q106a);
        s1q106b = (EditText) findViewById(R.id.s1q106b);
        //s1q107 = (EditText) findViewById(R.id.s1q107);
        s1q108 = (EditText) findViewById(R.id.s1q108);
        s1q108b = (EditText) findViewById(R.id.s1q108b);

        s1q110 = (DatePicker) findViewById(R.id.s1q110);
        //s1q111oth = (EditText) findViewById(R.id.s1q111oth);

        //vu_s1q112 = (LinearLayout) findViewById(R.id.vu_s1q112);



        ArrayList<String> lst_hhcode = GetHHCode();

        getS1q104().addTextChangedListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(Section1Activity.this,
                android.R.layout.simple_spinner_dropdown_item, lst_hhcode);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1q101.setAdapter(adapter);


        ArrayList<String> arr_members = new ArrayList<>();
        final ArrayList<String> arr_members1 = new ArrayList<>();

        final SRCDBHelper db = new SRCDBHelper(this);
        final Collection<Members> members = db.getCluster();


        for (Members m : members) {
            arr_members.add(m.getNME());
        }


        ArrayAdapter<String> adapter_cluster = new ArrayAdapter<>(Section1Activity.this,
                android.R.layout.simple_spinner_dropdown_item, arr_members);
//        adapter_cluster.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1q105.setAdapter(adapter_cluster);


        final CVars var = new CVars();

        s1q105.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                // TODO Auto-generated method stub

                String item = s1q105.getSelectedItem().toString();
                //var.setClusterName(item);

                final Collection<Members> members1 = db.getVillages(item);

                arr_members1.clear();

                for (Members m : members1) {
                    arr_members1.add(m.getNME());
                }


                ArrayAdapter<String> adapter1 = new ArrayAdapter<>(Section1Activity.this,
                        android.R.layout.simple_spinner_dropdown_item, arr_members1);
//                adapter1.setDropDownViewResource(android.R.layout.simple_list_item_1);
                s1q106a.setAdapter(adapter1);

            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
        alert = new AlertDialog.Builder(this);
        alert.setTitle("Confirm Exit");
        alert.setMessage("Are you sure you want to cancel the entry of this form and go back to main menu ?")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Section1Activity.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        /*radioS1q111.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //View view = this.getCurrentFocus();
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(rDOS1q1111.getWindowToken(), 0);

                if (checkedId == rDOS1q1114.getId()) {

                    vu_s1q112.setVisibility(View.VISIBLE);

                } else {

                    vu_s1q112.setVisibility(View.GONE);
                    s1q111oth.setText("");
                }
            }
        });*/

        getS1q104().addTextChangedListener(this);

//        s1q101.setBackgroundColor(getResources().getColor(R.color.dullWhile));


        rDOS1q1122.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    btnNext.setText(R.string.end_interview);
                }
                else {
                    btnNext.setText("Section 2");
                }
            }
        });

//        radioS1q112.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (rDOS1q1122.isChecked()){
//                    btnNext.setText(R.string.end_interview);
//                }
//                else {
//                    btnNext.setText("Section 2");
//                }
//            }
//        });



    }

    private EditText getFormid() {
        return (EditText) findViewById(R.id.formid);
    }

    private EditText getS1q102() {
        return (EditText) findViewById(R.id.s1q102);
    }

    private EditText getS1q104() {
        return (EditText) findViewById(R.id.s1q104);
    }

    private EditText getS1q106b() {
        return (EditText) findViewById(R.id.s1q106b);
    }

    //private EditText getS1q107() {
        //return (EditText) findViewById(R.id.s1q107);
    //}

    private EditText getS1q108() {
        return (EditText) findViewById(R.id.s1q108);
    }

    private DatePicker getS1q110() {
        return (DatePicker) findViewById(R.id.s1q110);
    }

    /*private EditText getS1q111oth() {
        return (EditText) findViewById(R.id.s1q111oth);
    }*/

    public void gotoSection2(View view) {

        spDateT = new SimpleDateFormat("dd-MM-yyyy").format(s1q110.getCalendarView().getDate());

        //spTimeT = mc101time.getCurrentHour() + ":" + mc101time.getCurrentMinute();

        switch (radioS1q112.getCheckedRadioButtonId()) {
            case R.id.RDO_s1q112_1:
                var_s1q112 = "1";
                break;
            case R.id.RDO_s1q112_2:
                var_s1q112 = "2";
                break;
        }

        if (ValidateForm()) {

            if (SaveDraft()) {

                Toast.makeText(getApplicationContext(), "Storing Values", Toast.LENGTH_SHORT).show();

                if (UpdateDB()) {

                    if (var_s1q112.equals("1")) {
                        Intent sec2_intent = new Intent(this, Section2Activity.class);
                        startActivity(sec2_intent);
                    } else {
                        Intent sec2_intent = new Intent(this, EndingActivity.class);
                        startActivity(sec2_intent);
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Unable to update database", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private boolean UpdateDB() {
        SRCDBHelper db = new SRCDBHelper(this);
        SRCApp.fc.set_ID(db.InsertRecord(SRCApp.fc));
        SRCApp.fc.setROW_UUID(SRCApp.fc.getROW_DEVID() + SRCApp.fc.get_ID());

        SRCApp.fc.get_ID();

        return true;
    }


    private boolean SaveDraft() {
        SRCApp.fc = new FormContract();

        setGPS();

        SRCApp.fc.setROW_DEVID(SRCApp.DEVID);
        SRCApp.fc.setROW_FORM_ID(formid.getText().toString());
        SRCApp.fc.setROW_S1Q101(s1q101.getSelectedItem().toString());
        SRCApp.fc.setROW_S1Q102(s1q102.getText().toString());

        CVars var = new CVars();
        var.StoreHHNO(formid.getText().toString());
        var.StoreHHCode(s1q101.getSelectedItem().toString());


        switch (radioS1q103.getCheckedRadioButtonId()) {
            case R.id.RDO_s1q103_1:
                var_s1q103 = "1";
                break;
            case R.id.RDO_s1q103_2:
                var_s1q103 = "2";
                break;
        }


        SRCApp.fc.setROW_S1Q103(var_s1q103.toString());
        SRCApp.fc.setROW_S1Q104(s1q104.getText().toString());


        SRCDBHelper db = new SRCDBHelper(this);
        String uccode = db.getUCCode(s1q105.getSelectedItem().toString());
        String vcode = db.getVCode(s1q105.getSelectedItem().toString(), s1q106a.getSelectedItem().toString());


        SRCApp.fc.setROW_S1Q105(uccode);
        SRCApp.fc.setROW_S1Q106a(vcode);

        SRCApp.fc.setROW_S1Q106b(s1q106b.getText().toString());
        //SRCApp.fc.setROW_S1Q107(s1q107.getText().toString());
        SRCApp.fc.setROW_S1Q108(s1q108.getText().toString());
        SRCApp.fc.setROW_S1Q108b(s1q108b.getText().toString());
        SRCApp.fc.setROW_S1Q110(spDateT);

        /*switch (radioS1q111.getCheckedRadioButtonId()) {
            case R.id.RDO_s1q111_1:
                var_s1q111 = "1";
                break;
            case R.id.RDO_s1q111_2:
                var_s1q111 = "2";
                break;
            case R.id.RDO_s1q111_3:
                var_s1q111 = "3";
                break;
            case R.id.RDO_s1q111_4:
                var_s1q111 = "4";
                break;
        }*/

        //SRCApp.fc.setROW_S1Q111(var_s1q111.toString());
        //SRCApp.fc.setROW_S1Q111oth(String.valueOf(s1q111oth.getText().toString()));

        switch (radioS1q112.getCheckedRadioButtonId()) {
            case R.id.RDO_s1q112_1:
                var_s1q112 = "1";
                break;
            case R.id.RDO_s1q112_2:
                var_s1q112 = "2";
                break;
        }

        SRCApp.fc.setROW_S1Q112(String.valueOf(var_s1q112.toString()));

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dt = new Date();
        String dt1 = sdf.format(dt);

        SRCApp.fc.setROW_ENTRYDATE(dt1);

        SRCApp.fc.setROW_USERID(var.GetUser());

        setGPS();

        return true;
    }

    private ArrayList GetHHCode() {
        ArrayList lst_hhcode = new ArrayList<>();

        lst_hhcode.add(0, "...");
        lst_hhcode.add(1, "X");
        lst_hhcode.add(2, "A");
        lst_hhcode.add(3, "B");
        lst_hhcode.add(4, "C");
        lst_hhcode.add(5, "D");
        lst_hhcode.add(6, "E");
        lst_hhcode.add(7, "F");
        lst_hhcode.add(8, "G");
        lst_hhcode.add(9, "H");
        lst_hhcode.add(10, "I");
        lst_hhcode.add(11, "J");
        lst_hhcode.add(12, "K");
        lst_hhcode.add(13, "L");
        lst_hhcode.add(14, "M");
        lst_hhcode.add(15, "N");
        lst_hhcode.add(16, "O");
        lst_hhcode.add(17, "P");
        lst_hhcode.add(18, "Q");
        lst_hhcode.add(19, "R");
        lst_hhcode.add(20, "S");
        lst_hhcode.add(21, "T");
        lst_hhcode.add(22, "U");
        lst_hhcode.add(23, "V");
        lst_hhcode.add(24, "W");
        lst_hhcode.add(25, "Y");
        lst_hhcode.add(26, "Z");

        return lst_hhcode;
    }


    private boolean ValidateForm() {
        //Toast.makeText(getApplicationContext(), "Validating Form", Toast.LENGTH_SHORT).show();

        if (getFormid().getText().toString().isEmpty()) {
            formid.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter form id \r\n", Toast.LENGTH_LONG).show();
            formid.requestFocus();
            return false;
        } else {
            formid.setError(null);
        }

        if (s1q101.getSelectedItem().toString().equals("...")) {
            formid.setError("Please enter Household number extension");
            Toast.makeText(getApplicationContext(), "Please enter Household number extension \r\n", Toast.LENGTH_LONG).show();
            formid.requestFocus();
            return false;
        } else {
            formid.setError(null);
        }

        if (getS1q102().getText().toString().isEmpty()) {
            s1q102.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter respondent name \r\n", Toast.LENGTH_LONG).show();
            s1q102.requestFocus();
            return false;
        } else {
            s1q102.setError(null);
        }




        rdo_s1q103 = radioS1q103.getCheckedRadioButtonId();

        if (rdo_s1q103 == -1) {
            rDOS1q1031.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS1q1031.requestFocus();
            return false;
        } else {
            rDOS1q1031.setError(null);
        }

        if (getS1q104().getText().toString().isEmpty()) {
            s1q104.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter respondent age \r\n", Toast.LENGTH_LONG).show();
            s1q104.requestFocus();
            return false;
        } else {
            s1q104.setError(null);
        }


        if (getS1q106b().getText().toString().isEmpty()) {
            s1q106b.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter uc code \r\n", Toast.LENGTH_LONG).show();
            s1q106b.requestFocus();
            return false;
        } else {
            s1q106b.setError(null);
        }

        /*if (getS1q107().getText().toString().isEmpty() || s1q107.getText().toString() == null) {
            s1q107.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter Family ID \r\n", Toast.LENGTH_LONG).show();
            s1q107.requestFocus();
            return false;
        } else {
            s1q107.setError(null);
        }*/


        if (getS1q108().getText().toString().isEmpty()) {
            s1q108.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please enter telephone number \r\n", Toast.LENGTH_LONG).show();
            s1q108.requestFocus();
            return false;
        } else {
            s1q108.setError(null);
        }


        /*rdo_s1q111 = radioS1q111.getCheckedRadioButtonId();

        if (rdo_s1q111 == -1) {
            rDOS1q1111.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS1q1111.requestFocus();
            return false;
        } else {
            rDOS1q1111.setError(null);
        }

        switch (rdo_s1q103) {
            case R.id.RDO_s1q103_2:
                var_s1q103 = "2";
        }


        if(var_s1q112 == "2" && getS1q111oth().getText().toString().isEmpty() || var_s1q103 == "2" && s1q111oth.getText().toString() == null) {
            s1q111oth.setError(getString(R.string.txterr));
            Toast.makeText(getApplicationContext(), "Please specify status of visit if others  \r\n", Toast.LENGTH_LONG).show();
            s1q111oth.requestFocus();
            return false;
        } else {
            s1q111oth.setError(null);
        }*/


        rdo_s1q112 = radioS1q112.getCheckedRadioButtonId();

        if (rdo_s1q112 == -1) {
            rDOS1q1121.setError(getString(R.string.rdoerr));
            Toast.makeText(getApplicationContext(), getString(R.string.rdoerr), Toast.LENGTH_LONG).show();
            rDOS1q1121.requestFocus();
            return false;
        } else {
            rDOS1q1121.setError(null);
        }


        spDateT = new SimpleDateFormat("dd-MM-yyyy").format(s1q110.getCalendarView().getDate());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dt = new Date();
        String dt1 = sdf.format(dt);


        if (!spDateT.equals(dt1)) {
            Toast.makeText(getApplicationContext(), "Date of visit and current date must be same", Toast.LENGTH_LONG).show();
            return false;
        }


        return true;
    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();


        try {
            String lat = GPSPref.getString("Latitude", "0");
            String lang = GPSPref.getString("Longitude", "0");
            String acc = GPSPref.getString("Accuracy", "0");
            String dt = GPSPref.getString("date", "0");

            if (lat == "0" && lang == "0") {
                Toast.makeText(this, "Could not obtained GPS points", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "GPS set", Toast.LENGTH_SHORT).show();
            }


            SRCApp.fc.setROW_GPS_LAT(GPSPref.getString("Latitude", "0"));
            SRCApp.fc.setROW_GPS_LANG(GPSPref.getString("Longitude", "0"));
            SRCApp.fc.setROW_GPS_ACC(GPSPref.getString("Accuracy", "0"));
            SRCApp.fc.setROW_GPS_DT(GPSPref.getString(date, "0"));

        } catch (Exception e) {

        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog alert1 = alert.create();
        alert1.show();
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        // Check on Age
        String age = getS1q104().getText().toString();
        int age1 = 0;
        try {
            age1 = Integer.parseInt(age);
            if (age1 < 18 || age1 > 99) {
                s1q104.setError("Age of Respondent should be 18 to 99 years");
                //Toast.makeText(getApplicationContext(), "Please Correct the age \r\n", Toast.LENGTH_LONG).show();
                s1q104.requestFocus();
            } else {
                s1q104.setError(null);
            }

        } catch (NumberFormatException nfe)
        {

        }


    }

    @Override
    public void afterTextChanged(Editable s) {

    }


}