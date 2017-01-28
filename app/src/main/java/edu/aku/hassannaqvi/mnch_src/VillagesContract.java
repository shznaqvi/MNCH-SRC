package edu.aku.hassannaqvi.mnch_src;

import android.provider.BaseColumns;

/**
 * Created by isd on 30/12/2016.
 */

import android.database.Cursor;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 10/31/2016.
 */

public class VillagesContract {

    private String villagesCode;
    private String villagesName;
    private String districtCode;


    public VillagesContract() {
    }

    public VillagesContract sync(JSONObject jsonObject) throws JSONException {
        this.villagesCode = jsonObject.getString(singleVillages.COLUMN_VILLAGES_CODE);
        this.villagesName = jsonObject.getString(singleVillages.COLUMN_VILLAGES_NAME);
        this.districtCode = jsonObject.getString(singleVillages.COLUMN_DISTRICT_CODE);


        return this;
    }

    public VillagesContract hydrate(Cursor cursor) {
        this.villagesCode = cursor.getString(cursor.getColumnIndex(singleVillages.COLUMN_VILLAGES_CODE));
        this.villagesName = cursor.getString(cursor.getColumnIndex(singleVillages.COLUMN_VILLAGES_NAME));
        this.districtCode = cursor.getString(cursor.getColumnIndex(singleVillages.COLUMN_DISTRICT_CODE));

        return this;
    }

    public String getVILLAGESCode() {
        return villagesCode;
    }

    public void setVILLAGESCode(String villagesCode) {
        this.villagesCode = villagesCode;
    }

    public String getVILLAGESName() {
        return villagesName;
    }

    public void setVILLAGESName(String villagesName) {
        this.villagesName = villagesName;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public static abstract class singleVillages implements BaseColumns {

        public static final String TABLE_NAME = "Villages";
        public static final String COLUMN_NAME_NULLABLE = "nullColumnHack";
        public static final String _ID = "_ID";
        public static final String COLUMN_VILLAGES_CODE = "villages_code";
        public static final String COLUMN_VILLAGES_NAME = "villages_name";
        public static final String COLUMN_DISTRICT_CODE = "district_code";

    }

}