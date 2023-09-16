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
        String name=intent.getStringExtra(MainActivity.EXTRA_NAME);
        String college=intent.getStringExtra(MainActivity.EXTRA_COLLEGE);

        Name.setText(name);
        College.setText(college);

    }

}