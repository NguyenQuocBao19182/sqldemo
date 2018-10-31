package com.example.philong.myapplication;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DataBase dataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tao database
         dataBase=new DataBase(this,"ghichu.sqlite",null,1);
         //tao table
        dataBase.QueryDaTa("create table if not exists congviec(id integer primary key ,ten cv varchar(40))");
        //insert du lieu
        dataBase.QueryDaTa("insert into congviec values(01,'lambaitapandroid') ");
        dataBase.QueryDaTa("insert into congviec values(02,'ghichu') ");

        //select data
        Cursor dataCongViec=dataBase.GetDaTa("select * from congviec");
        while (dataCongViec.moveToNext()){
            String ten=dataCongViec.getString(1);
            Toast.makeText(this, ten, Toast.LENGTH_SHORT).show();
        }

    }
}
