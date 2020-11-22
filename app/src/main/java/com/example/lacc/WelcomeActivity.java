package com.example.lacc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private Button button_sign_up;
    private TextView tv_continue_as_guest, tv_already_account_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        button_sign_up = findViewById(R.id.button_sign_up);
        tv_continue_as_guest = findViewById(R.id.tv_continue_as_guest);
        tv_already_account_login = findViewById(R.id.tv_already_account_login);

        // Sign Up Button Click Listener
        button_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_sign_up();
            }
        });

        // Continue as guest TextView Click Listener
        tv_continue_as_guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_home_guest();
            }
        });

        // Already Account Login TextView Click Listener
        tv_already_account_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_login();
            }
        });

    }

    // Button Methods
    private void go_to_sign_up(){

    }

    private void go_to_home_guest(){

    }

    private void go_to_login(){

    }
}