package edu.aku.hassannaqvi.mnch_src;

import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by isd on 14/12/2016.
 */

public class Section4Contract implements BaseColumns {

    private static final String TAG = "SEC4_CONTRACT";

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String ROW_FORM_ID;
    String ROW_HHCODE;

    String ROW_SNO;

    String ROW_s4q41a;
    String ROW_s4q41b;
    String ROW_s4q41c;
    String ROW_s4q41d;
    String ROW_s4q41e;
    String ROW_UID;

    public Section4Contract() {

    }


    public String getROW_HHCODE() {
        return this.ROW_HHCODE;
    }

    public void setROW_HHCODE(String ROW_HHCODE) {
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

    public void set_s4q41a(String ROW_s4q41a) {
        this.ROW_s4q41a = ROW_s4q41a;
    }

    public String get_s4q41a() {
        return this.ROW_s4q41a;
    }

    public void set_s4q41b(String ROW_s4q41b) {
        this.ROW_s4q41b = ROW_s4q41b;
    }

    public String get_s4q41b() {
        return this.ROW_s4q41b;
    }

    public void set_s4q41c(String ROW_s4q41c) {
        this.ROW_s4q41c = ROW_s4q41c;
    }

    public String get_s4q41c() {
        return this.ROW_s4q41c;
    }

    public void set_s4q41d(String ROW_s4q41d) {
        this.ROW_s4q41d = ROW_s4q41d;
    }

    public String get_s4q41d() {
        return this.ROW_s4q41d;
    }

    public void set_s4q41e(String ROW_s4q41e) {
        this.ROW_s4q41e = ROW_s4q41e;
    }

    public String get_s4q41e() {
        return this.ROW_s4q41e;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(Section4Entry._ID, this._ID);
        json.put(Section4Entry.ROW_DEVID, this.ROW_DEVID);
        json.put(Section4Entry.ROW_FORM_ID, this.ROW_FORM_ID);
        json.put(Section4Entry.ROW_HHCODE, this.ROW_HHCODE);
        json.put(Section4Entry.ROW_SNO, this.ROW_SNO);

        json.put(Section4Entry.ROW_s4q41a, this.ROW_s4q41a);
        json.put(Section4Entry.ROW_s4q41b, this.ROW_s4q41b);
        json.put(Section4Entry.ROW_s4q41c, this.ROW_s4q41c);
        json.put(Section4Entry.ROW_s4q41d, this.ROW_s4q41d);
        json.put(Section4Entry.ROW_s4q41e, this.ROW_s4q41e);
        json.put(Section4Entry.ROW_UID, this.ROW_UID);

        return json;
    }


    public static abstract class Section4Entry implements BaseColumns {
        public static final String TABLE_NAME = "sec4";
        public static final String _ID = "_ID";
        public static final String ROW_DEVID = "devid";
        public static final String ROW_FORM_ID = "formid";
        public static final String ROW_HHCODE = "hcode";

        public static final String ROW_SNO = "sno";

        public static final String ROW_s4q41a = "s4q41a";
        public static final String ROW_s4q41b = "s4q41b";
        public static final String ROW_s4q41c = "s4q41c";
        public static final String ROW_s4q41d = "s4q41d";
        public static final String ROW_s4q41e = "s4q41e";
        public static final String ROW_UID = "UUID";
    }
}