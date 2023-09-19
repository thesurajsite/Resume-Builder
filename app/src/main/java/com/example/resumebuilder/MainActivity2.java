package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView Name;
    TextView College;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name=findViewById(R.id.Name);
        College=findViewById(R.id.College);

        Intent intent =getIntent();
        String name=intent.getStringExtra("nameText123");
        String college=intent.getStringExtra("collegeText123");

        Name.setText(name);
        College.setText(college);

    }

}