package edu.aku.hassannaqvi.mnch_src;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by isd on 26/12/2016.
 */

public class Sec4bContract implements BaseColumns {

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String ROW_FORM_ID;
    String ROW_FORM_DATE;
    String ROW_HHCODE;
    String ROW_USERID;
    String ROW_SNO;
    String ROW_s4q42a;
    String ROW_s4q42b;
    String ROW_s4q42c;
    String ROW_s4q42d;
    String ROW_s4q42d1;
    String ROW_s4q42d2;
    String ROW_s4q42e;
    String ROW_s4q42eoth;
    String ROW_s4q42f;
    String ROW_UID;
    String ROW_UUID;
    String ROW_SYNCED;
    String ROW_SYNCED_DATE;


    public Sec4bContract() {

    }

    public Long get_ID() {
        return _ID;
    }

    public void set_ID(Long _ID) {
        this._ID = _ID;
    }


    public String get_s4q42eoth() {
        return this.ROW_s4q42eoth;
    }

    public void set_s4q42eoth(String ROW_s4q42eoth) {
        this.ROW_s4q42eoth = ROW_s4q42eoth;
    }

    public String getROW_HHCODE() {
        return this.ROW_HHCODE;
    }

    public void setROW_HHCODE(String ROW_HHCODE) {
        this.ROW_HHCODE = ROW_HHCODE;
    }


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

    public String getROW_FORM_ID() {
        return ROW_FORM_ID;
    }

