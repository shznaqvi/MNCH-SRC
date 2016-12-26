package edu.aku.hassannaqvi.mnch_src;

/**
 * Created by isd on 24/10/2016.
 */

public class CVars {
    public static String myuser;
    public static String url_sync_users;
    public static int repro_age_woman;


    public void StoreUser(String Users) {
        this.myuser = Users;
    }

    public String GetUser() {
        return this.myuser;
    }

    public void setUrl_sync_users(String url_sync_users) {
        this.url_sync_users = url_sync_users;
    }

    public String getUrl_sync_users() {
        return url_sync_users;
    }

    public void StoreReporductionAgeWoman(int repro_age_woman) {
        this.repro_age_woman = repro_age_woman;
    }

    public int GetReproductionAgeWoman() {
        return this.repro_age_woman;
    }
}