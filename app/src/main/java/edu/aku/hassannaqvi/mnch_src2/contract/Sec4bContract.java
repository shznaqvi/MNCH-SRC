package edu.aku.hassannaqvi.mnch_src2.contract;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;

/**
 * Created by isd on 26/12/2016.
 */

public class Sec4bContract implements BaseColumns {

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String HHNO;
    String ROW_FORM_DATE;
    //String ROW_HHCODE;
    String ROW_USERID;
    String ROW_SNO;
    /*String ROW_s4q42a;
    String ROW_s4q42b;
    String ROW_s4q42c;
    String ROW_s4q42d;
    String ROW_s4q42d1;
    String ROW_s4q42d2;
    String ROW_s4q42e;
    String ROW_s4q42eoth;
    String ROW_s4q42f;
    */

    String ROW_s4b;
    String ROW_UID;
    String ROW_UUID;
    String ROW_SYNCED;
    String ROW_SYNCED_DATE;

    String TagID = "";
    String Version = "";

    public Sec4bContract() {

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

    public String get_s4b() {
        return this.ROW_s4b;
    }

    public void set_s4b(String ROW_s4b) {
        this.ROW_s4b = ROW_s4b;
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

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(Section4bEntry._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(Section4bEntry.ROW_DEVID, this.ROW_DEVID == null ? JSONObject.NULL : this.ROW_DEVID);
        json.put(Section4bEntry.ROW_HHNO, this.HHNO == null ? JSONObject.NULL : this.HHNO);
        json.put(Section4bEntry.ROW_FORM_DATE, this.ROW_FORM_DATE == null ? JSONObject.NULL : this.ROW_FORM_DATE);
        //json.put(Section4bEntry.ROW_HHCODE, this.ROW_HHCODE == null ? JSONObject.NULL : this.ROW_HHCODE);
        json.put(Section4bEntry.ROW_USERID, this.ROW_USERID == null ? JSONObject.NULL : this.ROW_USERID);
        json.put(Section4bEntry.ROW_SNO, this.ROW_SNO == null ? JSONObject.NULL : this.ROW_SNO);
        json.put(Section4bEntry.ROW_S4B, this.ROW_s4b == null ? JSONObject.NULL : this.ROW_s4b);
        json.put(Section4bEntry.ROW_UID, this.ROW_UID == null ? JSONObject.NULL : this.ROW_UID);
        json.put(Section4bEntry.ROW_UUID, this.ROW_UUID == null ? JSONObject.NULL : this.ROW_UUID);
        json.put(Section4bEntry.ROW_SYNCED, this.ROW_SYNCED == null ? JSONObject.NULL : this.ROW_SYNCED);
        json.put(Section4bEntry.ROW_SYNCED_DATE, this.ROW_SYNCED_DATE == null ? JSONObject.NULL : this.ROW_SYNCED_DATE);

        json.put(Section4bEntry.COLUMN_TAGID, this.TagID == null ? JSONObject.NULL : this.TagID);
        json.put(Section4bEntry.COLUMN_VERSION, this.Version == null ? JSONObject.NULL : this.Version);
        return json;
    }

    public Sec4bContract sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getLong(Section4bEntry._ID);
        this.ROW_DEVID = jsonObject.getString(Section4bEntry.ROW_DEVID);
        this.HHNO = jsonObject.getString(Section4bEntry.ROW_HHNO);
        this.ROW_FORM_DATE = jsonObject.getString(Section4bEntry.ROW_FORM_DATE);
        //this.ROW_HHCODE = jsonObject.getString(Section4bEntry.ROW_HHCODE);
        this.ROW_USERID = jsonObject.getString(Section4bEntry.ROW_USERID);
        this.ROW_SNO = jsonObject.getString(Section4bEntry.ROW_SNO);
        this.ROW_s4b = jsonObject.getString(Section4bEntry.ROW_S4B);
        this.ROW_UID = jsonObject.getString(Section4bEntry.ROW_UID);
        this.ROW_UUID = jsonObject.getString(Section4bEntry.ROW_UUID);
        this.ROW_SYNCED = jsonObject.getString(Section4bEntry.ROW_SYNCED);
        this.ROW_SYNCED_DATE = jsonObject.getString(Section4bEntry.ROW_SYNCED_DATE);

        this.TagID = jsonObject.getString(Section4bEntry.COLUMN_TAGID);
        this.Version = jsonObject.getString(Section4bEntry.COLUMN_VERSION);
        return this;
    }

    public Sec4bContract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(Section4bEntry._ID));
        this.ROW_DEVID = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_DEVID));
        this.HHNO = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_HHNO));
        this.ROW_FORM_DATE = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_FORM_DATE));
        //this.ROW_HHCODE = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_HHCODE));
        this.ROW_USERID = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_USERID));
        this.ROW_SNO = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_SNO));
        this.ROW_s4b = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4B));
        this.ROW_UID = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_UID));
        this.ROW_UUID = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_UUID));
        this.ROW_SYNCED = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_SYNCED));
        this.ROW_SYNCED_DATE = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_SYNCED_DATE));

        this.TagID = cursor.getString(cursor.getColumnIndex(Section4bEntry.COLUMN_TAGID));
        this.Version = cursor.getString(cursor.getColumnIndex(Section4bEntry.COLUMN_VERSION));
        return this;
    }

    public static abstract class Section4bEntry implements BaseColumns {

        public static final String TABLE_NAME = "sec4b";
        public static final String _ID = "_id";
        public static final String ROW_DEVID = "devid";
        public static final String ROW_HHNO = "hh_no";
        public static final String ROW_FORM_DATE = "form_date";
        //public static final String ROW_HHCODE = "hhcode";
        public static final String ROW_USERID = "userid";
        public static final String ROW_SNO = "sno";
        public static final String ROW_S4B = "row_s4b";
        public static final String ROW_UID = "uid";
        public static final String ROW_UUID = "uuid";
        public static final String ROW_SYNCED = "synced";
        public static final String ROW_SYNCED_DATE = "synced_date";

        public static final String COLUMN_TAGID = "tagID";
        public static final String COLUMN_VERSION = "app_version";
    }
}