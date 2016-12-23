package edu.aku.hassannaqvi.mnch_src;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import edu.aku.hassannaqvi.mnch_src.FormContract.Sec1Entry;
import edu.aku.hassannaqvi.mnch_src.Sec3Contract.Sec3Entry;

import org.json.JSONArray;
import org.json.JSONObject;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by isd on 20/10/2016.
 */
public class SRCDBHelper extends SQLiteOpenHelper {

    private static final String TAG = "Sec1";
    private static final String DATABASE_NAME = "src.db";
    private static final int DATABASE_VERSION = 3;

    public static final String SQL_CREATE_USERS = "CREATE TABLE IF NOT EXISTS " + UsersContract.singleUser.TABLE_NAME + "("
            + UsersContract.singleUser._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersContract.singleUser.ROW_USERNAME + " TEXT,"
            + UsersContract.singleUser.ROW_PASSWORD + " TEXT,"
            + UsersContract.singleUser.ROW_USERSTATUS + " TEXT,"
            + UsersContract.singleUser.ROW_ISADMIN + " TEXT );";

    private static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + UsersContract.singleUser.TABLE_NAME;


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


    private static final String SQL_DELETE_SEC1 =
            "DROP TABLE IF EXISTS " + Sec1Entry.TABLE_NAME;


    public static final String SQL_CREATE_BASELINE_SEC3 = "CREATE TABLE IF NOT EXISTS " + Sec3Entry.TABLE_NAME + "("
            + Sec3Entry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + Sec3Entry.ROW_DEVID + " TEXT,"
            + Sec3Entry.ROW_FORM_ID + " INTEGER,"
            + Sec3Entry.ROW_S3 + " TEXT);";

    private static final String SQL_DELETE_SEC3 =
            "DROP TABLE IF EXISTS " + Sec3Entry.TABLE_NAME;


    SRCDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_USERS);
        db.execSQL(SQL_CREATE_BASELINE_SEC1);
        db.execSQL(SQL_CREATE_BASELINE_SEC3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //db.execSQL(SQL_DELETE_USERS);
        //db.execSQL(SQL_DELETE_SEC1);
        //db.execSQL(SQL_DELETE_SEC3);

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
        //db.delete(UsersContract.singleUser.TABLE_NAME, null, null);

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
        fc.ROW_UID = c.getString(c.getColumnIndex(Sec1Entry.ROW_UUID));
        fc.ROW_GPS_LANG = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_LNG));
        fc.ROW_GPS_LAT = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_LAT));
        fc.ROW_GPS_DT = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_DT));
        fc.ROW_GPS_ACC = c.getString(c.getColumnIndex(Sec1Entry.ROW_GPS_ACC));

        return fc;
    }


}