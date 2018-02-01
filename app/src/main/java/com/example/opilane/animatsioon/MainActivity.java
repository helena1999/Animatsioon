package com.example.opilane.animatsioon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView maasikas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maasikas = findViewById(R.id.maasikas);
    }

    public void zoom(View view) {
        ImageView image = (ImageView)findViewById(R.id.maasikas);
        Animation animationl = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        image.startAnimation(animationl);

    }

    public void blink(View view) {
        ImageView image = (ImageView)findViewById(R.id.maasikas);
        Animation animationl = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        image.startAnimation(animationl);

    }

    public void clockwise(View view) {
        ImageView image = (ImageView)findViewById(R.id.maasikas);
        Animation animationl = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        image.startAnimation(animationl);

    }

    public void fade(View view) {
        ImageView image = (ImageView)findViewById(R.id.maasikas);
        Animation animationl = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        image.startAnimation(animationl);

    }

    public void move(View view) {
        ImageView image = (ImageView)findViewById(R.id.maasikas);
        Animation animationl = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        image.startAnimation(animationl);

    }

    public void slide(View view) {

        ImageView image = (ImageView)findViewById(R.id.maasikas);
        Animation animationl = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        image.startAnimation(animationl);


    }
}
