package com.example.hp.helpers;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main19Activity extends AppCompatActivity {
    TextView tv81,tv82,tv83,tv84,tv85,tv86,tv87,tv4,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        tv81=(TextView)findViewById(R.id.et1);
        tv81.setText("NAME");
        tv82=(TextView)findViewById(R.id.et2);
        tv82.setText("MBL NUM");
        tv85=(TextView)findViewById(R.id.et3);
        tv85.setText("STATUS");
        tv83=(TextView)findViewById(R.id.et4);
        tv83.setText("Ramesh");
        tv84=(TextView)findViewById(R.id.et5);
        tv84.setText("9876543210");
        tv86=(TextView)findViewById(R.id.et6);
        tv86.setText("not available");
        tv87=(TextView)findViewById(R.id.textView15);
        tv87.setText("H/W SUPPORTOR");
        tv87.setTextColor(0xFFFFFFFF);

        tv86=(TextView)findViewById(R.id.et6);
        tv86.setText("Available");
        tv84=(TextView)findViewById(R.id.et5);
        tv84.setText("8008760730");

        tv84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_CALL);
                it.setData(Uri.parse("tel:" + "8008760730"));
                startActivity(it);
            }
        });

        tv6=(TextView)findViewById(R.id.et9);
        tv6.setText("Available");
        tv4=(TextView)findViewById(R.id.et8);
        tv4.setText("8328501140");

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_CALL);
                it.setData(Uri.parse("tel:" + "8328501140"));
                startActivity(it);
            }
        });

    }
}
