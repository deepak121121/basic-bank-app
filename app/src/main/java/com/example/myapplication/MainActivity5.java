package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    RecyclerView recyclerView2;
    ArrayList<Model2>list2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        recyclerView2=findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        list2=new ArrayList<>();
        Cursor cursor=  new DbTransfer(this).fetch2();

        while(cursor.moveToNext()) {

            Model2 model1 = new Model2(cursor.getString(1),cursor.getString(2),cursor.getString(3));

            list2.add(model1);
        }
        Adapter2 adapter1=new Adapter2(MainActivity5.this,this.list2);
        recyclerView2.setAdapter(adapter1);

    }
}