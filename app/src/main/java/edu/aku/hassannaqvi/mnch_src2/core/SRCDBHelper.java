package edu.aku.hassannaqvi.mnch_src2.core;

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

import edu.aku.hassannaqvi.mnch_src2.contract.BLRandomContract;
import edu.aku.hassannaqvi.mnch_src2.contract.BLRandomContract.singleRandom;
import edu.aku.hassannaqvi.mnch_src2.contract.DistrictsContract;
import edu.aku.hassannaqvi.mnch_src2.contract.DistrictsContract.singleDistrict;
import edu.aku.hassannaqvi.mnch_src2.contract.FormContract;
import edu.aku.hassannaqvi.mnch_src2.contract.FormContract.Sec1Entry;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec3Contract;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec3Contract.Sec3Entry;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec4aContract;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec4aContract.Section4Entry;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec4bContract;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec4bContract.Section4bEntry;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec7ImContract;
import edu.aku.hassannaqvi.mnch_src2.contract.Sec7ImContract.single7Im;
import edu.aku.hassannaqvi.mnch_src2.contract.UsersContract;
import edu.aku.hassannaqvi.mnch_src2.contract.UsersContract.singleUser;
import edu.aku.hassannaqvi.mnch_src2.contract.VillagesContract;
import edu.aku.hassannaqvi.mnch_src2.contract.VillagesContract.singleVillages;
import edu.aku.hassannaqvi.mnch_src2.other.CVars;
import edu.aku.hassannaqvi.mnch_src2.other.Members;


/**
 * Created by isd on 20/10/2016.
 */
public class SRCDBHelper extends SQLiteOpenHelper {


    public static final String SQL_CREATE_BL_RANDOM = "CREATE TABLE " + singleRandom.TABLE_NAME + "("
            + singleRandom.COLUMN_ID + " TEXT,"
            + singleRandom.COLUMN_SUB_VILLAGE_CODE + " TEXT,"
            + singleRandom.COLUMN_LUID + " TEXT,"
            + singleRandom.COLUMN_SNO + " TEXT,"
            + singleRandom.COLUMN_STRUCTURE_NO + " TEXT,"
            + singleRandom.COLUMN_MW_NAME + " TEXT,"
            + singleRandom.COLUMN_RANDOMDT + " TEXT );";

    public static final String SQL_CREATE_USERS = "CREATE TABLE " + UsersContract.singleUser.TABLE_NAME + "("
            + UsersContract.singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.singleUser.ROW_USERNAME + " TEXT,"
            + UsersContract.singleUser.ROW_PASSWORD + " TEXT,"
            + UsersContract.singleUser.ROW_USERSTATUS + " TEXT,"
            + UsersContract.singleUser.ROW_ISADMIN + " TEXT);";
    public static final String SQL_CREATE_BASELINE_SEC1 = "CREATE TABLE " + Sec1Entry.TABLE_NAME + "("
            + Sec1Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            Sec1Entry.COLUMN_TAGID + " TEXT," +
            Sec1Entry.COLUMN_VERSION + " TEXT," +
            Sec1Entry.ROW_DEVID + " TEXT," +
            Sec1Entry.ROW_HHNO + " TEXT," +
            Sec1Entry.ROW_ENTRYDATE + " TEXT," +
            Sec1Entry.ROW_USERID + " TEXT," +
            Sec1Entry.ROW_S1 + " TEXT," +
            Sec1Entry.ROW_S2 + " TEXT," +
            Sec1Entry.ROW_S5 + " TEXT," +
            Sec1Entry.ROW_S5B + " TEXT," +
            Sec1Entry.ROW_S5C + " TEXT," +
            Sec1Entry.ROW_S6 + " TEXT," +
            Sec1Entry.ROW_S7 + " TEXT," +
            Sec1Entry.ROW_S8 + " TEXT," +
            Sec1Entry.ROW_MN823 + " TEXT," +
            Sec1Entry.ROW_MN823X + " TEXT," +
            Sec1Entry.ROW_UID + " TEXT," +
            Sec1Entry.ROW_GPS_LNG + " TEXT," +
            Sec1Entry.ROW_GPS_LAT + " TEXT," +
            Sec1Entry.ROW_GPS_DT + " TEXT," +
            Sec1Entry.ROW_GPS_ACC + " TEXT," +
            Sec1Entry.COLUMN_SYNCED + " TEXT," +
            Sec1Entry.COLUMN_SYNCED_DATE + " TEXT" +
            ");";
    public static final String SQL_CREATE_BASELINE_SEC3 = "CREATE TABLE " + Sec3Entry.TABLE_NAME + "("
            + Sec3Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            Sec3Entry.COLUMN_TAGID + " TEXT," +
            Sec3Entry.COLUMN_VERSION + " TEXT," +
            Sec3Entry.ROW_DEVID + " TEXT," +
            Sec3Entry.ROW_HHNO + " TEXT," +
            Sec3Entry.ROW_FORM_DATE + " TEXT," +
            Sec3Entry.ROW_USERID + " TEXT," +
            //Sec3Entry.ROW_HHCODE + " TEXT," +
            Sec3Entry.ROW_SNO + " TEXT," +
            Sec3Entry.ROW_S3 + " TEXT," +
            Sec3Entry.ROW_UUID + " TEXT," +
            Sec3Entry.ROW_UID + " TEXT," +
            Sec3Entry.ROW_SYNCED + " TEXT," +
            Sec3Entry.ROW_SYNCED_DATE + " TEXT" +

