package com.example.lacc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView login_text_view_new_signup = findViewById(R.id.login_text_view_new_signup);

//        String text ="New to LACC Nepal Sign Up";
//
//        SpannableString ss = new SpannableString(text);
//        ClickableSpan clickableSpan1=new ClickableSpan() {
//            @Override
//            public void onClick(@NonNull View view) {
//            }
//        };
//        ss.setSpan(clickableSpan1,18, 25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        textView.setText(ss);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());
//        newsign.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(LoginActivity.this, SignUpActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        login_text_view_new_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}