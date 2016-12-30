package edu.aku.hassannaqvi.mnch_src;

/**
 * Created by isd on 30/12/2016.
 */

public class Members1 {
    String vcode;
    String vname;
    String ucname;


    public Members1() {
    }

    public Members1(String vcode, String vname, String ucname) {
        this.vcode = vcode;
        this.vname = vname;
        this.ucname = ucname;
    }


    public String get_ucname() {
        return this.ucname;
    }

    public void set_ucname(String nme) {
        this.ucname = ucname;
    }

    public void SetVcode(String vcode) {
        this.vcode = vcode;
    }

    public String get_vcode() {
        return this.vcode;
    }

    public void SetVname(String vname) {
        this.vname = vname;
    }

}