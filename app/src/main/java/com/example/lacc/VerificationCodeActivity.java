

package com.example.lacc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class VerificationCodeActivity extends AppCompatActivity {

//    TextView Resendcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);

//        Resendcode = findViewById(R.id.verification_code_resend);
//
//        String text ="Did not Receive! Resend";
//
//        SpannableString ss = new SpannableString(text);
//        ClickableSpan clickableSpan1=new ClickableSpan() {
//            @Override
//            public void onClick(@NonNull View view) {
//                Toast.makeText(VerificationCodeActivity.this, "one", Toast.LENGTH_SHORT).show();
//            }
//        };
//        ss.setSpan(clickableSpan1,17, 23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        Resendcode.setText(ss);
//        Resendcode.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
