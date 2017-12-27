package edu.aku.hassannaqvi.mnch_src2.contract;


import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

public class BLRandomContract {

    private static final String TAG = "BLRandom_CONTRACT";

    private String _ID;
    private String LUID;
    private String subVillageCode; // hh02
    private String structure;  // Structure
    private String sno;
    private String mwname;
    private String randomDT;

    public BLRandomContract() {
    }

    public BLRandomContract(String _ID, String LUID, String subVillageCode, String structure, String sno, String mwname, String randomDT) {
        this._ID = _ID;
        this.LUID = LUID;
        this.subVillageCode = subVillageCode;
        this.structure = structure;
        this.sno = sno;
        this.mwname = mwname;
        this.randomDT = randomDT;
    }

    public BLRandomContract(BLRandomContract rnd) {
        this._ID = rnd.get_ID();
        this.LUID = rnd.getLUID();
        this.sno = rnd.getSno();
        this.subVillageCode = rnd.getSubVillageCode();
        this.structure = rnd.getStructure();
        this.mwname = rnd.getMwname();
        this.randomDT = rnd.getRandomDT();
    }

    public BLRandomContract Sync(JSONObject jsonObject) throws JSONException {
        this._ID = jsonObject.getString(singleRandom.COLUMN_ID);
        this.LUID = jsonObject.getString(singleRandom.COLUMN_LUID);
        this.sno = jsonObject.getString(singleRandom.COLUMN_SNO);
        this.subVillageCode = jsonObject.getString(singleRandom.COLUMN_SUB_VILLAGE_CODE);
        this.structure = jsonObject.getString(singleRandom.COLUMN_STRUCTURE_NO);
        this.randomDT = jsonObject.getString(singleRandom.COLUMN_RANDOMDT);
        this.mwname = jsonObject.getString(singleRandom.COLUMN_MW_NAME);

        return this;
    }

    public BLRandomContract Hydrate(Cursor cursor) {
        this._ID = cursor.getString(cursor.getColumnIndex(singleRandom.COLUMN_ID));
        this.LUID = cursor.getString(cursor.getColumnIndex(singleRandom.COLUMN_LUID));
        this.subVillageCode = cursor.getString(cursor.getColumnIndex(singleRandom.COLUMN_SUB_VILLAGE_CODE));
        this.structure = cursor.getString(cursor.getColumnIndex(singleRandom.COLUMN_STRUCTURE_NO));
        this.sno = cursor.getString(cursor.getColumnIndex(singleRandom.COLUMN_SNO));
        this.randomDT = cursor.getString(cursor.getColumnIndex(singleRandom.COLUMN_RANDOMDT));
        this.mwname = cursor.getString(cursor.getColumnIndex(singleRandom.COLUMN_MW_NAME));

        return this;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    public String getLUID() {
        return LUID;
    }

    public void setLUID(String LUID) {
        this.LUID = LUID;
    }

    public String getSubVillageCode() {
        return subVillageCode;
    }

    public void setSubVillageCode(String subVillageCode) {
        this.subVillageCode = subVillageCode;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getRandomDT() {
        return randomDT;
    }

    public void setRandomDT(String randomDT) {
        this.randomDT = randomDT;
    }

    public String getMwname() {
        return mwname;
    }

    public void setMwname(String mwname) {
        this.mwname = mwname;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(singleRandom.COLUMN_ID, this._ID);
        json.put(singleRandom.COLUMN_LUID, this.LUID);
        json.put(singleRandom.COLUMN_STRUCTURE_NO, this.structure);
        json.put(singleRandom.COLUMN_SUB_VILLAGE_CODE, this.subVillageCode);
        json.put(singleRandom.COLUMN_SNO, this.sno);
        json.put(singleRandom.COLUMN_RANDOMDT, this.randomDT);
        json.put(singleRandom.COLUMN_MW_NAME, this.mwname);

        return json;
    }

    public static abstract class singleRandom implements BaseColumns {

        public static final String TABLE_NAME = "BLRandom";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_RANDOMDT = "randdt";
        public static final String COLUMN_LUID = "uid";
        public static final String COLUMN_SUB_VILLAGE_CODE = "mwvillagecode";
        public static final String COLUMN_STRUCTURE_NO = "mwstructureno";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_MW_NAME = "mw01";
        public static String _URIGET = "bl_random.php";
    }

}