    public void setROW_FORM_ID(String ROW_FORM_ID) {
        this.ROW_FORM_ID = ROW_FORM_ID;
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

    public String get_s4q42a() {
        return this.ROW_s4q42a;
    }

    public void set_s4q42a(String ROW_s4q42a) {
        this.ROW_s4q42a = ROW_s4q42a;
    }

    public String get_s4q42b() {
        return this.ROW_s4q42b;
    }

    public void set_s4q42b(String ROW_s4q42b) {
        this.ROW_s4q42b = ROW_s4q42b;
    }

    public String get_s4q42c() {
        return this.ROW_s4q42c;
    }

    public void set_s4q42c(String ROW_s4q42c) {
        this.ROW_s4q42c = ROW_s4q42c;
    }

    public String get_s4q42d() {
        return this.ROW_s4q42d;
    }

    public void set_s4q42d(String ROW_s4q42d) {
        this.ROW_s4q42d = ROW_s4q42d;
    }

    public String get_s4q42d1() {
        return this.ROW_s4q42d1;
    }

    public void set_s4q42d1(String ROW_s4q42d1) {
        this.ROW_s4q42d1 = ROW_s4q42d1;
    }

    public String get_s4q42d2() {
        return this.ROW_s4q42d2;
    }

    public void set_s4q42d2(String ROW_s4q42d2) {
        this.ROW_s4q42d2 = ROW_s4q42d2;
    }

    public String get_s4q42e() {
        return this.ROW_s4q42e;
    }

    public void set_s4q42e(String ROW_s4q42e) {
        this.ROW_s4q42e = ROW_s4q42e;
    }

    public String get_s4q42f() {
        return this.ROW_s4q42f;
    }

    public void set_s4q42f(String ROW_s4q42f) {
        this.ROW_s4q42f = ROW_s4q42f;
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

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(Section4bEntry._ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(Section4bEntry.ROW_DEVID, this.ROW_DEVID == null ? JSONObject.NULL : this.ROW_DEVID);
        json.put(Section4bEntry.ROW_FORM_ID, this.ROW_FORM_ID == null ? JSONObject.NULL : this.ROW_FORM_ID);
        json.put(Section4bEntry.ROW_FORM_DATE, this.ROW_FORM_DATE == null ? JSONObject.NULL : this.ROW_FORM_DATE);
        json.put(Section4bEntry.ROW_HHCODE, this.ROW_HHCODE == null ? JSONObject.NULL : this.ROW_HHCODE);
        json.put(Section4bEntry.ROW_USERID, this.ROW_USERID == null ? JSONObject.NULL : this.ROW_USERID);
        json.put(Section4bEntry.ROW_SNO, this.ROW_SNO == null ? JSONObject.NULL : this.ROW_SNO);
        json.put(Section4bEntry.ROW_S4Q42A, this.ROW_s4q42a == null ? JSONObject.NULL : this.ROW_s4q42a);
        json.put(Section4bEntry.ROW_S4Q42B, this.ROW_s4q42b == null ? JSONObject.NULL : this.ROW_s4q42b);
        json.put(Section4bEntry.ROW_S4Q42C, this.ROW_s4q42c == null ? JSONObject.NULL : this.ROW_s4q42c);
        json.put(Section4bEntry.ROW_S4Q42D, this.ROW_s4q42d == null ? JSONObject.NULL : this.ROW_s4q42d);
        json.put(Section4bEntry.ROW_S4Q42D1, this.ROW_s4q42d1 == null ? JSONObject.NULL : this.ROW_s4q42d1);
        json.put(Section4bEntry.ROW_S4Q42D2, this.ROW_s4q42d2 == null ? JSONObject.NULL : this.ROW_s4q42d2);
        json.put(Section4bEntry.ROW_S4Q42E, this.ROW_s4q42e == null ? JSONObject.NULL : this.ROW_s4q42e);
        json.put(Section4bEntry.ROW_S4Q42EOTH, this.ROW_s4q42eoth == null ? JSONObject.NULL : this.ROW_s4q42eoth);
        json.put(Section4bEntry.ROW_S4Q42F, this.ROW_s4q42f == null ? JSONObject.NULL : this.ROW_s4q42f);
        json.put(Section4bEntry.ROW_UID, this.ROW_UID == null ? JSONObject.NULL : this.ROW_UID);
        json.put(Section4bEntry.ROW_UUID, this.ROW_UUID == null ? JSONObject.NULL : this.ROW_UUID);
        json.put(Section4bEntry.ROW_SYNCED, this.ROW_SYNCED == null ? JSONObject.NULL : this.ROW_SYNCED);
        json.put(Section4bEntry.ROW_SYNCED_DATE, this.ROW_SYNCED_DATE == null ? JSONObject.NULL : this.ROW_SYNCED_DATE);

        return json;
    }

    public Sec4bContract sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getLong(Section4bEntry._ID);
        this.ROW_DEVID = jsonObject.getString(Section4bEntry.ROW_DEVID);
        this.ROW_FORM_ID = jsonObject.getString(Section4bEntry.ROW_FORM_ID);
        this.ROW_FORM_DATE = jsonObject.getString(Section4bEntry.ROW_FORM_DATE);
        this.ROW_HHCODE = jsonObject.getString(Section4bEntry.ROW_HHCODE);
        this.ROW_USERID = jsonObject.getString(Section4bEntry.ROW_USERID);
        this.ROW_SNO = jsonObject.getString(Section4bEntry.ROW_SNO);
        this.ROW_s4q42a = jsonObject.getString(Section4bEntry.ROW_S4Q42A);
        this.ROW_s4q42b = jsonObject.getString(Section4bEntry.ROW_S4Q42B);
        this.ROW_s4q42c = jsonObject.getString(Section4bEntry.ROW_S4Q42C);
        this.ROW_s4q42d = jsonObject.getString(Section4bEntry.ROW_S4Q42D);
        this.ROW_s4q42d1 = jsonObject.getString(Section4bEntry.ROW_S4Q42D1);
        this.ROW_s4q42d2 = jsonObject.getString(Section4bEntry.ROW_S4Q42D2);
        this.ROW_s4q42e = jsonObject.getString(Section4bEntry.ROW_S4Q42E);
        this.ROW_s4q42eoth = jsonObject.getString(Section4bEntry.ROW_S4Q42EOTH);
        this.ROW_s4q42f = jsonObject.getString(Section4bEntry.ROW_S4Q42F);
        this.ROW_UID = jsonObject.getString(Section4bEntry.ROW_UID);
        this.ROW_UUID = jsonObject.getString(Section4bEntry.ROW_UUID);
        this.ROW_SYNCED = jsonObject.getString(Section4bEntry.ROW_SYNCED);
        this.ROW_SYNCED_DATE = jsonObject.getString(Section4bEntry.ROW_SYNCED_DATE);

        return this;
    }

    public Sec4bContract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(Section4bEntry._ID));
        this.ROW_DEVID = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_DEVID));
        this.ROW_FORM_ID = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_FORM_ID));
        this.ROW_FORM_DATE = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_FORM_DATE));
        this.ROW_HHCODE = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_HHCODE));
        this.ROW_USERID = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_USERID));
        this.ROW_SNO = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_SNO));
        this.ROW_s4q42a = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4Q42A));
        this.ROW_s4q42b = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4Q42B));
        this.ROW_s4q42c = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4Q42C));
        this.ROW_s4q42d = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4Q42D));
        this.ROW_s4q42d1 = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4Q42D1));
        this.ROW_s4q42d2 = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4Q42D2));
        this.ROW_s4q42e = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4Q42E));
        this.ROW_s4q42eoth = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4Q42EOTH));
        this.ROW_s4q42f = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_S4Q42F));
        this.ROW_UID = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_UID));
        this.ROW_UUID = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_UUID));
        this.ROW_SYNCED = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_SYNCED));
        this.ROW_SYNCED_DATE = cursor.getString(cursor.getColumnIndex(Section4bEntry.ROW_SYNCED_DATE));

        return this;
    }

    public static abstract class Section4bEntry implements BaseColumns {

        public static final String TABLE_NAME = "sec4b";
        public static final String _ID = "_id";
        public static final String ROW_DEVID = "devid";
        public static final String ROW_FORM_ID = "form_id";
        public static final String ROW_FORM_DATE = "form_date";
        public static final String ROW_HHCODE = "hhcode";
        public static final String ROW_USERID = "userid";
        public static final String ROW_SNO = "sno";
        public static final String ROW_S4Q42A = "s4q42a";
        public static final String ROW_S4Q42B = "s4q42b";
        public static final String ROW_S4Q42C = "s4q42c";
        public static final String ROW_S4Q42D = "s4q42d";
        public static final String ROW_S4Q42D1 = "s4q42d1";
        public static final String ROW_S4Q42D2 = "s4q42d2";
        public static final String ROW_S4Q42E = "s4q42e";
        public static final String ROW_S4Q42EOTH = "s4q42eoth";
        public static final String ROW_S4Q42F = "s4q42f";
        public static final String ROW_UID = "uid";
        public static final String ROW_UUID = "uuid";
        public static final String ROW_SYNCED = "synced";
        public static final String ROW_SYNCED_DATE = "synced_date";

    }
}