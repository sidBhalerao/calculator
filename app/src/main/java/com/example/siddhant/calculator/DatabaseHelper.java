
package com.example.siddhant.calculator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.design.widget.TabLayout;

public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String Database_name = " Calculator.db";
    public static final String Table_name = " Number_table ";
    public static final String value1 = " first_value";
    public static final String value2 = " second_value";
    public static final String result = "  Result";



    public DatabaseHelper(Context context )
    {
        super(context, Database_name, null, 1);

    }
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table" + Table_name + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,first_value INTEGER, second_value INTEGER, result INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insertData(String val1, String val2, String val3)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(value1,val1);
        contentValues.put(value2,val2);
        contentValues.put(result,val3);
        long output = db.insert(Table_name,null,contentValues);
        if(output == -1)

            return false;
        else
            return true;

    }
    public Cursor getAlldata()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from"+ Table_name,null);
        return res;
    }

}
