package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, college, branch, CGPA,email,phone, address, age, gender,birthdate;

   // public static final String EXTRA_NAME="itsJustARandomKey12345";   // intent extras
  //  public static final String EXTRA_COLLEGE="itsJustARandomKey1";



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
        CGPA=findViewById(R.id.Cgpa);
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
//        double intCGPA=Double.parseDouble(CGPAText);

        String emailText=email.getText().toString();

        String phoneText=phone.getText().toString();
//        long intPhone=Long.parseLong(phoneText);

        String addressText=address.getText().toString();

        String ageText=age.getText().toString();
//        int intAge=Integer.parseInt(ageText);

        String genderText=gender.getText().toString();
        String birthdateText=birthdate.getText().toString();


        intent.putExtra("nameText123",nameText);
        intent.putExtra("collegeText123",collegeText);
        intent.putExtra("branchText123",branchText);
        intent.putExtra("CGPAText123",CGPAText);
        intent.putExtra("emailText123", emailText);
        intent.putExtra("phoneText123",phoneText);
        intent.putExtra("addressText123",addressText);
        intent.putExtra("ageText123",ageText);
        intent.putExtra("genderText123",genderText);
        intent.putExtra("birthdateText123",birthdateText);

        startActivity(intent);
    }
}