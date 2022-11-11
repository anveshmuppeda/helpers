package com.example.hp.helpers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv,tv1,tv2,tv3,tv4,tv5,tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       tv=findViewById(R.id.textView18);
       tv.setText("DESCRIPTION");
       tv.setTextColor(0xFF000000);
        tv=findViewById(R.id.textView30);
        tv.setText("INSTALING STEPS");
        tv.setTextColor(0xFF000000);
        tv1=findViewById(R.id.textView20);
        tv1.setText("This is android based application which helps people to find any type of technician with different functionalities. It is useful in the way that it makes an easier way for the people to solve their problems like delivery and home services.In this application we have basically two modules. The first module includes customer module. The customer have to register for any enquiry related to technician. The unregistered person can’t access this application. The registered customer can view details of technicians and he can chose any technician of his choice and need.  He has to pay for the work. The admin module contains the access of admin on the application. The admin can changes everything in the application. He has the ability to add, delete, and update any information regarding the technicians.\n");
        tv1.setTextColor(0xFF000000);
        tv2=findViewById(R.id.textView21);
        tv2.setText("STEP 1: Instal application from playstore.");
        tv2.setTextColor(0xFF000000);
        tv3=findViewById(R.id.textView31);
        tv3.setText("STEP 2: Select one module either TECHNICIAN or USER.");
        tv3.setTextColor(0xFF000000);
        tv4=findViewById(R.id.textView32);
        tv4.setText("STEP 3: Register or else if you have an account then you click on LOGIN.");
        tv4.setTextColor(0xFF000000);
        tv5=findViewById(R.id.textView33);
        tv5.setText("STEP 4: If you register as technician then after register or login you can manage your status.");
        tv5.setTextColor(0xFF000000);
        tv6=findViewById(R.id.textView36);
        tv6.setText("STEP 5: If you register as User then after register or login you can use services.");
        tv6.setTextColor(0xFF000000);
    }
}
