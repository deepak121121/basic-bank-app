package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    TextView textView1,textView2,textView3;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView1=findViewById(R.id.name_text);
        textView2=findViewById(R.id.balance_text);
        textView3=findViewById(R.id.email_text);
        button3=findViewById(R.id.button);

        Intent intent=getIntent();
        textView1.setText(intent.getStringExtra("name"));
        textView2.setText(intent.getStringExtra("balance"));
        textView3.setText(intent.getStringExtra("email"));
    }
    public void data(View view){
        DbTransfer dbTransfer=new DbTransfer(this);
     Intent intent=new Intent(MainActivity3.this,MainActivity4.class);
     startActivity(intent);

    }

}