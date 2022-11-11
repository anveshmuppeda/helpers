package com.example.hp.helpers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main27Activity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);
        b1=(Button)findViewById(R.id.button9);
        rg=(RadioGroup)findViewById(R.id.radio);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(i);
                if(i==1) {

                    Toast.makeText(getApplicationContext(), "NOW YOUR  AVILABLE", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "NOW YOUR NOT AVILABLE", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
