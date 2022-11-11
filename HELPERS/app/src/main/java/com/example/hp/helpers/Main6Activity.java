package com.example.hp.helpers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main6Activity extends AppCompatActivity {
     TextView tv25,tv26,tv27,tv23,tv24,tv28,tv29;
    EditText et20,et21,et22,et23,et24;
    Button b21,b22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        b21=(Button)findViewById(R.id.button6);
        b22=(Button)findViewById(R.id.button7);


        tv23=(TextView)findViewById(R.id.textView23);
        tv23.setText("       USER NAME:");
        tv23.setTextColor(0xFF000000);

        tv28=(TextView)findViewById(R.id.textView17);
        tv28.setText("already have an account");
        tv28.setTextColor(0xFFFF0000);

        tv28=(TextView)findViewById(R.id.textView22);
        tv28.setText("REGISTRATION");
        tv28.setTextColor(0xff444444);

        tv24=(TextView)findViewById(R.id.textView24);
        tv24.setText("        PASSWORD:");
        tv24.setTextColor(0xFF000000);

        tv25=(TextView)findViewById(R.id.textView25);
        tv25.setText("              STREET:");
        tv25.setTextColor(0xFF000000);

        tv26=(TextView)findViewById(R.id.textView26);
        tv26.setText("         HOUSE NO:");
        tv26.setTextColor(0xFF000000);

        tv27=(TextView)findViewById(R.id.textView27);
        tv27.setText("         PHONE NO:");
        tv27.setTextColor(0xFF000000);



        et20=(EditText)findViewById(R.id.editText14);
        et21=(EditText)findViewById(R.id.editText21);
        et22=(EditText)findViewById(R.id.editText16);
        et23=(EditText)findViewById(R.id.editText15);
        et24=(EditText)findViewById(R.id.editText17);


        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2,s3,s4,s5;
                int l1,l2,l3,l4,l5;
                s1=et20.getText().toString();
                s2=et21.getText().toString();
                s3=et22.getText().toString();
                s4=et23.getText().toString();
                s5=et24.getText().toString();

                l1=s1.length();
                l2=s2.length();
                l3=s3.length();
                l4=s4.length();
                l5=s5.length();



                if(l1>2 && l2==8 && l3>2 && l4==10 && l5>2 )
                {
                    FirebaseDatabase database=FirebaseDatabase.getInstance();
                    DatabaseReference databaseReference=database.getReference("User");
                    UserStore reg1=new UserStore(s1,s2,s3,s4,s5);
                    databaseReference.child(s1).setValue(reg1);
                    Intent it=new Intent(Main6Activity.this,Main5Activity.class);
                    startActivity(it);

                }
                else
                {
                    if(l1<3)
                    {
                        et20.setError("invalid user name");
                        et20.requestFocus();
                    }
                    if(l2!=8)
                    {
                        et21.setError("password must have 8 characters");
                        et21.requestFocus();
                    }
                    if(l3<3)
                    {
                        et22.setError("invalid street name");
                        et22.requestFocus();
                    }
                    if(l4!=10)
                    {
                        et23.setError("Invalid mbl number");
                        et23.requestFocus();
                    }
                    if(l5<3)
                    {
                        et24.setError("invaid house number");
                        et24.requestFocus();
                    }

                }



            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it21=new Intent(Main6Activity.this,Main23Activity.class);
                startActivity(it21);
            }
        });
    }
}
