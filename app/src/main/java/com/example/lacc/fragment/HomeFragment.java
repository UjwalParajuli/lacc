package com.example.lacc.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lacc.R;
import com.example.lacc.bottomsheets.BottomSheetFeed;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        EditText edit_text_ask_question = view.findViewById(R.id.search_content_read);

        edit_text_ask_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetFeed bottomSheetFeed = new BottomSheetFeed();
                assert getFragmentManager() != null;
                bottomSheetFeed.show(getFragmentManager(), "TAG_FEED");
            }
        });

        return view;
    }


}
