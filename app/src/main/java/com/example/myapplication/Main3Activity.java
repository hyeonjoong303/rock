package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    int user1, user2;
    Intent intent;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        intent= getIntent();
        user1 = intent.getIntExtra("user1",0);
        user2 = intent.getIntExtra("user2",0);
        text1 = findViewById(R.id.tex1);
        if (user1 == user2) {
            text1.setText("결과는!!:비김");

        } else if (user1 == 1 && user2 == 2) {
            text1.setText("결과는:플레이어 2이김");


        } else if (user1 == 1 && user2 == 3) {
            text1.setText("결과는:플레이어1 이김");


        } else if (user1 == 2 && user2 == 1) {
            text1.setText("결과는:플레이어1 이김");

        } else if (user1 == 2 && user2 == 3) {
            text1.setText("결과는:플레이어2 이김");

        } else if (user1 == 3 && user2 == 1) {
            text1.setText("결과는:플레이어2 이김");


        } else if (user1 == 3 && user2 == 2) {
            text1.setText("결과는:플레이어1 이김");


        }

    }
}
