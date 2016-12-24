package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Section5bActivity extends Activity {

    @BindView(R.id.activity_section5b)
    FrameLayout activitySection5b;
    @BindView(R.id.section5bScrollView)
    ScrollView section5bScrollView;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0527)
    RadioGroup mn0527;
    @BindView(R.id.mn052701)
    RadioButton mn052701;
    @BindView(R.id.mn052702)
    RadioButton mn052702;
    @BindView(R.id.mn052703)
    RadioButton mn052703;
    @BindView(R.id.mn052704)
    RadioButton mn052704;
    @BindView(R.id.mn052705)
    RadioButton mn052705;
    @BindView(R.id.mn052706)
    RadioButton mn052706;
    @BindView(R.id.mn052707)
    RadioButton mn052707;
    @BindView(R.id.mn052708)
    RadioButton mn052708;
    @BindView(R.id.mn052709)
    RadioButton mn052709;
    @BindView(R.id.mn052788x)
    EditText mn052788x;
    @BindView(R.id.mn0528)
    RadioGroup mn0528;
    @BindView(R.id.mn052801)
    RadioButton mn052801;
    @BindView(R.id.mn052802)
    RadioButton mn052802;
    @BindView(R.id.mn052803)
    RadioButton mn052803;
    @BindView(R.id.mn052804)
    RadioButton mn052804;
    @BindView(R.id.mn052805)
    RadioButton mn052805;
    @BindView(R.id.mn052806)
    RadioButton mn052806;
    @BindView(R.id.mn052807)
    RadioButton mn052807;
    @BindView(R.id.mn052888x)
    EditText mn052888x;
    @BindView(R.id.mn0529)
    RadioGroup mn0529;
    @BindView(R.id.mn052901)
    RadioButton mn052901;
    @BindView(R.id.mn052902)
    RadioButton mn052902;
    @BindView(R.id.mn052903)
    RadioButton mn052903;
    @BindView(R.id.mn052904)
    RadioButton mn052904;
    @BindView(R.id.mn052905)
    RadioButton mn052905;
    @BindView(R.id.mn052906)
    RadioButton mn052906;
    @BindView(R.id.mn052907)
    RadioButton mn052907;
    @BindView(R.id.mn052908)
    RadioButton mn052908;
    @BindView(R.id.mn052988x)
    EditText mn052988x;
    @BindView(R.id.mn0530)
    RadioGroup mn0530;
    @BindView(R.id.mn053001)
    RadioButton mn053001;
    @BindView(R.id.mn053002)
    RadioButton mn053002;
    @BindView(R.id.mn053003)
    RadioButton mn053003;
    @BindView(R.id.mn053004)
    RadioButton mn053004;
    @BindView(R.id.mn053005)
    RadioButton mn053005;
    @BindView(R.id.mn0531)
    RadioGroup mn0531;
    @BindView(R.id.mn053101)
    RadioButton mn053101;
    @BindView(R.id.mn053102)
    RadioButton mn053102;
    @BindView(R.id.mn053201)
    CheckBox mn053201;
    @BindView(R.id.mn053202)
    CheckBox mn053202;
    @BindView(R.id.mn053203)
    CheckBox mn053203;
    @BindView(R.id.mn053204)
    CheckBox mn053204;
    @BindView(R.id.mn053205)
    CheckBox mn053205;
    @BindView(R.id.mn053206)
    CheckBox mn053206;
    @BindView(R.id.mn0532other)
    CheckBox mn0532other;
    @BindView(R.id.mn0532)
    EditText mn0532;
    @BindView(R.id.mn0533)
    RadioGroup mn0533;
    @BindView(R.id.mn053301)
    RadioButton mn053301;
    @BindView(R.id.mn053302)
    RadioButton mn053302;
    @BindView(R.id.mn0534)
    RadioGroup mn0534;
    @BindView(R.id.mn053401)
    RadioButton mn053401;
    @BindView(R.id.mn053402)
    RadioButton mn053402;
    @BindView(R.id.mn053403)
    RadioButton mn053403;
    @BindView(R.id.mn053404)
    RadioButton mn053404;
    @BindView(R.id.mn053405)
    RadioButton mn053405;
    @BindView(R.id.mn053406)
    RadioButton mn053406;
    @BindView(R.id.mn053407)
    RadioButton mn053407;
    @BindView(R.id.mn0535)
    RadioGroup mn0535;
    @BindView(R.id.mn053501)
    RadioButton mn053501;
    @BindView(R.id.mn053502)
    RadioButton mn053502;
    @BindView(R.id.mn053503)
    RadioButton mn053503;
    @BindView(R.id.mn0536)
    RadioGroup mn0536;
    @BindView(R.id.mn053601)
    RadioButton mn053601;
    @BindView(R.id.mn053602)
    RadioButton mn053602;
    @BindView(R.id.mn0537)
    RadioGroup mn0537;
    @BindView(R.id.mn053701)
    RadioButton mn053701;
    @BindView(R.id.mn053702)
    RadioButton mn053702;
    @BindView(R.id.mn053801)
    CheckBox mn053801;
    @BindView(R.id.mn053802)
    CheckBox mn053802;
    @BindView(R.id.mn053803)
    CheckBox mn053803;
    @BindView(R.id.mn053804)
    CheckBox mn053804;
    @BindView(R.id.mn053805)
    CheckBox mn053805;
    @BindView(R.id.mn0538other)
    CheckBox mn0538other;
    @BindView(R.id.mn0538)
    EditText mn0538;
    @BindView(R.id.mn0539)
    RadioGroup mn0539;
    @BindView(R.id.mn053901)
    RadioButton mn053901;
    @BindView(R.id.mn053902)
    RadioButton mn053902;
    @BindView(R.id.mn053903)
    RadioButton mn053903;
    @BindView(R.id.mn053904)
    RadioButton mn053904;
    @BindView(R.id.mn053905)
    RadioButton mn053905;
    @BindView(R.id.mn053906)
    RadioButton mn053906;
    @BindView(R.id.mn053907)
    RadioButton mn053907;
    @BindView(R.id.mn053908)
    RadioButton mn053908;
    @BindView(R.id.mn053909)
    RadioButton mn053909;
    @BindView(R.id.mn053988x)
    EditText mn053988x;
    @BindView(R.id.mn0540)
    RadioGroup mn0540;
    @BindView(R.id.mn054001)
    RadioButton mn054001;
    @BindView(R.id.mn054002)
    RadioButton mn054002;
    @BindView(R.id.mn054003)
    RadioButton mn054003;
    @BindView(R.id.mn054004)
    RadioButton mn054004;
    @BindView(R.id.mn054005)
    RadioButton mn054005;
    @BindView(R.id.mn054006)
    RadioButton mn054006;
    @BindView(R.id.mn054007)
    RadioButton mn054007;
    @BindView(R.id.mn054088x)
    EditText mn054088x;
    @BindView(R.id.mn0541)
    RadioGroup mn0541;
    @BindView(R.id.mn054101)
    RadioButton mn054101;
    @BindView(R.id.mn054102)
    RadioButton mn054102;
    @BindView(R.id.mn054103)
    RadioButton mn054103;
    @BindView(R.id.mn054104)
    RadioButton mn054104;
    @BindView(R.id.mn054105)
    RadioButton mn054105;
    @BindView(R.id.mn054106)
    RadioButton mn054106;
    @BindView(R.id.mn054107)
    RadioButton mn054107;
    @BindView(R.id.mn054188x)
    EditText mn054188x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5b);
        ButterKnife.bind(this);

    }

}
