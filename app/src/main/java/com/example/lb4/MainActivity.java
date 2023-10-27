package com.example.lb4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isTomVisible = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseTom(View view) {
        if (isTomVisible) {
            ImageView tom_ImageView = findViewById(R.id.tom_imageView);
            tom_ImageView.animate().alpha(0).rotation(tom_ImageView.getRotation() + 3600)
                    .scaleY(0).scaleX(0).setDuration(3000);

            ImageView jerry_ImageView = findViewById(R.id.jerry_imageView);
            jerry_ImageView.animate().alpha(1).rotation(jerry_ImageView.getRotation() + 3600)
                    .scaleY(1).scaleX(1).setDuration(3000);

            isTomVisible = false;
        } else {
            ImageView tom_ImageView = findViewById(R.id.tom_imageView);
            tom_ImageView.animate().alpha(1).rotation(tom_ImageView.getRotation() + 3600)
                    .scaleY(1).scaleX(1).setDuration(3000);

            ImageView jerry_ImageView = findViewById(R.id.jerry_imageView);
            jerry_ImageView.animate().alpha(0).rotation(jerry_ImageView.getRotation() + 3600)
                    .scaleY(0).scaleX(0).setDuration(3000);
            isTomVisible = true;
        }

    }
}