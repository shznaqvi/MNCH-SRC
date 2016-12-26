package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Section5Activity extends Activity {

    @BindView(R.id.ScrollView01)
    ScrollView scrollView01;
    @BindView(R.id.app_header)
    TextView appHeader;
    @BindView(R.id.mn0501)
    RadioGroup mn0501;
    @BindView(R.id.mn0501_1)
    RadioButton mn05011;
    @BindView(R.id.mn0501_2)
    RadioButton mn05012;
    @BindView(R.id.fldGrpmn0502)
    LinearLayout fldGrpmn0502;
    @BindView(R.id.mn0502)
    RadioGroup mn0502;
    @BindView(R.id.mn0502_1)
    RadioButton mn05021;
    @BindView(R.id.mn0502_2)
    RadioButton mn05022;
    @BindView(R.id.fldGrpmn0503)
    LinearLayout fldGrpmn0503;
    @BindView(R.id.mn0503)
    RadioGroup mn0503;
    @BindView(R.id.mn050301)
    RadioButton mn050301;
    @BindView(R.id.mn050302)
    RadioButton mn050302;
    @BindView(R.id.mn050303)
    RadioButton mn050303;
    @BindView(R.id.mn0504)
    RadioGroup mn0504;
    @BindView(R.id.mn0504_1)
    RadioButton mn05041;
    @BindView(R.id.mn0504_2)
    RadioButton mn05042;
    @BindView(R.id.fldGrpmn0505)
    LinearLayout fldGrpmn0505;
    @BindView(R.id.mn0505)
    RadioGroup mn0505;
    @BindView(R.id.mn0505_1)
    RadioButton mn05051;
    @BindView(R.id.mn0505_2)
    RadioButton mn05052;
    @BindView(R.id.mn0506)
    RadioGroup mn0506;
    @BindView(R.id.mn0506_1)
    RadioButton mn05061;
    @BindView(R.id.mn0506_2)
    RadioButton mn05062;
    @BindView(R.id.fldGrpmn0507)
    LinearLayout fldGrpmn0507;
    @BindView(R.id.mn0507)
    RadioGroup mn0507;
    @BindView(R.id.mn050701)
    RadioButton mn050701;
    @BindView(R.id.mn050702)
    RadioButton mn050702;
    @BindView(R.id.mn050703)
    RadioButton mn050703;
    @BindView(R.id.mn050704)
    RadioButton mn050704;
    @BindView(R.id.mn0508)
    RadioGroup mn0508;
    @BindView(R.id.mn0508_1)
    RadioButton mn05081;
    @BindView(R.id.mn0508_2)
    RadioButton mn05082;
    @BindView(R.id.mn050901)
    CheckBox mn050901;
    @BindView(R.id.mn050902)
    CheckBox mn050902;
    @BindView(R.id.mn050903)
    CheckBox mn050903;
    @BindView(R.id.mn050904)
    CheckBox mn050904;
    @BindView(R.id.mn050905)
    CheckBox mn050905;
    @BindView(R.id.mn050906)
    CheckBox mn050906;
    @BindView(R.id.mn050907)
    CheckBox mn050907;
    @BindView(R.id.mn050988)
    CheckBox mn050988;
    @BindView(R.id.mn050988x)
    EditText mn050988x;
    @BindView(R.id.mn0510)
    RadioGroup mn0510;
    @BindView(R.id.mn051001)
    RadioButton mn051001;
    @BindView(R.id.mn051002)
    RadioButton mn051002;
    @BindView(R.id.mn051003)
    RadioButton mn051003;
    @BindView(R.id.mn051004)
    RadioButton mn051004;
    @BindView(R.id.mn0511)
    RadioGroup mn0511;
    @BindView(R.id.mn051101)
    RadioButton mn051101;
    @BindView(R.id.mn051102)
    RadioButton mn051102;
    @BindView(R.id.fldGrpmn0512)
    LinearLayout fldGrpmn0512;
    @BindView(R.id.mn0512)
    RadioGroup mn0512;
    @BindView(R.id.mn051201)
    RadioButton mn051201;
    @BindView(R.id.mn051202)
    RadioButton mn051202;
    @BindView(R.id.mn051201x)
    EditText mn051201x;
    @BindView(R.id.mn0513)
    RadioGroup mn0513;
    @BindView(R.id.mn051301)
    RadioButton mn051301;
    @BindView(R.id.mn051302)
    RadioButton mn051302;
    @BindView(R.id.mn051301x)
    EditText mn051301x;
    @BindView(R.id.mn051401)
    CheckBox mn051401;
    @BindView(R.id.mn051402)
    CheckBox mn051402;
    @BindView(R.id.mn051403)
    CheckBox mn051403;
    @BindView(R.id.mn051404)
    CheckBox mn051404;
    @BindView(R.id.mn051405)
    CheckBox mn051405;
    @BindView(R.id.mn051406)
    CheckBox mn051406;
    @BindView(R.id.mn051407)
    CheckBox mn051407;
    @BindView(R.id.mn0514077)
    CheckBox mn0514077;
    @BindView(R.id.mn051488)
    CheckBox mn051488;
    @BindView(R.id.mn051488x)
    EditText mn051488x;
    @BindView(R.id.mn051501)
    CheckBox mn051501;
    @BindView(R.id.mn051502)
    CheckBox mn051502;
    @BindView(R.id.mn051503)
    CheckBox mn051503;
    @BindView(R.id.mn051504)
    CheckBox mn051504;
    @BindView(R.id.mn051505)
    CheckBox mn051505;
    @BindView(R.id.mn051506)
    CheckBox mn051506;
    @BindView(R.id.mn051507)
    CheckBox mn051507;
    @BindView(R.id.mn051508)
    CheckBox mn051508;
    @BindView(R.id.mn051588)
    CheckBox mn051588;
    @BindView(R.id.mn051588x)
    EditText mn051588x;
    @BindView(R.id.mn051601)
    CheckBox mn051601;
    @BindView(R.id.mn051602)
    CheckBox mn051602;
    @BindView(R.id.mn051603)
    CheckBox mn051603;
    @BindView(R.id.mn051604)
    CheckBox mn051604;
    @BindView(R.id.mn051605)
    CheckBox mn051605;
    @BindView(R.id.mn051606)
    CheckBox mn051606;
    @BindView(R.id.mn051607)
    CheckBox mn051607;
    @BindView(R.id.mn051608)
    CheckBox mn051608;
    @BindView(R.id.mn051609)
    CheckBox mn051609;
    @BindView(R.id.mn051610)
    CheckBox mn051610;
    @BindView(R.id.mn051688)
    CheckBox mn051688;
    @BindView(R.id.mn051688x)
    EditText mn051688x;
    @BindView(R.id.mn0517a1)
    RadioGroup mn0517a1;
    @BindView(R.id.mn0517a101)
    RadioButton mn0517a101;
    @BindView(R.id.mn0517a102)
    RadioButton mn0517a102;
    @BindView(R.id.mn0517a2d)
    EditText mn0517a2d;
    @BindView(R.id.mn0517a2m)
    EditText mn0517a2m;
    @BindView(R.id.mn0517a3)
    RadioGroup mn0517a3;
    @BindView(R.id.mn0517a301)
    RadioButton mn0517a301;
    @BindView(R.id.mn0517a302)
    RadioButton mn0517a302;
    @BindView(R.id.mn0517a303)
    RadioButton mn0517a303;
    @BindView(R.id.mn0517a304)
    RadioButton mn0517a304;
    @BindView(R.id.mn0517a305)
    RadioButton mn0517a305;
    @BindView(R.id.mn0517a306)
    RadioButton mn0517a306;
    @BindView(R.id.mn0517a307)
    RadioButton mn0517a307;
    @BindView(R.id.mn0517a3077)
    RadioButton mn0517a3077;
    @BindView(R.id.mn0517b1)
    RadioGroup mn0517b1;
    @BindView(R.id.mn0517b101)
    RadioButton mn0517b101;
    @BindView(R.id.mn0517b102)
    RadioButton mn0517b102;
    @BindView(R.id.mn0517b2d)
    EditText mn0517b2d;
    @BindView(R.id.mn0517b2m)
    EditText mn0517b2m;
    @BindView(R.id.mn0517b3)
    RadioGroup mn0517b3;
    @BindView(R.id.mn0517b301)
    RadioButton mn0517b301;
    @BindView(R.id.mn0517b302)
    RadioButton mn0517b302;
    @BindView(R.id.mn0517b303)
    RadioButton mn0517b303;
    @BindView(R.id.mn0517b304)
    RadioButton mn0517b304;
    @BindView(R.id.mn0517b305)
    RadioButton mn0517b305;
    @BindView(R.id.mn0517b306)
    RadioButton mn0517b306;
    @BindView(R.id.mn0517b307)
    RadioButton mn0517b307;
    @BindView(R.id.mn0517b3077)
    RadioButton mn0517b3077;
    @BindView(R.id.mn0517c1)
    RadioGroup mn0517c1;
    @BindView(R.id.mn0517c101)
    RadioButton mn0517c101;
    @BindView(R.id.mn0517c102)
    RadioButton mn0517c102;
    @BindView(R.id.mn0517c2d)
    EditText mn0517c2d;
    @BindView(R.id.mn0517c2m)
    EditText mn0517c2m;
    @BindView(R.id.mn0517c3)
    RadioGroup mn0517c3;
    @BindView(R.id.mn0517c301)
    RadioButton mn0517c301;
    @BindView(R.id.mn0517c302)
    RadioButton mn0517c302;
    @BindView(R.id.mn0517c303)
    RadioButton mn0517c303;
    @BindView(R.id.mn0517c304)
    RadioButton mn0517c304;
    @BindView(R.id.mn0517c305)
    RadioButton mn0517c305;
    @BindView(R.id.mn0517c306)
    RadioButton mn0517c306;
    @BindView(R.id.mn0517c307)
    RadioButton mn0517c307;
    @BindView(R.id.mn0517c3077)
    RadioButton mn0517c3077;
    @BindView(R.id.mn0517d1)
    RadioGroup mn0517d1;
    @BindView(R.id.mn0517d101)
    RadioButton mn0517d101;
    @BindView(R.id.mn0517d102)
    RadioButton mn0517d102;
    @BindView(R.id.mn0517d2d)
    EditText mn0517d2d;
    @BindView(R.id.mn0517d2m)
    EditText mn0517d2m;
    @BindView(R.id.mn0517d3)
    RadioGroup mn0517d3;
    @BindView(R.id.mn0517d301)
    RadioButton mn0517d301;
    @BindView(R.id.mn0517d302)
    RadioButton mn0517d302;
    @BindView(R.id.mn0517d303)
    RadioButton mn0517d303;
    @BindView(R.id.mn0517d304)
    RadioButton mn0517d304;
    @BindView(R.id.mn0517d305)
    RadioButton mn0517d305;
    @BindView(R.id.mn0517d306)
    RadioButton mn0517d306;
    @BindView(R.id.mn0517d307)
    RadioButton mn0517d307;
    @BindView(R.id.mn0517d3077)
    RadioButton mn0517d3077;
    @BindView(R.id.mn0517e1)
    RadioGroup mn0517e1;
    @BindView(R.id.mn0517e101)
    RadioButton mn0517e101;
    @BindView(R.id.mn0517e102)
    RadioButton mn0517e102;
    @BindView(R.id.mn0517e2d)
    EditText mn0517e2d;
    @BindView(R.id.mn0517e2m)
    EditText mn0517e2m;
    @BindView(R.id.mn0517e3)
    RadioGroup mn0517e3;
    @BindView(R.id.mn0517e301)
    RadioButton mn0517e301;
    @BindView(R.id.mn0517e302)
    RadioButton mn0517e302;
    @BindView(R.id.mn0517e303)
    RadioButton mn0517e303;
    @BindView(R.id.mn0517e304)
    RadioButton mn0517e304;
    @BindView(R.id.mn0517e305)
    RadioButton mn0517e305;
    @BindView(R.id.mn0517e306)
    RadioButton mn0517e306;
    @BindView(R.id.mn0517e307)
    RadioButton mn0517e307;
    @BindView(R.id.mn0517e3077)
    RadioButton mn0517e3077;
    @BindView(R.id.mn0517f1)
    RadioGroup mn0517f1;
    @BindView(R.id.mn0517f101)
    RadioButton mn0517f101;
    @BindView(R.id.mn0517f102)
    RadioButton mn0517f102;
    @BindView(R.id.mn0517f2d)
    EditText mn0517f2d;
    @BindView(R.id.mn0517f2m)
    EditText mn0517f2m;
    @BindView(R.id.mn0517f3)
    RadioGroup mn0517f3;
    @BindView(R.id.mn0517f301)
    RadioButton mn0517f301;
    @BindView(R.id.mn0517f302)
    RadioButton mn0517f302;
    @BindView(R.id.mn0517f303)
    RadioButton mn0517f303;
    @BindView(R.id.mn0517f304)
    RadioButton mn0517f304;
    @BindView(R.id.mn0517f305)
    RadioButton mn0517f305;
    @BindView(R.id.mn0517f306)
    RadioButton mn0517f306;
    @BindView(R.id.mn0517f307)
    RadioButton mn0517f307;
    @BindView(R.id.mn0517f3077)
    RadioButton mn0517f3077;
    @BindView(R.id.mn051801)
    CheckBox mn051801;
    @BindView(R.id.mn051802)
    CheckBox mn051802;
    @BindView(R.id.mn051803)
    CheckBox mn051803;
    @BindView(R.id.mn051804)
    CheckBox mn051804;
    @BindView(R.id.mn051805)
    CheckBox mn051805;
    @BindView(R.id.mn051806)
    CheckBox mn051806;
    @BindView(R.id.mn051807)
    CheckBox mn051807;
    @BindView(R.id.mn051808)
    CheckBox mn051808;
    @BindView(R.id.mn051809)
    CheckBox mn051809;
    @BindView(R.id.mn051888)
    CheckBox mn051888;
    @BindView(R.id.mn051888x)
    EditText mn051888x;
    @BindView(R.id.mn051901)
    CheckBox mn051901;
    @BindView(R.id.mn051902)
    CheckBox mn051902;
    @BindView(R.id.mn051903)
    CheckBox mn051903;
    @BindView(R.id.mn051904)
    CheckBox mn051904;
    @BindView(R.id.mn051905)
    CheckBox mn051905;
    @BindView(R.id.mn051906)
    CheckBox mn051906;
    @BindView(R.id.mn051988)
    CheckBox mn051988;
    @BindView(R.id.mn051988x)
    EditText mn051988x;
    @BindView(R.id.mn0520)
    RadioGroup mn0520;
    @BindView(R.id.mn052001)
    RadioButton mn052001;
    @BindView(R.id.mn052002)
    RadioButton mn052002;
    @BindView(R.id.mn0521)
    RadioGroup mn0521;
    @BindView(R.id.mn052101)
    RadioButton mn052101;
    @BindView(R.id.mn052102)
    RadioButton mn052102;
    @BindView(R.id.mn052103)
    RadioButton mn052103;
    @BindView(R.id.mn052104)
    RadioButton mn052104;
    @BindView(R.id.mn0522)
    RadioGroup mn0522;
    @BindView(R.id.mn052201)
    RadioButton mn052201;
    @BindView(R.id.mn052202)
    RadioButton mn052202;
    @BindView(R.id.mn052301)
    CheckBox mn052301;
    @BindView(R.id.mn052302)
    CheckBox mn052302;
    @BindView(R.id.mn052303)
    CheckBox mn052303;
    @BindView(R.id.mn052304)
    CheckBox mn052304;
    @BindView(R.id.mn052305)
    CheckBox mn052305;
    @BindView(R.id.mn052306)
    CheckBox mn052306;
    @BindView(R.id.mn052307)
    CheckBox mn052307;
    @BindView(R.id.mn052308)
    CheckBox mn052308;
    @BindView(R.id.mn052309)
    CheckBox mn052309;
    @BindView(R.id.mn052310)
    CheckBox mn052310;
    @BindView(R.id.mn052311)
    CheckBox mn052311;
    @BindView(R.id.mn052312)
    CheckBox mn052312;
    @BindView(R.id.mn052313)
    CheckBox mn052313;
    @BindView(R.id.mn052314)
    CheckBox mn052314;
    @BindView(R.id.mn052315)
    CheckBox mn052315;
    @BindView(R.id.mn052316)
    CheckBox mn052316;
    @BindView(R.id.mn052317)
    CheckBox mn052317;
    @BindView(R.id.mn052318)
    CheckBox mn052318;
    @BindView(R.id.mn052319)
    CheckBox mn052319;
    @BindView(R.id.mn052320)
    CheckBox mn052320;
    @BindView(R.id.mn052321)
    CheckBox mn052321;
    @BindView(R.id.mn052388)
    CheckBox mn052388;
    @BindView(R.id.mn052388x)
    EditText mn052388x;
    @BindView(R.id.mn0524)
    RadioGroup mn0524;
    @BindView(R.id.mn052401)
    RadioButton mn052401;
    @BindView(R.id.mn052402)
    RadioButton mn052402;
    @BindView(R.id.mn052403)
    RadioButton mn052403;
    @BindView(R.id.mn052404)
    RadioButton mn052404;
    @BindView(R.id.mn052405)
    RadioButton mn052405;
    @BindView(R.id.mn052406)
    RadioButton mn052406;
    @BindView(R.id.mn052407)
    RadioButton mn052407;
    @BindView(R.id.mn052477)
    RadioButton mn052477;
    @BindView(R.id.mn052488)
    RadioButton mn052488;
    @BindView(R.id.mn052488x)
    EditText mn052488x;
    @BindView(R.id.mn0525)
    RadioGroup mn0525;
    @BindView(R.id.mn052501)
    RadioButton mn052501;
    @BindView(R.id.mn052502)
    RadioButton mn052502;
    @BindView(R.id.mn052503)
    RadioButton mn052503;
    @BindView(R.id.mn052504)
    RadioButton mn052504;
    @BindView(R.id.mn052505)
    RadioButton mn052505;
    @BindView(R.id.mn052506)
    RadioButton mn052506;
    @BindView(R.id.mn052507)
    RadioButton mn052507;
    @BindView(R.id.mn052588)
    RadioButton mn052588;
    @BindView(R.id.mn052588x)
    EditText mn052588x;
    @BindView(R.id.mn052601)
    CheckBox mn052601;
    @BindView(R.id.mn052602)
    CheckBox mn052602;
    @BindView(R.id.mn052603)
    CheckBox mn052603;
    @BindView(R.id.mn052604)
    CheckBox mn052604;
    @BindView(R.id.mn052605)
    CheckBox mn052605;
    @BindView(R.id.mn052606)
    CheckBox mn052606;
    @BindView(R.id.mn052688)
    CheckBox mn052688;
    @BindView(R.id.mn052688x)
    EditText mn052688x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5);
        ButterKnife.bind(this);


    }

}
