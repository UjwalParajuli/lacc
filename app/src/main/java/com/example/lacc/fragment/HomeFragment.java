package com.example.lacc.fragment;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.lacc.ChatActivity;
import com.example.lacc.NotificationActivity;
import com.example.lacc.R;
import com.example.lacc.bottomsheets.BottomSheetFeed;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        EditText edit_text_ask_question = view.findViewById(R.id.search_content_read);
        ImageButton home_notification = view.findViewById(R.id.home_notification);
        ImageButton home_chat = view.findViewById(R.id.home_chat);

        edit_text_ask_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetFeed bottomSheetFeed = new BottomSheetFeed();
                assert getFragmentManager() != null;
                bottomSheetFeed.show(getFragmentManager(), "TAG_FEED");
            }
        });

        home_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), NotificationActivity.class);
                startActivity(intent);
            }
        });

        home_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ChatActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void showPopUp() {
        AlertDialog.Builder alert;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            alert = new AlertDialog.Builder(getContext(), android.R.style.Theme_Material_Dialog_Alert);
        } else {
            alert = new AlertDialog.Builder(getContext());
        }

        LayoutInflater inflater = getLayoutInflater();
        View alert_view = inflater.inflate(R.layout.create_account_alert_dialog, null);

        Button button_create_account = alert_view.findViewById(R.id.button_create_account_alert_box);

        alert.setView(alert_view);
        alert.setCancelable(true);

        final AlertDialog dialog = alert.create();
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.show();

    }
}
