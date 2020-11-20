package com.example.lacc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class SignUpActivity extends AppCompatActivity {

    String [] SPINNERLISTSTATE={"Gandaki Province", "Bagmati Province","Lumbini Province" };
    String[] SPINNERLISTCITY={"Mustang","Kaski","Lamjung"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView textView = findViewById(R.id.signup_login);

        ArrayAdapter<String> arrayAdapterstate = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLISTSTATE);
        MaterialBetterSpinner betterSpinner=(MaterialBetterSpinner) findViewById(R.id.signup_state);
        betterSpinner.setAdapter(arrayAdapterstate);

        ArrayAdapter<String> arrayAdaptercity = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLISTCITY);
        MaterialBetterSpinner betterSpinner1=(MaterialBetterSpinner) findViewById(R.id.signup_city);
        betterSpinner1.setAdapter(arrayAdaptercity);



        String text ="Already have account?Log In";

        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan1=new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Toast.makeText(SignUpActivity.this, "one", Toast.LENGTH_SHORT).show();
            }
        };
        ss.setSpan(clickableSpan1,21, 27, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


    }

}