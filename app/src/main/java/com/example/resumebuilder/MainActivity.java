package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText college;
    EditText branch;
    EditText CGPA;
    EditText email;
    EditText phone;
    EditText address;
    EditText age;
    EditText gender;
    EditText birthdate;

    public static final String EXTRA_NAME="itsJustARandomKey12345";   // intent extras
    public static final String EXTRA_COLLEGE="itsJustARandomKey1";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View v){
        Toast.makeText(this, "Generating Resume", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this , MainActivity2.class);

        name=findViewById(R.id.name);
        college=findViewById(R.id.college);
        branch=findViewById(R.id.branch);
        CGPA=findViewById(R.id.CGPA);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        address=findViewById(R.id.address);
        age=findViewById(R.id.age);
        gender=findViewById(R.id.gender);
        birthdate=findViewById(R.id.birthdate);

        String nameText=name.getText().toString();
        String collegeText=college.getText().toString();
        String branchText=branch.getText().toString();
        String CGPAText=CGPA.getText().toString();
        String emailText=email.getText().toString();
        String phoneText=phone.getText().toString();
        String addressText=address.getText().toString();
        String ageText=age.getText().toString();
        String genderText=gender.getText().toString();
        String birthdateText=birthdate.getText().toString();

        intent.putExtra(EXTRA_NAME,nameText);
        intent.putExtra(EXTRA_COLLEGE,collegeText);

        startActivity(intent);
    }
}