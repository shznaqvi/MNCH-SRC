package edu.aku.hassannaqvi.mnch_src.other;

/**
 * Created by isd on 09/11/2016.
 */

public class Members {
    String id;
    String nme;
    String sno;

    public Members() {
    }

    public Members(String id, String nme) {
        this.id = id;
        this.nme = nme;
    }


    public String getID() {
        return this.id;
    }

    public String getNME() {
        return this.nme;
    }

    public void SetID(String id) {
        this.id = id;
    }

    public void SetName(String nme) {
        this.nme = nme;
    }
}