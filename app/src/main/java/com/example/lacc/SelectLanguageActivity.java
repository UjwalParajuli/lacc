package com.example.lacc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectLanguageActivity extends AppCompatActivity {
    private ImageButton button_nepali_unselected, button_nepali_selected, button_english_unselected
            , button_english_selected;

    private ImageView image_checked_nepali, image_checked_english;

    private TextView tv_select_lang_en, tv_select_lang_np;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language);

        button_nepali_unselected = findViewById(R.id.button_nepali_unselected);
        button_nepali_selected = findViewById(R.id.button_nepali_selected);
        button_english_unselected = findViewById(R.id.button_english_unselected);
        button_english_selected = findViewById(R.id.button_english_selected);
        Button button_continue = findViewById(R.id.button_continue);

        image_checked_nepali = findViewById(R.id.image_checked_nepali);
        image_checked_english = findViewById(R.id.image_checked_english);

        tv_select_lang_en = findViewById(R.id.tv_select_lang_en);
        tv_select_lang_np = findViewById(R.id.tv_select_lang_np);

        button_nepali_unselected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_nepali_unselected();
            }
        });

        button_nepali_selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_nepali_selected();
            }
        });

        button_english_selected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_english_selected();
            }
        });

        button_english_unselected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_english_unselected();
            }
        });

        button_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_continue();
            }
        });

    }

    private void button_nepali_unselected(){
        button_nepali_unselected.setVisibility(View.GONE);
        button_nepali_selected.setVisibility(View.VISIBLE);
        image_checked_nepali.setVisibility(View.VISIBLE);
        image_checked_english.setVisibility(View.GONE);
        tv_select_lang_np.setVisibility(View.GONE);
        tv_select_lang_en.setVisibility(View.GONE);
        button_english_selected.setVisibility(View.GONE);
        button_english_unselected.setVisibility(View.VISIBLE);
    }

    private void button_nepali_selected(){
        button_nepali_unselected.setVisibility(View.VISIBLE);
        button_nepali_selected.setVisibility(View.GONE);
        image_checked_nepali.setVisibility(View.GONE);
        tv_select_lang_np.setVisibility(View.VISIBLE);
        tv_select_lang_en.setVisibility(View.VISIBLE);
    }

    private void button_english_unselected(){
        button_english_unselected.setVisibility(View.GONE);
        button_english_selected.setVisibility(View.VISIBLE);
        image_checked_english.setVisibility(View.VISIBLE);
        image_checked_nepali.setVisibility(View.GONE);
        tv_select_lang_np.setVisibility(View.GONE);
        tv_select_lang_en.setVisibility(View.GONE);
        button_nepali_selected.setVisibility(View.GONE);
        button_nepali_unselected.setVisibility(View.VISIBLE);
    }

    private void button_english_selected(){
        button_english_unselected.setVisibility(View.VISIBLE);
        button_english_selected.setVisibility(View.GONE);
        image_checked_english.setVisibility(View.GONE);
        tv_select_lang_np.setVisibility(View.VISIBLE);
        tv_select_lang_en.setVisibility(View.VISIBLE);
    }

    private void button_continue(){
        Intent intent = new Intent(SelectLanguageActivity.this,OnBoardingActivity.class);
        startActivity(intent);
    }
}