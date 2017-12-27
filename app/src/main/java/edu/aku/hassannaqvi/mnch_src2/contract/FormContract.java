package edu.aku.hassannaqvi.mnch_src2.contract;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;

/**
 * Created by isd on 28/10/2016.
 */

public class FormContract implements BaseColumns {
    private static final String TAG = "SEC1_CONTRACT";

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String HHNO;
    String ROW_ENTRYDATE;
    String ROW_USERID;
    String ROW_S1;
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

    String TagID = "";
    String Version = "";

    public FormContract() {}

    public FormContract Sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getLong(Sec1Entry._ID);
        this.ROW_DEVID = jsonObject.getString(Sec1Entry.ROW_DEVID);
        this.HHNO = jsonObject.getString(Sec1Entry.ROW_HHNO);
        this.ROW_ENTRYDATE = jsonObject.getString(Sec1Entry.ROW_ENTRYDATE);
        this.ROW_USERID = jsonObject.getString(Sec1Entry.ROW_USERID);
        this.ROW_S1 = jsonObject.getString(Sec1Entry.ROW_S1);
        this.ROW_S2 = jsonObject.getString(Sec1Entry.ROW_S2);
        this.ROW_S5 = jsonObject.getString(Sec1Entry.ROW_S5);
        this.ROW_S5b = jsonObject.getString(Sec1Entry.ROW_S5B);
        this.ROW_S5c = jsonObject.getString(Sec1Entry.ROW_S5C);
        this.ROW_S6 = jsonObject.getString(Sec1Entry.ROW_S6);
        this.ROW_S7 = jsonObject.getString(Sec1Entry.ROW_S7);
        this.ROW_S8 = jsonObject.getString(Sec1Entry.ROW_S8);
        this.ROW_MN823 = jsonObject.getString(Sec1Entry.ROW_MN823);
        this.ROW_MN823X = jsonObject.getString(Sec1Entry.ROW_MN823X);
        this.ROW_UUID = jsonObject.getString(Sec1Entry.ROW_UID);
        this.ROW_GPS_LNG = jsonObject.getString(Sec1Entry.ROW_GPS_LNG);
        this.ROW_GPS_LAT = jsonObject.getString(Sec1Entry.ROW_GPS_LAT);
        this.ROW_GPS_DT = jsonObject.getString(Sec1Entry.ROW_GPS_DT);
        this.ROW_GPS_ACC = jsonObject.getString(Sec1Entry.ROW_GPS_ACC);
        this.COLUMN_SYNCED = jsonObject.getString(Sec1Entry.COLUMN_SYNCED);
        this.COLUMN_SYNCED_DATE = jsonObject.getString(Sec1Entry.COLUMN_SYNCED_DATE);

        this.TagID = jsonObject.getString(Sec1Entry.COLUMN_TAGID);
        this.Version = jsonObject.getString(Sec1Entry.COLUMN_VERSION);

