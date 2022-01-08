package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EseDepartmentsActivity extends AppCompatActivity {

    Button button47;
    Button button48;
    Button button49;
    Button button50;
    Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ese_departments);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button47 = findViewById(R.id.button47);
        button48 = findViewById(R.id.button48);
        button49 = findViewById(R.id.button49);
        button50 = findViewById(R.id.button50);
        button12 = findViewById(R.id.button12);

        button47.setOnClickListener(new View.OnClickListener() {
            @Override //Civil Engineering
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1WcPiNyjkpUHCrtPfWX1czGyUeonn8cdj\n");
            }
        });

        button48.setOnClickListener(new View.OnClickListener() {
            @Override //EE
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1XVCZoFRqaLKsMPROzFCMBBft9BG5yy08\n");
            }
        });

        button49.setOnClickListener(new View.OnClickListener() {
            @Override //ECE
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1Wnhura4TWDSNE9Neme6HP-iTlZxZf-KI\n");
            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override //ME
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1XzaqhQCAEzQdFyjQgT5O9uRxAV9mrOhw\n");
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override //ME
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1YXvjLcsNBrAKdtAkeUEfkpqzNcw_wgSp\n");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}