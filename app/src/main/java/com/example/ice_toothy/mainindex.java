package com.example.ice_toothy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class mainindex extends AppCompatActivity {
    TextView c,s,r,v,t,rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainindex);
        Intent bill=new Intent(this,Finalbill.class);
        ImageButton choco=findViewById(R.id.Chocolate);
        ImageButton strawberry=findViewById(R.id.Strawberry);
        ImageButton rainbow=findViewById(R.id.Rainbow);
        ImageButton vanilla=findViewById(R.id.Vanilla);
        ImageButton tutifruity=findViewById(R.id.TutiFruity);
        ImageButton redvelvet=findViewById(R.id.Redvelvet);

        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c=findViewById(R.id.c);
                String cho= (String) c.getText();
                bill.putExtra("flv", cho);
                startActivity(bill);
            }
        });
        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=findViewById(R.id.s);
                String straw= (String) s.getText();
                bill.putExtra("flv", straw);
                startActivity(bill);
            }
        });
        rainbow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r=findViewById(R.id.r);
                String rainbow = (String) r.getText();
                bill.putExtra("flv",rainbow);
                startActivity(bill);
            }
        });
        vanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v=findViewById(R.id.v);
                String rainbow = (String) v.getText();
                bill.putExtra("flv",rainbow);
                startActivity(bill);
            }
        });
        tutifruity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=findViewById(R.id.t);
                String rainbow = (String) t.getText();
                bill.putExtra("flv",rainbow);
                startActivity(bill);
            }
        });
        redvelvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rv=findViewById(R.id.rv);
                String rainbow = (String) rv.getText();
                bill.putExtra("flv",rainbow);
                startActivity(bill);
            }
        });

    }
}