        return this;
    }

    public FormContract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(Sec1Entry._ID));
        this.ROW_DEVID = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_DEVID));
        this.HHNO = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_HHNO));
        this.ROW_ENTRYDATE = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_ENTRYDATE));
        this.ROW_USERID = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_USERID));
        this.ROW_S1 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1));
        this.ROW_S2 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S2));
        this.ROW_S5 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S5));
        this.ROW_S5b = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S5B));
        this.ROW_S5c = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S5C));
        this.ROW_S6 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S6));
        this.ROW_S7 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S7));
        this.ROW_S8 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S8));
        this.ROW_MN823 = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_MN823));
        this.ROW_MN823X = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_MN823X));
        this.ROW_UUID = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_UID));
        this.ROW_GPS_LNG = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_LNG));
        this.ROW_GPS_LAT = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_LAT));
        this.ROW_GPS_DT = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_DT));
        this.ROW_GPS_ACC = cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_ACC));
        this.COLUMN_SYNCED = cursor.getString(cursor.getColumnIndex(Sec1Entry.COLUMN_SYNCED));
        this.COLUMN_SYNCED_DATE = cursor.getString(cursor.getColumnIndex(Sec1Entry.COLUMN_SYNCED_DATE));

        this.TagID = cursor.getString(cursor.getColumnIndex(Sec1Entry.COLUMN_TAGID));
        this.Version = cursor.getString(cursor.getColumnIndex(Sec1Entry.COLUMN_VERSION));

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

    public String getHHNO() {
        return HHNO;
    }

    public void setHHNO(String HHNO) {
        this.HHNO = HHNO;
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

    public String getROW_S1() {
        return ROW_S1;
    }

    public void setROW_S1(String ROW_S1) {
        this.ROW_S1 = ROW_S1;
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

    public String getTagID() {
        return TagID;
    }

    public void setTagID(String tagID) {
        TagID = tagID;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(Sec1Entry._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(Sec1Entry.ROW_DEVID, this.ROW_DEVID == null ? JSONObject.NULL : this.ROW_DEVID);
        json.put(Sec1Entry.ROW_HHNO, this.HHNO == null ? JSONObject.NULL : this.HHNO);
        json.put(Sec1Entry.ROW_ENTRYDATE, this.ROW_ENTRYDATE == null ? JSONObject.NULL : this.ROW_ENTRYDATE);
        json.put(Sec1Entry.ROW_USERID, this.ROW_USERID == null ? JSONObject.NULL : this.ROW_USERID);

        try {
            if (!this.ROW_S1.equals("")) {
                json.put(Sec1Entry.ROW_S1, this.ROW_S1.equals("") ? JSONObject.NULL : new JSONObject(this.ROW_S1));
            }
        } catch (Exception e) {
        }
        try {
            if (!this.ROW_S2.equals("")) {
                json.put(Sec1Entry.ROW_S2, this.ROW_S2.equals("") ? JSONObject.NULL : new JSONObject(this.ROW_S2));
            }
        } catch (Exception e) {
        }
        try {
            if (!this.ROW_S5.equals("")) {
                json.put(Sec1Entry.ROW_S5, this.ROW_S5.equals("") ? JSONObject.NULL : new JSONObject(this.ROW_S5));
            }
        } catch (Exception e) {
        }
        try {
            if (!this.ROW_S5b.equals("")) {
                json.put(Sec1Entry.ROW_S5B, this.ROW_S5b.equals("") ? JSONObject.NULL : new JSONObject(this.ROW_S5b));
            }
        } catch (Exception e) {
        }
        try {
            if (!this.ROW_S5c.equals("")) {
                json.put(Sec1Entry.ROW_S5C, this.ROW_S5c.equals("") ? JSONObject.NULL : new JSONObject(this.ROW_S5c));
            }
        } catch (Exception e) {
        }
        try {
            if (!this.ROW_S6.equals("")) {
                json.put(Sec1Entry.ROW_S6, this.ROW_S6.equals("") ? JSONObject.NULL : new JSONObject(this.ROW_S6));
            }
        } catch (Exception e) {
        }
        try {
            if (!this.ROW_S7.equals("")) {
                json.put(Sec1Entry.ROW_S7, this.ROW_S7.equals("") ? JSONObject.NULL : new JSONObject(this.ROW_S7));
            }
        } catch (Exception e) {
        }
        try {
            if (!this.ROW_S8.equals("")) {
                json.put(Sec1Entry.ROW_S8, this.ROW_S8.equals("") ? JSONObject.NULL : new JSONObject(this.ROW_S8));
            }
        } catch (Exception e) {
        }
        json.put(Sec1Entry.ROW_MN823, this.ROW_MN823 == null ? JSONObject.NULL : this.ROW_MN823);
        json.put(Sec1Entry.ROW_MN823X, this.ROW_MN823X == null ? JSONObject.NULL : this.ROW_MN823X);
        json.put(Sec1Entry.ROW_UID, this.ROW_UUID == null ? JSONObject.NULL : this.ROW_UUID);
        json.put(Sec1Entry.ROW_GPS_LNG, this.ROW_GPS_LNG == null ? JSONObject.NULL : this.ROW_GPS_LNG);
        json.put(Sec1Entry.ROW_GPS_LAT, this.ROW_GPS_LAT == null ? JSONObject.NULL : this.ROW_GPS_LAT);
        json.put(Sec1Entry.ROW_GPS_DT, this.ROW_GPS_DT == null ? JSONObject.NULL : this.ROW_GPS_DT);
        json.put(Sec1Entry.ROW_GPS_ACC, this.ROW_GPS_ACC == null ? JSONObject.NULL : this.ROW_GPS_ACC);
        json.put(Sec1Entry.COLUMN_SYNCED, this.COLUMN_SYNCED == null ? JSONObject.NULL : this.COLUMN_SYNCED);
        json.put(Sec1Entry.COLUMN_SYNCED_DATE, this.COLUMN_SYNCED_DATE == null ? JSONObject.NULL : this.COLUMN_SYNCED_DATE);

        json.put(Sec1Entry.COLUMN_TAGID, this.TagID == null ? JSONObject.NULL : this.TagID);
        json.put(Sec1Entry.COLUMN_VERSION, this.Version == null ? JSONObject.NULL : this.Version);


        return json;
    }


    public static abstract class Sec1Entry implements BaseColumns {
        public static final String TABLE_NAME = "sec1";
        public static final String _ID = "_id";
        public static final String ROW_DEVID = "row_devid";
        public static final String ROW_ENTRYDATE = "row_entrydate";
        public static final String ROW_USERID = "row_userid";
        public static final String ROW_HHNO = "hh_no";
        public static final String ROW_S1 = "row_s1";
        public static final String ROW_S2 = "row_s2";
        public static final String ROW_S5 = "row_s5";
        public static final String ROW_S5B = "row_s5b";
        public static final String ROW_S5C = "row_s5c";
        public static final String ROW_S6 = "row_s6";
        public static final String ROW_S7 = "row_s7";
        public static final String ROW_S8 = "row_s8";
        public static final String ROW_MN823 = "row_mn823";
        public static final String ROW_MN823X = "row_mn823x";
        public static final String ROW_UID = "row_uid";
        public static final String ROW_GPS_LNG = "row_gps_lng";
        public static final String ROW_GPS_LAT = "row_gps_lat";
        public static final String ROW_GPS_DT = "row_gps_dt";
        public static final String ROW_GPS_ACC = "row_gps_acc";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";

        public static final String COLUMN_TAGID = "tagID";
        public static final String COLUMN_VERSION = "app_version";
    }
}