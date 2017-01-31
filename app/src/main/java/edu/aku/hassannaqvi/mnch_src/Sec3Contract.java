package edu.aku.hassannaqvi.mnch_src;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by isd on 03/11/2016.
 */

public class Sec3Contract implements BaseColumns {
    private static final String TAG = "SEC3_CONTRACT";

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String ROW_FORM_ID;
    String ROW_FORM_DATE;
    String ROW_HHCODE;
    String ROW_SNO;
    String ROW_s3q301a;
    String ROW_s3q301b;
    String ROW_s3q301c;
    String ROW_s3q301d;
    String ROW_s3q301e;
    String ROW_s3q301f1;
    String ROW_s3q301f;
    String ROW_s3q301g;
    String ROW_s3q301h;
    String ROW_s3q301i;
    String ROW_s3q301j;
    String ROW_s3q301k;
    String ROW_s3q301l;
    String ROW_UUID;
    String ROW_UID;
    String ROW_SYNCED;
    String ROW_SYNCED_DATE;

    public Sec3Contract() {

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

    public String get_s3q301a() {
        return this.ROW_s3q301a;
    }

    public void set_s3q301a(String ROW_s3q301a) {
        this.ROW_s3q301a = ROW_s3q301a;
    }

    public String get_s3q301b() {
        return this.ROW_s3q301b;
    }

    public void set_s3q301b(String ROW_s3q301b) {
        this.ROW_s3q301b = ROW_s3q301b;
    }

    public String get_s3q301c() {
        return this.ROW_s3q301c;
    }

    public void set_s3q301c(String ROW_s3q301c) {
        this.ROW_s3q301c = ROW_s3q301c;
    }

    public String get_s3q301d() {
        return this.ROW_s3q301d;
    }

    public void set_s3q301d(String ROW_s3q301d) {
        this.ROW_s3q301d = ROW_s3q301d;
    }

    public String get_s3q301e() {
        return this.ROW_s3q301e;
    }

    public void set_s3q301e(String ROW_s3q301e) {
        this.ROW_s3q301e = ROW_s3q301e;
    }

    public String get_s3q301f() {
        return this.ROW_s3q301f;
    }

    public void set_s3q301f(String ROW_s3q301f) {
        this.ROW_s3q301f = ROW_s3q301f;
    }

    public String get_s3q301f1() {
        return this.ROW_s3q301f1;
    }

    public void set_s3q301f1(String ROW_s3q301f1) {
        this.ROW_s3q301f1 = ROW_s3q301f1;
    }

    public String get_s3q301g() {
        return this.ROW_s3q301g;
    }

    public void set_s3q301g(String ROW_s3q301g) {
        this.ROW_s3q301g = ROW_s3q301g;
    }

    public String get_s3q301h() {
        return this.ROW_s3q301h;
    }

    public void set_s3q301h(String ROW_s3q301h) {
        this.ROW_s3q301h = ROW_s3q301h;
    }

    public String get_s3q301i() {
        return this.ROW_s3q301i;
    }

    public void set_s3q301i(String ROW_s3q301i) {
        this.ROW_s3q301i = ROW_s3q301i;
    }

    public String get_s3q301j() {
        return this.ROW_s3q301j;
    }

    public void set_s3q301j(String ROW_s3q301j) {
        this.ROW_s3q301j = ROW_s3q301j;
    }

    public String get_s3q301k() {
        return this.ROW_s3q301k;
    }

    public void set_s3q301k(String ROW_s3q301k) {
        this.ROW_s3q301k = ROW_s3q301k;
    }

    public String get_s3q301l() {
        return this.ROW_s3q301l;
    }

    public void set_s3q301l(String ROW_s3q301l) {
        this.ROW_s3q301l = ROW_s3q301l;
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

    public Sec3Contract sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getLong(Sec3Entry._ID);
        this.ROW_DEVID = jsonObject.getString(Sec3Entry.ROW_DEVID);
        this.ROW_FORM_ID = jsonObject.getString(Sec3Entry.ROW_FORM_ID);
        this.ROW_s3q301a = jsonObject.getString(Sec3Entry.ROW_s3q301a);
        this.ROW_s3q301b = jsonObject.getString(Sec3Entry.ROW_s3q301b);
        this.ROW_s3q301c = jsonObject.getString(Sec3Entry.ROW_s3q301c);
        this.ROW_s3q301d = jsonObject.getString(Sec3Entry.ROW_s3q301d);
        this.ROW_s3q301e = jsonObject.getString(Sec3Entry.ROW_s3q301e);
        this.ROW_s3q301f1 = jsonObject.getString(Sec3Entry.ROW_s3q301f1);
        this.ROW_s3q301f = jsonObject.getString(Sec3Entry.ROW_s3q301f);
        this.ROW_s3q301g = jsonObject.getString(Sec3Entry.ROW_s3q301g);
        this.ROW_s3q301h = jsonObject.getString(Sec3Entry.ROW_s3q301h);
        this.ROW_s3q301i = jsonObject.getString(Sec3Entry.ROW_s3q301i);
        this.ROW_s3q301j = jsonObject.getString(Sec3Entry.ROW_s3q301j);
        this.ROW_s3q301k = jsonObject.getString(Sec3Entry.ROW_s3q301k);

        return this;
    }

    public Sec3Contract Hydrate(Cursor cursor) {
        this._ID = cursor.getLong(cursor.getColumnIndex(Sec3Entry._ID));
        this.ROW_DEVID = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_DEVID));
        this.ROW_FORM_ID = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_FORM_ID));
        this.ROW_s3q301a = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301a));
        this.ROW_s3q301b = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301b));
        this.ROW_s3q301c = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301c));
        this.ROW_s3q301d = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301d));
        this.ROW_s3q301e = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301e));
        this.ROW_s3q301f1 = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301f1));
        this.ROW_s3q301f = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301f));
        this.ROW_s3q301g = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301g));
        this.ROW_s3q301h = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301h));
        this.ROW_s3q301i = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301i));
        this.ROW_s3q301j = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301j));
        this.ROW_s3q301k = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301k));

        return this;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(Sec3Entry._ID, this._ID);
        json.put(Sec3Entry.ROW_FORM_ID, this.ROW_FORM_ID);
        json.put(Sec3Entry.ROW_s3q301a, this.ROW_s3q301a);
        json.put(Sec3Entry.ROW_s3q301b, this.ROW_s3q301b);
        json.put(Sec3Entry.ROW_s3q301c, this.ROW_s3q301c);
        json.put(Sec3Entry.ROW_s3q301d, this.ROW_s3q301d);
        json.put(Sec3Entry.ROW_s3q301e, this.ROW_s3q301e);
        json.put(Sec3Entry.ROW_s3q301f1, this.ROW_s3q301f1);
        json.put(Sec3Entry.ROW_s3q301f, this.ROW_s3q301f);
        json.put(Sec3Entry.ROW_s3q301g, this.ROW_s3q301g);
        json.put(Sec3Entry.ROW_s3q301h, this.ROW_s3q301h);
        json.put(Sec3Entry.ROW_s3q301i, this.ROW_s3q301i);
        json.put(Sec3Entry.ROW_s3q301j, this.ROW_s3q301j);
        json.put(Sec3Entry.ROW_s3q301k, this.ROW_s3q301k);

        return json;
    }


    public static abstract class Sec3Entry implements BaseColumns {
        public static final String TABLE_NAME = "sec3";
        public static final String _ID = "_ID";
        public static final String ROW_DEVID = "devid";
        public static final String ROW_FORM_ID = "formid";
        public static final String ROW_FORM_DATE = "form_date";
        public static final String ROW_HHCODE = "hcode";
        public static final String ROW_SNO = "sno";
        public static final String ROW_s3q301a = "s3q301a";
        public static final String ROW_s3q301b = "s3q301b";
        public static final String ROW_s3q301c = "s3q301c";
        public static final String ROW_s3q301d = "s3q301d";
        public static final String ROW_s3q301f1 = "s3q301f1";
        public static final String ROW_s3q301e = "s3q301e";
        public static final String ROW_s3q301f = "s3q301f";
        public static final String ROW_s3q301g = "s3q301g";
        public static final String ROW_s3q301h = "s3q301h";
        public static final String ROW_s3q301i = "s3q301i";
        public static final String ROW_s3q301j = "s3q301j";
        public static final String ROW_s3q301k = "s3q301k";
        public static final String ROW_UID = "uid";
        public static final String ROW_UUID = "uuid";
        public static final String ROW_SYNCED = "synced";
        public static final String ROW_SYNCED_DATE = "synced_date";
    }
}