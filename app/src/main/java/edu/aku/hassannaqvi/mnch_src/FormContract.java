package edu.aku.hassannaqvi.mnch_src;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by isd on 28/10/2016.
 */

public class FormContract implements BaseColumns {
    private static final String TAG = "SEC1_CONTRACT";

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String ROW_FORM_ID;
    String ROW_S1Q101;
    String ROW_S1Q102;
    String ROW_S1Q103;
    String ROW_S1Q104;
    String ROW_S1Q105;
    String ROW_S1Q106a;
    String ROW_S1Q106b;
    String ROW_S1Q107;
    String ROW_S1Q108;
    String ROW_S1Q108b;
    String ROW_S1Q110;
    String ROW_S1Q111;
    String ROW_S1Q111oth;
    String ROW_S1Q112;
    String ROW_ENTRYDATE;
    String ROW_USERID;
    String ROW_S2;
    String ROW_S5;
    String ROW_S5b;
    String ROW_S5c;
    String ROW_S6;
    String ROW_S7;
    String ROW_S8;
    String ROW_MN823;
    String ROW_MN823X;
    String ROW_UUID;
    String ROW_GPS_LNG;
    String ROW_GPS_LAT;
    String ROW_GPS_DT;
    String ROW_GPS_ACC;
    String COLUMN_SYNCED;
    String COLUMN_SYNCED_DATE;

    FormContract(String devid, String formid, String s1q101, String s1q102, String s1q103, String s1q104, String s1q105,
                 String s1q106a, String s1q106b, String s1q107, String s1q108, String s1q108b, String s1q109a, String s1q109b, String s1q110,
                 String s1q111, String s1q111oth, String s1q112) {
        this.ROW_DEVID = devid;
        this.ROW_FORM_ID = formid;
        this.ROW_S1Q101 = s1q101;
        this.ROW_S1Q102 = s1q102;
        this.ROW_S1Q103 = s1q103;
        this.ROW_S1Q104 = s1q104;
        this.ROW_S1Q105 = s1q105;
        this.ROW_S1Q106a = s1q106a;
        this.ROW_S1Q106b = s1q106b;
        this.ROW_S1Q107 = s1q107;
        this.ROW_S1Q108 = s1q108;
        this.ROW_S1Q108b = s1q108b;
        this.ROW_S1Q110 = s1q110;
        this.ROW_S1Q111 = s1q111;
        this.ROW_S1Q111oth = s1q111oth;
        this.ROW_S1Q111oth = s1q111oth;
    }

    public FormContract() {

    }

    public FormContract(Long ID) {
        this._ID = ID;
    }


    public FormContract(String formid) {
        this.ROW_FORM_ID = formid;
    }

    public FormContract(String formid, JSONObject fc) throws JSONException {

        this.ROW_FORM_ID = formid;
        this.ROW_S2 = fc.getString("va_01");
        this.ROW_S5 = fc.getString("va_04");
        this.ROW_S6 = fc.getString("va_04");
        this.ROW_S7 = fc.getString("va_04");
        this.ROW_S8 = fc.getString("va_04");
    }

