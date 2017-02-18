package com.example.rust.ufo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.rust.ufo.R.id.tvSignup;
import static com.example.rust.ufo.R.id.tvforgotpassword;

public class LoginActivity extends AppCompatActivity {
    private static EditText Username;
    private static EditText Password;
    private static CheckBox rememberme;
    private static Button login;
    private static TextView forgotpassword;
    private static TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
    }
    public void LoginButton(){

        Username =(EditText)findViewById(R.id.etUsername);
        Password =(EditText)findViewById(R.id.etPassword);
        rememberme =(CheckBox)findViewById(R.id.cbrememberme);
        login=(Button)findViewById(R.id.button_login);
        forgotpassword=(TextView)findViewById(tvforgotpassword);
        signup=(TextView)findViewById(tvSignup);


        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Username.getText().toString().equals("aspk4")&&
                        Password.getText().toString().equals("aspk4")) {
                    Intent intent = new Intent("com.example.rust.ufo.HomepageActivity");
                    startActivity(intent);
                } else{
                    Toast.makeText(LoginActivity.this,"user and password is not correct",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                Intent launchActivity1= new Intent("com.example.rust.ufo.Registerpage");
                startActivity(launchActivity1);

            }
        });
        forgotpassword.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v2) {
                Intent launchActivity2= new Intent("com.example.rust.ufo.Forgotpassword");
                startActivity(launchActivity2);

            }
        });


    }
}