package com.example.ice_toothy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Finalbill extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i=new Intent(this,lastIntent.class);
        setContentView(R.layout.activity_finalbill);
        Intent prev= getIntent();
        ImageView img=findViewById(R.id.imageset);
        Button back=findViewById(R.id.back);
        Button next=findViewById(R.id.next);
        TextView setflavor=findViewById(R.id.Flavor);
        String str=prev.getExtras().getString("flv");
        setflavor.setText(str + " Flavor");

        if(str.equals("Chocolate")){
            img.setImageResource(R.drawable.img_1);
        }
        else if(str.equals("Strawberry")){
            img.setImageResource(R.drawable.img_3);
        }
        else if(str.equals("Rainbow")){
            img.setImageResource(R.drawable.img);
        }

        else if(str.equals("Vanilla")){
            img.setImageResource(R.drawable.img_5);
        }

        else if(str.equals("Tuti Fruity")){
            img.setImageResource(R.drawable.img_2);
        }

        else if(str.equals("Red Velvet")){
            img.setImageResource(R.drawable.img_4);
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}