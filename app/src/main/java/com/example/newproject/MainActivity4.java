package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {


    private static final long SPLASH_SCREEN = 5000 ;
    Animation top_anim,bottom_anim;
    ImageView image1;
    //TextView logo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main4);


        top_anim= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottom_anim= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        image1=findViewById(R.id.im1);
        //logo=findViewById(R.id.textView);

        image1.setAnimation(top_anim);
        //logo.setAnimation(bottom_anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}