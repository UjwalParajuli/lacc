package com.example.lacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {


    TextView Alreadylogin;
    Button signUpBtnCreateAccount;
    EditText fullName;
    EditText phoneNumber;
    EditText password;

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +

                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{4,}" +               //at least 4 characters
                    "$");

    private  static  final Pattern Full_Name_Pattern = Pattern.compile("^"+"(?=.*[a-zA-Z])");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fullName = findViewById(R.id.sign_up_edit_text_full_name);
        phoneNumber = findViewById(R.id.sign_up_edit_text_phone);
        password = findViewById(R.id.sign_up_edit_text_password);

        //validation
        signUpBtnCreateAccount = findViewById(R.id.sign_up_button_create_account);
        signUpBtnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String signUp_fullName = fullName.getText().toString();
                String signUp_phone = phoneNumber.getText().toString();
                String sign_up_password = password.getText().toString();

                if(InternetConnection.isDeviceOnline(getApplicationContext())){
                    if(signUp_fullName.length()==0){
                        fullName.setError("Please enter your full name.");
                        return;
                    }

                    if(!Full_Name_Pattern.matcher( signUp_fullName).matches()){
                        password.setError("Full name must include only alphabet");
                        return;
                    }


                    if(signUp_phone.length()==0){
                        phoneNumber.setError("Please enter your phone number");
                        return;
                    }

                    if(signUp_phone.length()<10 || phoneNumber.length()>10){
                        phoneNumber.setError("Please enter valid number.");
                    }

                    if(sign_up_password.length()==0){
                        password.setError("Please enter your password");
                        return;
                    }

                    if(sign_up_password.length()<=5){
                        password.setError("Password must be of at least 8 character");
                        return;
                    }

                    if(!PASSWORD_PATTERN.matcher( sign_up_password).matches()){
                        password.setError("Password too weak");
                        return;

                    }

                    else{
                        Toast.makeText(SignUpActivity.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        Alreadylogin = findViewById(R.id.signup_text_view_already_login);
//        ETfullname = findViewById(R.id.signup_edit_text_full_name);
//        ETphonenumber = findViewById(R.id.signup_edit_text_phone);
//        ETpassword = findViewById(R.id.signup_edit_text_password);
//        Btncreateaccount = findViewById(R.id.signup_button_createaccount);

        //for clickable
        Alreadylogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }

}
