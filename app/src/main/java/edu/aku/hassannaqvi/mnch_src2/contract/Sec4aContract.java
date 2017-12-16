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
    String ROW_FORM_ID;
    String ROW_FORM_DATE;
    String ROW_USERID;
    String ROW_HHCODE;
    String ROW_SNO;
    String ROW_s4q41a;
    String ROW_s4q41b;
    String ROW_s4q41b1;
    String ROW_s4q41b2;
    String ROW_s4q41c;
    String ROW_s4q41d;
    String ROW_s4q41doth;
    String ROW_s4q41e;
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

    public String get_s4q41b1() {
        return this.ROW_s4q41b1;
    }

    public void set_s4q41b1(String ROW_s4q41b1) {
        this.ROW_s4q41b1 = ROW_s4q41b1;
    }

    public String get_s4q41b2() {
        return this.ROW_s4q41b2;
    }

    public void set_s4q41b2(String ROW_s4q41b2) {
        this.ROW_s4q41b2 = ROW_s4q41b2;
    }

    public String get_HHCODE() {
        return this.ROW_HHCODE;
    }

    public void set_HHCODE(String ROW_HHCODE) {
        this.ROW_HHCODE = ROW_HHCODE;
    }


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

    public String get_FORM_ID() {
        return this.ROW_FORM_ID;
    }

    public void set_FORM_ID(String ROW_FORM_ID) {
        this.ROW_FORM_ID = ROW_FORM_ID;
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


    public String get_s4q41a() {
        return this.ROW_s4q41a;
    }

    public void set_s4q41a(String ROW_s4q41a) {
        this.ROW_s4q41a = ROW_s4q41a;
    }

    public String get_s4q41b() {
        return this.ROW_s4q41b;
    }

    public void set_s4q41b(String ROW_s4q41b) {
        this.ROW_s4q41b = ROW_s4q41b;
    }

    public String get_s4q41c() {
        return this.ROW_s4q41c;
    }

    public void set_s4q41c(String ROW_s4q41c) {
        this.ROW_s4q41c = ROW_s4q41c;
    }

    public String get_s4q41d() {
        return this.ROW_s4q41d;
    }

    public void set_s4q41d(String ROW_s4q41d) {
        this.ROW_s4q41d = ROW_s4q41d;
    }

    public String get_s4q41doth() {
        return this.ROW_s4q41doth;
    }

    public void set_s4q41doth(String ROW_s4q41doth) {
        this.ROW_s4q41d = ROW_s4q41doth;
    }

    public String get_s4q41e() {
        return this.ROW_s4q41e;
    }

    public void set_s4q41e(String ROW_s4q41e) {
        this.ROW_s4q41e = ROW_s4q41e;
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
        json.put(Section4Entry.ROW_FORM_ID, this.ROW_FORM_ID == null ? JSONObject.NULL : this.ROW_FORM_ID);
        json.put(Section4Entry.ROW_FORM_DATE, this.ROW_FORM_DATE == null ? JSONObject.NULL : this.ROW_FORM_DATE);
        json.put(Section4Entry.ROW_USERID, this.ROW_USERID == null ? JSONObject.NULL : this.ROW_USERID);
        json.put(Section4Entry.ROW_HHCODE, this.ROW_HHCODE == null ? JSONObject.NULL : this.ROW_HHCODE);
        json.put(Section4Entry.ROW_SNO, this.ROW_SNO == null ? JSONObject.NULL : this.ROW_SNO);
        json.put(Section4Entry.ROW_S4Q41A, this.ROW_s4q41a == null ? JSONObject.NULL : this.ROW_s4q41a);
        json.put(Section4Entry.ROW_S4Q41B, this.ROW_s4q41b == null ? JSONObject.NULL : this.ROW_s4q41b);
        json.put(Section4Entry.ROW_S4Q41B1, this.ROW_s4q41b1 == null ? JSONObject.NULL : this.ROW_s4q41b1);
        json.put(Section4Entry.ROW_S4Q41B2, this.ROW_s4q41b2 == null ? JSONObject.NULL : this.ROW_s4q41b2);
        json.put(Section4Entry.ROW_S4Q41C, this.ROW_s4q41c == null ? JSONObject.NULL : this.ROW_s4q41c);
        json.put(Section4Entry.ROW_S4Q41D, this.ROW_s4q41d == null ? JSONObject.NULL : this.ROW_s4q41d);
        json.put(Section4Entry.ROW_S4Q41DOTH, this.ROW_s4q41doth == null ? JSONObject.NULL : this.ROW_s4q41doth);
        json.put(Section4Entry.ROW_S4Q41E, this.ROW_s4q41e == null ? JSONObject.NULL : this.ROW_s4q41e);
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
        this.ROW_FORM_ID = jsonObject.getString(Section4Entry.ROW_FORM_ID);
        this.ROW_FORM_DATE = jsonObject.getString(Section4Entry.ROW_FORM_DATE);
        this.ROW_USERID = jsonObject.getString(Section4Entry.ROW_USERID);
        this.ROW_HHCODE = jsonObject.getString(Section4Entry.ROW_HHCODE);
        this.ROW_SNO = jsonObject.getString(Section4Entry.ROW_SNO);
        this.ROW_s4q41a = jsonObject.getString(Section4Entry.ROW_S4Q41A);
        this.ROW_s4q41b = jsonObject.getString(Section4Entry.ROW_S4Q41B);
        this.ROW_s4q41b1 = jsonObject.getString(Section4Entry.ROW_S4Q41B1);
        this.ROW_s4q41b2 = jsonObject.getString(Section4Entry.ROW_S4Q41B2);
        this.ROW_s4q41c = jsonObject.getString(Section4Entry.ROW_S4Q41C);
        this.ROW_s4q41d = jsonObject.getString(Section4Entry.ROW_S4Q41D);
        this.ROW_s4q41doth = jsonObject.getString(Section4Entry.ROW_S4Q41DOTH);
        this.ROW_s4q41e = jsonObject.getString(Section4Entry.ROW_S4Q41E);
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
        this.ROW_FORM_ID = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_FORM_ID));
        this.ROW_FORM_DATE = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_FORM_DATE));
        this.ROW_USERID = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_USERID));
        this.ROW_HHCODE = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_HHCODE));
        this.ROW_SNO = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_SNO));
        this.ROW_s4q41a = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_S4Q41A));
        this.ROW_s4q41b = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_S4Q41B));
        this.ROW_s4q41b1 = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_S4Q41B1));
        this.ROW_s4q41b2 = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_S4Q41B2));
        this.ROW_s4q41c = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_S4Q41C));
        this.ROW_s4q41d = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_S4Q41D));
        this.ROW_s4q41doth = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_S4Q41DOTH));
        this.ROW_s4q41e = cursor.getString(cursor.getColumnIndex(Section4Entry.ROW_S4Q41E));
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
        public static final String ROW_FORM_ID = "form_id";
        public static final String ROW_FORM_DATE = "form_date";
        public static final String ROW_USERID = "userid";
        public static final String ROW_HHCODE = "hhcode";
        public static final String ROW_SNO = "sno";
        public static final String ROW_S4Q41A = "s4q41a";
        public static final String ROW_S4Q41B = "s4q41b";
        public static final String ROW_S4Q41B1 = "s4q41b1";
        public static final String ROW_S4Q41B2 = "s4q41b2";
        public static final String ROW_S4Q41C = "s4q41c";
        public static final String ROW_S4Q41D = "s4q41d";
        public static final String ROW_S4Q41DOTH = "s4q41doth";
        public static final String ROW_S4Q41E = "s4q41e";
        public static final String ROW_UID = "uid";
        public static final String ROW_UUID = "uuid";
        public static final String ROW_SYNCED = "synced";
        public static final String ROW_SYNCED_DATE = "synced_date";

        public static final String COLUMN_TAGID = "tagID";
        public static final String COLUMN_VERSION = "app_version";
    }
}