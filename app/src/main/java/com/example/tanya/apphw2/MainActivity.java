package com.example.tanya.apphw2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
//    final float scale = getContext().getResources().getDisplayMetrics().density;
//
//    private int getPixels() {
//
//        int pixels = (int) (dps * scale + 0.5f);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("My Application");

        ViewGroup leftLayout = (ViewGroup) findViewById(R.id.leftLayout);

        for (int i = 0; i < 3; i++) {
            ViewGroup rowLeftLayout = new LinearLayout(this);
            ((LinearLayout)rowLeftLayout).setOrientation(LinearLayout.HORIZONTAL);
            rowLeftLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));

            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT, getResources().getDimensionPixelSize(R.dimen.row_height));

            int margin = getResources().getDimensionPixelSize(R.dimen.item_margin);

            layoutParams.setMargins(margin, margin, margin, margin);
            layoutParams.gravity = Gravity.CENTER;
            rowLeftLayout.setLayoutParams(layoutParams);

            leftLayout.addView(rowLeftLayout);

            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(R.mipmap.ic_launcher);

            TextView textView = new TextView(this);


            textView.setLayoutParams(layoutParams);
            textView.setGravity(Gravity.CENTER);
            textView.setText(R.string.text_example);

            rowLeftLayout.addView(imageView);
            rowLeftLayout.addView(textView);

        }

        leftLayout.invalidate();

    }
}
