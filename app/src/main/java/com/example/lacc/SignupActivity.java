package com.example.lacc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Spinner statespinner=findViewById(R.id.signupstate);

        ArrayAdapter <String> stateAdapter = new ArrayAdapter<String>(SignupActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.State));
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statespinner.setAdapter(stateAdapter);


    }

}