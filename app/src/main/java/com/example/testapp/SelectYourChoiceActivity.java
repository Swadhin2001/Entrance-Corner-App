package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;


public class SelectYourChoiceActivity extends AppCompatActivity {


    private Button button2;
    private Button button4;

    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_your_choice);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button8 = findViewById(R.id.button8);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectYourChoiceActivity.this, ChooseSubjectActivity.class);
                startActivity(intent);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectYourChoiceActivity.this, WChooseSubActivity.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1TnMrZT4Z75b09ZB96cd-ZiYJk_YMeL0f\n");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}