package edu.aku.hassannaqvi.mnch_src2.contract;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;

/**
 * Created by isd on 03/11/2016.
 */

public class Sec3Contract implements BaseColumns {
    private static final String TAG = "SEC3_CONTRACT";

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String HHNO;
    String ROW_FORM_DATE;
    String ROW_USERID;
    //String ROW_HHCODE;
    String ROW_SNO;
    /*String ROW_s3q301a;
    String ROW_s3q301b;
    String ROW_s3q301c;
    String ROW_s3q301d;
    String ROW_s3q301e;
    String ROW_s3q301f1;
    String ROW_s3q301f;
    String ROW_s3q301g;
    String ROW_s3q301h;
    String ROW_s3q301i;
    String ROW_s3q301ioth;
    String ROW_s3q301j;
    String ROW_s3q301joth;
    String ROW_s3q301k;
    String ROW_s3q301l;*/
    String ROW_S3;
    String ROW_UUID;
    String ROW_UID;
    String ROW_SYNCED;
    String ROW_SYNCED_DATE;

    String TagID = "";
    String Version = "";

    public Sec3Contract() {

    }

    public Long get_ID() {
        return _ID;
    }

    public void set_ID(Long _ID) {
        this._ID = _ID;
    }

    /*public String getROW_HHCODE() {
        return this.ROW_HHCODE;
    }

    public void setROW_HHCODE(String ROW_HHCODE) {
        this.ROW_HHCODE = ROW_HHCODE;
    }*/


    public String getROW_SNO() {
        return this.ROW_SNO;
    }

    public void setROW_SNO(String ROW_SNO) {
        this.ROW_SNO = ROW_SNO;
    }


    public String getROW_UID() {
        return this.ROW_UID;
    }

    public void setROW_UID(String ROW_UID) {
        this.ROW_UID = ROW_UID;
    }

    public String getROW_UUID() {
        return ROW_UUID;
    }

