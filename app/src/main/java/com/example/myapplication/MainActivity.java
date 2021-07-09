package com.example.myapplication;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button=findViewById(R.id.button2);


    }
    public void userlist(View view){
        DbManager db=new DbManager(this);

      db.add("deepak","9999 Rs/","choubeydeepak101@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        db.add("kabir singh","8999 Rs/","XXXXXXXXXX@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        db.add("rahul sharma","9999 Rs/","XXXXXXXXX@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        db.add("vvh rathi","7999 Rs/","XXXXXXXXX@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        db.add("keshav sharma","6999 Rs/","XXXXXXXXX@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        db.add("vikas rajput","5999 Rs/","XXXXXXXXX@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        db.add("rishab singh","4999 Rs/","XXXXXXXXX@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        db.add("ritika rathi","3999 Rs/","choubeydeepak101@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        db.add("kunal sharma","2999 Rs/","choubeydeepak101@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        db.add("anjul rathi","1999 Rs/","choubeydeepak101@gmail.com","hdfc1167901", "XXXXXXXXXXXX5555");
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
    public void Transfer(View view){
        Intent intent=new Intent(MainActivity.this,MainActivity5.class);
        startActivity(intent);

    }

}