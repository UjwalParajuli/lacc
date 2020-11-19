package com.example.lacc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class SignupActivity extends AppCompatActivity {

    String [] SPINNERLISTSTATE={"Gandaki Province", "Bagmati Province","Lumbini Province" };
    String[] SPINNERLISTCITY={"Mustang","Kaski","Lamjung"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ArrayAdapter<String> arrayAdapterstate = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLISTSTATE);
        MaterialBetterSpinner betterSpinner=(MaterialBetterSpinner) findViewById(R.id.signup_state);
        betterSpinner.setAdapter(arrayAdapterstate);

        ArrayAdapter<String> arrayAdaptercity = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLISTCITY);
        MaterialBetterSpinner betterSpinner1=(MaterialBetterSpinner) findViewById(R.id.signup_city);
        betterSpinner1.setAdapter(arrayAdaptercity);



    }

}