            ");";
    public static final String SQL_CREATE_BASELINE_SEC4 = "CREATE TABLE " + Section4Entry.TABLE_NAME + "("
            + Section4Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            Section4Entry.COLUMN_TAGID + " TEXT," +
            Section4Entry.COLUMN_VERSION + " TEXT," +
            Section4Entry.ROW_DEVID + " TEXT," +
            Section4Entry.ROW_HHNO + " TEXT," +
            Section4Entry.ROW_FORM_DATE + " TEXT," +
            Section4Entry.ROW_USERID + " TEXT," +
            //Section4Entry.ROW_HHCODE + " TEXT," +
            Section4Entry.ROW_SNO + " TEXT," +
            Section4Entry.ROW_S4A + " TEXT," +
            Section4Entry.ROW_UID + " TEXT," +
            Section4Entry.ROW_UUID + " TEXT," +
            Section4Entry.ROW_SYNCED + " TEXT," +
            Section4Entry.ROW_SYNCED_DATE + " TEXT"

            + ");";
    public static final String SQL_CREATE_BASELINE_SEC4b = "CREATE TABLE " + Section4bEntry.TABLE_NAME + "("
            + Section4bEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            Section4bEntry.COLUMN_TAGID + " TEXT," +
            Section4bEntry.COLUMN_VERSION + " TEXT," +
            Section4bEntry.ROW_DEVID + " TEXT," +
            Section4bEntry.ROW_HHNO + " TEXT," +
            Section4bEntry.ROW_FORM_DATE + " TEXT," +
            Section4bEntry.ROW_USERID + " TEXT," +
            Section4bEntry.ROW_UUID + " TEXT," +
            Section4bEntry.ROW_UID + " TEXT," +
            //Section4bEntry.ROW_HHCODE + " TEXT," +
            Section4bEntry.ROW_SNO + " TEXT," +
            Section4bEntry.ROW_S4B + " TEXT," +
            Section4bEntry.ROW_SYNCED + " TEXT," +
            Section4bEntry.ROW_SYNCED_DATE + " TEXT" +

            ");";

    public static final String SQL_CREATE_SEC_7_IM = "CREATE TABLE " + single7Im.TABLE_NAME + "("
            + single7Im._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            single7Im.COLUMN_TAGID + " TEXT," +
            single7Im.COLUMN_VERSION + " TEXT," +
            single7Im.ROW_DEVID + " TEXT,"
            + single7Im.ROW_ENTRYDATE + " TEXT,"
            + single7Im.ROW_USERID + " TEXT,"
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
    private static final String SQL_DELETE_BL_RANDOM =
            "DROP TABLE IF EXISTS " + singleRandom.TABLE_NAME;
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


    public SRCDBHelper(Context context) {
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
        db.execSQL(SQL_CREATE_BL_RANDOM);

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
        db.execSQL(SQL_DELETE_BL_RANDOM);

        onCreate(db);
    }

