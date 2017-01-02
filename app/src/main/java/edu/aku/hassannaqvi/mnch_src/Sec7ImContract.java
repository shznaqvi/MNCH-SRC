package edu.aku.hassannaqvi.mnch_src;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by isd on 28/10/2016.
 */

public final class Sec7ImContract implements BaseColumns {
    private static final String TAG = "SEC1_CONTRACT";

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String ROW_ENTRYDATE = "";
    String ROW_USERID = "";
    String ROW_UUID = ""; // UID of FormsContract (MainApp.fc.UID)
    String ROW_UID = ""; // Device_ID+this._ID
    String household = ""; // Household number
    String ROW_7IM = ""; // JSON String
    String ROW_GPS_LNG = "";
    String ROW_GPS_LAT = "";
    String ROW_GPS_DT = "";
    String ROW_GPS_ACC = "";


    public Sec7ImContract() {

    }

    public Sec7ImContract Sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getLong(single7Im._ID);
        this.ROW_DEVID = jsonObject.getString(single7Im.ROW_DEVID);
        this.ROW_ENTRYDATE = jsonObject.getString(single7Im.ROW_ENTRYDATE);
        this.ROW_USERID = jsonObject.getString(single7Im.ROW_USERID);
        this.ROW_UUID = jsonObject.getString(single7Im.ROW_UUID);
        this.ROW_UID = jsonObject.getString(single7Im.ROW_UID);
        this.household = jsonObject.getString(single7Im.ROW_HOUSEHOLD);
        this.ROW_7IM = jsonObject.getString(single7Im.ROW_7IM);
        this.ROW_GPS_LNG = jsonObject.getString(single7Im.ROW_GPS_LNG);
        this.ROW_GPS_LAT = jsonObject.getString(single7Im.ROW_GPS_LAT);
        this.ROW_GPS_DT = jsonObject.getString(single7Im.ROW_GPS_DT);
        this.ROW_GPS_ACC = jsonObject.getString(single7Im.ROW_GPS_ACC);
        return this;
    }

    public Sec7ImContract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(single7Im._ID));
        this.ROW_DEVID = cursor.getString(cursor.getColumnIndex(single7Im.ROW_DEVID));
        this.ROW_ENTRYDATE = cursor.getString(cursor.getColumnIndex(single7Im.ROW_ENTRYDATE));
        this.ROW_USERID = cursor.getString(cursor.getColumnIndex(single7Im.ROW_USERID));
        this.ROW_UUID = cursor.getString(cursor.getColumnIndex(single7Im.ROW_UUID));
        this.ROW_UID = cursor.getString(cursor.getColumnIndex(single7Im.ROW_UID));
        this.household = cursor.getString(cursor.getColumnIndex(single7Im.ROW_HOUSEHOLD));
        this.ROW_7IM = cursor.getString(cursor.getColumnIndex(single7Im.ROW_7IM));
        this.ROW_GPS_LNG = cursor.getString(cursor.getColumnIndex(single7Im.ROW_GPS_LNG));
        this.ROW_GPS_LAT = cursor.getString(cursor.getColumnIndex(single7Im.ROW_GPS_LAT));
        this.ROW_GPS_DT = cursor.getString(cursor.getColumnIndex(single7Im.ROW_GPS_DT));
        this.ROW_GPS_ACC = cursor.getString(cursor.getColumnIndex(single7Im.ROW_GPS_ACC));

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

    public String getROW_UUID() {
        return ROW_UUID;
    }

    public void setROW_UUID(String ROW_UUID) {
        this.ROW_UUID = ROW_UUID;
    }

    public String getROW_UID() {
        return ROW_UID;
    }

    public void setROW_UID(String ROW_UID) {
        this.ROW_UID = ROW_UID;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getROW_7IM() {
        return ROW_7IM;
    }

    public void setROW_7IM(String ROW_7IM) {
        this.ROW_7IM = ROW_7IM;
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

    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();
        json.put(single7Im._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(single7Im.ROW_DEVID, this.ROW_DEVID == null ? JSONObject.NULL : this.ROW_DEVID);
        json.put(single7Im.ROW_ENTRYDATE, this.ROW_ENTRYDATE == null ? JSONObject.NULL : this.ROW_ENTRYDATE);
        json.put(single7Im.ROW_USERID, this.ROW_USERID == null ? JSONObject.NULL : this.ROW_USERID);
        json.put(single7Im.ROW_UUID, this.ROW_UUID == null ? JSONObject.NULL : this.ROW_UUID);
        json.put(single7Im.ROW_UID, this.ROW_UID == null ? JSONObject.NULL : this.ROW_UID);
        json.put(single7Im.ROW_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);
        json.put(single7Im.ROW_7IM, this.ROW_7IM == null ? JSONObject.NULL : this.ROW_7IM);
        json.put(single7Im.ROW_GPS_LNG, this.ROW_GPS_LNG == null ? JSONObject.NULL : this.ROW_GPS_LNG);
        json.put(single7Im.ROW_GPS_LAT, this.ROW_GPS_LAT == null ? JSONObject.NULL : this.ROW_GPS_LAT);
        json.put(single7Im.ROW_GPS_DT, this.ROW_GPS_DT == null ? JSONObject.NULL : this.ROW_GPS_DT);
        json.put(single7Im.ROW_GPS_ACC, this.ROW_GPS_ACC == null ? JSONObject.NULL : this.ROW_GPS_ACC);

        return json;
    }

    public static abstract class single7Im implements BaseColumns {
        public static final String TABLE_NAME = "sec1";
        public static final String _ID = "id";
        public static final String ROW_DEVID = "devid ";
        public static final String ROW_ENTRYDATE = "entrydate ";
        public static final String ROW_USERID = "userid ";
        public static final String ROW_UUID = "uuid ";
        public static final String ROW_UID = "uid ";
        public static final String ROW_HOUSEHOLD = "household ";
        public static final String ROW_7IM = "7im ";
        public static final String ROW_GPS_LNG = "gps_lng ";
        public static final String ROW_GPS_LAT = "gps_lat ";
        public static final String ROW_GPS_DT = "gps_dt ";
        public static final String ROW_GPS_ACC = "gps_acc ";

    }
}