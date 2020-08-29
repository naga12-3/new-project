package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity2 extends AppCompatActivity {
    //TextInputLayout textInputLayout;
    Button button;
    TextInputEditText name1,fooditem1,quantity1,foodtiming1,address1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //textInputLayout = findViewById(R.id.fooditem);
        name1=findViewById(R.id.name1);
        fooditem1=findViewById(R.id.fooditem1);
        quantity1=findViewById(R.id.quantity1);
        foodtiming1=findViewById(R.id.foodtiming1);
        address1=findViewById(R.id.address1);

        button = (Button) findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String test=name1.getText().toString().trim();
                String test1=fooditem1.getText().toString().trim();
                String test2=quantity1.getText().toString().trim();
                String test3=foodtiming1.getText().toString().trim();
                String test4=address1.getText().toString().trim();
                //String hi=test+test1+test2+test3+test4;
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("name2",test);
                intent.putExtra("fooditem2",test1);
                intent.putExtra("quantity2",test2);
                intent.putExtra("foodtiming2",test3);
                intent.putExtra("address1",test4);
                startActivity(intent);





                //Toast.makeText(getApplicationContext(),hi,Toast.LENGTH_LONG).show();
            }

        });
    }









}