    public FormContract Sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getLong(Sec1Entry._ID);
        this.ROW_DEVID = jsonObject.getString(Sec1Entry.ROW_DEVID);
        this.ROW_FORM_ID = jsonObject.getString(Sec1Entry.ROW_FORM_ID);
        this.ROW_S1Q101 = jsonObject.getString(Sec1Entry.ROW_S1Q101);
        this.ROW_S1Q102 = jsonObject.getString(Sec1Entry.ROW_S1Q102);
        this.ROW_S1Q103 = jsonObject.getString(Sec1Entry.ROW_S1Q103);
        this.ROW_S1Q104 = jsonObject.getString(Sec1Entry.ROW_S1Q104);
        this.ROW_S1Q105 = jsonObject.getString(Sec1Entry.ROW_S1Q105);
        this.ROW_S1Q106a = jsonObject.getString(Sec1Entry.ROW_S1Q106A);
        this.ROW_S1Q106b = jsonObject.getString(Sec1Entry.ROW_S1Q106B);
        this.ROW_S1Q107 = jsonObject.getString(Sec1Entry.ROW_S1Q107);
        this.ROW_S1Q108 = jsonObject.getString(Sec1Entry.ROW_S1Q108);
        this.ROW_S1Q108b = jsonObject.getString(Sec1Entry.ROW_S1Q108B);
        this.ROW_S1Q110 = jsonObject.getString(Sec1Entry.ROW_S1Q110);
        this.ROW_S1Q111 = jsonObject.getString(Sec1Entry.ROW_S1Q111);
        this.ROW_S1Q111oth = jsonObject.getString(Sec1Entry.ROW_S1Q111OTH);
        this.ROW_S1Q112 = jsonObject.getString(Sec1Entry.ROW_S1Q112);
        this.ROW_ENTRYDATE = jsonObject.getString(Sec1Entry.ROW_ENTRYDATE);
        this.ROW_USERID = jsonObject.getString(Sec1Entry.ROW_USERID);
        this.ROW_S2 = jsonObject.getString(Sec1Entry.ROW_S2);
        this.ROW_S5 = jsonObject.getString(Sec1Entry.ROW_S5);
        this.ROW_S5b = jsonObject.getString(Sec1Entry.ROW_S5B);
        this.ROW_S5c = jsonObject.getString(Sec1Entry.ROW_S5C);
        this.ROW_S6 = jsonObject.getString(Sec1Entry.ROW_S6);
        this.ROW_S7 = jsonObject.getString(Sec1Entry.ROW_S7);
        this.ROW_S8 = jsonObject.getString(Sec1Entry.ROW_S8);
        this.ROW_MN823 = jsonObject.getString(Sec1Entry.ROW_MN823);
        this.ROW_MN823X = jsonObject.getString(Sec1Entry.ROW_MN823X);
        this.ROW_UUID = jsonObject.getString(Sec1Entry.ROW_UUID);
        this.ROW_GPS_LNG = jsonObject.getString(Sec1Entry.ROW_GPS_LNG);
        this.ROW_GPS_LAT = jsonObject.getString(Sec1Entry.ROW_GPS_LAT);
        this.ROW_GPS_DT = jsonObject.getString(Sec1Entry.ROW_GPS_DT);
        this.ROW_GPS_ACC = jsonObject.getString(Sec1Entry.ROW_GPS_ACC);
        this.COLUMN_SYNCED = jsonObject.getString(Sec1Entry.COLUMN_SYNCED);
        this.COLUMN_SYNCED_DATE = jsonObject.getString(Sec1Entry.COLUMN_SYNCED_DATE);


