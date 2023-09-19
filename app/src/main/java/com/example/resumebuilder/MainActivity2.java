package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    TextView Name, College, Branch, Cgpa , Email,Phone, Address, Age, Gender,Birthdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        // Getting TextView IDs
        Name=findViewById(R.id.Name);
        College=findViewById(R.id.College);
        Branch=findViewById(R.id.Branch);
        Cgpa=findViewById(R.id.Cgpa);
        Email=findViewById(R.id.Email);
        Phone=findViewById(R.id.Phone);
        Address=findViewById(R.id.Address);
        Age=findViewById(R.id.Age);
        Gender=findViewById(R.id.Gender);
        Birthdate=findViewById(R.id.Birthdate);


        //Getting the Intents
        Intent intent =getIntent();
        String name=intent.getStringExtra("nameText123");
        String college=intent.getStringExtra("collegeText123");
        String branch =intent.getStringExtra("branchText123");
        String CGPA=intent.getStringExtra("CGPAText123");
        String email=intent.getStringExtra("emailText123");
        String phone=intent.getStringExtra("phoneText123");
        String address=intent.getStringExtra("addressText123");
        String age=intent.getStringExtra("ageText123");
        String gender=intent.getStringExtra("genderText123");
        String birthdate=intent.getStringExtra("birthdateText123");

        Name.setText(name);
        College.setText(college);
        Branch.setText(branch);
        Cgpa.setText(CGPA);
        Email.setText(email);
        Phone.setText(phone);
        Address.setText(address);
        Age.setText(age);
        Gender.setText(gender);
        Birthdate.setText(birthdate);




    }

}