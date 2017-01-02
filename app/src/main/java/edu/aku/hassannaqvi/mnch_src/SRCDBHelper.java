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
import java.util.List;

import edu.aku.hassannaqvi.mnch_src.ClusterContract.ClusterEntry;
import edu.aku.hassannaqvi.mnch_src.FormContract.Sec1Entry;
import edu.aku.hassannaqvi.mnch_src.Sec3Contract.Sec3Entry;
import edu.aku.hassannaqvi.mnch_src.Sec7ImContract.single7Im;
import edu.aku.hassannaqvi.mnch_src.Section4Contract.Section4Entry;
import edu.aku.hassannaqvi.mnch_src.Section4aContract.Section4aEntry;
import edu.aku.hassannaqvi.mnch_src.VillageContract.VillageEntry;

/**
 * Created by isd on 20/10/2016.
 */
public class SRCDBHelper extends SQLiteOpenHelper {

    public static final String SQL_CREATE_USERS = "CREATE TABLE IF NOT EXISTS " + UsersContract.singleUser.TABLE_NAME + "("
            + UsersContract.singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.singleUser.ROW_USERNAME + " TEXT,"
            + UsersContract.singleUser.ROW_PASSWORD + " TEXT,"
            + UsersContract.singleUser.ROW_USERSTATUS + " TEXT,"
            + UsersContract.singleUser.ROW_ISADMIN + " TEXT );";
    /*******************************
     * Section 1
     ******************************/

    public static final String SQL_CREATE_BASELINE_SEC1 = "CREATE TABLE IF NOT EXISTS " + Sec1Entry.TABLE_NAME + "("
            + Sec1Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Sec1Entry.ROW_DEVID + " TEXT,"
            + Sec1Entry.ROW_FORM_ID + " INTEGER,"
            + Sec1Entry.ROW_S1Q101 + " TEXT,"
            + Sec1Entry.ROW_S1Q102 + " TEXT,"
            + Sec1Entry.ROW_S1Q103 + " INTEGER,"
            + Sec1Entry.ROW_S1Q104 + " INTEGER,"
            + Sec1Entry.ROW_S1Q105 + " TEXT,"
            + Sec1Entry.ROW_S1Q106a + " TEXT,"
            + Sec1Entry.ROW_S1Q106b + " INTEGER,"
            + Sec1Entry.ROW_S1Q107 + " TEXT,"
            + Sec1Entry.ROW_S1Q108 + " TEXT,"
            + Sec1Entry.ROW_S1Q108b + " TEXT,"
            + Sec1Entry.ROW_S1Q110 + " DATETIME,"
            + Sec1Entry.ROW_S1Q111 + " INTEGER,"
            + Sec1Entry.ROW_S1Q111OTH + " TEXT,"
            + Sec1Entry.ROW_S1Q112 + " INTEGER,"
            + Sec1Entry.ROW_S2 + " TEXT,"
            + Sec1Entry.ROW_S3 + " TEXT,"
            + Sec1Entry.ROW_S4 + " TEXT,"
            + Sec1Entry.ROW_S5 + " TEXT,"
            + Sec1Entry.ROW_S6 + " TEXT,"
            + Sec1Entry.ROW_S7 + " TEXT,"
            + Sec1Entry.ROW_S8 + " TEXT,"
            + Sec1Entry.ROW_UUID + " TEXT,"
            + Sec1Entry.ROW_GPS_LNG + " TEXT,"
            + Sec1Entry.ROW_GPS_LAT + " TEXT,"
            + Sec1Entry.ROW_GPS_DT + " TEXT,"
            + Sec1Entry.ROW_GPS_ACC + " TEXT);";
    /*******************************
     * Section 3
     ******************************/

