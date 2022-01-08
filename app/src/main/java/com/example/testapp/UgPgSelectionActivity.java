package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UgPgSelectionActivity extends AppCompatActivity {

    private Button button11;
    private Button button44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ug_pg_selection);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UgPgSelectionActivity.this, SelectYourChoiceActivity.class);
                startActivity(intent);
            }
        });

        button44 = (Button) findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UgPgSelectionActivity.this, PgStreamSelectionActivity.class);
                startActivity(intent);
            }
        });
    }
}