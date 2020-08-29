package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textview=(TextView)findViewById(R.id.textView2);
        Intent intent=getIntent();
        String str1=intent.getStringExtra("name2");
        String str2=intent.getStringExtra("fooditem2");
        String str3=intent.getStringExtra("quantity2");
        String str4=intent.getStringExtra("foodtiming2");
        String str5=intent.getStringExtra("address2");
        String str=str1+" "+str2+" "+str3+" "+str4+" "+str5;



        textview.setText(str);

    }
}