    public static final String SQL_CREATE_BASELINE_SEC3 = "CREATE TABLE IF NOT EXISTS " + Sec3Entry.TABLE_NAME + "("
            + Sec3Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Sec3Entry.ROW_DEVID + " TEXT,"
            + Sec3Entry.ROW_FORM_ID + " INTEGER,"
            + Sec3Entry.ROW_HHCODE + " TEXT,"
            + Sec3Entry.ROW_SNO + " TEXT,"
            + Sec3Entry.ROW_s3q301a + " TEXT,"
            + Sec3Entry.ROW_s3q301b + " TEXT,"
            + Sec3Entry.ROW_s3q301c + " INTEGER,"
            + Sec3Entry.ROW_s3q301d + " INTEGER,"
            + Sec3Entry.ROW_s3q301f1 + " INTEGER,"
            + Sec3Entry.ROW_s3q301e + " INTEGER,"
            + Sec3Entry.ROW_s3q301f + " INTEGER,"
            + Sec3Entry.ROW_s3q301g + " INTEGER,"
            + Sec3Entry.ROW_s3q301h + " INTEGER,"
            + Sec3Entry.ROW_s3q301i + " INTEGER,"
            + Sec3Entry.ROW_s3q301j + " INTEGER,"
            + Sec3Entry.ROW_s3q301k + " INTEGER,"
            + Sec3Entry.ROW_UID + " TEXT);";
    /*******************************
     * Section 4a
     ******************************/

    public static final String SQL_CREATE_BASELINE_SEC4 = "CREATE TABLE IF NOT EXISTS " + Section4Entry.TABLE_NAME + "("
            + Section4Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Section4Entry.ROW_DEVID + " TEXT,"
            + Section4Entry.ROW_FORM_ID + " INTEGER,"
            + Section4Entry.ROW_HHCODE + " TEXT,"
            + Section4Entry.ROW_SNO + " TEXT,"
            + Section4Entry.ROW_s4q41a + " TEXT,"
            + Section4Entry.ROW_s4q41b + " TEXT,"
            + Section4Entry.ROW_s4q41b1 + " TEXT,"
            + Section4Entry.ROW_s4q41b2 + " TEXT,"
            + Section4Entry.ROW_s4q41c + " TEXT,"
            + Section4Entry.ROW_s4q41d + " TEXT,"
            + Section4Entry.ROW_s4q41e + " TEXT,"
            + Section4Entry.ROW_UID + " TEXT);";
    public static final String SQL_CREATE_SEC_7_IM = "CREATE TABLE IF NOT EXISTS " + single7Im.TABLE_NAME + "("
            + single7Im._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + single7Im.ROW_DEVID + " TEXT,"
            + single7Im.ROW_ENTRYDATE + " TEXT,"
            + single7Im.ROW_USERID + " TEXT,"
            + single7Im.ROW_UUID + " TEXT,"
            + single7Im.ROW_HOUSEHOLD + " TEXT,"
            + single7Im.ROW_7IM + " TEXT,"
            + single7Im.ROW_GPS_LNG + " TEXT,"
            + single7Im.ROW_GPS_LAT + " TEXT,"
            + single7Im.ROW_GPS_DT + " TEXT,"
            + single7Im.ROW_GPS_ACC + " TEXT,"
            + single7Im.ROW_UID + " TEXT);";
    /*******************************
     * Section 4b
     ******************************/

    public static final String SQL_CREATE_BASELINE_SEC4b = "CREATE TABLE IF NOT EXISTS " + Section4aEntry.TABLE_NAME + "("
            + Section4aEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Section4aEntry.ROW_DEVID + " TEXT,"
            + Section4aEntry.ROW_FORM_ID + " INTEGER,"
            + Section4aEntry.ROW_HHCODE + " TEXT,"
            + Section4aEntry.ROW_SNO + " TEXT,"
            + Section4aEntry.ROW_s4q42a + " TEXT,"
            + Section4aEntry.ROW_s4q42b + " TEXT,"
            + Section4aEntry.ROW_s4q42c + " TEXT,"
            + Section4aEntry.ROW_s4q42d + " TEXT,"
            + Section4aEntry.ROW_s4q42d1 + " TEXT,"
            + Section4aEntry.ROW_s4q42d2 + " TEXT,"
            + Section4aEntry.ROW_s4q42e + " TEXT,"
            + Section4aEntry.ROW_s4q42eoth + " TEXT,"
            + Section4aEntry.ROW_s4q42f + " TEXT,"
            + Section4aEntry.ROW_UID + " TEXT);";
    /*******************************
     * Get Cluster / UC
     ******************************/


    public static final String SQL_CREATE_CLUSTER = "CREATE TABLE IF NOT EXISTS " + ClusterEntry.TABLE_NAME + "("
            + ClusterEntry.ROW_UCCODE + " TEXT,"
            + ClusterEntry.ROW_UCNAME + " TEXT);";
    /*******************************
     * Get Villages
     ******************************/


