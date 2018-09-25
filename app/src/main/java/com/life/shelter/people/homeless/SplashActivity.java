package com.life.shelter.people.homeless;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        animation = AnimationUtils.loadAnimation(this,R.anim.anim);

        textView = (TextView) findViewById(R.id.splash_txt);
        textView.setAnimation(animation);

        imageView = (ImageView) findViewById(R.id.splash_pic);
        imageView.setAnimation(animation);

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, home.class);
                    startActivity(intent);
                }
            }
        });
        timer.start();
    }
}
