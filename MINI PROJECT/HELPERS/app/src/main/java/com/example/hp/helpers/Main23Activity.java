package com.example.hp.helpers;



import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.helpers.Main14Activity;
import com.example.hp.helpers.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main23Activity extends AppCompatActivity {
    TextView tv;
    CardView cv;
    EditText et,et1;
    String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        et=(EditText)findViewById(R.id.editText13);
        et1=(EditText)findViewById(R.id.editText19);


        ImageView im=(ImageView)findViewById(R.id.imageView);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.logo);
        RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        roundedBitmapDrawable.setCircular(true);
        im.setImageDrawable(roundedBitmapDrawable);

        tv=(TextView)findViewById(R.id.textView34);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myref=database.getReference("User/"+ et.getText().toString());
                myref.child("s2").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        try{
                            pass=dataSnapshot.getValue().toString();
                            if(pass.equals(et1.getText().toString()))
                            {
                                Intent it71 = new Intent(Main23Activity.this, Main14Activity.class);
                                startActivity(it71);
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"entered fields are not matched",Toast.LENGTH_LONG).show();
                            }
                        }
                        catch (Exception e){

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
        cv=(CardView) findViewById(R.id.cardview);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database=FirebaseDatabase.getInstance();
                DatabaseReference myref=database.getReference("User/"+ et.getText().toString());
                myref.child("s2").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        try{
                            pass=dataSnapshot.getValue().toString();
                            if(pass.equals(et1.getText().toString()))
                            {
                                Intent it71 = new Intent(Main23Activity.this, Main5Activity.class);
                                startActivity(it71);
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"entered fields are not matched",Toast.LENGTH_LONG).show();
                            }
                        }
                        catch (Exception e){

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });


    }
}
