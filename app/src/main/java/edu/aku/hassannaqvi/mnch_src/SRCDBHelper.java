package edu.aku.hassannaqvi.mnch_src;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import edu.aku.hassannaqvi.mnch_src.DistrictsContract.singleDistrict;
import edu.aku.hassannaqvi.mnch_src.FormContract.Sec1Entry;
import edu.aku.hassannaqvi.mnch_src.Sec3Contract.Sec3Entry;
import edu.aku.hassannaqvi.mnch_src.Sec4aContract.Section4Entry;
import edu.aku.hassannaqvi.mnch_src.Sec4bContract.Section4bEntry;
import edu.aku.hassannaqvi.mnch_src.Sec7ImContract.single7Im;
import edu.aku.hassannaqvi.mnch_src.UsersContract.singleUser;
import edu.aku.hassannaqvi.mnch_src.VillagesContract.singleVillages;


/**
 * Created by isd on 20/10/2016.
 */
public class SRCDBHelper extends SQLiteOpenHelper {

    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersContract.singleUser.TABLE_NAME + "("
            + UsersContract.singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.singleUser.ROW_USERNAME + " TEXT,"
            + UsersContract.singleUser.ROW_PASSWORD + " TEXT,"
            + UsersContract.singleUser.ROW_USERSTATUS + " TEXT,"
            + UsersContract.singleUser.ROW_ISADMIN + " TEXT);";
    public static final String SQL_CREATE_BASELINE_SEC1 = "CREATE TABLE " + Sec1Entry.TABLE_NAME + "("
            + Sec1Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Sec1Entry.ROW_DEVID + " TEXT,"
            + Sec1Entry.ROW_FORM_ID + " TEXT,"
            + Sec1Entry.ROW_S1Q101 + " TEXT,"
            + Sec1Entry.ROW_S1Q102 + " TEXT,"
            + Sec1Entry.ROW_S1Q103 + " TEXT,"
            + Sec1Entry.ROW_S1Q104 + " TEXT,"
            + Sec1Entry.ROW_S1Q105 + " TEXT,"
            + Sec1Entry.ROW_S1Q106a + " TEXT,"
            + Sec1Entry.ROW_S1Q106b + " TEXT,"
            + Sec1Entry.ROW_S1Q107 + " TEXT,"
            + Sec1Entry.ROW_S1Q108 + " TEXT,"
            + Sec1Entry.ROW_S1Q108b + " TEXT,"
            + Sec1Entry.ROW_S1Q110 + " TEXT,"
            + Sec1Entry.ROW_S1Q111 + " TEXT,"
            + Sec1Entry.ROW_S1Q111OTH + " TEXT,"
            + Sec1Entry.ROW_S1Q112 + " TEXT,"
            + Sec1Entry.ROW_S2 + " TEXT,"
            + Sec1Entry.ROW_S3 + " TEXT,"
            + Sec1Entry.ROW_S4 + " TEXT,"
            + Sec1Entry.ROW_S5 + " TEXT,"
            + Sec1Entry.ROW_S5b + " TEXT,"
            + Sec1Entry.ROW_S5c + " TEXT,"
            + Sec1Entry.ROW_S6 + " TEXT,"
            + Sec1Entry.ROW_S7 + " TEXT,"
            + Sec1Entry.ROW_S8 + " TEXT,"
            + Sec1Entry.ROW_UUID + " TEXT,"
            + Sec1Entry.ROW_GPS_LNG + " TEXT,"
            + Sec1Entry.ROW_GPS_LAT + " TEXT,"
            + Sec1Entry.ROW_GPS_DT + " TEXT,"
            + Sec1Entry.ROW_GPS_ACC + " TEXT,"
            + Sec1Entry.COLUMN_SYNCED + " TEXT,"
            + Sec1Entry.COLUMN_SYNCED_DATE + " TEXT,"
            + Sec1Entry.ROW_ENTRYDATE + " TEXT,"
            + Sec1Entry.ROW_USERID + " TEXT);";
    public static final String SQL_CREATE_BASELINE_SEC3 = "CREATE TABLE " + Sec3Entry.TABLE_NAME + "("
            + Sec3Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            Sec3Entry.ROW_DEVID + " TEXT," +
            Sec3Entry.ROW_FORM_ID + " TEXT," +
            Sec3Entry.ROW_FORM_DATE + " TEXT," +
            Sec3Entry.ROW_USERID + " TEXT," +
            Sec3Entry.ROW_HHCODE + " TEXT," +
            Sec3Entry.ROW_SNO + " TEXT," +
            Sec3Entry.ROW_S3Q301A + " TEXT," +
            Sec3Entry.ROW_S3Q301B + " TEXT," +
            Sec3Entry.ROW_S3Q301C + " TEXT," +
            Sec3Entry.ROW_S3Q301D + " TEXT," +
            Sec3Entry.ROW_S3Q301E + " TEXT," +
            Sec3Entry.ROW_S3Q301F1 + " TEXT," +
            Sec3Entry.ROW_S3Q301F + " TEXT," +
            Sec3Entry.ROW_S3Q301G + " TEXT," +
            Sec3Entry.ROW_S3Q301H + " TEXT," +
            Sec3Entry.ROW_S3Q301I + " TEXT," +
            Sec3Entry.ROW_S3Q301J + " TEXT," +
            Sec3Entry.ROW_S3Q301K + " TEXT," +
            Sec3Entry.ROW_S3Q301L + " TEXT," +
            Sec3Entry.ROW_UUID + " TEXT," +
            Sec3Entry.ROW_UID + " TEXT," +
            Sec3Entry.ROW_SYNCED + " TEXT," +
            Sec3Entry.ROW_SYNCED_DATE + " TEXT" +

            ");";
    public static final String SQL_CREATE_BASELINE_SEC4 = "CREATE TABLE " + Section4Entry.TABLE_NAME + "("
            + Section4Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Section4Entry.ROW_DEVID + " TEXT," +
            Section4Entry.ROW_FORM_ID + " TEXT," +
            Section4Entry.ROW_FORM_DATE + " TEXT," +
            Section4Entry.ROW_USERID + " TEXT," +
            Section4Entry.ROW_HHCODE + " TEXT," +
            Section4Entry.ROW_SNO + " TEXT," +
            Section4Entry.ROW_S4Q41A + " TEXT," +
            Section4Entry.ROW_S4Q41B + " TEXT," +
            Section4Entry.ROW_S4Q41B1 + " TEXT," +
            Section4Entry.ROW_S4Q41B2 + " TEXT," +
            Section4Entry.ROW_S4Q41C + " TEXT," +
            Section4Entry.ROW_S4Q41D + " TEXT," +
            Section4Entry.ROW_S4Q41E + " TEXT," +
            Section4Entry.ROW_UID + " TEXT," +
            Section4Entry.ROW_UUID + " TEXT," +
            Section4Entry.ROW_SYNCED + " TEXT," +
            Section4Entry.ROW_SYNCED_DATE + " TEXT"

