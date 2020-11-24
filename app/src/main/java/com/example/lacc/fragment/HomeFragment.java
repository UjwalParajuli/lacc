package com.example.lacc.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.lacc.R;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        EditText edit_text_ask_question = view.findViewById(R.id.edit_text_ask_question);

        edit_text_ask_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });

        return view;
    }

    private void showPopUp(){
        AlertDialog.Builder alert;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            alert = new AlertDialog.Builder(getContext(), android.R.style.Theme_Material_Dialog_Alert);
        }
        else {
            alert = new AlertDialog.Builder(getContext());
        }

        // retrieve display dimensions
        Rect displayRectangle = new Rect();
        Window window = getActivity().getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(displayRectangle);

        LayoutInflater inflater = getLayoutInflater();
        View alert_view = inflater.inflate(R.layout.ask_question_popup, null);
        alert_view.setMinimumWidth((int)(displayRectangle.width() * 0.9f));
        alert_view.setMinimumHeight((int)(displayRectangle.height() * 0.9f));

        EditText edit_text_main_question = alert_view.findViewById(R.id.edit_text_main_question);
        TextView tv_cancel_ask_question_popup = alert_view.findViewById(R.id.tv_cancel_ask_question_popup);
        TextView tv_post_question = alert_view.findViewById(R.id.tv_post_question);

        alert.setView(alert_view);
        alert.setCancelable(false);

        final AlertDialog dialog = alert.create();
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.show();

        tv_cancel_ask_question_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });



    }
}
