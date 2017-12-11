package edu.aku.hassannaqvi.mnch_src.contract;

import android.provider.BaseColumns;

/**
 * Created by isd on 20/10/2016.
 */
public class UsersContract implements BaseColumns {
    private static final String TAG = "Users_CONTRACT";
    Long _ID;
    String ROW_USERNAME;
    String ROW_PASSWORD;
    String ROW_USERSTATUS;
    String ROW_ISADMIN;

    public UsersContract() {
        // Default Constructor
    }

    public UsersContract(String username, String password, String userstatus, String isadmin) {
        this.ROW_PASSWORD = password;
        this.ROW_USERNAME = username;
        this.ROW_USERSTATUS = userstatus;
        this.ROW_ISADMIN = isadmin;
    }

    public Long getUserID() {
        return this._ID;
    }

    public void setId(int id) {
        this._ID = Long.valueOf(id);
    }

    public String getUserName() {
        return this.ROW_USERNAME;
    }

    public void setUserName(String username) {
        this.ROW_USERNAME = username;
    }

    public String getPassword() {
        return this.ROW_PASSWORD;
    }

    public void setPassword(String password) {
        this.ROW_PASSWORD = password;
    }

    public String getUserStatus() {
        return this.ROW_USERSTATUS;
    }

    public void setUserStatus(String userstatus) {
        this.ROW_USERSTATUS = userstatus;
    }

    public String getIsAdmin() {
        return this.ROW_ISADMIN;
    }

    public void setIsAdmin(String isadmin) {
        this.ROW_ISADMIN = isadmin;
    }

    public static abstract class singleUser implements BaseColumns {

        public static final String TABLE_NAME = "Users";
        public static final String _ID = "_ID";
        public static final String ROW_USERNAME = "USERNAME";
        public static final String ROW_PASSWORD = "PASSWORD";
        public static final String ROW_USERSTATUS = "USERSTATUS";
        public static final String ROW_ISADMIN = "ISADMIN";

    }
}