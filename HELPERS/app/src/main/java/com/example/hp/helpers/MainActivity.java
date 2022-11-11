package com.example.hp.helpers;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Button tech;
    ImageButton user,tech;
    TextView tv1,tv2,tv3,tv4,tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tech=(ImageButton) findViewById(R.id.button);
     //   user=(Button)findViewById(R.id.button2);
        ImageButton user=(ImageButton)findViewById(R.id.button2);
      //  tv=(TextView)findViewById(R.id.textView3);
       // tv.setText("    HELPERS");
        //tv.setTextColor(0xFFFFFFFF);
        ImageView im=(ImageView)findViewById(R.id.imageView2);
        ImageView im2=(ImageView)findViewById(R.id.imageView3);

        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.logo);
        RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        roundedBitmapDrawable.setCircular(true);
        im.setImageDrawable(roundedBitmapDrawable);

        Bitmap bitmap2= BitmapFactory.decodeResource(getResources(),R.drawable.about);
        RoundedBitmapDrawable roundedBitmapDrawable2= RoundedBitmapDrawableFactory.create(getResources(),bitmap2);
        roundedBitmapDrawable2.setCircular(true);
        im2.setImageDrawable(roundedBitmapDrawable2);

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent it2=new Intent(MainActivity.this,Main2Activity.class);
               startActivity(it2);
            }
        });

        tv1=(TextView)findViewById(R.id.textView4);
        tv1.setText("      CONTACT INFO");
        tv1.setTextColor(0xFF000000);

        tv2=(TextView)findViewById(R.id.textView5);
        tv2.setText("MAIN BRANCH:UPPAL");
        tv2.setTextColor(0xFF000000);
        tv3=(TextView)findViewById(R.id.textView6);
        tv3.setText("             MBL NO:8008748589");
        tv3.setTextColor(0xFF000000);

        tv4=(TextView)findViewById(R.id.textView28);
        tv4.setText("TECHNICIAN");
        tv4.setTextColor(0xFF000000);
        tv5=(TextView)findViewById(R.id.textView29);
        tv5.setText("USER");
        tv5.setTextColor(0xFF000000);


        tech.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent it=new Intent(MainActivity.this,Main3Activity.class);
             startActivity(it);

         }
     });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1=new Intent(MainActivity.this,Main6Activity.class);
                startActivity(it1);

            }
        });
    }
}
