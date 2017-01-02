package edu.aku.hassannaqvi.mnch_src;

/**
 * Created by isd on 24/10/2016.
 */

public class CVars {
    public static String myuser;
    public static String url_sync_users;
    public static int repro_age_woman;
    public static String hhno;
    public static String hhcode;
    public static String isadmin;

    public static String url_sync_hf;
    public static String url_sync_lhw;
    public static String url_sync_usr;
    public static String url_sync_sec1;


    public String getUrl_sync_usr() {
        return url_sync_usr;
    }

    public void setUrl_sync_usr(String url_sync_usr) {
        CVars.url_sync_usr = url_sync_usr;
    }

    public String getUrl_sync_hf() {
        return url_sync_hf;
    }

    public void setUrl_sync_hf(String url_sync_hf) {
        CVars.url_sync_hf = url_sync_hf;
    }

    public String getUrl_sync_lhw() {
        return url_sync_lhw;
    }


    public void setUrl_sync_lhw(String url_sync_lhw) {
        CVars.url_sync_lhw = url_sync_lhw;
    }

    public String get_url_sync_sec1() {
        return url_sync_sec1;
    }

    public void set_url_sync_sec1(String url_sync_sec1) {
        CVars.url_sync_sec1 = url_sync_sec1;
    }

    public void Store_isadmin(String isadmin) {
        CVars.isadmin = isadmin;
    }

    public String Get_isadmin() {
        return isadmin;
    }


    public void StoreHHNO(String hhno) {
        CVars.hhno = hhno;
    }

    public String GetHHNO() {
        return hhno;
    }

    public void StoreHHCode(String hhcode) {
        CVars.hhcode = hhcode;
    }

    public String GetHHCode() {
        return hhcode;
    }

    public void StoreUser(String Users) {
        myuser = Users;
    }

    public String GetUser() {
        return myuser;
    }

    public String getUrl_sync_users() {
        return url_sync_users;
    }

    public void setUrl_sync_users(String url_sync_users) {
        CVars.url_sync_users = url_sync_users;
    }

    public void StoreReporductionAgeWoman(int repro_age_woman) {
        CVars.repro_age_woman = repro_age_woman;
    }

    public int GetReproductionAgeWoman() {
        return repro_age_woman;
    }
}