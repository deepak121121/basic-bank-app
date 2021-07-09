package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button button8;
    EditText editText1,editText2,editText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button8=findViewById(R.id.button8);
        editText1=findViewById(R.id.editText7);
        editText2=findViewById(R.id.editText11);
        editText3=findViewById(R.id.editText6);


    }
    public void money(View view){
        DbTransfer dbTransfer=new DbTransfer(this);
        String result=   dbTransfer.add1(editText1.getText().toString(),editText2.getText().toString(),editText3.getText().toString());
        Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(MainActivity4.this,MainActivity.class);
        startActivity(intent);





    }



}