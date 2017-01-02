package edu.aku.hassannaqvi.mnch_src;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Section7ImActivity extends Activity {

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
    @BindView(R.id.bcgscar)
    RadioGroup bcgscar;
    @BindView(R.id.bcgscar01)
    RadioButton bcgscar01;
    @BindView(R.id.bcgscar02)
    RadioButton bcgscar02;
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
    @BindView(R.id.mnipv2)
    RadioGroup mnipv2;
    @BindView(R.id.mnipv201)
    RadioButton mnipv201;
    @BindView(R.id.mnipv202)
    RadioButton mnipv202;
    @BindView(R.id.mnipv2src)
    RadioGroup mnipv2src;
    @BindView(R.id.mnipv2src01)
    RadioButton mnipv2src01;
    @BindView(R.id.mnipv2src02)
    RadioButton mnipv2src02;
    @BindView(R.id.mnipv2src03)
    RadioButton mnipv2src03;
    @BindView(R.id.mnipcv3)
    RadioGroup mnipcv3;
    @BindView(R.id.mnipcv301)
    RadioButton mnipcv301;
    @BindView(R.id.mnipcv302)
    RadioButton mnipcv302;
    @BindView(R.id.mnipcv3src)
    RadioGroup mnipcv3src;
    @BindView(R.id.mnipcv3src01)
    RadioButton mnipcv3src01;
    @BindView(R.id.mnipcv3src02)
    RadioButton mnipcv3src02;
    @BindView(R.id.mnipcv3src03)
    RadioButton mnipcv3src03;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section7_im);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        //TODO implement
    }

    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {
        //TODO implement
    }


}