        return this;
    }

    public FormContract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(Sec1Entry._ID));
        this.ROW_DEVID = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_DEVID));
        this.ROW_FORM_ID = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_FORM_ID));
        this.ROW_S1Q101 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q101));
        this.ROW_S1Q102 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q102));
        this.ROW_S1Q103 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q103));
        this.ROW_S1Q104 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q104));
        this.ROW_S1Q105 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q105));
        this.ROW_S1Q106a = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q106A));
        this.ROW_S1Q106b = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q106B));
        this.ROW_S1Q107 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q107));
        this.ROW_S1Q108 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q108));
        this.ROW_S1Q108b = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q108B));
        this.ROW_S1Q110 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q110));
        this.ROW_S1Q111 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q111));
        this.ROW_S1Q111oth = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q111OTH));
        this.ROW_S1Q112 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q112));
        this.ROW_ENTRYDATE = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_ENTRYDATE));
        this.ROW_USERID = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_USERID));
        this.ROW_S2 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S2));
        this.ROW_S5 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S5));
        this.ROW_S5b = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S5B));
        this.ROW_S5c = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S5C));
        this.ROW_S6 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S6));
        this.ROW_S7 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S7));
        this.ROW_S8 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S8));
        this.ROW_MN823 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_MN823));
        this.ROW_MN823X = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_MN823X));
        this.ROW_UUID = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_UUID));
        this.ROW_GPS_LNG = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_LNG));
        this.ROW_GPS_LAT = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_LAT));
        this.ROW_GPS_DT = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_DT));
        this.ROW_GPS_ACC = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_ACC));
        this.COLUMN_SYNCED = cursor.getString(cursor.getColumnIndex(Sec1Entry.COLUMN_SYNCED));
        this.COLUMN_SYNCED_DATE = cursor.getString(cursor.getColumnIndex(Sec1Entry.COLUMN_SYNCED_DATE));

        return this;
    }

    public Long get_ID() {
        return _ID;
    }

    public void set_ID(Long _ID) {
        this._ID = _ID;
    }

    public String getROW_DEVID() {
        return ROW_DEVID;
    }

    public void setROW_DEVID(String ROW_DEVID) {
        this.ROW_DEVID = ROW_DEVID;
    }

    public String getROW_FORM_ID() {
        return ROW_FORM_ID;
    }

    public void setROW_FORM_ID(String ROW_FORM_ID) {
        this.ROW_FORM_ID = ROW_FORM_ID;
    }

    public String getROW_S1Q101() {
        return ROW_S1Q101;
    }

    public void setROW_S1Q101(String ROW_S1Q101) {
        this.ROW_S1Q101 = ROW_S1Q101;
    }

    public String getROW_S1Q102() {
        return ROW_S1Q102;
    }

    public void setROW_S1Q102(String ROW_S1Q102) {
        this.ROW_S1Q102 = ROW_S1Q102;
    }

    public String getROW_S1Q103() {
        return ROW_S1Q103;
    }

    public void setROW_S1Q103(String ROW_S1Q103) {
        this.ROW_S1Q103 = ROW_S1Q103;
    }

    public String getROW_S1Q104() {
        return ROW_S1Q104;
    }

    public void setROW_S1Q104(String ROW_S1Q104) {
        this.ROW_S1Q104 = ROW_S1Q104;
    }

    public String getROW_S1Q105() {
        return ROW_S1Q105;
    }

    public void setROW_S1Q105(String ROW_S1Q105) {
        this.ROW_S1Q105 = ROW_S1Q105;
    }

    public String getROW_S1Q106a() {
        return ROW_S1Q106a;
    }

    public void setROW_S1Q106a(String ROW_S1Q106a) {
        this.ROW_S1Q106a = ROW_S1Q106a;
    }

    public String getROW_S1Q106b() {
        return ROW_S1Q106b;
    }

    public void setROW_S1Q106b(String ROW_S1Q106b) {
        this.ROW_S1Q106b = ROW_S1Q106b;
    }

    public String getROW_S1Q107() {
        return ROW_S1Q107;
    }

    public void setROW_S1Q107(String ROW_S1Q107) {
        this.ROW_S1Q107 = ROW_S1Q107;
    }

    public String getROW_S1Q108() {
        return ROW_S1Q108;
    }

    public void setROW_S1Q108(String ROW_S1Q108) {
        this.ROW_S1Q108 = ROW_S1Q108;
    }

    public String getROW_S1Q108b() {
        return ROW_S1Q108b;
    }

    public void setROW_S1Q108b(String ROW_S1Q108b) {
        this.ROW_S1Q108b = ROW_S1Q108b;
    }

    public String getROW_S1Q110() {
        return ROW_S1Q110;
    }

    public void setROW_S1Q110(String ROW_S1Q110) {
        this.ROW_S1Q110 = ROW_S1Q110;
    }

    public String getROW_S1Q111() {
        return ROW_S1Q111;
    }

    public void setROW_S1Q111(String ROW_S1Q111) {
        this.ROW_S1Q111 = ROW_S1Q111;
    }

    public String getROW_S1Q111oth() {
        return ROW_S1Q111oth;
    }

    public void setROW_S1Q111oth(String ROW_S1Q111oth) {
        this.ROW_S1Q111oth = ROW_S1Q111oth;
    }

    public String getROW_S1Q112() {
        return ROW_S1Q112;
    }

    public void setROW_S1Q112(String ROW_S1Q112) {
        this.ROW_S1Q112 = ROW_S1Q112;
    }

    public String getROW_ENTRYDATE() {
        return ROW_ENTRYDATE;
    }

    public void setROW_ENTRYDATE(String ROW_ENTRYDATE) {
        this.ROW_ENTRYDATE = ROW_ENTRYDATE;
    }

    public String getROW_USERID() {
        return ROW_USERID;
    }

    public void setROW_USERID(String ROW_USERID) {
        this.ROW_USERID = ROW_USERID;
    }

    public String getROW_S2() {
        return ROW_S2;
    }

    public void setROW_S2(String ROW_S2) {
        this.ROW_S2 = ROW_S2;
    }

    public String getROW_S5() {
        return ROW_S5;
    }

    public void setROW_S5(String ROW_S5) {
        this.ROW_S5 = ROW_S5;
    }

    public String getROW_S5b() {
        return ROW_S5b;
    }

    public void setROW_S5b(String ROW_S5b) {
        this.ROW_S5b = ROW_S5b;
    }

    public String getROW_S5c() {
        return ROW_S5c;
    }

    public void setROW_S5c(String ROW_S5c) {
        this.ROW_S5c = ROW_S5c;
    }

    public String getROW_S6() {
        return ROW_S6;
    }

    public void setROW_S6(String ROW_S6) {
        this.ROW_S6 = ROW_S6;
    }

    public String getROW_S7() {
        return ROW_S7;
    }

    public void setROW_S7(String ROW_S7) {
        this.ROW_S7 = ROW_S7;
    }

    public String getROW_S8() {
        return ROW_S8;
    }

    public void setROW_S8(String ROW_S8) {
        this.ROW_S8 = ROW_S8;
    }

    public String getROW_MN823() {
        return ROW_MN823;
    }

    public void setROW_MN823(String ROW_MN823) {
        this.ROW_MN823 = ROW_MN823;
    }

    public String getROW_MN823X() {
        return ROW_MN823X;
    }

    public void setROW_MN823X(String ROW_MN823X) {
        this.ROW_MN823X = ROW_MN823X;
    }

    public String getROW_UUID() {
        return ROW_UUID;
    }

    public void setROW_UUID(String ROW_UUID) {
        this.ROW_UUID = ROW_UUID;
    }

    public String getROW_GPS_LNG() {
        return ROW_GPS_LNG;
    }

    public void setROW_GPS_LNG(String ROW_GPS_LNG) {
        this.ROW_GPS_LNG = ROW_GPS_LNG;
    }

    public String getROW_GPS_LAT() {
        return ROW_GPS_LAT;
    }

    public void setROW_GPS_LAT(String ROW_GPS_LAT) {
        this.ROW_GPS_LAT = ROW_GPS_LAT;
    }

    public String getROW_GPS_DT() {
        return ROW_GPS_DT;
    }

    public void setROW_GPS_DT(String ROW_GPS_DT) {
        this.ROW_GPS_DT = ROW_GPS_DT;
    }

    public String getROW_GPS_ACC() {
        return ROW_GPS_ACC;
    }

    public void setROW_GPS_ACC(String ROW_GPS_ACC) {
        this.ROW_GPS_ACC = ROW_GPS_ACC;
    }

    public String getCOLUMN_SYNCED() {
        return COLUMN_SYNCED;
    }

    public void setCOLUMN_SYNCED(String COLUMN_SYNCED) {
        this.COLUMN_SYNCED = COLUMN_SYNCED;
    }

    public String getCOLUMN_SYNCED_DATE() {
        return COLUMN_SYNCED_DATE;
    }

    public void setCOLUMN_SYNCED_DATE(String COLUMN_SYNCED_DATE) {
        this.COLUMN_SYNCED_DATE = COLUMN_SYNCED_DATE;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(Sec1Entry._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(Sec1Entry.ROW_DEVID, this.ROW_DEVID == null ? JSONObject.NULL : this.ROW_DEVID);
        json.put(Sec1Entry.ROW_FORM_ID, this.ROW_FORM_ID == null ? JSONObject.NULL : this.ROW_FORM_ID);
        json.put(Sec1Entry.ROW_S1Q101, this.ROW_S1Q101 == null ? JSONObject.NULL : this.ROW_S1Q101);
        json.put(Sec1Entry.ROW_S1Q102, this.ROW_S1Q102 == null ? JSONObject.NULL : this.ROW_S1Q102);
        json.put(Sec1Entry.ROW_S1Q103, this.ROW_S1Q103 == null ? JSONObject.NULL : this.ROW_S1Q103);
        json.put(Sec1Entry.ROW_S1Q104, this.ROW_S1Q104 == null ? JSONObject.NULL : this.ROW_S1Q104);
        json.put(Sec1Entry.ROW_S1Q105, this.ROW_S1Q105 == null ? JSONObject.NULL : this.ROW_S1Q105);
        json.put(Sec1Entry.ROW_S1Q106A, this.ROW_S1Q106a == null ? JSONObject.NULL : this.ROW_S1Q106a);
        json.put(Sec1Entry.ROW_S1Q106B, this.ROW_S1Q106b == null ? JSONObject.NULL : this.ROW_S1Q106b);
        json.put(Sec1Entry.ROW_S1Q107, this.ROW_S1Q107 == null ? JSONObject.NULL : this.ROW_S1Q107);
        json.put(Sec1Entry.ROW_S1Q108, this.ROW_S1Q108 == null ? JSONObject.NULL : this.ROW_S1Q108);
        json.put(Sec1Entry.ROW_S1Q108B, this.ROW_S1Q108b == null ? JSONObject.NULL : this.ROW_S1Q108b);
        json.put(Sec1Entry.ROW_S1Q110, this.ROW_S1Q110 == null ? JSONObject.NULL : this.ROW_S1Q110);
        json.put(Sec1Entry.ROW_S1Q111, this.ROW_S1Q111 == null ? JSONObject.NULL : this.ROW_S1Q111);
        json.put(Sec1Entry.ROW_S1Q111OTH, this.ROW_S1Q111oth == null ? JSONObject.NULL : this.ROW_S1Q111oth);
        json.put(Sec1Entry.ROW_S1Q112, this.ROW_S1Q112 == null ? JSONObject.NULL : this.ROW_S1Q112);
        json.put(Sec1Entry.ROW_ENTRYDATE, this.ROW_ENTRYDATE == null ? JSONObject.NULL : this.ROW_ENTRYDATE);
        json.put(Sec1Entry.ROW_USERID, this.ROW_USERID == null ? JSONObject.NULL : this.ROW_USERID);
        JSONObject jsonObj = new JSONObject("{\"phonetype\":\"N95\",\"cat\":\"WP\"}");

        json.put(Sec1Entry.ROW_S2, this.ROW_S2 == null ? JSONObject.NULL : new JSONObject(this.ROW_S2));
        json.put(Sec1Entry.ROW_S5, this.ROW_S5 == null ? JSONObject.NULL : this.ROW_S5);
        json.put(Sec1Entry.ROW_S5B, this.ROW_S5b == null ? JSONObject.NULL : this.ROW_S5b);
        json.put(Sec1Entry.ROW_S5C, this.ROW_S5c == null ? JSONObject.NULL : this.ROW_S5c);
        json.put(Sec1Entry.ROW_S6, this.ROW_S6 == null ? JSONObject.NULL : this.ROW_S6);
        json.put(Sec1Entry.ROW_S7, this.ROW_S7 == null ? JSONObject.NULL : this.ROW_S7);
        json.put(Sec1Entry.ROW_S8, this.ROW_S8 == null ? JSONObject.NULL : this.ROW_S8);
        json.put(Sec1Entry.ROW_MN823, this.ROW_MN823 == null ? JSONObject.NULL : this.ROW_MN823);
        json.put(Sec1Entry.ROW_MN823X, this.ROW_MN823X == null ? JSONObject.NULL : this.ROW_MN823X);
        json.put(Sec1Entry.ROW_UUID, this.ROW_UUID == null ? JSONObject.NULL : this.ROW_UUID);
        json.put(Sec1Entry.ROW_GPS_LNG, this.ROW_GPS_LNG == null ? JSONObject.NULL : this.ROW_GPS_LNG);
        json.put(Sec1Entry.ROW_GPS_LAT, this.ROW_GPS_LAT == null ? JSONObject.NULL : this.ROW_GPS_LAT);
        json.put(Sec1Entry.ROW_GPS_DT, this.ROW_GPS_DT == null ? JSONObject.NULL : this.ROW_GPS_DT);
        json.put(Sec1Entry.ROW_GPS_ACC, this.ROW_GPS_ACC == null ? JSONObject.NULL : this.ROW_GPS_ACC);
        json.put(Sec1Entry.COLUMN_SYNCED, this.COLUMN_SYNCED == null ? JSONObject.NULL : this.COLUMN_SYNCED);
        json.put(Sec1Entry.COLUMN_SYNCED_DATE, this.COLUMN_SYNCED_DATE == null ? JSONObject.NULL : this.COLUMN_SYNCED_DATE);


        return json;
    }


    public static abstract class Sec1Entry implements BaseColumns {
        public static final String TABLE_NAME = "sec1";
        public static final String _ID = "_id";
        public static final String ROW_DEVID = "row_devid";
        public static final String ROW_FORM_ID = "row_form_id";
        public static final String ROW_S1Q101 = "row_s1q101";
        public static final String ROW_S1Q102 = "row_s1q102";
        public static final String ROW_S1Q103 = "row_s1q103";
        public static final String ROW_S1Q104 = "row_s1q104";
        public static final String ROW_S1Q105 = "row_s1q105";
        public static final String ROW_S1Q106A = "row_s1q106a";
        public static final String ROW_S1Q106B = "row_s1q106b";
        public static final String ROW_S1Q107 = "row_s1q107";
        public static final String ROW_S1Q108 = "row_s1q108";
        public static final String ROW_S1Q108B = "row_s1q108b";
        public static final String ROW_S1Q110 = "row_s1q110";
        public static final String ROW_S1Q111 = "row_s1q111";
        public static final String ROW_S1Q111OTH = "row_s1q111oth";
        public static final String ROW_S1Q112 = "row_s1q112";
        public static final String ROW_ENTRYDATE = "row_entrydate";
        public static final String ROW_USERID = "row_userid";
        public static final String ROW_S2 = "row_s2";
        public static final String ROW_S5 = "row_s5";
        public static final String ROW_S5B = "row_s5b";
        public static final String ROW_S5C = "row_s5c";
        public static final String ROW_S6 = "row_s6";
        public static final String ROW_S7 = "row_s7";
        public static final String ROW_S8 = "row_s8";
        public static final String ROW_MN823 = "row_mn823";
        public static final String ROW_MN823X = "row_mn823x";
        public static final String ROW_UUID = "row_uuid";
        public static final String ROW_GPS_LNG = "row_gps_lng";
        public static final String ROW_GPS_LAT = "row_gps_lat";
        public static final String ROW_GPS_DT = "row_gps_dt";
        public static final String ROW_GPS_ACC = "row_gps_acc";
        public static final String COLUMN_SYNCED = "column_synced";
        public static final String COLUMN_SYNCED_DATE = "column_synced_date";
    }
}