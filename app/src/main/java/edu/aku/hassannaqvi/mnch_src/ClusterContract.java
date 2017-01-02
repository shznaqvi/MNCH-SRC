package edu.aku.hassannaqvi.mnch_src;

/**
 * Created by isd on 30/12/2016.
 */

import android.provider.BaseColumns;

/**
 * Created by isd on 20/10/2016.
 */
public final class ClusterContract implements BaseColumns {
    private static final String TAG = "cluster_contract";
    String ROW_UCCODE;
    String ROW_UCNAME;


    public ClusterContract() {
        // Default Constructor
    }

    public ClusterContract(String uccode, String ucname, String vcode, String vname) {
        this.ROW_UCCODE = uccode;
        this.ROW_UCNAME = ucname;
    }

    public String getROW_UCCODE() {
        return ROW_UCCODE;
    }

    public void setROW_UCCODE(String ROW_UCCODE) {
        this.ROW_UCCODE = ROW_UCCODE;
    }

    public String getROW_UCNAME() {
        return ROW_UCNAME;
    }

    public void setROW_UCNAME(String ROW_UCNAME) {
        this.ROW_UCNAME = ROW_UCNAME;
    }


    public static abstract class ClusterEntry implements BaseColumns {

        public static final String TABLE_NAME = "cluster";
        public static final String ROW_UCCODE = "uccode";
        public static final String ROW_UCNAME = "ucname";
    }
}