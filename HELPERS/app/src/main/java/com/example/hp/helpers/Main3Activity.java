package com.example.hp.helpers;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3Activity extends AppCompatActivity {

    EditText et, et1, et2, et3, et4, et5;
    TextView tv4, tv5, tv6, tv7, tv8, tv9, tv10;
    Button b3, b4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv4 = (TextView) findViewById(R.id.textView16);
        tv4.setText("TECHNICIAN");
        tv4.setTextColor(0xff444444);

        tv5 = (TextView) findViewById(R.id.textView8);
        tv5.setText("       USER NAME:");
        tv5.setTextColor(0xFFFFFFFF);
        et = (EditText) findViewById(R.id.editText4);

        tv6 = (TextView) findViewById(R.id.textView10);
        tv6.setText("        PASSWORD:");
        tv6.setTextColor(0xFFFFFFFF);
        et1 = (EditText) findViewById(R.id.editText2);

        tv7 = (TextView) findViewById(R.id.textView11);
        tv7.setText("                 GMAIL:");
        tv7.setTextColor(0xFFFFFFFF);
        et2 = (EditText) findViewById(R.id.editText);

        tv8 = (TextView) findViewById(R.id.textView2);
        tv8.setText("               PHN NO:");
        tv8.setTextColor(0xFFFFFFFF);
        et3 = (EditText) findViewById(R.id.editText5);

        tv9 = (TextView) findViewById(R.id.textView7);
        tv9.setText("            ADDRESS:");
        tv9.setTextColor(0xFFFFFFFF);
        et4 = (EditText) findViewById(R.id.editText6);


        tv10 = (TextView) findViewById(R.id.textView12);
        tv10.setText("                   FIELD:");
        tv10.setTextColor(0xFFFFFFFF);
        et5 = (EditText) findViewById(R.id.editText8);
        b3=(Button)findViewById(R.id.button3);

        b4 = (Button) findViewById(R.id.button10);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main3Activity.this, Main26Activity.class);
                startActivity(it);
            }
        });


     //   findViewById(R.id.button3).setOnClickListener(this);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1, s2, s3, s4, s5, s6;
                int l1,l2,l3,l4,l5,l6;
                s1 = et.getText().toString();
                s2 = et1.getText().toString();
                s3 = et2.getText().toString();
                s4 = et3.getText().toString();
                s5 = et4.getText().toString();
                s6 = et5.getText().toString();

                l1=s1.length();
                l2=s2.length();
                l3=s3.length();
                l4=s4.length();
                l5=s5.length();
                l6=s6.length();
                if(l1>2 && l2==8 && l3>10 && l4==10 && l5>2 && l6>2)
                {
                    FirebaseDatabase database=FirebaseDatabase.getInstance();
                    DatabaseReference databaseReference=database.getReference("technician");
                    Storetech reg=new Storetech(s1,s2,s3,s4,s5,s6);
                    databaseReference.child(s1).setValue(reg);
                    Intent it1 = new Intent(Main3Activity.this, Main27Activity.class);
                    startActivity(it1);
                }
                else
                {
                    if(l1<3)
                    {
                        et.setError("invalid user name");
                        et.requestFocus();
                    }
                    if(l2!=8)
                    {
                        et1.setError("password must have 8 characters");
                        et1.requestFocus();
                    }
                    if(l3<=10)
                    {
                        et2.setError("invalid mail Id");
                        et2.requestFocus();
                    }
                    if(l4!=10)
                    {
                        et3.setError("Invalid mbl number");
                        et3.requestFocus();
                    }
                    if(l5<3)
                    {
                        et4.setError("invaid addres");
                        et4.requestFocus();
                    }
                    if(l6<3)
                    {
                        et5.setError("invalid field");
                        et5.requestFocus();
                    }
                }



            }
        });
    }


}

