package com.example.ice_toothy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class lastIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_intent);
        EditText address=findViewById(R.id.address);
        EditText fn=findViewById(R.id.contact);
        EditText name=findViewById(R.id.fullname);
        Button done=findViewById(R.id.done);
        Button exit=findViewById(R.id.button2);
        RadioGroup rg=findViewById(R.id.radioGroup);



        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int flag=0;
                if(address.getText().toString().isEmpty())
                    flag++;
                if(fn.getText().toString().isEmpty())
                    flag++;
                if(name.getText().toString().isEmpty())
                    flag++;
                if(flag>0){
                    Toast.makeText(lastIntent.this,"Field can't be empty",Toast.LENGTH_SHORT);
                }
                else{
                    Toast t=Toast.makeText(getApplicationContext(),"Happy to have you",Toast.LENGTH_SHORT);
                    t.show();}
                Toast.makeText(lastIntent.this,"Order will be ready soon",Toast.LENGTH_SHORT);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
