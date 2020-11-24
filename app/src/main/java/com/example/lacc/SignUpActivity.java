package com.example.lacc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText ETfullname, ETphonenumber, ETpassword;
    Button Btncreateaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView textView = findViewById(R.id.signup_text_view_alreadylogin);
        ETfullname = findViewById(R.id.signup_edit_text_full_name);
        ETphonenumber = findViewById(R.id.signup_edit_text_phone);
        ETpassword = findViewById(R.id.signup_edit_text_password);
        Btncreateaccount = findViewById(R.id.signup_button_createaccount);

        //for clickable
        String text = "Already have account? Log In";

        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };
        ss.setSpan(clickableSpan1, 21, 28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


        //for button
    }
//    private boolean validatefullname()
//    {
//        String fullnameinput = ETfullname.getText().toString().trim();
//        if (fullnameinput.isEmpty())
//        {
//            ETfullname.setError("Field cannot be empty");
//            return false;
//        }
//        else {
//            ETfullname.setError(null);
//            return true;
//        }
//    }
}
