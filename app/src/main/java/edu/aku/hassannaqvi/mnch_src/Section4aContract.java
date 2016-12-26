package edu.aku.hassannaqvi.mnch_src;

import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by isd on 26/12/2016.
 */

public class Section4aContract implements BaseColumns {

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String ROW_FORM_ID;
    String ROW_HHCODE;

    String ROW_SNO;

    String ROW_s4q42a;
    String ROW_s4q42b;
    String ROW_s4q42c;
    String ROW_s4q42d;
    String ROW_s4q42e;
    String ROW_s4q42f;
    String ROW_UID;


    public Section4aContract() {

    }

    public void set_hhcode(String ROW_HHCODE) {
        this.ROW_HHCODE = ROW_HHCODE;
    }

    public String get_hhcdoe() {
        return this.ROW_HHCODE;
    }

    public void set_sno(String ROW_SNO) {
        this.ROW_SNO = ROW_SNO;
    }

    public String get_sno() {
        return this.ROW_SNO;
    }

    public void set_form_id(String ROW_FORM_ID) {
        this.ROW_FORM_ID = ROW_FORM_ID;
    }

    public String get_form_id() {
        return this.ROW_FORM_ID;
    }

    public void set_uuid(String ROW_UID) {
        this.ROW_UID = ROW_UID;
    }

    public String get_uuid() {
        return this.ROW_UID;
    }

    public void set_s4q42a(String ROW_s4q42a) {
        this.ROW_s4q42a = ROW_s4q42a;
    }

    public String get_s4q42a() {
        return this.ROW_s4q42a;
    }

    public void set_s4q42b(String ROW_s4q42b) {
        this.ROW_s4q42b = ROW_s4q42b;
    }

    public String get_s4q42b() {
        return this.ROW_s4q42b;
    }

    public void set_s4q42c(String ROW_s4q42c) {
        this.ROW_s4q42c = ROW_s4q42c;
    }

    public String get_s4q42c() {
        return this.ROW_s4q42c;
    }

    public void set_s4q42d(String ROW_s4q42d) {
        this.ROW_s4q42d = ROW_s4q42d;
    }

    public String get_s4q42d() {
        return this.ROW_s4q42d;
    }

    public void set_s4q42e(String ROW_s4q42e) {
        this.ROW_s4q42e = ROW_s4q42e;
    }

    public String get_s4q42e() {
        return this.ROW_s4q42e;
    }

    public void set_s4q42f(String ROW_s4q42f) {
        this.ROW_s4q42f = ROW_s4q42f;
    }

    public String get_s4q42f() {
        return this.ROW_s4q42f;
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(Section4aContract.Section4aEntry._ID, this._ID);
        json.put(Section4aContract.Section4aEntry.ROW_DEVID, this.ROW_DEVID);
        json.put(Section4aContract.Section4aEntry.ROW_FORM_ID, this.ROW_FORM_ID);
        json.put(Section4aContract.Section4aEntry.ROW_HHCODE, this.ROW_HHCODE);
        json.put(Section4aContract.Section4aEntry.ROW_SNO, this.ROW_SNO);

        json.put(Section4aContract.Section4aEntry.ROW_s4q42a, this.ROW_s4q42a);
        json.put(Section4aContract.Section4aEntry.ROW_s4q42b, this.ROW_s4q42b);
        json.put(Section4aContract.Section4aEntry.ROW_s4q42c, this.ROW_s4q42c);
        json.put(Section4aContract.Section4aEntry.ROW_s4q42d, this.ROW_s4q42d);
        json.put(Section4aContract.Section4aEntry.ROW_s4q42e, this.ROW_s4q42e);
        json.put(Section4aContract.Section4aEntry.ROW_s4q42f, this.ROW_s4q42f);
        json.put(Section4aContract.Section4aEntry.ROW_UID, this.ROW_UID);

        return json;
    }


    public class Section4aEntry implements BaseColumns {

        public static final String TABLE_NAME = "sec4b";
        public static final String _ID = "_ID";
        public static final String ROW_DEVID = "devid";
        public static final String ROW_FORM_ID = "formid";
        public static final String ROW_HHCODE = "hcode";

        public static final String ROW_SNO = "sno";

        public static final String ROW_s4q42a = "s4q42a";
        public static final String ROW_s4q42b = "s4q42b";
        public static final String ROW_s4q42c = "s4q42c";
        public static final String ROW_s4q42d = "s4q42d";
        public static final String ROW_s4q42e = "s4q42e";
        public static final String ROW_s4q42f = "s4q42f";

        public static final String ROW_UID = "UUID";
    }
}