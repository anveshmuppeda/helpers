package com.example.hp.helpers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView tv1,tv,tv2,tv3,tv4,tv7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tv7=findViewById(R.id.textView19);
        tv7.setText("©AGI CSE DEPT @2018");
        tv7.setTextColor(0xFFFF0000);


        tv=findViewById(R.id.textView38);
        tv.setText("DESCRIPTION");
        tv.setTextColor(0xFF000000);
        tv1=findViewById(R.id.textView39);
        tv1.setText("   This app helps the people to find technician with different functionalities.It makes an " +
                "easier way for the people to solve their problem like delivery and home services.\n" +
                "   In this application we have basically two modules. The first module include user module.The" +
                "user has to register for any enquiry related to technician. The unregistered person can’t access" +
                "this application. The registered user can view the details of technician and can choose" +
                "technician with their choice and need. They has to pay for the work.\n" +
                "   The technician can get register using personal details and the field which is required and" +
                "receives a call from user for a particular task to complete.");
        tv1.setTextColor(0xFF000000);
        tv=findViewById(R.id.textView40);
        tv.setText("INSTALLATION STEPS ");
        tv.setTextColor(0xFF000000);
        tv=findViewById(R.id.textView41);
        tv.setText("STEP 1: Install application from playstore.\n"+
        "STEP 2: Select one module either TECHNICIAN or USER.\n"+"STEP 3: Register or else if you have an account then you click on LOGIN.\n"
        +"STEP 4: If you register as technician then after register or login you can manage your status.\n"
        +"STEP 5: If you register as User then after register or login you can use services.\n");

        tv.setTextColor(0xFF000000);
    }
}
