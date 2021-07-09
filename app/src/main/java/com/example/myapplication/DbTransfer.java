 package com.example.myapplication;






import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import androidx.annotation.Nullable;


public class DbTransfer extends SQLiteOpenHelper {
    public static final String name = "data.file";

    public DbTransfer(Context context) {
        super(context, name, null, 3);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry2 = "create table transfer_list(ID Integer primary key autoincrement,from_name text,to_name text,amount text)";
        db.execSQL(qry2);






    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS transfer_list");
        onCreate(db);

    }

    public String add1(String p1, String p2, String p3) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv1 = new ContentValues();
        cv1.put("from_name",p1);
        cv1.put("to_name",p2);
        cv1.put("amount",p3);



        long res = db.insert("transfer_list", null, cv1);
        if (res == -1)
            return "false";
        else
            return "true";

    }

    //   we can create method by using cursor because cursor are used to fetch the data

    public Cursor fetch2() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor= db.rawQuery("SELECT * FROM transfer_list", null);

        return cursor;
    }




}

