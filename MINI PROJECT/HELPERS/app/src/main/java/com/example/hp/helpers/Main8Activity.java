package com.example.hp.helpers;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {
    TextView tv81,tv82,tv83,tv84,tv85,tv86,tv87,tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        tv81=(TextView)findViewById(R.id.et1);
        tv81.setText("NAME");
        tv82=(TextView)findViewById(R.id.et2);
        tv82.setText("MBL NUM");
        tv85=(TextView)findViewById(R.id.et3);
        tv85.setText("STATUS");
        tv83=(TextView)findViewById(R.id.et4);
        tv83.setText("*******");
        tv87=(TextView)findViewById(R.id.textView15);
        tv87.setText("        FOOD DELIVERY BOYS");
        tv87.setTextColor(0xFFFFFFFF);

        tv1=(TextView)findViewById(R.id.et9);
        tv1.setText("Available");
        tv2=(TextView)findViewById(R.id.et8);
        tv2.setText("8919543559");

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_CALL);
                it.setData(Uri.parse("tel:" + "8919543559"));
                startActivity(it);
            }
        });

        tv86=(TextView)findViewById(R.id.et6);
        tv86.setText("Available");
        tv84=(TextView)findViewById(R.id.et5);
        tv84.setText("9133233277");

        tv84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Intent.ACTION_CALL);
                it.setData(Uri.parse("tel:" + "9133233277"));
                startActivity(it);
            }
        });
    }
}