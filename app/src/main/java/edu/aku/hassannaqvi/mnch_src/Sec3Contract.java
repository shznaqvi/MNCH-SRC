package edu.aku.hassannaqvi.mnch_src;

import android.provider.BaseColumns;

/**
 * Created by isd on 03/11/2016.
 */

public class Sec3Contract implements BaseColumns {
    private static final String TAG = "SEC3_CONTRACT";

    Long _ID;
    String ROW_DEVID = SRCApp.DEVID;
    String ROW_FORM_ID;
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
    String ROW_UID;

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


    public void set_s3q301a(String ROW_s3q301a) {
        this.ROW_s3q301a = ROW_s3q301a;
    }

    public String get_s3q301a() {
        return this.ROW_s3q301a;
    }

    public void set_s3q301b(String ROW_s3q301b) {
        this.ROW_s3q301b = ROW_s3q301b;
    }

    public String get_s3q301b() {
        return this.ROW_s3q301b;
    }

    public void set_s3q301c(String ROW_s3q301c) {
        this.ROW_s3q301c = ROW_s3q301c;
    }

    public String get_s3q301c() {
        return this.ROW_s3q301c;
    }

    public void set_s3q301d(String ROW_s3q301d) {
        this.ROW_s3q301d = ROW_s3q301d;
    }

    public String get_s3q301d() {
        return this.ROW_s3q301d;
    }

    public void set_s3q301e(String ROW_s3q301e) {
        this.ROW_s3q301e = ROW_s3q301e;
    }

    public String get_s3q301e() {
        return this.ROW_s3q301e;
    }

    public void set_s3q301f(String ROW_s3q301f) {
        this.ROW_s3q301f = ROW_s3q301f;
    }

    public String get_s3q301f() {
        return this.ROW_s3q301f;
    }

    public void set_s3q301f1(String ROW_s3q301f1) {
        this.ROW_s3q301f1 = ROW_s3q301f1;
    }

    public String get_s3q301f1() {
        return this.ROW_s3q301f1;
    }

    public void set_s3q301g(String ROW_s3q301g) {
        this.ROW_s3q301g = ROW_s3q301g;
    }

    public String get_s3q301g() {
        return this.ROW_s3q301g;
    }

    public void set_s3q301h(String ROW_s3q301h) {
        this.ROW_s3q301h = ROW_s3q301h;
    }

    public String get_s3q301h() {
        return this.ROW_s3q301h;
    }

    public void set_s3q301i(String ROW_s3q301i) {
        this.ROW_s3q301i = ROW_s3q301i;
    }

    public String get_s3q301i() {
        return this.ROW_s3q301i;
    }

    public void set_s3q301j(String ROW_s3q301j) {
        this.ROW_s3q301j = ROW_s3q301j;
    }

    public String get_s3q301j() {
        return this.ROW_s3q301j;
    }

    public void set_s3q301k(String ROW_s3q301k) {
        this.ROW_s3q301k = ROW_s3q301k;
    }

    public String get_s3q301k() {
        return this.ROW_s3q301k;
    }


    public void set_s3q301l(String ROW_s3q301l) {
        this.ROW_s3q301l = ROW_s3q301l;
    }

    public String get_s3q301l() {
        return this.ROW_s3q301l;
    }


    public static abstract class Sec3Entry implements BaseColumns {
        public static final String TABLE_NAME = "sec3";
        public static final String _ID = "_ID";

        public static final String ROW_DEVID = "devid";
        public static final String ROW_FORM_ID = "formid";
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
    }
}