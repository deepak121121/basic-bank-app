package com.example.myapplication;



import android.database.Cursor;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model>list;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list=new ArrayList<>();
        Cursor cursor=  new DbManager(this).fetch();

        while(cursor.moveToNext()) {

            Model model = new Model(cursor.getString(1),cursor.getString(2),cursor.getString(5),
                    cursor.getString(4),cursor.getString(3));

            list.add(model);
        }
        Adapter adapter=new Adapter(MainActivity2.this,this.list);
        recyclerView.setAdapter(adapter);



    }
}