package com.example.kon5379.animationimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view) {
        ImageView frozen = (ImageView)findViewById(R.id.frozen);
        frozen.animate().translationXBy(1000f).translationYBy(1000f).rotationBy(3600).setDuration(2000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView frozen = (ImageView)findViewById(R.id.frozen);
        frozen.setTranslationX(-1000f);
        frozen.setTranslationY(-1000f);
    }
}
