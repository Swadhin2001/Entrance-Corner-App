package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PgStreamSelectionActivity extends AppCompatActivity {

    private Button button3;
    private Button button45;
    private Button button46;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pg_stream_selection);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PgStreamSelectionActivity.this, SelectYourDepartmentActivity.class);
                startActivity(intent);
            }
        });
        button45 = (Button) findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PgStreamSelectionActivity.this,EseDepartmentsActivity.class);
                startActivity(intent);
            }
        });

        button46 = (Button) findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PgStreamSelectionActivity.this,CatStreamActivity.class);
                startActivity(intent);
            }
        });
    }
}