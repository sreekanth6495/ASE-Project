package com.example.rust.ufo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registerpage extends AppCompatActivity {
    private static EditText Firstname;
    private static EditText LastName;
    private static EditText password;
    private static EditText retypepassword;
    private static EditText EmailAddress;
    private static EditText Phonenumber;
    private static Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);
        Registeration();


    }

    public void Registeration() {
        Firstname = (EditText) findViewById(R.id.etfirstname);
        LastName = (EditText) findViewById(R.id.etlastname);
        password = (EditText) findViewById(R.id.etPassword);
        retypepassword = (EditText) findViewById(R.id.etretype);
        EmailAddress = (EditText) findViewById(R.id.etemail);
        Phonenumber = (EditText) findViewById(R.id.etPhonenumber);
        Register = (Button) findViewById(R.id.button_register);
        Register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Firstname.getText()!=null&&
                        LastName.getText()!=null&&password.getText()!=null&&retypepassword.getText()!=null&&
                EmailAddress.getText()!=null&&Phonenumber.getText()!=null) {
                    Intent intent = new Intent("com.example.rust.ufo.HomepageActivity");
                    startActivity(intent);

                } else{
                    Toast.makeText(Registerpage.this,"Please Enter all fields",
                            Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}