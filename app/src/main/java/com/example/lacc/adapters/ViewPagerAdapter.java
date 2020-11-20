package com.example.lacc.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lacc.OnBoardingActivity;
import com.example.lacc.R;
import com.example.lacc.WelcomeActivity;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.onboarding_screen, container, false);

        ImageView image_onboard_first = view.findViewById(R.id.image_onboard_first);
        ImageView indicator_first = view.findViewById(R.id.indicator_first);
        ImageView indicator_second = view.findViewById(R.id.indicator_second);
        ImageView indicator_third = view.findViewById(R.id.indicator_third);

        TextView tv_onboard_heading_first = view.findViewById(R.id.tv_onboard_heading_first);
        TextView tv_onboard_content_first = view.findViewById(R.id.tv_onboard_content_first);

        Button button_next = view.findViewById(R.id.button_next);
        Button button_start = view.findViewById(R.id.button_start);

        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBoardingActivity.viewPager.setCurrentItem(position + 1);
            }
        });

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WelcomeActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        switch (position){
            case 0:
                image_onboard_first.setImageResource(R.drawable.onboarding_first);
                indicator_first.setImageResource(R.drawable.active_circle);
                indicator_second.setImageResource(R.drawable.inactive_circle);
                indicator_third.setImageResource(R.drawable.inactive_circle);

                tv_onboard_heading_first.setText(R.string.onboard_heading_first);
                tv_onboard_content_first.setText(R.string.onboard_content_first);

                break;

            case 1:
                image_onboard_first.setImageResource(R.drawable.onboarding_second);
                indicator_first.setImageResource(R.drawable.inactive_circle);
                indicator_second.setImageResource(R.drawable.active_circle);
                indicator_third.setImageResource(R.drawable.inactive_circle);

                tv_onboard_heading_first.setText(R.string.onboard_heading_second);
                tv_onboard_content_first.setText(R.string.onboard_content_second);

                break;

            case 2:
                image_onboard_first.setImageResource(R.drawable.onboarding_third);
                indicator_first.setImageResource(R.drawable.inactive_circle);
                indicator_second.setImageResource(R.drawable.inactive_circle);
                indicator_third.setImageResource(R.drawable.active_circle);

                tv_onboard_heading_first.setText(R.string.onboard_heading_third);
                tv_onboard_content_first.setText(R.string.onboard_content_third);

                button_next.setVisibility(View.GONE);
                button_start.setVisibility(View.VISIBLE);

                break;

        }

        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
