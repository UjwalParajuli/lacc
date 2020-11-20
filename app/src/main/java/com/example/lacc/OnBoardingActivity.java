package com.example.lacc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.lacc.adapters.ViewPagerAdapter;

public class OnBoardingActivity extends AppCompatActivity {

    public static ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        viewPager = findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

//        if (isOpenAlready()){
//            Intent intent = new Intent(OnboardingActivity.this, MainActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(intent);
//        }
//        else{
//            SharedPreferences.Editor onBoardingEditor = getSharedPreferences("onBoardingEditor", MODE_PRIVATE).edit();
//            onBoardingEditor.putBoolean("onBoard", true);
//            onBoardingEditor.apply();
//        }
    }

    private boolean isOpenAlready(){
        SharedPreferences sharedPreferences = getSharedPreferences("onBoardingEditor", MODE_PRIVATE);
        return sharedPreferences.getBoolean("onBoard", false);
    }
}