    public static final String SQL_CREATE_VILLAGE = "CREATE TABLE IF NOT EXISTS " + VillageEntry.TABLE_NAME + "("
            + VillageEntry.ROW_VCODE + " TEXT,"
            + VillageEntry.ROW_VNAME + " TEXT,"
            + VillageEntry.ROW_UCNAME + " TEXT);";
    private static final String TAG = "Sec1";
    private static final String DATABASE_NAME = "src.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + UsersContract.singleUser.TABLE_NAME;
    private static final String SQL_DELETE_SEC1 =
            "DROP TABLE IF EXISTS " + Sec1Entry.TABLE_NAME;
    private static final String SQL_DELETE_SEC3 =
            "DROP TABLE IF EXISTS " + Sec3Entry.TABLE_NAME;
    private static final String SQL_DELETE_SEC4 =
            "DROP TABLE IF EXISTS " + Section4Entry.TABLE_NAME;
    private static final String SQL_DELETE_SEC_7_IM =
            "DROP TABLE IF EXISTS " + single7Im.TABLE_NAME;
    private static final String SQL_DELETE_SEC4b =
            "DROP TABLE IF EXISTS " + Section4Entry.TABLE_NAME;

    SRCDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_CLUSTER);
        db.execSQL(SQL_CREATE_VILLAGE);

        db.execSQL(SQL_CREATE_BASELINE_SEC1);
        db.execSQL(SQL_CREATE_BASELINE_SEC3);
        db.execSQL(SQL_CREATE_BASELINE_SEC4);
        db.execSQL(SQL_CREATE_SEC_7_IM);
        db.execSQL(SQL_CREATE_BASELINE_SEC4b);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(SQL_DELETE_USERS);
        db.execSQL(SQL_DELETE_SEC1);
        db.execSQL(SQL_DELETE_SEC3);
        db.execSQL(SQL_DELETE_SEC4);

        onCreate(db);
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

    public void syncCluster(JSONArray test) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(ClusterContract.ClusterEntry.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = test;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);
                String uccode = jsonObjectUser.getString("uccode");
                String ucname = jsonObjectUser.getString("ucname");

                ContentValues values = new ContentValues();

                values.put(ClusterEntry.ROW_UCCODE, uccode);
                values.put(ClusterEntry.ROW_UCNAME, ucname);

                db.insert(ClusterEntry.TABLE_NAME, null, values);
            }
            db.close();

        } catch (Exception e) {
        }
    }

    public void syncVillages(JSONArray test) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(VillageEntry.TABLE_NAME, null, null);

        try {
            JSONArray jsonArray = test;
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObjectUser = jsonArray.getJSONObject(i);

                String vcode = jsonObjectUser.getString("vcode");
                String vname = jsonObjectUser.getString("vname");
                String ucname = jsonObjectUser.getString("ucname");

                ContentValues values = new ContentValues();

                values.put(VillageEntry.ROW_VCODE, vcode);
                values.put(VillageEntry.ROW_VNAME, vname);
                values.put(VillageEntry.ROW_UCNAME, ucname);

                db.insert(VillageEntry.TABLE_NAME, null, values);
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
            String QUERY = "SELECT * FROM " + Section4aEntry.TABLE_NAME + " WHERE formid = '"
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


            newRowId = db.insert(Sec1Entry.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }

        return newRowId;
    }


    public Long InsertRecord_Section3(Sec3Contract fc) {
        long newRowId = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(Sec3Entry.ROW_DEVID, fc.getROW_DEVID());
            values.put(Sec3Entry.ROW_FORM_ID, fc.getROW_FORM_ID());
            values.put(Sec3Entry.ROW_HHCODE, fc.getROW_HHCODE());

            values.put(Sec3Entry.ROW_SNO, fc.getROW_SNO());

            values.put(Sec3Entry.ROW_s3q301a, fc.get_s3q301a());
            values.put(Sec3Entry.ROW_s3q301b, fc.get_s3q301b());
            values.put(Sec3Entry.ROW_s3q301c, fc.get_s3q301c());
            values.put(Sec3Entry.ROW_s3q301d, fc.get_s3q301d());
            values.put(Sec3Entry.ROW_s3q301f1, fc.get_s3q301f1());
            values.put(Sec3Entry.ROW_s3q301e, fc.get_s3q301e());
            values.put(Sec3Entry.ROW_s3q301f, fc.get_s3q301f());
            values.put(Sec3Entry.ROW_s3q301g, fc.get_s3q301g());
            values.put(Sec3Entry.ROW_s3q301h, fc.get_s3q301h());
            values.put(Sec3Entry.ROW_s3q301i, fc.get_s3q301i());
            values.put(Sec3Entry.ROW_s3q301j, fc.get_s3q301j());
            values.put(Sec3Entry.ROW_s3q301k, fc.get_s3q301k());

            values.put(Sec3Entry.ROW_UID, SRCApp.fc.getROW_UUID());

            newRowId = db.insert(Sec3Entry.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }

        return newRowId;
    }


    public Long InsertRecord_Section4a(Section4Contract fc) {
        long newRowId = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(Section4Entry.ROW_DEVID, fc.get_DEVID());
            values.put(Section4Entry.ROW_FORM_ID, fc.get_FORM_ID());
            values.put(Section4Entry.ROW_HHCODE, fc.get_HHCODE());

            values.put(Section4Entry.ROW_SNO, fc.get_SNO());

            values.put(Section4Entry.ROW_s4q41a, fc.get_s4q41a());
            values.put(Section4Entry.ROW_s4q41b, fc.get_s4q41b());
            values.put(Section4Entry.ROW_s4q41b1, fc.get_s4q41b1());
            values.put(Section4Entry.ROW_s4q41b2, fc.get_s4q41b2());
            values.put(Section4Entry.ROW_s4q41c, fc.get_s4q41c());
            values.put(Section4Entry.ROW_s4q41d, fc.get_s4q41d());
            values.put(Section4Entry.ROW_s4q41e, fc.get_s4q41e());

            values.put(Section4Entry.ROW_UID, SRCApp.fc.getROW_UUID());

            newRowId = db.insert(Section4Entry.TABLE_NAME, null, values);
            db.close();

        } catch (Exception e) {
        }

        return newRowId;
    }


    public Long InsertRecord_Section4b(Section4aContract fc) {
        long newRowId = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        try {
            ContentValues values = new ContentValues();

            values.put(Section4aEntry.ROW_DEVID, fc.get_deviceid());
            values.put(Section4aEntry.ROW_FORM_ID, fc.get_form_id());
            values.put(Section4aEntry.ROW_HHCODE, fc.get_hhcdoe());

            values.put(Section4aEntry.ROW_SNO, fc.get_sno());

            values.put(Section4aEntry.ROW_s4q42a, fc.get_s4q42a());
            values.put(Section4aEntry.ROW_s4q42b, fc.get_s4q42b());
            values.put(Section4aEntry.ROW_s4q42c, fc.get_s4q42c());
            values.put(Section4aEntry.ROW_s4q42d, fc.get_s4q42d());
            values.put(Section4aEntry.ROW_s4q42d1, fc.get_s4q42d1());
            values.put(Section4aEntry.ROW_s4q42d2, fc.get_s4q42d2());
            values.put(Section4aEntry.ROW_s4q42e, fc.get_s4q42e());
            values.put(Section4aEntry.ROW_s4q42eoth, fc.get_s4q42eoth());
            values.put(Section4aEntry.ROW_s4q42f, fc.get_s4q42f());

            values.put(Section4aEntry.ROW_UID, SRCApp.fc.getROW_UUID());

            newRowId = db.insert(Section4aEntry.TABLE_NAME, null, values);
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

    public Long addSec7Im(Sec7ImContract s7im) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(single7Im._ID, s7im.get_ID());
        values.put(single7Im.ROW_DEVID, s7im.getROW_DEVID());
        values.put(single7Im.ROW_ENTRYDATE, s7im.getROW_ENTRYDATE());
        values.put(single7Im.ROW_USERID, s7im.getROW_USERID());
        values.put(single7Im.ROW_UUID, s7im.getROW_UUID());
        values.put(single7Im.ROW_UID, s7im.getROW_UID());
        values.put(single7Im.ROW_HOUSEHOLD, s7im.getHousehold());
        values.put(single7Im.ROW_7IM, s7im.getROW_7IM());
        values.put(single7Im.ROW_GPS_LNG, s7im.getROW_GPS_LNG());
        values.put(single7Im.ROW_GPS_LAT, s7im.getROW_GPS_LAT());
        values.put(single7Im.ROW_GPS_DT, s7im.getROW_GPS_DT());
        values.put(single7Im.ROW_GPS_ACC, s7im.getROW_GPS_ACC());


        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                single7Im.TABLE_NAME,
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

                // Adding contact to list
                formList.add(SRCApp.fc);
            } while (cursor.moveToNext());
        }

        // return contact list
        return formList;
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
                single7Im.ROW_HOUSEHOLD,
                single7Im.ROW_7IM,
                single7Im.ROW_GPS_LNG,
                single7Im.ROW_GPS_LAT,
                single7Im.ROW_GPS_DT,
                single7Im.ROW_GPS_ACC,
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
        fc.ROW_S6 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S6));
        fc.ROW_S7 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S7));
        fc.ROW_S8 = c.getString(c.getColumnIndex(Sec1Entry.ROW_S8));
        fc.ROW_UUID = c.getString(c.getColumnIndex(Sec1Entry.ROW_UUID));
        fc.ROW_GPS_LNG = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_LNG));
        fc.ROW_GPS_LAT = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_LAT));
        fc.ROW_GPS_DT = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_DT));
        fc.ROW_GPS_ACC = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_ACC));

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

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {

                    Members m = new Members();

                    Section4aContract sc = new Section4aContract();
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


    public ArrayList<Members> getCluster() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Members> userList = null;
        try {
            userList = new ArrayList<Members>();
            String QUERY = "SELECT * FROM " + ClusterEntry.TABLE_NAME;
            Cursor cursor = db.rawQuery(QUERY, null);

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    ClusterContract hf = new ClusterContract();

                    hf.setROW_UCCODE(cursor.getString(0));
                    hf.setROW_UCNAME(cursor.getString(1));

                    userList.add(new Members(hf.getROW_UCCODE(), hf.getROW_UCNAME()));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }


    public ArrayList<Members> getVillages(String ucname) {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Members> userList = null;
        try {
            userList = new ArrayList<Members>();
            String QUERY = "SELECT * FROM " + VillageEntry.TABLE_NAME + " WHERE "
                    + VillageEntry.ROW_UCNAME + "='" + ucname + "'";

            Cursor cursor = db.rawQuery(QUERY, null);

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    VillageContract hf = new VillageContract();

                    hf.setROW_VCODE(cursor.getString(0));
                    hf.setROW_VNAME(cursor.getString(1));

                    userList.add(new Members(hf.getROW_VCODE(), hf.getROW_VNAME()));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }

    public ArrayList<Members> getVillages() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<Members> userList = null;
        try {
            userList = new ArrayList<Members>();
            String QUERY = "SELECT * FROM " + VillageEntry.TABLE_NAME;

            Cursor cursor = db.rawQuery(QUERY, null);

            if (!cursor.isLast()) {
                while (cursor.moveToNext()) {
                    VillageContract hf = new VillageContract();

                    hf.setROW_VCODE(cursor.getString(0));
                    hf.setROW_VNAME(cursor.getString(1));

                    userList.add(new Members(hf.getROW_VCODE(), hf.getROW_VNAME()));
                }
            }
            db.close();
        } catch (Exception e) {
        }
        return userList;
    }


    public String getUCCode(String ucname) {
        SQLiteDatabase db = this.getReadableDatabase();
        String uccode = "";

        try {
            String QUERY = "SELECT * FROM " + ClusterEntry.TABLE_NAME + " WHERE " +
                    ClusterEntry.ROW_UCNAME + " = '" + ucname + "'";

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


    public String getVCode(String ucname, String vname) {
        SQLiteDatabase db = this.getReadableDatabase();
        String vcode = "";

        try {
            String QUERY = "SELECT * FROM " + VillageEntry.TABLE_NAME + " WHERE " +
                    VillageEntry.ROW_UCNAME + " = '" + ucname + "' AND " +
                    VillageEntry.ROW_VNAME + " = '" + vname + "'";

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

}