    public void setROW_UUID(String ROW_UUID) {
        this.ROW_UUID = ROW_UUID;
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

    public String getROW_FORM_DATE() {
        return ROW_FORM_DATE;
    }

    public void setROW_FORM_DATE(String ROW_FORM_DATE) {
        this.ROW_FORM_DATE = ROW_FORM_DATE;
    }

    public String getROW_USERID() {
        return ROW_USERID;
    }

    public void setROW_USERID(String ROW_USERID) {
        this.ROW_USERID = ROW_USERID;
    }

    public String getROW_SYNCED() {
        return ROW_SYNCED;
    }

    public void setROW_SYNCED(String ROW_SYNCED) {
        this.ROW_SYNCED = ROW_SYNCED;
    }

    public String getROW_SYNCED_DATE() {
        return ROW_SYNCED_DATE;
    }

    public void setROW_SYNCED_DATE(String ROW_SYNCED_DATE) {
        this.ROW_SYNCED_DATE = ROW_SYNCED_DATE;
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

    public String getROW_S3() {

        return ROW_S3;
    }

    public void setROW_S3(String ROW_S3) {
        this.ROW_S3 = ROW_S3;
    }

    public Sec3Contract sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getLong(Sec3Entry._ID);
        this.ROW_DEVID = jsonObject.getString(Sec3Entry.ROW_DEVID);
        this.HHNO = jsonObject.getString(Sec3Entry.ROW_HHNO);
        this.ROW_FORM_DATE = jsonObject.getString(Sec3Entry.ROW_FORM_DATE);
        this.ROW_USERID = jsonObject.getString(Sec3Entry.ROW_USERID);
        //this.ROW_HHCODE = jsonObject.getString(Sec3Entry.ROW_HHCODE);
        this.ROW_SNO = jsonObject.getString(Sec3Entry.ROW_SNO);
        this.ROW_UUID = jsonObject.getString(Sec3Entry.ROW_UUID);
        this.ROW_UID = jsonObject.getString(Sec3Entry.ROW_UID);
        this.ROW_S3 = jsonObject.getString(Sec3Entry.ROW_S3);
        this.ROW_SYNCED = jsonObject.getString(Sec3Entry.ROW_SYNCED);
        this.ROW_SYNCED_DATE = jsonObject.getString(Sec3Entry.ROW_SYNCED_DATE);

        this.TagID = jsonObject.getString(Sec3Entry.COLUMN_TAGID);
        this.Version = jsonObject.getString(Sec3Entry.COLUMN_VERSION);

        return this;
    }

    public Sec3Contract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(Sec3Entry._ID));
        this.ROW_DEVID = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_DEVID));
        this.HHNO = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_HHNO));
        this.ROW_FORM_DATE = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_FORM_DATE));
        this.ROW_USERID = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_USERID));
        //this.ROW_HHCODE = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_HHCODE));
        this.ROW_SNO = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_SNO));

        this.ROW_UUID = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_UUID));
        this.ROW_UID = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_UID));
        this.ROW_S3 = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_S3));
        this.ROW_SYNCED = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_SYNCED));
        this.ROW_SYNCED_DATE = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_SYNCED_DATE));

        this.TagID = cursor.getString(cursor.getColumnIndex(Sec3Entry.COLUMN_TAGID));
        this.Version = cursor.getString(cursor.getColumnIndex(Sec3Entry.COLUMN_VERSION));
        return this;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(Sec3Entry._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(Sec3Entry.ROW_DEVID, this.ROW_DEVID == null ? JSONObject.NULL : this.ROW_DEVID);
        json.put(Sec3Entry.ROW_HHNO, this.HHNO == null ? JSONObject.NULL : this.HHNO);
        json.put(Sec3Entry.ROW_FORM_DATE, this.ROW_FORM_DATE == null ? JSONObject.NULL : this.ROW_FORM_DATE);
        json.put(Sec3Entry.ROW_USERID, this.ROW_USERID == null ? JSONObject.NULL : this.ROW_USERID);
        //json.put(Sec3Entry.ROW_HHCODE, this.ROW_HHCODE == null ? JSONObject.NULL : this.ROW_HHCODE);
        json.put(Sec3Entry.ROW_SNO, this.ROW_SNO == null ? JSONObject.NULL : this.ROW_SNO);
        json.put(Sec3Entry.ROW_UUID, this.ROW_UUID == null ? JSONObject.NULL : this.ROW_UUID);
        json.put(Sec3Entry.ROW_UID, this.ROW_UID == null ? JSONObject.NULL : this.ROW_UID);
        json.put(Sec3Entry.ROW_S3, this.ROW_S3 == null ? JSONObject.NULL : this.ROW_S3);
        json.put(Sec3Entry.ROW_SYNCED, this.ROW_SYNCED == null ? JSONObject.NULL : this.ROW_SYNCED);
        json.put(Sec3Entry.ROW_SYNCED_DATE, this.ROW_SYNCED_DATE == null ? JSONObject.NULL : this.ROW_SYNCED_DATE);

        json.put(Sec3Entry.COLUMN_TAGID, this.TagID == null ? JSONObject.NULL : this.TagID);
        json.put(Sec3Entry.COLUMN_VERSION, this.Version == null ? JSONObject.NULL : this.Version);
        return json;
    }


    public static abstract class Sec3Entry implements BaseColumns {
        public static final String TABLE_NAME = "sec3";
        public static final String _ID = "_id";
        public static final String ROW_DEVID = "devid";
        public static final String ROW_HHNO = "hh_no";
        public static final String ROW_FORM_DATE = "form_date";
        public static final String ROW_USERID = "userid";
        //public static final String ROW_HHCODE = "hhcode";
        public static final String ROW_SNO = "sno";
        public static final String ROW_UUID = "uuid";
        public static final String ROW_UID = "uid";
        public static final String ROW_S3 = "row_s3";
        public static final String ROW_SYNCED = "synced";
        public static final String ROW_SYNCED_DATE = "synced_date";

        public static final String COLUMN_TAGID = "tagID";
        public static final String COLUMN_VERSION = "app_version";

    }
}