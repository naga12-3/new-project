package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView name_,fooditem_,quantity_,address_,date_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        name_=(TextView)findViewById(R.id.name_);
        fooditem_=(TextView)findViewById(R.id.fooditem_);
        quantity_=(TextView)findViewById(R.id.quantity_);
        address_=(TextView)findViewById(R.id.address_);
        date_=(TextView)findViewById(R.id.date_);

        Intent intent=getIntent();
        String str1=intent.getStringExtra("name2");
        String str2=intent.getStringExtra("fooditem2");
        String str3=intent.getStringExtra("quantity2");
        String str4=intent.getStringExtra("foodtiming2");
        String str5=intent.getStringExtra("address2");
        String str6=intent.getStringExtra("date2");
        String str7=intent.getStringExtra("time2");

        //String str=str1+" "+str2+" "+str3+" "+str4+" "+str5;
        name_.setText(str1);
        fooditem_.setText(str2);
        quantity_.setText(str3);
        address_.setText(str5);
        String str8=str6+"\n"+"TIME-"+str7;
        date_.setText(str8);



        //textview.setText(str);

    }
}