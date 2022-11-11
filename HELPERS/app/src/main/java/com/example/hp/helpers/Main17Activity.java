package com.example.hp.helpers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main17Activity extends AppCompatActivity {
    TextView tv81,tv82,tv83,tv84,tv85,tv86,tv87;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        tv81=(TextView)findViewById(R.id.et1);
        tv81.setText("NAME");
        tv82=(TextView)findViewById(R.id.et2);
        tv82.setText("MBL NUM");
        tv85=(TextView)findViewById(R.id.et3);
        tv85.setText("STATUS");
        tv83=(TextView)findViewById(R.id.et4);
        tv83.setText("*******");
        tv84=(TextView)findViewById(R.id.et5);
        tv84.setText("9876543210");
        tv86=(TextView)findViewById(R.id.et6);
        tv86.setText("not available");
        tv87=(TextView)findViewById(R.id.textView15);
        tv87.setText("ELECTRICIAN");
        tv87.setTextColor(0xFFFFFFFF);

    }
}
