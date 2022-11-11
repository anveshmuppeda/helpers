package com.example.hp.helpers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    TextView tv11,tv12,tv14,tv15;
    EditText et6,et7;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        tv11=(TextView)findViewById(R.id.textView9);
        tv11.setText("AVAILABLE STATUS");
        tv11.setTextColor(0xff444444);

        et6=(EditText)findViewById(R.id.editText3);
        et7=(EditText)findViewById(R.id.editText7);

        tv12=(TextView)findViewById(R.id.textView13);
        tv12.setText("     ADDRESS:");
        tv12.setTextColor(0xFF000000);

        tv14=(TextView)findViewById(R.id.textView14);
        tv14.setText("     PIN CODE:");
        tv14.setTextColor(0xFF000000);

        b1=(Button)findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et6.getText().toString();
                String s2=et7.getText().toString();
                int l1,l2;
                l1=s1.length();
                l2=s2.length();
                if (l2==6 && l1>2)
                {
                Intent it2=new Intent(Main5Activity.this,Main14Activity.class);
                startActivity(it2);
            }
            else
                {
                    if(l1<3)
                    {
                        et6.setError("inavalid area");
                        et6.requestFocus();
                    }
                    if(l2<6)
                    {
                        et7.setError("invalid pincode");
                        et7.requestFocus();
                    }
                }
            }

        });


    }
}
