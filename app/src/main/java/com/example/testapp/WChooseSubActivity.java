package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WChooseSubActivity extends AppCompatActivity {

    Button button9;
    Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w_choose_sub);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1evg40h5T_oo5cOWBahsOSSXY2nLyi-5-\n");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1eeY7X6heYFsz7IEZLKAzqRvn9jmX-mix\n");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}