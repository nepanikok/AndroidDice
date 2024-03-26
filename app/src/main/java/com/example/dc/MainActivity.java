package com.example.dc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    int[] dice={R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6};
    private Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgClick();
    }

    public void imgClick(){
        imageView = (ImageView) findViewById(R.id.imageView4);
        imageView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int ch = rand.nextInt(dice.length);
                        imageView.setImageResource(dice[ch]);
                        imageView.animate().rotationXBy(360).setDuration(5000).start();
                      imageView.animate().rotationYBy(360).setDuration(2000).start();
                        imageView.animate().rotationBy(360).setDuration(3000).start();
                       imageView.setEnabled(false);
                        Handler handler = new Handler();
                        handler.postDelayed(() -> imageView.setEnabled(true),10000);
                        //imageView.animate().rotation(360).setDuration(500).start();
                    }
                }
        );
    }

}