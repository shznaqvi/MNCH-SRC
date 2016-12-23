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
    String ROW_S3;

    public Sec3Contract() {

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

    public String getROW_S3() {
        return ROW_S3;
    }

    public void setROW_S3(String ROW_S3) {
        this.ROW_S3 = ROW_S3;
    }

    public static abstract class Sec3Entry implements BaseColumns {
        public static final String TABLE_NAME = "sec3";
        public static final String _ID = "_ID";

        public static final String ROW_DEVID = "devid";
        public static final String ROW_FORM_ID = "formid";
        public static final String ROW_S3 = "ROW_S3";
    }
}