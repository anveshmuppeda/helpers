package com.example.hp.helpers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main14Activity extends Activity {

    ListView simpleList;
    String countryList[] = {"       DELIVERY", "1:Food","2:Home needs","      HOME SERVICES","1:Electrician","2:Plumber","3:H/W suportor","4:Home servants","5:Mechanics"};
    int flags[] = { R.drawable.d1,R.drawable.f1, R.drawable.h1,R.drawable.hs1,R.drawable.e1,R.drawable.p1,R.drawable.hw1,R.drawable.hs2,R.drawable.m1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              //  String s=simpleList.getItemAtPosition(position).toString();
                //Toast.makeText(getApplicationContext(),countryList[position],Toast.LENGTH_LONG).show();
                if(position==1)
                {
                    Intent it141=new Intent(Main14Activity.this,Main8Activity.class);
                    startActivity(it141);
                }
                if(position==2)
                {
                    Intent it142=new Intent(Main14Activity.this,Main16Activity.class);
                    startActivity(it142);
                }
                if(position==4)
                {
                    Intent it143=new Intent(Main14Activity.this,Main17Activity.class);
                    startActivity(it143);
                }
                if(position==5)
                {
                    Intent it144=new Intent(Main14Activity.this,Main18Activity.class);
                    startActivity(it144);
                }
                if(position==6)
                {
                    Intent it145=new Intent(Main14Activity.this,Main19Activity.class);
                    startActivity(it145);
                }
                if(position==7)
                {
                    Intent it146=new Intent(Main14Activity.this,Main20Activity.class);
                    startActivity(it146);
                }
                if(position==8)
                {
                    Intent it147=new Intent(Main14Activity.this,Main21Activity.class);
                    startActivity(it147);
                }
            }
        });
    }
}