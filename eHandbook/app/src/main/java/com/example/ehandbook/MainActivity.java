package com.example.ehandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    androidx.constraintlayout.widget.ConstraintLayout jtmkbtn;
    androidx.constraintlayout.widget.ConstraintLayout spmp;
    androidx.constraintlayout.widget.ConstraintLayout cidos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jtmkbtn = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(R.id.btn1);
        jtmkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });
        spmp=(androidx.constraintlayout.widget.ConstraintLayout) findViewById(R.id.spmpbtn);
        spmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://spmp.pmj.edu.my/login.jsp");
            }
        });
        cidos=(androidx.constraintlayout.widget.ConstraintLayout) findViewById(R.id.cidosbtn);
        cidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://pmjlms.cidos.edu.my");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void clickexit(View V)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}