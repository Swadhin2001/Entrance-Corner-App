package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SelectYourDepartmentActivity extends AppCompatActivity {

    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;

    Button button28;
    Button button29;
    Button button30;
    Button button31;
    Button button32;
    Button button34;
    Button button35;
    Button button36;
    Button button37;
    Button button38;
    Button button39;
    Button button40;
    Button button41;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_your_department);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button28 = findViewById(R.id.button28);
        button29 = findViewById(R.id.button29);
        button30 = findViewById(R.id.button30);
        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);
        button34 = findViewById(R.id.button34);
        button35 = findViewById(R.id.button35);
        button36 = findViewById(R.id.button36);
        button37 = findViewById(R.id.button37);
        button38 = findViewById(R.id.button38);
        button39 = findViewById(R.id.button39);
        button40 = findViewById(R.id.button40);
        button41 = findViewById(R.id.button41);


        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1J30GtA3FfIYu6cfhWJ3RtRzTx98LeMJT\n");
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1JSLrs9dB6_-1NrdD2vgrZ_KmSSGlHTPb\n");
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1Jjm6EyiSPeg9zZugYIHUUrVk3N-M3CzY\n");
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1K4m6AlEb83F3AXjjLGW7CaN2NqqtE_Gk\n");
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1K9UZNEgl0S3uoM-gniCyBJjKb9XjIlc6\n");
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override    //Civil Eng.
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1KIBsHOsQrbNOV6nay7PG9DpwgurC0xSf\n\n");
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1KiiJtWToyLhkYea9BUvpxxsiMGu1y_2z\n");
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override //cse it
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1L5-M7tn9-4cuJ66wgGLursFw1O3r-lKO\n");
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override //chemistry
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1LtvQc1VUYcGpeE75MhtxP8qHibtwA12H\n");
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override //ECE
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1MMkSgHXk6apSNaVJLxQMKZQ4Jasa4rTw\n");
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override //EE
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1Mj0JTnLbfix_ymecO8qB-lyFU4OSt5We\n");
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override //Environmental Science and engineering
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1NASrLfxfg3QxNXuJmAPgk2mI7ovobQA0\n");
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override //Ecology and Evolution
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1NHtUM5WDnzs6JvHfRv4m_4N5lJoHg0Zv\n");
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override //Geology and Geophysics
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1NfVBRP8UqvPpmuO5prgBzscdYIXL_EhS\n");
            }
        });



        button28.setOnClickListener(new View.OnClickListener() {
            @Override //Instrumentation Engineering
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1OQ_2crOZkNUlSFE1rbEovgfDX8JW5M_1\n");
            }
        });


        button29.setOnClickListener(new View.OnClickListener() {
            @Override //Mathematics
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1Ot3_-kfZTMAVxUe35dQ-OMbLa5sRV_NP\n");
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override //Mechanical Engineering
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1PCII3MVUPvAf8_U7fRaEkMea7ZVtNswk\n");
            }
        });


        button31.setOnClickListener(new View.OnClickListener() {
            @Override //Mining Engineering
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1PSI8kRFva1TIQYQKWt4L0rW6aOk07k5U\n");
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override //Metallurgical Engineering
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1PumIDOE3phTLKtUPUGgFtI2ZFIcPpybM\n");
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override //Petroleum Engineering
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1QEnH678tjA3qliS3xekqnOomFO1OQvgv\n");
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override //Physics
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1QRkGsoW683QwQiSjyvh2eY9ikucSrq0o\n");
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override //Production and Industrial Engineering
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1QrApP2pOcbenRVRJkpqvQMOIhQtZDvd0\n");
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override //Textile Engineering and Fiber Science
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1RYBtYuBsuHXDK9lsVCAScS3ZPvmqXdqo\n");
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override //Engineering Sciences
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1Ro67uFCMsjmrl6ut17ZEawi5EwnlU7R-\n");
            }
        });

        button39.setOnClickListener(new View.OnClickListener() {
            @Override //Life Sciences
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1SUCWEw37S3UU4rZShKGhkmY0aVPsClfs\n");
            }
        });

        button40.setOnClickListener(new View.OnClickListener() {
            @Override //Humanities and Social Sciences
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1S0wVHmCYhMuOjTL4mQdGPeIpkFiF7uaS\n");
            }
        });

        button41.setOnClickListener(new View.OnClickListener() {
            @Override //Statistics
            public void onClick(View view) {
                gotoUrl("https://drive.google.com/folderview?id=1RMEodMwEII-SM8occlJGpAyY8kYvmA49\n");
            }
        });




    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}