package edu.aku.hassannaqvi.mnch_src;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class Section8Activity extends Activity {

    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0801)
    RadioGroup mn0801;
    @BindView(R.id.mn080101)
    RadioButton mn080101;
    @BindView(R.id.mn080102)
    RadioButton mn080102;
    @BindView(R.id.mn080103)
    RadioButton mn080103;
    @BindView(R.id.mn080104)
    RadioButton mn080104;
    @BindView(R.id.mn080105)
    RadioButton mn080105;
    @BindView(R.id.mn080106)
    RadioButton mn080106;
    @BindView(R.id.mn080188)
    RadioButton mn080188;
    @BindView(R.id.vu_mn080188x)
    LinearLayout vuMn080188x;
    @BindView(R.id.mn080188x)
    EditText mn080188x;
    @BindView(R.id.mn0802a)
    RadioGroup mn0802a;
    @BindView(R.id.mn0802a01)
    RadioButton mn0802a01;
    @BindView(R.id.mn0802a02)
    RadioButton mn0802a02;
    @BindView(R.id.mn0802a03)
    RadioButton mn0802a03;
    @BindView(R.id.mn0802a04)
    RadioButton mn0802a04;
    @BindView(R.id.mn0802a05)
    RadioButton mn0802a05;
    @BindView(R.id.mn0802a06)
    RadioButton mn0802a06;
    @BindView(R.id.mn0802a07)
    RadioButton mn0802a07;
    @BindView(R.id.mn0802a08)
    RadioButton mn0802a08;
    @BindView(R.id.mn0802a88)
    RadioButton mn0802a88;
    @BindView(R.id.vu_mn0802a88x)
    LinearLayout vuMn0802a88x;
    @BindView(R.id.mn0802a88x)
    EditText mn0802a88x;
    @BindView(R.id.mn0802b)
    RadioGroup mn0802b;
    @BindView(R.id.mn0802b01)
    RadioButton mn0802b01;
    @BindView(R.id.mn0802b02)
    RadioButton mn0802b02;
    @BindView(R.id.mn0802b03)
    RadioButton mn0802b03;
    @BindView(R.id.mn0802b04)
    RadioButton mn0802b04;
    @BindView(R.id.mn0802b05)
    RadioButton mn0802b05;
    @BindView(R.id.mn0802b06)
    RadioButton mn0802b06;
    @BindView(R.id.mn0802b07)
    RadioButton mn0802b07;
    @BindView(R.id.mn0802b08)
    RadioButton mn0802b08;
    @BindView(R.id.mn0802b09)
    RadioButton mn0802b09;
    @BindView(R.id.mn0802b10)
    RadioButton mn0802b10;
    @BindView(R.id.mn0802b11)
    RadioButton mn0802b11;
    @BindView(R.id.mn0802b88)
    RadioButton mn0802b88;
    @BindView(R.id.vu_mn0802b88x)
    LinearLayout vuMn0802b88x;
    @BindView(R.id.mn0802b88x)
    EditText mn0802b88x;
    @BindView(R.id.mn0802c)
    RadioGroup mn0802c;
    @BindView(R.id.mn0802c01)
    RadioButton mn0802c01;
    @BindView(R.id.mn0802c02)
    RadioButton mn0802c02;
    @BindView(R.id.mn0802c03)
    RadioButton mn0802c03;
    @BindView(R.id.mn0802c04)
    RadioButton mn0802c04;
    @BindView(R.id.mn0802c05)
    RadioButton mn0802c05;
    @BindView(R.id.mn0802c06)
    RadioButton mn0802c06;
    @BindView(R.id.mn0802c07)
    RadioButton mn0802c07;
    @BindView(R.id.mn0802c08)
    RadioButton mn0802c08;
    @BindView(R.id.mn0802c09)
    RadioButton mn0802c09;
    @BindView(R.id.mn0802c88)
    RadioButton mn0802c88;
    @BindView(R.id.vu_mn0802c88x)
    LinearLayout vuMn0802c88x;
    @BindView(R.id.mn0802c88x)
    EditText mn0802c88x;
    @BindView(R.id.mn0803)
    RadioGroup mn0803;
    @BindView(R.id.mn080301)
    RadioButton mn080301;
    @BindView(R.id.mn080302)
    RadioButton mn080302;
    @BindView(R.id.mn080303)
    RadioButton mn080303;
    @BindView(R.id.mn0804)
    EditText mn0804;
    @BindView(R.id.mn0805)
    RadioGroup mn0805;
    @BindView(R.id.mn080501)
    RadioButton mn080501;
    @BindView(R.id.mn080502)
    RadioButton mn080502;
    @BindView(R.id.mn0806)
    RadioGroup mn0806;
    @BindView(R.id.mn080601)
    RadioButton mn080601;
    @BindView(R.id.mn080602)
    RadioButton mn080602;
    @BindView(R.id.mn080603)
    RadioButton mn080603;
    @BindView(R.id.mn080604)
    RadioButton mn080604;
    @BindView(R.id.mn080605)
    RadioButton mn080605;
    @BindView(R.id.mn080606)
    RadioButton mn080606;
    @BindView(R.id.mn080607)
    RadioButton mn080607;
    @BindView(R.id.mn080608)
    RadioButton mn080608;
    @BindView(R.id.mn080609)
    RadioButton mn080609;
    @BindView(R.id.mn080610)
    RadioButton mn080610;
    @BindView(R.id.mn080611)
    RadioButton mn080611;
    @BindView(R.id.mn080688)
    RadioButton mn080688;
    @BindView(R.id.vu_mn080688x)
    LinearLayout vuMn080688x;
    @BindView(R.id.mn080688x)
    EditText mn080688x;
    @BindView(R.id.mn807a)
    RadioGroup mn807a;
    @BindView(R.id.mn0807a01)
    RadioButton mn0807a01;
    @BindView(R.id.mn0807a02)
    RadioButton mn0807a02;
    @BindView(R.id.mn0807a03)
    RadioButton mn0807a03;
    @BindView(R.id.mn0807a04)
    RadioButton mn0807a04;
    @BindView(R.id.mn0807a05)
    RadioButton mn0807a05;
    @BindView(R.id.mn0807b)
    RadioGroup mn0807b;
    @BindView(R.id.mn0807b01)
    RadioButton mn0807b01;
    @BindView(R.id.mn0807b02)
    RadioButton mn0807b02;
    @BindView(R.id.mn0807b03)
    RadioButton mn0807b03;
    @BindView(R.id.mn0807b04)
    RadioButton mn0807b04;
    @BindView(R.id.mn0807c)
    RadioGroup mn0807c;
    @BindView(R.id.mn0807c01)
    RadioButton mn0807c01;
    @BindView(R.id.mn0807c02)
    RadioButton mn0807c02;
    @BindView(R.id.mn0807c03)
    RadioButton mn0807c03;
    @BindView(R.id.mn0807c04)
    RadioButton mn0807c04;
    @BindView(R.id.mn0807c05)
    RadioButton mn0807c05;
    @BindView(R.id.mn0807c06)
    RadioButton mn0807c06;
    @BindView(R.id.mn080788)
    RadioButton mn080788;
    @BindView(R.id.vu_mn80788x)
    LinearLayout vuMn80788x;
    @BindView(R.id.mn80788x)
    EditText mn80788x;
    @BindView(R.id.mn808a)
    RadioGroup mn808a;
    @BindView(R.id.mn0808a01)
    RadioButton mn0808a01;
    @BindView(R.id.mn0808a02)
    RadioButton mn0808a02;
    @BindView(R.id.mn0808a03)
    RadioButton mn0808a03;
    @BindView(R.id.mn0808a04)
    RadioButton mn0808a04;
    @BindView(R.id.mn0808a05)
    RadioButton mn0808a05;
    @BindView(R.id.mn0808b)
    RadioGroup mn0808b;
    @BindView(R.id.mn0808b01)
    RadioButton mn0808b01;
    @BindView(R.id.mn0808b02)
    RadioButton mn0808b02;
    @BindView(R.id.mn0808b03)
    RadioButton mn0808b03;
    @BindView(R.id.mn0808b04)
    RadioButton mn0808b04;
    @BindView(R.id.mn0808c)
    RadioGroup mn0808c;
    @BindView(R.id.mn0808c01)
    RadioButton mn0808c01;
    @BindView(R.id.mn0808c02)
    RadioButton mn0808c02;
    @BindView(R.id.mn0808c03)
    RadioButton mn0808c03;
    @BindView(R.id.mn0808c04)
    RadioButton mn0808c04;
    @BindView(R.id.mn0808c05)
    RadioButton mn0808c05;
    @BindView(R.id.mn0808c06)
    RadioButton mn0808c06;
    @BindView(R.id.mn0808c88)
    RadioButton mn0808c88;
    @BindView(R.id.vu_mn0808c88x)
    LinearLayout vuMn0808c88x;
    @BindView(R.id.mn0808c88x)
    EditText mn0808c88x;
    @BindView(R.id.mn0809)
    RadioGroup mn0809;
    @BindView(R.id.mn080901)
    RadioButton mn080901;
    @BindView(R.id.mn080902)
    RadioButton mn080902;
    @BindView(R.id.mn0810)
    EditText mn0810;
    @BindView(R.id.mn0811)
    RadioGroup mn0811;
    @BindView(R.id.mn081101)
    RadioButton mn081101;
    @BindView(R.id.mn081102)
    RadioButton mn081102;
    @BindView(R.id.mn081103)
    RadioButton mn081103;
    @BindView(R.id.mn081104)
    RadioButton mn081104;
    @BindView(R.id.mn0812)
    RadioGroup mn0812;
    @BindView(R.id.mn081201)
    RadioButton mn081201;
    @BindView(R.id.mn081202)
    RadioButton mn081202;
    @BindView(R.id.mn081301)
    CheckBox mn081301;
    @BindView(R.id.mn081302)
    CheckBox mn081302;
    @BindView(R.id.mn081303)
    CheckBox mn081303;
    @BindView(R.id.mn081304)
    CheckBox mn081304;
    @BindView(R.id.mn081305)
    CheckBox mn081305;
    @BindView(R.id.mn081306)
    CheckBox mn081306;
    @BindView(R.id.mn081388)
    CheckBox mn081388;
    @BindView(R.id.vu_mn081388x)
    LinearLayout vuMn081388x;
    @BindView(R.id.mn081388x)
    EditText mn081388x;
    @BindView(R.id.mn0814a)
    RadioGroup mn0814a;
    @BindView(R.id.mn0814a01)
    RadioButton mn0814a01;
    @BindView(R.id.mn0814a02)
    RadioButton mn0814a02;
    @BindView(R.id.mn0814a03)
    RadioButton mn0814a03;
    @BindView(R.id.mn0814a04)
    RadioButton mn0814a04;
    @BindView(R.id.mn0814b)
    RadioGroup mn0814b;
    @BindView(R.id.mn0814b01)
    RadioButton mn0814b01;
    @BindView(R.id.mn0814b02)
    RadioButton mn0814b02;
    @BindView(R.id.mn0814b03)
    RadioButton mn0814b03;
    @BindView(R.id.mn0814b04)
    RadioButton mn0814b04;
    @BindView(R.id.mn0814b05)
    RadioButton mn0814b05;
    @BindView(R.id.mn0814c)
    RadioGroup mn0814c;
    @BindView(R.id.mn0814c01)
    RadioButton mn0814c01;
    @BindView(R.id.mn081488)
    RadioButton mn081488;
    @BindView(R.id.vu_mn081488x)
    LinearLayout vuMn081488x;
    @BindView(R.id.mn081488x)
    EditText mn081488x;
    @BindView(R.id.mn0815)
    RadioGroup mn0815;
    @BindView(R.id.mn081501)
    RadioButton mn081501;
    @BindView(R.id.mn081502)
    RadioButton mn081502;
    @BindView(R.id.mn0816)
    EditText mn0816;
    @BindView(R.id.mn0817)
    RadioGroup mn0817;
    @BindView(R.id.mn081701)
    RadioButton mn081701;
    @BindView(R.id.mn081702)
    RadioButton mn081702;
    @BindView(R.id.mn0818)
    RadioGroup mn0818;
    @BindView(R.id.mn081801)
    RadioButton mn081801;
    @BindView(R.id.mn081802)
    RadioButton mn081802;
    @BindView(R.id.mn0819)
    RadioGroup mn0819;
    @BindView(R.id.mn081901)
    RadioButton mn081901;
    @BindView(R.id.mn081902)
    RadioButton mn081902;
    @BindView(R.id.mn0820)
    RadioGroup mn0820;
    @BindView(R.id.mn082001)
    RadioButton mn082001;
    @BindView(R.id.mn082002)
    RadioButton mn082002;
    @BindView(R.id.mn0821)
    RadioGroup mn0821;
    @BindView(R.id.mn0821_1)
    RadioButton mn08211;
    @BindView(R.id.mn0821_2)
    RadioButton mn08212;
    @BindView(R.id.mn082199)
    RadioButton mn082199;
    @BindView(R.id.mn082101)
    EditText mn082101;
    @BindView(R.id.mn082102)
    EditText mn082102;
    @BindView(R.id.mn082201)
    EditText mn082201;
    @BindView(R.id.mn082202)
    EditText mn082202;
    @BindView(R.id.mn082203)
    EditText mn082203;
    @BindView(R.id.mn082204)
    EditText mn082204;
    @BindView(R.id.mn082205)
    EditText mn082205;
    @BindView(R.id.mn082206)
    EditText mn082206;
    @BindView(R.id.mn082207)
    EditText mn082207;
    @BindView(R.id.mn082208)
    EditText mn082208;
    @BindView(R.id.mn082209)
    EditText mn082209;
    @BindView(R.id.mn082210)
    EditText mn082210;
    @BindView(R.id.mn082211)
    EditText mn082211;
    @BindView(R.id.mn082212)
    EditText mn082212;
    @BindView(R.id.mn082213)
    EditText mn082213;
    @BindView(R.id.mn082214)
    EditText mn082214;
    @BindView(R.id.mn082215)
    EditText mn082215;
    @BindView(R.id.mn082216)
    EditText mn082216;
    @BindView(R.id.mn082217)
    EditText mn082217;
    @BindView(R.id.mn082218)
    EditText mn082218;
    @BindView(R.id.mn082219)
    EditText mn082219;
    @BindView(R.id.mn082220)
    EditText mn082220;
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
    @BindView(R.id.mn082305)
    RadioButton mn082305;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section8);
        ButterKnife.bind(this);

        appHeader.setText("SRC -> Section8");
    }

    @OnClick(R.id.btnnext)
    void onBtnnextClick() {
        //TODO implement
    }

    @OnLongClick(R.id.btnnext)
    boolean onBtnnextLongClick() {
        //TODO implement
        return true;
    }
}