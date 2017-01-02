package edu.aku.hassannaqvi.mnch_src;

import android.provider.BaseColumns;

/**
 * Created by isd on 30/12/2016.
 */

public final class VillageContract implements BaseColumns {
    private static final String TAG = "cluster_contract";

    String ROW_VCODE;
    String ROW_VNAME;
    String ROW_UCNAME;

    public VillageContract() {
        // Default Constructor
    }

    public VillageContract(String vcode, String vname, String ucname) {
        this.ROW_VCODE = vcode;
        this.ROW_VNAME = vname;
        this.ROW_UCNAME = ucname;
    }


    public String getROW_UCNAME() {
        return ROW_UCNAME;
    }

    public void setROW_UCNAME(String ROW_UCNAME) {
        this.ROW_UCNAME = ROW_UCNAME;
    }

    public String getROW_VCODE() {
        return ROW_VCODE;
    }

    public void setROW_VCODE(String ROW_VCODE) {
        this.ROW_VCODE = ROW_VCODE;
    }

    public String getROW_VNAME() {
        return ROW_VNAME;
    }

    public void setROW_VNAME(String ROW_VNAME) {
        this.ROW_VNAME = ROW_VNAME;
    }


    public static abstract class VillageEntry implements BaseColumns {

        public static final String TABLE_NAME = "villages";
        public static final String ROW_VCODE = "vcode";
        public static final String ROW_VNAME = "vname";
        public static final String ROW_UCNAME = "ucname";
    }
}