    public Collection<BLRandomContract> getAllBLRandom(String subVillageCode, String hh) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                singleRandom.COLUMN_ID,
                singleRandom.COLUMN_LUID,
                singleRandom.COLUMN_STRUCTURE_NO,
                singleRandom.COLUMN_SNO,
                singleRandom.COLUMN_SUB_VILLAGE_CODE,
                singleRandom.COLUMN_RANDOMDT,
                singleRandom.COLUMN_MW_NAME
        };

        String whereClause = singleRandom.COLUMN_SUB_VILLAGE_CODE + "=? AND " +
                singleRandom.COLUMN_STRUCTURE_NO + "=?";
        String[] whereArgs = new String[]{subVillageCode, hh};
        String groupBy = null;
        String having = null;

        String orderBy =
                singleRandom.COLUMN_ID + " ASC";

        Collection<BLRandomContract> allBL = new ArrayList<>();
        try {
            c = db.query(
                    singleRandom.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                BLRandomContract dc = new BLRandomContract();
                allBL.add(dc.Hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allBL;
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
                singleDistrict.COLUMN_DISTRICT_NAME + " ASC";

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

            DistrictsContract dc1 = new DistrictsContract();
            allDC.add(dc1.setDefaultVal("", "..."));

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
                singleVillages.COLUMN_VILLAGES_NAME + " ASC";

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

            VillagesContract pc1 = new VillagesContract();
            allPC.add(pc1.setDefaultVal("", "..."));

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

    public void syncBlRandom(JSONArray Areaslist) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(singleRandom.TABLE_NAME, null, null);
        try {
            JSONArray jsonArray = Areaslist;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectCC = jsonArray.getJSONObject(i);

                BLRandomContract Vc = new BLRandomContract();
                Vc.Sync(jsonObjectCC);

                ContentValues values = new ContentValues();

                values.put(singleRandom.COLUMN_ID, Vc.get_ID());
                values.put(singleRandom.COLUMN_LUID, Vc.getLUID());
                values.put(singleRandom.COLUMN_STRUCTURE_NO, Vc.getStructure());
                values.put(singleRandom.COLUMN_SNO, Vc.getSno());
                values.put(singleRandom.COLUMN_SUB_VILLAGE_CODE, Vc.getSubVillageCode());
                values.put(singleRandom.COLUMN_RANDOMDT, Vc.getRandomDT());
                values.put(singleRandom.COLUMN_MW_NAME, Vc.getMwname());

                db.insert(singleRandom.TABLE_NAME, null, values);
            }
        } catch (Exception e) {
        } finally {
            db.close();
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

                ContentValues values = new ContentValues();

                values.put(UsersContract.singleUser.ROW_USERNAME, userName);
                values.put(UsersContract.singleUser.ROW_PASSWORD, password);
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

            values.put(Sec1Entry._ID, fc.get_ID());
            values.put(Sec1Entry.ROW_DEVID, fc.getROW_DEVID());
            values.put(Sec1Entry.ROW_HHNO, fc.getHHNO());
            values.put(Sec1Entry.ROW_ENTRYDATE, fc.getROW_ENTRYDATE());
            values.put(Sec1Entry.ROW_USERID, fc.getROW_USERID());
            values.put(Sec1Entry.ROW_S1, fc.getROW_S1());
            values.put(Sec1Entry.ROW_S2, fc.getROW_S2());
            values.put(Sec1Entry.ROW_S5, fc.getROW_S5());
            values.put(Sec1Entry.ROW_S5B, fc.getROW_S5b());
            values.put(Sec1Entry.ROW_S5C, fc.getROW_S5c());
            values.put(Sec1Entry.ROW_S6, fc.getROW_S6());
            values.put(Sec1Entry.ROW_S7, fc.getROW_S7());
            values.put(Sec1Entry.ROW_S8, fc.getROW_S8());
            values.put(Sec1Entry.COLUMN_TAGID, fc.getTagID());
            values.put(Sec1Entry.COLUMN_VERSION, fc.getVersion());
            values.put(Sec1Entry.ROW_MN823, fc.getROW_MN823());
            values.put(Sec1Entry.ROW_MN823X, fc.getROW_MN823X());
            values.put(Sec1Entry.ROW_UID, fc.getROW_UUID());
            values.put(Sec1Entry.ROW_GPS_LNG, fc.getROW_GPS_LNG());
            values.put(Sec1Entry.ROW_GPS_LAT, fc.getROW_GPS_LAT());
            values.put(Sec1Entry.ROW_GPS_DT, fc.getROW_GPS_DT());
            values.put(Sec1Entry.ROW_GPS_ACC, fc.getROW_GPS_ACC());

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

            values.put(Sec3Entry.COLUMN_TAGID, sec3.getTagID());
            values.put(Sec3Entry.COLUMN_VERSION, sec3.getVersion());

            values.put(Sec3Entry.ROW_DEVID, sec3.getROW_DEVID());
            values.put(Sec3Entry.ROW_HHNO, sec3.getHHNO());
            values.put(Sec3Entry.ROW_FORM_DATE, sec3.getROW_FORM_DATE());
            values.put(Sec3Entry.ROW_USERID, sec3.getROW_USERID());
            //values.put(Sec3Entry.ROW_HHCODE, sec3.getROW_HHCODE());
            values.put(Sec3Entry.ROW_SNO, sec3.getROW_SNO());
            values.put(Sec3Entry.ROW_S3, sec3.getROW_S3());
            values.put(Sec3Entry.ROW_UUID, sec3.getROW_UUID()); // get primary key of main Form UUID
            /*values.put(Sec3Entry.ROW_UID, sec3.getROW_UID());*/
            // No need to update SYNC fields in this function

            newRowId = db.insert(Sec3Entry.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }

        return newRowId;
    }

    public int updateS1() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_S1, SRCApp.fc.getROW_S1());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
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
        values.put(Sec1Entry.ROW_S5B, SRCApp.fc.getROW_S5b());

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
        values.put(Sec1Entry.ROW_S5C, SRCApp.fc.getROW_S5c());

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

        values.put(single7Im.COLUMN_TAGID, sec7Im.getTagID());
        values.put(single7Im.COLUMN_VERSION, sec7Im.getVersion());

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
        values.put(Sec3Entry.ROW_HHNO, sec3.getHHNO());
        values.put(Sec3Entry.ROW_FORM_DATE, sec3.getROW_FORM_DATE());
        values.put(Sec3Entry.ROW_USERID, sec3.getROW_USERID());
        //values.put(Sec3Entry.ROW_HHCODE, sec3.getROW_HHCODE());
        values.put(Sec3Entry.ROW_SNO, sec3.getROW_SNO());
        values.put(Sec3Entry.ROW_S3, sec3.getROW_S3());
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
        values.put(Section4bEntry.ROW_HHNO, sec4b.getHHNO());
        values.put(Section4bEntry.ROW_FORM_DATE, sec4b.getROW_FORM_DATE());
        //values.put(Section4bEntry.ROW_HHCODE, sec4b.getROW_HHCODE());
        values.put(Section4bEntry.ROW_USERID, sec4b.getROW_USERID());
        values.put(Section4bEntry.ROW_SNO, sec4b.getROW_SNO());
        values.put(Section4bEntry.ROW_S4B, sec4b.get_s4b());
        values.put(Section4bEntry.ROW_UID, sec4b.getROW_UID());
        values.put(Section4bEntry.ROW_UUID, sec4b.getROW_UUID());
        values.put(Section4bEntry.ROW_SYNCED, sec4b.getROW_SYNCED());
        values.put(Section4bEntry.ROW_SYNCED_DATE, sec4b.getROW_SYNCED_DATE());

        values.put(Section4bEntry.COLUMN_TAGID, sec4b.getTagID());
        values.put(Section4bEntry.COLUMN_VERSION, sec4b.getVersion());

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
        values.put(Section4Entry.ROW_HHNO, sec4a.get_HHNO());
        values.put(Section4Entry.ROW_FORM_DATE, sec4a.get_FORM_DATE());
        values.put(Section4Entry.ROW_USERID, sec4a.get_USERID());
        //values.put(Section4Entry.ROW_HHCODE, sec4a.get_HHCODE());
        values.put(Section4Entry.ROW_SNO, sec4a.get_SNO());
        values.put(Section4Entry.ROW_S4A, sec4a.get_s4a());
        //values.put(Section4Entry.ROW_UID, sec4a.get_UID());
        values.put(Section4Entry.ROW_UUID, sec4a.getROW_UUID());
        values.put(Section4Entry.ROW_SYNCED, sec4a.getROW_SYNCED());
        values.put(Section4Entry.ROW_SYNCED_DATE, sec4a.getROW_SYNCED_DATE());

        values.put(Section4Entry.COLUMN_TAGID, sec4a.getTagID());
        values.put(Section4Entry.COLUMN_VERSION, sec4a.getVersion());

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

    public int updateEnding() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_MN823, SRCApp.fc.getROW_MN823());
        values.put(Sec1Entry.ROW_MN823X, SRCApp.fc.getROW_MN823X());

