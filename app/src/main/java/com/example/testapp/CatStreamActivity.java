package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CatStreamActivity extends AppCompatActivity {

    Button button33;
    Button button43;
    Button button51;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat_stream);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button33 = findViewById(R.id.button33);
        button43 = findViewById(R.id.button43);
        button51 = findViewById(R.id.button51);

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1aJKhTE_WimYCOpYoo4wuQTCxFw6FNtKq\n");
            }
        });

        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1ZJ_stCV8TmOLnuENg55A_hC6_WG6GJ5C\n");
            }
        });

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1cqe0Nn-8ZFldPRZdBQ1Si-aYRp8FV8F4\n");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}