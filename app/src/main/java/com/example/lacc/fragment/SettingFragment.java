package com.example.lacc.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lacc.R;
import com.example.lacc.bottomsheets.BottomSheetBookmarked;
import com.example.lacc.bottomsheets.BottomSheetChangeLanguage;
import com.example.lacc.bottomsheets.BottomSheetFeed;

public class SettingFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        TextView setting_text_view_support_about = view.findViewById(R.id.setting_text_view_support_about);
        TextView setting_text_view_language_select = view.findViewById(R.id.setting_text_view_language_select);
        setting_text_view_support_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetBookmarked bottomSheetBookmarked = new BottomSheetBookmarked();
                assert getFragmentManager() != null;
                bottomSheetBookmarked.show(getFragmentManager(), "TAG_BOOKMARKED");
            }
        });

        setting_text_view_language_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetChangeLanguage bottomSheetChangeLanguage = new BottomSheetChangeLanguage();
                assert getFragmentManager() != null;
                bottomSheetChangeLanguage.show(getFragmentManager(), "TAG_CHANGE_LANGUAGE");
            }
        });

        return view;
    }
}