// Which row to update, based on the ID
        String selection = " _ID = " + SRCApp.fc.get_ID();
        String[] selectionArgs = {String.valueOf(SRCApp.fc.get_ID())};

        int count = db.update(Sec1Entry.TABLE_NAME,
                values,
                selection,
                null);
        return count;
    }

    public void updateFormsUID() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec1Entry.ROW_UID, SRCApp.fc.getROW_UUID());

// Which row to update, based on the title
        String where = Sec1Entry._ID + " = ?";
        String[] whereArgs = {SRCApp.fc.get_ID().toString()};

        int count = db.update(
                Sec1Entry.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSec3UID() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(Sec3Entry.ROW_UID, SRCApp.sc3.getROW_UID());

        // Which row to update, based on the title
        String where = Sec3Entry._ID + " = ?";
        String[] whereArgs = {SRCApp.sc3.get_ID().toString()};

        int count = db.update(
                Sec3Entry.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSec4aUID() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(Section4Entry.ROW_UID, SRCApp.sc4a.get_UID());

        // Which row to update, based on the title
        String where = Section4Entry._ID + " = ?";
        String[] whereArgs = {SRCApp.sc4a.get_ID().toString()};

        int count = db.update(
                Section4Entry.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSec4bUID() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(Section4bEntry.ROW_UID, SRCApp.sc4b.getROW_UID());

        // Which row to update, based on the title
        String where = Section4bEntry._ID + " = ?";
        String[] whereArgs = {SRCApp.sc4b.get_ID().toString()};

        int count = db.update(
                Section4bEntry.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateS7ImUID() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(single7Im.ROW_UID, SRCApp.sec7im.getROW_UID());

        // Which row to update, based on the title
        String where = single7Im._ID + " = ?";
        String[] whereArgs = {SRCApp.sec7im.get_ID().toString()};

        int count = db.update(
                single7Im.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public Collection<Sec3Contract> getUnsyncedSec3() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Sec3Entry._ID,
                Sec3Entry.ROW_DEVID,
                Sec3Entry.ROW_HHNO,
                Sec3Entry.ROW_FORM_DATE,
                Sec3Entry.ROW_USERID,
                //Sec3Entry.ROW_HHCODE,
                Sec3Entry.ROW_SNO,
                Sec3Entry.ROW_S3,
                Sec3Entry.ROW_UUID,
                Sec3Entry.ROW_UID,
                Sec3Entry.ROW_SYNCED,
                Sec3Entry.ROW_SYNCED_DATE,
                Sec3Entry.COLUMN_TAGID,
                Sec3Entry.COLUMN_VERSION,

        };
        String whereClause = Sec3Entry.ROW_SYNCED + " is null";
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

    public Collection<Sec4aContract> getUnsyncedSec4a() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Section4Entry._ID,
                Section4Entry.ROW_DEVID,
                Section4Entry.ROW_HHNO,
                Section4Entry.ROW_FORM_DATE,
                Section4Entry.ROW_USERID,
                //Section4Entry.ROW_HHCODE,
                Section4Entry.ROW_SNO,
                Section4Entry.ROW_S4A,

                Section4Entry.ROW_UID,
                Section4Entry.ROW_UUID,
                Section4Entry.ROW_SYNCED,
                Section4Entry.ROW_SYNCED_DATE,
                Section4Entry.COLUMN_TAGID,
                Section4Entry.COLUMN_VERSION,

        };
        String whereClause = Section4Entry.ROW_SYNCED + " is null";
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

    public Collection<FormContract> getUnsyncedForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Sec1Entry._ID,
                Sec1Entry.ROW_DEVID,
                Sec1Entry.ROW_HHNO,
                Sec1Entry.ROW_ENTRYDATE,
                Sec1Entry.ROW_USERID,
                Sec1Entry.ROW_S1,
                Sec1Entry.ROW_S2,
                Sec1Entry.ROW_S5,
                Sec1Entry.ROW_S5B,
                Sec1Entry.ROW_S5C,
                Sec1Entry.ROW_S6,
                Sec1Entry.ROW_S7,
                Sec1Entry.ROW_S8,
                Sec1Entry.COLUMN_TAGID,
                Sec1Entry.COLUMN_VERSION,
                Sec1Entry.ROW_MN823,
                Sec1Entry.ROW_MN823X,
                Sec1Entry.ROW_UID,
                Sec1Entry.ROW_GPS_LNG,
                Sec1Entry.ROW_GPS_LAT,
                Sec1Entry.ROW_GPS_DT,
                Sec1Entry.ROW_GPS_ACC,
                Sec1Entry.COLUMN_SYNCED,
                Sec1Entry.COLUMN_SYNCED_DATE

        };
        String whereClause = Sec1Entry.COLUMN_SYNCED + " is null";
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                Sec1Entry._ID + " ASC";

        Collection<FormContract> allEntries = new ArrayList<>();
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
                FormContract oc = new FormContract();
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

    public Collection<Sec4bContract> getUnsyncedSec4b() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                Section4bEntry._ID,
                Section4bEntry.ROW_DEVID,
                Section4bEntry.ROW_HHNO,
                Section4bEntry.ROW_FORM_DATE,
                //Section4bEntry.ROW_HHCODE,
                Section4bEntry.ROW_USERID,
                Section4bEntry.ROW_SNO,
                Section4bEntry.ROW_S4B,

                Section4bEntry.ROW_UID,
                Section4bEntry.ROW_UUID,
                Section4bEntry.ROW_SYNCED,
                Section4bEntry.ROW_SYNCED_DATE,
                Section4bEntry.COLUMN_TAGID,
                Section4bEntry.COLUMN_VERSION,

        };
        String whereClause = Section4bEntry.ROW_SYNCED + " is null";
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                Section4bEntry._ID + " ASC";

        Collection<Sec4bContract> allEntries = new ArrayList<>();
        try {
            c = db.query(
                    Section4bEntry.TABLE_NAME,  // The table to query
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

    public Collection<Sec7ImContract> getUnsyncedSec7Im() {
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
                single7Im.COLUMN_TAGID,
                single7Im.COLUMN_VERSION,

        };
        String whereClause = single7Im.ROW_SYNCED + " is null";
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

    /*public ArrayList<Members> getAll_Woman_Reproductive_Age() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Members> userList = null;
        try {

            CVars var = new CVars();

            userList = new ArrayList<>();
            String QUERY = "SELECT * FROM " + Sec3Entry.TABLE_NAME + " WHERE " + Sec3Entry.ROW_HHNO +
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
                    sc.setROW_SNO(cursor.getString(cursor.getColumnIndex(Sec3Entry._ID)));
                    sc.set_s4q42a(cursor.getString(cursor.getColumnIndex(Sec3Entry.ROW_S3Q301A)));

                    userList.add(new Members(String.valueOf(sc.getROW_SNO()), sc.get_s4q42a()));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }
*/

   /* public String getID_Woman_Reproductive_Age(String nme) {
        SQLiteDatabase db = this.getReadableDatabase();
        String id = "";

        try {

            CVars var = new CVars();

            String QUERY = "SELECT * FROM " + Sec3Entry.TABLE_NAME + " WHERE " +
                    Sec3Entry.ROW_HHNO + " = '" + var.GetHHNO() + "' and " +
                    Sec3Entry.ROW_S3Q301A + " = '" + nme + "'";

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
    }*/


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
                    singleDistrict.COLUMN_DISTRICT_NAME + " = '" + ucname + "'";

            Cursor cursor = db.rawQuery(QUERY, null);

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    uccode = cursor.getString(cursor.getColumnIndex("district_code"));
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
                    vcode = cursor.getString(cursor.getColumnIndex("villages_code"));
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

    public void updateSyncedSec4b(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(Section4bEntry.ROW_SYNCED, true);
        values.put(Section4bEntry.ROW_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = Section4bEntry._ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                Section4bEntry.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

    public void updateSyncedSec7Im(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(single7Im.ROW_SYNCED, true);
        values.put(single7Im.ROW_SYNCED_DATE, new Date().toString());

// Which row to update, based on the title
        String where = single7Im._ID + " = ?";
        String[] whereArgs = {id};

        int count = db.update(
                single7Im.TABLE_NAME,
                values,
                where,
                whereArgs);
    }

}