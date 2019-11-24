package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button btn1,btn2,btn3;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent=getIntent();
        btn1 =findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        btn3 =findViewById(R.id.btn3);
        final int user1=intent.getIntExtra("user",0);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Main2Activity.this,Main3Activity.class);

                intent.putExtra("user2",1);
                intent.putExtra("user1",user1);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Main2Activity.this,Main3Activity.class);

                intent.putExtra("user2",2);
                intent.putExtra("user1",user1);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Main2Activity.this,Main3Activity.class);

                intent.putExtra("user2",3);
                intent.putExtra("user1",user1);
                startActivity(intent);
            }
        });


    }
}


