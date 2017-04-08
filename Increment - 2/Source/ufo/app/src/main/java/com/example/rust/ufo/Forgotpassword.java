package com.example.rust.ufo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Forgotpassword extends AppCompatActivity {
  private static TextView etforgot;
    private static EditText etTextboc;
    private static Button  submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        forgotpassword();
    }
    public void forgotpassword(){
        etforgot =(TextView)findViewById(R.id.tventernumber);
        etTextboc =(EditText)findViewById(R.id.editText);
        submit=(Button)findViewById(R.id.button_submit);
    }
}