            + ");";
    public static final String SQL_CREATE_BASELINE_SEC4b = "CREATE TABLE IF NOT EXISTS " + Section4bEntry.TABLE_NAME + "("
            + single7Im._ID + " TEXT," +
            single7Im.ROW_DEVID + " TEXT," +
            single7Im.ROW_ENTRYDATE + " TEXT," +
            single7Im.ROW_USERID + " TEXT," +
            single7Im.ROW_UUID + " TEXT," +
            single7Im.ROW_UID + " TEXT," +
            single7Im.HOUSEHOLD + " TEXT," +
            single7Im.ROW_7IM + " TEXT," +
            single7Im.ROW_GPS_LNG + " TEXT," +
            single7Im.ROW_GPS_LAT + " TEXT," +
            single7Im.ROW_GPS_DT + " TEXT," +
            single7Im.ROW_GPS_ACC + " TEXT," +
            single7Im.ROW_SYNCED + " TEXT," +
            single7Im.ROW_SYNCED_DATE + " TEXT," +

            ");";

    public static final String SQL_CREATE_SEC_7_IM = "CREATE TABLE IF NOT EXISTS " + single7Im.TABLE_NAME + "("
            + single7Im._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + single7Im.ROW_DEVID + " TEXT,"
            + single7Im.ROW_ENTRYDATE + " TEXT,"
            + single7Im.ROW_USERID + " TEXT,"
            + single7Im.ROW_UUID + " TEXT,"
            + single7Im.HOUSEHOLD + " TEXT,"
            + single7Im.ROW_7IM + " TEXT,"
            + single7Im.ROW_GPS_LNG + " TEXT,"
            + single7Im.ROW_GPS_LAT + " TEXT,"
            + single7Im.ROW_GPS_DT + " TEXT,"
            + single7Im.ROW_GPS_ACC + " TEXT,"
            + single7Im.ROW_UID + " TEXT,"
            + single7Im.ROW_UUID + " TEXT,"
            + single7Im.ROW_SYNCED + " TEXT,"
            + single7Im.ROW_SYNCED_DATE + " TEXT"
            + ");";
    private static final String TAG = "Sec1";
    private static final String DATABASE_NAME = "src.db";
    private static final int DATABASE_VERSION = 2;
    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + singleUser.TABLE_NAME;
    private static final String SQL_DELETE_DISTRICTS =
            "DROP TABLE IF EXISTS " + singleDistrict.TABLE_NAME;
    private static final String SQL_DELETE_VILLAGES =
            "DROP TABLE IF EXISTS " + singleVillages.TABLE_NAME;
    private static final String SQL_DELETE_SEC1 =
            "DROP TABLE IF EXISTS " + Sec1Entry.TABLE_NAME;
    private static final String SQL_DELETE_SEC3 =
            "DROP TABLE IF EXISTS " + Sec3Entry.TABLE_NAME;
    private static final String SQL_DELETE_SEC4 =
            "DROP TABLE IF EXISTS " + Section4Entry.TABLE_NAME;
    private static final String SQL_DELETE_SEC4B =
            "DROP TABLE IF EXISTS " + Section4bEntry.TABLE_NAME;
    private static final String SQL_DELETE_SEC7IM =
            "DROP TABLE IF EXISTS " + single7Im.TABLE_NAME;
    final String SQL_CREATE_DISTRICT_TABLE = "CREATE TABLE " + singleDistrict.TABLE_NAME + " (" +
            singleDistrict._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            singleDistrict.COLUMN_DISTRICT_CODE + " TEXT, " +
            singleDistrict.COLUMN_DISTRICT_NAME + " TEXT " +
            ");";
    final String SQL_CREATE_VILLAGES_TABLE = "CREATE TABLE " + singleVillages.TABLE_NAME + " (" +
            singleVillages._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            singleVillages.COLUMN_VILLAGES_CODE + " TEXT, " +
            singleVillages.COLUMN_VILLAGES_NAME + " TEXT, " +
            singleVillages.COLUMN_DISTRICT_CODE + " TEXT " +
            ");";


    SRCDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_DISTRICT_TABLE);
        db.execSQL(SQL_CREATE_VILLAGES_TABLE);
        db.execSQL(SQL_CREATE_BASELINE_SEC1);
        db.execSQL(SQL_CREATE_BASELINE_SEC3);
        db.execSQL(SQL_CREATE_BASELINE_SEC4);
        db.execSQL(SQL_CREATE_BASELINE_SEC4b);
        db.execSQL(SQL_CREATE_SEC_7_IM);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_USERS);
        db.execSQL(SQL_DELETE_DISTRICTS);
        db.execSQL(SQL_DELETE_VILLAGES);
        db.execSQL(SQL_DELETE_SEC1);
        db.execSQL(SQL_DELETE_SEC3);
        db.execSQL(SQL_DELETE_SEC4);
        db.execSQL(SQL_DELETE_SEC4B);
        db.execSQL(SQL_DELETE_SEC7IM);

        onCreate(db);
    }

    public Collection<DistrictsContract> getAllDistricts() {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleDistrict._ID,
                singleDistrict.COLUMN_DISTRICT_CODE,
                singleDistrict.COLUMN_DISTRICT_NAME
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                singleDistrict._ID + " ASC";

        Collection<DistrictsContract> allDC = new ArrayList<DistrictsContract>();
        try {
            c = db.query(
                    singleDistrict.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                DistrictsContract dc = new DistrictsContract();
                allDC.add(dc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allDC;
    }

    public Collection<VillagesContract> getAllVillagesByDistrict(String district_code) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleVillages._ID,
                singleVillages.COLUMN_VILLAGES_CODE,
                singleVillages.COLUMN_VILLAGES_NAME,
                singleVillages.COLUMN_DISTRICT_CODE
        };

        String whereClause = singleVillages.COLUMN_DISTRICT_CODE + " = ?";
        String[] whereArgs = {district_code};
        String groupBy = null;
        String having = null;

        String orderBy =
                singleVillages.COLUMN_VILLAGES_CODE + " ASC";

        Collection<VillagesContract> allPC = new ArrayList<VillagesContract>();
        try {
            c = db.query(
                    singleVillages.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                VillagesContract pc = new VillagesContract();
                allPC.add(pc.hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allPC;
    }

    public void syncDistrict(JSONArray dcList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(singleDistrict.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = dcList;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectDistrict = jsonArray.getJSONObject(i);

                DistrictsContract dc = new DistrictsContract();
                dc.sync(jsonObjectDistrict);

                ContentValues values = new ContentValues();

                values.put(singleDistrict.COLUMN_DISTRICT_CODE, dc.getDistrictCode());
                values.put(singleDistrict.COLUMN_DISTRICT_NAME, dc.getDistrictName());

                db.insert(singleDistrict.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {

        }
    }

    public void syncVILLAGES(JSONArray pcList) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(singleVillages.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = pcList;

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectVILLAGES = jsonArray.getJSONObject(i);

                VillagesContract vc = new VillagesContract();
                vc.sync(jsonObjectVILLAGES);

                ContentValues values = new ContentValues();

                values.put(singleVillages.COLUMN_VILLAGES_CODE, vc.getVILLAGESCode());
                values.put(singleVillages.COLUMN_VILLAGES_NAME, vc.getVILLAGESName());
                values.put(singleVillages.COLUMN_DISTRICT_CODE, vc.getDistrictCode());

                db.insert(singleVillages.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {

        }
    }


    public void addUser(UsersContract userscontract) {
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(UsersContract.singleUser.ROW_USERNAME, userscontract.getUserName());
            values.put(UsersContract.singleUser.ROW_PASSWORD, userscontract.getPassword());
            values.put(UsersContract.singleUser.ROW_USERSTATUS, userscontract.getUserStatus());
            values.put(UsersContract.singleUser.ROW_ISADMIN, userscontract.getIsAdmin());

            db.insert(UsersContract.singleUser.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }
    }

    public void syncUser(JSONArray userlist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(UsersContract.singleUser.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = userlist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String userName = jsonObjectUser.getString("username");
                String password = jsonObjectUser.getString("password");
                String userstatus = jsonObjectUser.getString("userstatus");
                String isadmin = jsonObjectUser.getString("isadmin");

                ContentValues values = new ContentValues();

                values.put(UsersContract.singleUser.ROW_USERNAME, userName);
                values.put(UsersContract.singleUser.ROW_PASSWORD, password);
                values.put(UsersContract.singleUser.ROW_USERSTATUS, userstatus);
                values.put(UsersContract.singleUser.ROW_ISADMIN, isadmin);

                db.insert(UsersContract.singleUser.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }


    public int getSNO() {
        SQLiteDatabase db = this.getReadableDatabase();
        int sno = 0;
        try {

            CVars var = new CVars();
            String QUERY = "SELECT * FROM " + Sec3Entry.TABLE_NAME + " WHERE formid = '"
                    + var.GetHHNO() + "'";

            Cursor cursor = db.rawQuery(QUERY, null);
            sno = cursor.getCount();
            db.close();
        } catch (Exception e) {
        }
        return sno;
    }


    public int getSNO1() {
        SQLiteDatabase db = this.getReadableDatabase();
        int sno = 0;
        try {

            CVars var = new CVars();
            String QUERY = "SELECT * FROM " + Section4Entry.TABLE_NAME + " WHERE formid = '"
                    + var.GetHHNO() + "'";

            Cursor cursor = db.rawQuery(QUERY, null);
            sno = cursor.getCount();
            db.close();
        } catch (Exception e) {
        }
        return sno;
    }


    public int getSNO2() {
        SQLiteDatabase db = this.getReadableDatabase();
        int sno = 0;
        try {

            CVars var = new CVars();
            String QUERY = "SELECT * FROM " + Section4bEntry.TABLE_NAME + " WHERE formid = '"
                    + var.GetHHNO() + "'";

            Cursor cursor = db.rawQuery(QUERY, null);
            sno = cursor.getCount();
            db.close();
        } catch (Exception e) {
        }
        return sno;
    }


    public ArrayList<UsersContract> getAllUsers() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<UsersContract> userList = null;
        try {
            userList = new ArrayList<UsersContract>();
            String QUERY = "SELECT * FROM " + UsersContract.singleUser.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    UsersContract user = new UsersContract();
                    user.setId(cursor.getInt(0));
                    user.setUserName(cursor.getString(1));
                    user.setPassword(cursor.getString(2));
                    user.setUserStatus(cursor.getString(3));
                    user.setIsAdmin(cursor.getString(4));

                    userList.add(user);
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }

    public ArrayList<String> getAllUsersArray() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<String> userList = null;
        try {
            userList = new ArrayList<String>();
            String QUERY = "SELECT * FROM " + UsersContract.singleUser.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();
            if (!cursor.isLast()) {
                while (cursor.moveToNext())
                    userList.add(cursor.getString(1));

                db.close();
            }
        } catch (Exception e) {
        }
        return userList;
    }


    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"mesage"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);


        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);


            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {


                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }
    }


    public boolean Login(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();
        boolean isexists = false;
        String isadmin = "";
        String status = "";

        CVars var = new CVars();


        Cursor mCursor = db.rawQuery("SELECT * FROM " + UsersContract.singleUser.TABLE_NAME + " WHERE " +
                UsersContract.singleUser.ROW_USERNAME + "=? AND " +
                UsersContract.singleUser.ROW_PASSWORD + "=? AND " +
                UsersContract.singleUser.ROW_USERSTATUS + "=?", new String[]{username, password, "1"}, null);

        if (mCursor.getCount() < 0) {
            isexists = false;

        } else {

            if (mCursor.moveToFirst()) {

                status = mCursor.getString(3);
                isadmin = mCursor.getString(4);
                var.Store_isadmin(isadmin);


                isexists = status.equals("1");
            }
        }

        mCursor.close();

        return isexists;
    }


    public boolean Login1(String username, String password) throws SQLException {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor mCursor = db.rawQuery("SELECT * FROM " + UsersContract.singleUser.TABLE_NAME + " WHERE " + UsersContract.singleUser.ROW_USERNAME + "=? AND " + UsersContract.singleUser.ROW_PASSWORD + "=?", new String[]{username, password});
        if (mCursor != null) {
            if (mCursor.getCount() > 0) {
                return true;
            }
        }
        return false;
    }


    /*****************************
     * Section 1
     ***************************/

    public Long InsertRecord(FormContract fc) {
        long newRowId = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(Sec1Entry.ROW_DEVID, fc.getROW_DEVID());
            values.put(Sec1Entry.ROW_FORM_ID, fc.getROW_FORM_ID());
            values.put(Sec1Entry.ROW_S1Q101, fc.getROW_S1Q101());
            values.put(Sec1Entry.ROW_S1Q102, fc.getROW_S1Q102());
            values.put(Sec1Entry.ROW_S1Q103, fc.getROW_S1Q103());
            values.put(Sec1Entry.ROW_S1Q104, fc.getROW_S1Q104());
            values.put(Sec1Entry.ROW_S1Q105, fc.getROW_S1Q105());
            values.put(Sec1Entry.ROW_S1Q106a, fc.getROW_S1Q106a());
            values.put(Sec1Entry.ROW_S1Q106b, fc.getROW_S1Q106b());
            values.put(Sec1Entry.ROW_S1Q107, fc.getROW_S1Q107());
            values.put(Sec1Entry.ROW_S1Q108, fc.getROW_S1Q108());
            values.put(Sec1Entry.ROW_S1Q108b, fc.getROW_S1Q108b());
            values.put(Sec1Entry.ROW_S1Q110, fc.getROW_S1Q110());
            values.put(Sec1Entry.ROW_S1Q111, fc.getROW_S1Q111());
            values.put(Sec1Entry.ROW_S1Q111OTH, fc.getROW_S1Q111oth());
            values.put(Sec1Entry.ROW_S1Q112, fc.getROW_S1Q112());
            values.put(Sec1Entry.ROW_GPS_LAT, fc.getROW_GPS_LAT());
            values.put(Sec1Entry.ROW_GPS_LNG, fc.getROW_GPS_LANG());
            values.put(Sec1Entry.ROW_GPS_ACC, fc.getROW_GPS_ACC());
            values.put(Sec1Entry.ROW_GPS_DT, fc.getROW_GPS_DT());
            // No need to update SYNC fields in this function

            newRowId = db.insert(Sec1Entry.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }

        return newRowId;
    }


    public Long InsertRecord_Section3(Sec3Contract sec3) {
        long newRowId = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(Sec3Entry.ROW_DEVID, sec3.getROW_DEVID());
            values.put(Sec3Entry.ROW_FORM_ID, sec3.getROW_FORM_ID());
            values.put(Sec3Entry.ROW_FORM_DATE, sec3.getROW_FORM_DATE());
            values.put(Sec3Entry.ROW_HHCODE, sec3.getROW_HHCODE());
            values.put(Sec3Entry.ROW_SNO, sec3.getROW_SNO());
            values.put(Sec3Entry.ROW_s3q301a, sec3.get_s3q301a());
            values.put(Sec3Entry.ROW_s3q301b, sec3.get_s3q301b());
            values.put(Sec3Entry.ROW_s3q301c, sec3.get_s3q301c());
            values.put(Sec3Entry.ROW_s3q301d, sec3.get_s3q301d());
            values.put(Sec3Entry.ROW_s3q301f1, sec3.get_s3q301f1());
            values.put(Sec3Entry.ROW_s3q301e, sec3.get_s3q301e());
            values.put(Sec3Entry.ROW_s3q301f, sec3.get_s3q301f());
            values.put(Sec3Entry.ROW_s3q301g, sec3.get_s3q301g());
            values.put(Sec3Entry.ROW_s3q301h, sec3.get_s3q301h());
            values.put(Sec3Entry.ROW_s3q301i, sec3.get_s3q301i());
            values.put(Sec3Entry.ROW_s3q301j, sec3.get_s3q301j());
            values.put(Sec3Entry.ROW_s3q301k, sec3.get_s3q301k());
            values.put(Sec3Entry.ROW_UUID, SRCApp.fc.getROW_UUID()); // get primary key of main Form UUID
            values.put(Sec3Entry.ROW_UID, sec3.getROW_UID());
            // No need to update SYNC fields in this function

            newRowId = db.insert(Sec3Entry.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }

        return newRowId;
    }


    public Long InsertRecord_Section4a(Sec4aContract sec4a) {
        long newRowId = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(Section4Entry.ROW_DEVID, sec4a.get_DEVID());
            values.put(Section4Entry.ROW_FORM_ID, sec4a.get_FORM_ID());
            values.put(Section4Entry.ROW_FORM_DATE, sec4a.get_FORM_DATE());
            values.put(Section4Entry.ROW_HHCODE, sec4a.get_HHCODE());

            values.put(Section4Entry.ROW_SNO, sec4a.get_SNO());

            values.put(Section4Entry.ROW_S4Q41A, sec4a.get_s4q41a());
            values.put(Section4Entry.ROW_S4Q41B, sec4a.get_s4q41b());
            values.put(Section4Entry.ROW_S4Q41B1, sec4a.get_s4q41b1());
            values.put(Section4Entry.ROW_S4Q41B2, sec4a.get_s4q41b2());
            values.put(Section4Entry.ROW_S4Q41C, sec4a.get_s4q41c());
            values.put(Section4Entry.ROW_S4Q41D, sec4a.get_s4q41d());
            values.put(Section4Entry.ROW_S4Q41E, sec4a.get_s4q41e());
            values.put(Section4Entry.ROW_UID, sec4a.get_UID());
            values.put(Section4Entry.ROW_UUID, SRCApp.fc.getROW_UUID());
            // No need to update SYNC fields in this function

            newRowId = db.insert(Section4Entry.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }

        return newRowId;
    }


    public Long InsertRecord_Section4b(Sec4bContract sec4b) {
        long newRowId = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(Section4bEntry.ROW_DEVID, sec4b.getROW_DEVID());
            values.put(Section4bEntry.ROW_FORM_ID, sec4b.getROW_FORM_ID());
            values.put(Section4bEntry.ROW_FORM_DATE, sec4b.getROW_FORM_DATE());
            values.put(Section4bEntry.ROW_HHCODE, sec4b.getROW_HHCODE());

            values.put(Section4bEntry.ROW_SNO, sec4b.get_sno());

            values.put(Section4bEntry.ROW_s4q42a, sec4b.get_s4q42a());
            values.put(Section4bEntry.ROW_s4q42b, sec4b.get_s4q42b());
            values.put(Section4bEntry.ROW_s4q42c, sec4b.get_s4q42c());
            values.put(Section4bEntry.ROW_s4q42d, sec4b.get_s4q42d());
            values.put(Section4bEntry.ROW_s4q42d1, sec4b.get_s4q42d1());
            values.put(Section4bEntry.ROW_s4q42d2, sec4b.get_s4q42d2());
            values.put(Section4bEntry.ROW_s4q42e, sec4b.get_s4q42e());
            values.put(Section4bEntry.ROW_s4q42eoth, sec4b.get_s4q42eoth());
            values.put(Section4bEntry.ROW_s4q42f, sec4b.get_s4q42f());
            values.put(Section4bEntry.ROW_UID, SRCApp.fc.getROW_UUID());
            values.put(Section4bEntry.ROW_UUID, sec4b.getROW_UUID());
            values.put(Section4bEntry.ROW_SYNCED, sec4b.getROW_SYNCED());
            values.put(Section4bEntry.ROW_SYNCED_DATE, sec4b.getROW_SYNCED_DATE());

            newRowId = db.insert(Section4bEntry.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }

        return newRowId;
    }


    public int updateS2() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_S2, SRCApp.fc.getROW_S2());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }


    public int updateS3() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_S3, SRCApp.fc.getROW_S3());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateS5() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_S5, SRCApp.fc.getROW_S5());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateS5b() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_S5b, SRCApp.fc.getROW_S5b());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateS5c() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_S5c, SRCApp.fc.getROW_S5c());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateS6() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_S6, SRCApp.fc.getROW_S6());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public int updateS7() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_S7, SRCApp.fc.getROW_S7());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public Long addSec7Im(Sec7ImContract sec7Im) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(single7Im._ID, sec7Im.get_ID());
        values.put(single7Im.ROW_DEVID, sec7Im.getROW_DEVID());
        values.put(single7Im.ROW_ENTRYDATE, sec7Im.getROW_ENTRYDATE());
        values.put(single7Im.ROW_USERID, sec7Im.getROW_USERID());
        values.put(single7Im.ROW_UUID, sec7Im.getROW_UUID());
        values.put(single7Im.ROW_UID, sec7Im.getROW_UID());
        values.put(single7Im.HOUSEHOLD, sec7Im.getHousehold());
        values.put(single7Im.ROW_7IM, sec7Im.getROW_7IM());
        values.put(single7Im.ROW_GPS_LNG, sec7Im.getROW_GPS_LNG());
        values.put(single7Im.ROW_GPS_LAT, sec7Im.getROW_GPS_LAT());
        values.put(single7Im.ROW_GPS_DT, sec7Im.getROW_GPS_DT());
        values.put(single7Im.ROW_GPS_ACC, sec7Im.getROW_GPS_ACC());
        values.put(single7Im.ROW_SYNCED, sec7Im.getROW_SYNCED());
        values.put(single7Im.ROW_SYNCED_DATE, sec7Im.getROW_SYNCED_DATE());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                single7Im.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    public Long addSec3(Sec3Contract sec3) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(Sec3Entry._ID, sec3.get_ID());
        values.put(Sec3Entry.ROW_DEVID, sec3.getROW_DEVID());
        values.put(Sec3Entry.ROW_FORM_ID, sec3.getROW_FORM_ID());
        values.put(Sec3Entry.ROW_FORM_DATE, sec3.getROW_FORM_DATE());
        values.put(Sec3Entry.ROW_USERID, sec3.getROW_USERID());
        values.put(Sec3Entry.ROW_HHCODE, sec3.getROW_HHCODE());
        values.put(Sec3Entry.ROW_SNO, sec3.getROW_SNO());
        values.put(Sec3Entry.ROW_S3Q301A, sec3.get_s3q301a());
        values.put(Sec3Entry.ROW_S3Q301B, sec3.get_s3q301b());
        values.put(Sec3Entry.ROW_S3Q301C, sec3.get_s3q301c());
        values.put(Sec3Entry.ROW_S3Q301D, sec3.get_s3q301d());
        values.put(Sec3Entry.ROW_S3Q301E, sec3.get_s3q301e());
        values.put(Sec3Entry.ROW_S3Q301F1, sec3.get_s3q301f1());
        values.put(Sec3Entry.ROW_S3Q301F, sec3.get_s3q301f());
        values.put(Sec3Entry.ROW_S3Q301G, sec3.get_s3q301g());
        values.put(Sec3Entry.ROW_S3Q301H, sec3.get_s3q301h());
        values.put(Sec3Entry.ROW_S3Q301I, sec3.get_s3q301i());
        values.put(Sec3Entry.ROW_S3Q301J, sec3.get_s3q301j());
        values.put(Sec3Entry.ROW_S3Q301K, sec3.get_s3q301k());
        values.put(Sec3Entry.ROW_S3Q301L, sec3.get_s3q301l());
        values.put(Sec3Entry.ROW_UUID, sec3.getROW_UUID());
        values.put(Sec3Entry.ROW_UID, sec3.getROW_UID());
        values.put(Sec3Entry.ROW_SYNCED, sec3.getROW_SYNCED());
        values.put(Sec3Entry.ROW_SYNCED_DATE, sec3.getROW_SYNCED_DATE());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                Sec3Entry.TABLE_NAME,
                null,
                values);

        return newRowId;
    }


    public Long addSec4b(Sec4bContract sec4b) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(Section4bEntry._ID, sec4b.get_ID());
        values.put(Section4bEntry.ROW_DEVID, sec4b.getROW_DEVID());
        values.put(Section4bEntry.ROW_FORM_ID, sec4b.getROW_FORM_ID());
        values.put(Section4bEntry.ROW_FORM_DATE, sec4b.getROW_FORM_DATE());
        values.put(Section4bEntry.ROW_HHCODE, sec4b.getROW_HHCODE());
        values.put(Section4bEntry.ROW_USERID, sec4b.getROW_USERID());
        values.put(Section4bEntry.ROW_SNO, sec4b.getROW_SNO());
        values.put(Section4bEntry.ROW_S4Q42A, sec4b.get_s4q42a());
        values.put(Section4bEntry.ROW_S4Q42B, sec4b.get_s4q42b());
        values.put(Section4bEntry.ROW_S4Q42C, sec4b.get_s4q42c());
        values.put(Section4bEntry.ROW_S4Q42D, sec4b.get_s4q42d());
        values.put(Section4bEntry.ROW_S4Q42D1, sec4b.get_s4q42d1());
        values.put(Section4bEntry.ROW_S4Q42D2, sec4b.get_s4q42d2());
        values.put(Section4bEntry.ROW_S4Q42E, sec4b.get_s4q42e());
        values.put(Section4bEntry.ROW_S4Q42EOTH, sec4b.get_s4q42eoth());
        values.put(Section4bEntry.ROW_S4Q42F, sec4b.get_s4q42f());
        values.put(Section4bEntry.ROW_UID, sec4b.getROW_UID());
        values.put(Section4bEntry.ROW_UUID, sec4b.getROW_UUID());
        values.put(Section4bEntry.ROW_SYNCED, sec4b.getROW_SYNCED());
        values.put(Section4bEntry.ROW_SYNCED_DATE, sec4b.getROW_SYNCED_DATE());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                Section4bEntry.TABLE_NAME,
                null,
                values);

        return newRowId;
    }


    public Long addSec4a(Sec4aContract sec4a) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(Section4Entry._ID, sec4a.get_ID());
        values.put(Section4Entry.ROW_DEVID, sec4a.get_DEVID());
        values.put(Section4Entry.ROW_FORM_ID, sec4a.get_FORM_ID());
        values.put(Section4Entry.ROW_FORM_DATE, sec4a.get_FORM_DATE());
        values.put(Section4Entry.ROW_USERID, sec4a.get_USERID());
        values.put(Section4Entry.ROW_HHCODE, sec4a.get_HHCODE());
        values.put(Section4Entry.ROW_SNO, sec4a.get_SNO());
        values.put(Section4Entry.ROW_S4Q41A, sec4a.get_s4q41a());
        values.put(Section4Entry.ROW_S4Q41B, sec4a.get_s4q41b());
        values.put(Section4Entry.ROW_S4Q41B1, sec4a.get_s4q41b1());
        values.put(Section4Entry.ROW_S4Q41B2, sec4a.get_s4q41b2());
        values.put(Section4Entry.ROW_S4Q41C, sec4a.get_s4q41c());
        values.put(Section4Entry.ROW_S4Q41D, sec4a.get_s4q41d());
        values.put(Section4Entry.ROW_S4Q41E, sec4a.get_s4q41e());
        values.put(Section4Entry.ROW_UID, sec4a.get_UID());
        values.put(Section4Entry.ROW_UUID, sec4a.getROW_UUID());
        values.put(Section4Entry.ROW_SYNCED, sec4a.getROW_SYNCED());
        values.put(Section4Entry.ROW_SYNCED_DATE, sec4a.getROW_SYNCED_DATE());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                Section4Entry.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    public int updateS7im() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(single7Im.ROW_UID, SRCApp.sec7im.getROW_UID());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.sec7im.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.sec7im.get_ID())};

        int count = db.update(single7Im.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }


    public int updateS8() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_S8, SRCApp.fc.getROW_S8());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public void updateForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.COLUMN_SYNCED, true);
        values.put(Sec1Entry.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = Sec1Entry._ID + " LIKE ?";
        String[] whereArgs = {id};

        int count = db.update(
                Sec1Entry.TABLE_NAME,
                values,
                where,
                whereArgs);
    }


    public List<FormContract> getAllForms() {

        SRCApp.fc = new FormContract();

        List<FormContract> formList = new ArrayList<FormContract>();
        // Select All Query
        String selectQuery = "SELECT * FROM " + Sec1Entry.TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                SRCApp.fc.setROW_FORM_ID(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_FORM_ID)));
                SRCApp.fc.set_ID(Long.parseLong(cursor.getString(cursor.getColumnIndex(Sec1Entry._ID))));

                SRCApp.fc.setROW_DEVID(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_DEVID)));
                SRCApp.fc.setROW_GPS_LAT(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_LAT)));
                SRCApp.fc.setROW_GPS_LANG(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_LNG)));
                SRCApp.fc.setROW_GPS_ACC(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_ACC)));
                SRCApp.fc.setROW_GPS_DT(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_GPS_DT)));
                SRCApp.fc.setROW_S1Q101(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q101)));
                SRCApp.fc.setROW_S1Q102(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q102)));
                SRCApp.fc.setROW_S1Q103(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q103)));
                SRCApp.fc.setROW_S1Q104(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q104)));
                SRCApp.fc.setROW_S1Q105(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q105)));
                SRCApp.fc.setROW_S1Q106a(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q106a)));
                SRCApp.fc.setROW_S1Q106b(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q106b)));
                SRCApp.fc.setROW_S1Q107(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q107)));
                SRCApp.fc.setROW_S1Q108(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q108)));
                SRCApp.fc.setROW_S1Q109a(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q109a)));
                SRCApp.fc.setROW_S1Q109b(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q109b)));
                SRCApp.fc.setROW_S1Q110(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q110)));
                SRCApp.fc.setROW_S1Q111(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q111)));
                SRCApp.fc.setROW_S1Q111oth(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q111OTH)));
                SRCApp.fc.setROW_S1Q112(cursor.getString(cursor.getColumnIndex(Sec1Entry.ROW_S1Q112)));

                SRCApp.fc.setColumnSynced(cursor.getString(cursor.getColumnIndex(Sec1Entry.COLUMN_SYNCED)));
                SRCApp.fc.setColumnSyncedDate(cursor.getString(cursor.getColumnIndex(Sec1Entry.COLUMN_SYNCED_DATE)));

                // Adding contact to list
                formList.add(SRCApp.fc);
            } while (cursor.moveToNext());
        }

        // return contact list
        return formList;
    }

    public Collection<Sec3Contract> getAllSec3() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Sec3Entry._ID,
                Sec3Entry.ROW_DEVID,
                Sec3Entry.ROW_FORM_ID,
                Sec3Entry.ROW_FORM_DATE,
                Sec3Entry.ROW_USERID,
                Sec3Entry.ROW_HHCODE,
                Sec3Entry.ROW_SNO,
                Sec3Entry.ROW_S3Q301A,
                Sec3Entry.ROW_S3Q301B,
                Sec3Entry.ROW_S3Q301C,
                Sec3Entry.ROW_S3Q301D,
                Sec3Entry.ROW_S3Q301E,
                Sec3Entry.ROW_S3Q301F1,
                Sec3Entry.ROW_S3Q301F,
                Sec3Entry.ROW_S3Q301G,
                Sec3Entry.ROW_S3Q301H,
                Sec3Entry.ROW_S3Q301I,
                Sec3Entry.ROW_S3Q301J,
                Sec3Entry.ROW_S3Q301K,
                Sec3Entry.ROW_S3Q301L,
                Sec3Entry.ROW_UUID,
                Sec3Entry.ROW_UID,
                Sec3Entry.ROW_SYNCED,
                Sec3Entry.ROW_SYNCED_DATE,

        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                Sec3Entry._ID + " ASC";

        Collection<Sec3Contract> allEntries = new ArrayList<>();
        try {
            c = db.query(
                    Sec3Entry.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Sec3Contract oc = new Sec3Contract();
                allEntries.add(oc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allEntries;
    }

    public Collection<Sec4aContract> getAllSec4a() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Section4Entry._ID,
                Section4Entry.ROW_DEVID,
                Section4Entry.ROW_FORM_ID,
                Section4Entry.ROW_FORM_DATE,
                Section4Entry.ROW_USERID,
                Section4Entry.ROW_HHCODE,
                Section4Entry.ROW_SNO,
                Section4Entry.ROW_S4Q41A,
                Section4Entry.ROW_S4Q41B,
                Section4Entry.ROW_S4Q41B1,
                Section4Entry.ROW_S4Q41B2,
                Section4Entry.ROW_S4Q41C,
                Section4Entry.ROW_S4Q41D,
                Section4Entry.ROW_S4Q41E,
                Section4Entry.ROW_UID,
                Section4Entry.ROW_UUID,
                Section4Entry.ROW_SYNCED,
                Section4Entry.ROW_SYNCED_DATE,

        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                Section4Entry._ID + " ASC";

        Collection<Sec4aContract> allEntries = new ArrayList<>();
        try {
            c = db.query(
                    Section4Entry.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Sec4aContract oc = new Sec4aContract();
                allEntries.add(oc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allEntries;
    }

    public Collection<Sec4bContract> getAllSec4b() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Section4bEntry._ID,
                Section4bEntry.ROW_DEVID,
                Section4bEntry.ROW_FORM_ID,
                Section4bEntry.ROW_FORM_DATE,
                Section4bEntry.ROW_HHCODE,
                Section4bEntry.ROW_USERID,
                Section4bEntry.ROW_SNO,
                Section4bEntry.ROW_S4Q42A,
                Section4bEntry.ROW_S4Q42B,
                Section4bEntry.ROW_S4Q42C,
                Section4bEntry.ROW_S4Q42D,
                Section4bEntry.ROW_S4Q42D1,
                Section4bEntry.ROW_S4Q42D2,
                Section4bEntry.ROW_S4Q42E,
                Section4bEntry.ROW_S4Q42EOTH,
                Section4bEntry.ROW_S4Q42F,
                Section4bEntry.ROW_UID,
                Section4bEntry.ROW_UUID,
                Section4bEntry.ROW_SYNCED,
                Section4bEntry.ROW_SYNCED_DATE,

        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                Section4bEntry._ID + " ASC";

        Collection<Sec4bContract> allEntries = new ArrayList<>();
        try {
            c = db.query(
                    Sec3Entry.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Sec4bContract oc = new Sec4bContract();
                allEntries.add(oc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allEntries;
    }



    public Collection<FormContract> getAllForms_old() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Sec1Entry._ID,
                Sec1Entry.ROW_FORM_ID,
                Sec1Entry.ROW_S1Q101,
                Sec1Entry.ROW_S1Q102,
                Sec1Entry.ROW_S1Q103,
                Sec1Entry.ROW_S1Q104,
                Sec1Entry.ROW_S1Q105,
                Sec1Entry.ROW_S1Q106a,
                Sec1Entry.ROW_S1Q106b,
                Sec1Entry.ROW_S1Q107,
                Sec1Entry.ROW_S1Q108,
                Sec1Entry.ROW_S1Q109a,
                Sec1Entry.ROW_S1Q109b,
                Sec1Entry.ROW_S1Q110,
                Sec1Entry.ROW_S1Q111,
                Sec1Entry.ROW_S1Q111OTH,
                Sec1Entry.ROW_S1Q112
        };

        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                Sec1Entry._ID + " ASC";

        Collection<FormContract> allFC = new ArrayList<FormContract>();
        try {
            c = db.query(
                    Sec1Entry.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC.add(hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }



    public Collection<Sec7ImContract> getAllSec7Im() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                single7Im._ID,
                single7Im.ROW_DEVID,
                single7Im.ROW_ENTRYDATE,
                single7Im.ROW_USERID,
                single7Im.ROW_UUID,
                single7Im.ROW_UID,
                single7Im.HOUSEHOLD,
                single7Im.ROW_7IM,
                single7Im.ROW_GPS_LNG,
                single7Im.ROW_GPS_LAT,
                single7Im.ROW_GPS_DT,
                single7Im.ROW_GPS_ACC,
                single7Im.ROW_SYNCED,
                single7Im.ROW_SYNCED_DATE,

        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                single7Im._ID + " ASC";

        Collection<Sec7ImContract> allOC = new ArrayList<Sec7ImContract>();
        try {
            c = db.query(
                    single7Im.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                Sec7ImContract s7Im = new Sec7ImContract();
                allOC.add(s7Im.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allOC;
    }

    private FormContract hydrate(Cursor c) {
        FormContract fc = new FormContract();

        fc._ID = Long.parseLong(c.getString(c.getColumnIndex(Sec1Entry._ID)));
        fc.ROW_DEVID = c.getString(c.getColumnIndex(Sec1Entry.ROW_DEVID));
        fc.ROW_FORM_ID = c.getString(c.getColumnIndex(Sec1Entry.ROW_FORM_ID));
        fc.ROW_S1Q101 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q101));
        fc.ROW_S1Q102 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q102));
        fc.ROW_S1Q103 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q103));
        fc.ROW_S1Q104 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q104));
        fc.ROW_S1Q105 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q105));
        fc.ROW_S1Q106a = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q106a));
        fc.ROW_S1Q106b = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q106b));
        fc.ROW_S1Q107 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q107));
        fc.ROW_S1Q108 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q108));
        fc.ROW_S1Q109a = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q109a));
        fc.ROW_S1Q109b = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q109b));
        fc.ROW_S1Q110 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q110));
        fc.ROW_S1Q111 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q111));
        fc.ROW_S1Q111oth = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q111OTH));
        fc.ROW_S1Q112 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S1Q112));
        fc.ROW_S2 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S2));
        fc.ROW_S3 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S3));
        fc.ROW_S4 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S4));
        fc.ROW_S5 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S5));
        fc.ROW_S5 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S5b));
        fc.ROW_S5 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S5c));
        fc.ROW_S6 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S6));
        fc.ROW_S7 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S7));
        fc.ROW_S8 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S8));
        fc.ROW_UUID = c.getString(c.getColumnIndex(Sec1Entry.ROW_UUID));
        fc.ROW_GPS_LNG = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_LNG));
        fc.ROW_GPS_LAT = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_LAT));
        fc.ROW_GPS_DT = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_DT));
        fc.ROW_GPS_ACC = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_ACC));
        fc.COLUMN_SYNCED = c.getString(c.getColumnIndex(Sec1Entry.COLUMN_SYNCED));
        fc.COLUMN_SYNCED_DATE = c.getString(c.getColumnIndex(Sec1Entry.COLUMN_SYNCED_DATE));

        return fc;
    }


    public ArrayList<Members> getAll_Woman_Reproductive_Age() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Members> userList = null;
        try {

            CVars var = new CVars();

            userList = new ArrayList<>();
            String QUERY = "SELECT * FROM " + Sec3Entry.TABLE_NAME + " WHERE " + Sec3Entry.ROW_FORM_ID +
                    " = '" + var.GetHHNO() + "'";

            Cursor cursor = db.rawQuery(QUERY, null);
            int num = cursor.getCount();

            if (num == 0) {
                userList.add(new Members("99", "NA"));
            }

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {

                    Members m = new Members();

                    Sec4bContract sc = new Sec4bContract();
                    sc.set_sno(cursor.getString(cursor.getColumnIndex(Sec3Entry._ID)));
                    sc.set_s4q42a(cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_s3q301a)));

                    userList.add(new Members(String.valueOf(sc.get_sno()), sc.get_s4q42a()));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }


    public String getID_Woman_Reproductive_Age(String nme) {
        SQLiteDatabase db = this.getReadableDatabase();
        String id = "";

        try {

            CVars var = new CVars();

            String QUERY = "SELECT * FROM " + Sec3Entry.TABLE_NAME + " WHERE " +
                    Sec3Entry.ROW_FORM_ID + " = '" + var.GetHHNO() + "' and " +
                    Sec3Entry.ROW_s3q301a + " = '" + nme + "'";

            Cursor cursor = db.rawQuery(QUERY, null);

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    id = cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_SNO));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return id;
    }


    public ArrayList<Members> getDistricts() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Members> userList = null;
        try {
            userList = new ArrayList<Members>();
            String QUERY = "SELECT * FROM " + singleDistrict.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);

            int num = cursor.getCount();

            if (num == 0) {
                userList.add(new Members("0", "..."));
            }

            if (!cursor.isLast()) {
                userList.add(new Members("0", "..."));

                while (cursor.moveToNext()) {
                    DistrictsContract dc = new DistrictsContract();

                    dc.setDistrictCode(cursor.getString(0));
                    dc.setDistrictName(cursor.getString(1));

                    userList.add(new Members(dc.getDistrictCode(), dc.getDistrictName()));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }


    public ArrayList<Members> getVillages(String uccode) {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Members> villageList = null;
        try {
            villageList = new ArrayList<Members>();
            String QUERY = "SELECT * FROM " + singleVillages.TABLE_NAME + " WHERE "
                    + singleVillages.COLUMN_DISTRICT_CODE + "='" + uccode + "'";

            Cursor cursor = db.rawQuery(QUERY, null);

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    VillagesContract vc = new VillagesContract();

                    vc.setVILLAGESCode(cursor.getString(0));
                    vc.setVILLAGESName(cursor.getString(1));

                    villageList.add(new Members(vc.getVILLAGESCode(), vc.getVILLAGESName()));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return villageList;
    }

    public ArrayList<Members> getVillages() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Members> userList = null;
        try {
            userList = new ArrayList<Members>();
            String QUERY = "SELECT * FROM " + singleVillages.TABLE_NAME;

            Cursor cursor = db.rawQuery(QUERY, null);

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    VillagesContract vc = new VillagesContract();

                    vc.setVILLAGESCode(cursor.getString(0));
                    vc.setVILLAGESName(cursor.getString(1));

                    userList.add(new Members(vc.getVILLAGESCode(), vc.getVILLAGESName()));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }


    public String getDistrictCode(String ucname) {
        SQLiteDatabase db = this.getReadableDatabase();
        String uccode = "";

        try {
            String QUERY = "SELECT * FROM " + singleDistrict.TABLE_NAME + " WHERE " +
                    singleDistrict.COLUMN_DISTRICT_CODE + " = '" + ucname + "'";

            Cursor cursor = db.rawQuery(QUERY, null);

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    uccode = cursor.getString(cursor.getColumnIndex("uccode"));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return uccode;
    }


    public String getVCode(String uccode, String vname) {
        SQLiteDatabase db = this.getReadableDatabase();
        String vcode = "";

        try {
            String QUERY = "SELECT * FROM " + singleVillages.TABLE_NAME + " WHERE " +
                    singleVillages.COLUMN_DISTRICT_CODE + " = '" + uccode + "' AND " +
                    singleVillages.COLUMN_VILLAGES_NAME + " = '" + vname + "'";

            Cursor cursor = db.rawQuery(QUERY, null);

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    vcode = cursor.getString(cursor.getColumnIndex("vcode"));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return vcode;
    }

    public void updateSyncedForms(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.COLUMN_SYNCED, true);
        values.put(Sec1Entry.COLUMN_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = Sec1Entry._ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                Sec1Entry.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedSec3(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec3Entry.ROW_SYNCED, true);
        values.put(Sec3Entry.ROW_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = Sec3Entry._ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                Sec3Entry.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedSec4a(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Section4Entry.ROW_SYNCED, true);
        values.put(Section4Entry.ROW_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = Section4Entry._ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                Section4Entry.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

}