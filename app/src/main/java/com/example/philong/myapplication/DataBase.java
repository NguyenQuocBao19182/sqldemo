package com.example.philong.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper{


    public DataBase (Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //ham de su dung truy van khong ket qua create,insert,update



    public void QueryDaTa(String sql){
        SQLiteDatabase database=getWritableDatabase();
        database.execSQL(sql);

    }
    //ham de su dung truy van co ket qua select,tra ve kieu con tro cursor

    public Cursor GetDaTa(String sql){

        SQLiteDatabase database=getReadableDatabase();
        return database.rawQuery(sql,null);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
