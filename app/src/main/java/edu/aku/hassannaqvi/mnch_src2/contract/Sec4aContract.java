package edu.aku.hassannaqvi.mnch_src2.contract;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mnch_src2.core.SRCApp;

/**
 * Created by isd on 14/12/2016.
 */

public class Sec4aContract implements BaseColumns {

    private static final String TAG = "SEC4_CONTRACT";

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String HHNO;
    String ROW_FORM_DATE;
    String ROW_USERID;
    //String ROW_HHCODE;
    String ROW_SNO;
    /*String ROW_s4q41a;
    String ROW_s4q41b;
    String ROW_s4q41b1;
    String ROW_s4q41b2;
    String ROW_s4q41c;
    String ROW_s4q41d;
    String ROW_s4q41doth;
    String ROW_s4q41e;*/
    String ROW_s4a;
    String ROW_UID;
    String ROW_UUID;
    String ROW_SYNCED;
    String ROW_SYNCED_DATE;

    String TagID = "";
    String Version = "";

    public Sec4aContract() {

    }


    public String get_USERID() {
        return ROW_USERID;
    }

    public void set_USERID(String ROW_USERID) {
        this.ROW_USERID = ROW_USERID;
    }


   /* public String get_HHCODE() {
        return this.ROW_HHCODE;
    }

    public void set_HHCODE(String ROW_HHCODE) {
        this.ROW_HHCODE = ROW_HHCODE;
    }
*/

    public String get_SNO() {
        return this.ROW_SNO;
    }

    public void set_SNO(String ROW_SNO) {
        this.ROW_SNO = ROW_SNO;
    }


    public Long get_ID() {
        return _ID;
    }

    public void set_ID(Long _ID) {
        this._ID = _ID;
    }

    public String get_HHNO() {
        return this.HHNO;
    }

    public void set_HHNO(String HHNO) {
        this.HHNO = HHNO;
    }

    public String get_FORM_DATE() {
        return ROW_FORM_DATE;
    }

    public void set_FORM_DATE(String ROW_FORM_DATE) {
        this.ROW_FORM_DATE = ROW_FORM_DATE;
    }

    public String get_DEVID() {
        return this.ROW_DEVID;
    }

    public void set_DEVID(String ROW_DEVID) {
        this.ROW_DEVID = ROW_DEVID;
    }

    public String get_UID() {
        return this.ROW_UID;
    }

    public void set_UID(String ROW_UID) {
        this.ROW_UID = ROW_UID;
    }


    public String get_s4a() {
        return this.ROW_s4a;
    }

    public void set_s4a(String ROW_s4a) {
        this.ROW_s4a = ROW_s4a;
    }

    public String getROW_UUID() {
        return ROW_UUID;
    }

    public void setROW_UUID(String ROW_UUID) {
        this.ROW_UUID = ROW_UUID;
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

        json.put(Section4Entry._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(Section4Entry.ROW_DEVID, this.ROW_DEVID == null ? JSONObject.NULL : this.ROW_DEVID);
        json.put(Section4Entry.ROW_HHNO, this.HHNO == null ? JSONObject.NULL : this.HHNO);
        json.put(Section4Entry.ROW_FORM_DATE, this.ROW_FORM_DATE == null ? JSONObject.NULL : this.ROW_FORM_DATE);
        json.put(Section4Entry.ROW_USERID, this.ROW_USERID == null ? JSONObject.NULL : this.ROW_USERID);
        //json.put(Section4Entry.ROW_HHCODE, this.ROW_HHCODE == null ? JSONObject.NULL : this.ROW_HHCODE);
        json.put(Section4Entry.ROW_SNO, this.ROW_SNO == null ? JSONObject.NULL : this.ROW_SNO);
        json.put(Section4Entry.ROW_S4A, this.ROW_s4a == null ? JSONObject.NULL : this.ROW_s4a);

        json.put(Section4Entry.ROW_UID, this.ROW_UID == null ? JSONObject.NULL : this.ROW_UID);
        json.put(Section4Entry.ROW_UUID, this.ROW_UUID == null ? JSONObject.NULL : this.ROW_UUID);
        json.put(Section4Entry.ROW_SYNCED, this.ROW_SYNCED == null ? JSONObject.NULL : this.ROW_SYNCED);
        json.put(Section4Entry.ROW_SYNCED_DATE, this.ROW_SYNCED_DATE == null ? JSONObject.NULL : this.ROW_SYNCED_DATE);

        json.put(Section4Entry.COLUMN_TAGID, this.TagID == null ? JSONObject.NULL : this.TagID);
        json.put(Section4Entry.COLUMN_VERSION, this.Version == null ? JSONObject.NULL : this.Version);
        return json;
    }

    public Sec4aContract sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getLong(Section4Entry._ID);
        this.ROW_DEVID = jsonObject.getString(Section4Entry.ROW_DEVID);
        this.HHNO = jsonObject.getString(Section4Entry.ROW_HHNO);
        this.ROW_FORM_DATE = jsonObject.getString(Section4Entry.ROW_FORM_DATE);
        this.ROW_USERID = jsonObject.getString(Section4Entry.ROW_USERID);
        //this.ROW_HHCODE = jsonObject.getString(Section4Entry.ROW_HHCODE);
        this.ROW_SNO = jsonObject.getString(Section4Entry.ROW_SNO);
        this.ROW_s4a = jsonObject.getString(Section4Entry.ROW_S4A);
        this.ROW_UID = jsonObject.getString(Section4Entry.ROW_UID);
        this.ROW_UUID = jsonObject.getString(Section4Entry.ROW_UUID);
        this.ROW_SYNCED = jsonObject.getString(Section4Entry.ROW_SYNCED);
        this.ROW_SYNCED_DATE = jsonObject.getString(Section4Entry.ROW_SYNCED_DATE);

        this.TagID = jsonObject.getString(Section4Entry.COLUMN_TAGID);
        this.Version = jsonObject.getString(Section4Entry.COLUMN_VERSION);

        return this;
    }

    public Sec4aContract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(Section4Entry._ID));
        this.ROW_DEVID = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_DEVID));
        this.HHNO = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_HHNO));
        this.ROW_FORM_DATE = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_FORM_DATE));
        this.ROW_USERID = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_USERID));
        //this.ROW_HHCODE = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_HHCODE));
        this.ROW_SNO = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_SNO));
        this.ROW_s4a = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_S4A));

        this.ROW_UID = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_UID));
        this.ROW_UUID = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_UUID));
        this.ROW_SYNCED = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_SYNCED));
        this.ROW_SYNCED_DATE = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_SYNCED_DATE));

        this.TagID = cursor.getString(cursor.getColumnIndex(Section4Entry.COLUMN_TAGID));
        this.Version = cursor.getString(cursor.getColumnIndex(Section4Entry.COLUMN_VERSION));
        return this;
    }


    public static abstract class Section4Entry implements BaseColumns {
        public static final String TABLE_NAME = "sec4";
        public static final String _ID = "_id";
        public static final String ROW_DEVID = "devid";
        public static final String ROW_HHNO = "hh_no";
        public static final String ROW_FORM_DATE = "form_date";
        public static final String ROW_USERID = "userid";
        //public static final String ROW_HHCODE = "hhcode";
        public static final String ROW_SNO = "sno";
        public static final String ROW_S4A = "row_s4a";
        public static final String ROW_UID = "uid";
        public static final String ROW_UUID = "uuid";
        public static final String ROW_SYNCED = "synced";
        public static final String ROW_SYNCED_DATE = "synced_date";

        public static final String COLUMN_TAGID = "tagID";
        public static final String COLUMN_VERSION = "app_version";
    }
}