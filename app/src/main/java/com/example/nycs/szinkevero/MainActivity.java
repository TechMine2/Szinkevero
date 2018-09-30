package com.example.nycs.szinkevero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private SeekBar SB_R, SB_B, SB_G;
    private TextView Leiras, TV_R, TV_G,TV_B, RGB_szinkod;
    private FrameLayout FL_doboz;
    private int RGB_R, RGB_G, RGB_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SB_R = (SeekBar) findViewById(R.id.SB_R);
        SB_G = (SeekBar) findViewById(R.id.SB_G);
        SB_B = (SeekBar) findViewById(R.id.SB_B);
        Leiras = (TextView) findViewById(R.id.Leiras);
        TV_R = (TextView) findViewById(R.id.TV_R);
        TV_G = (TextView) findViewById(R.id.TV_G);
        TV_B = (TextView) findViewById(R.id.TV_B);
        RGB_szinkod = (TextView) findViewById(R.id.RGB_szinkod);
        FL_doboz = (FrameLayout) findViewById(R.id.FL_doboz);

        SB_R.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                RGB_R = progress;
                TV_R.setText("R: " + RGB_R);
                RGB_szinkod.setText("(" + RGB_R + ", " + RGB_G + ", " + RGB_B + ")");
                FL_doboz.setBackgroundColor(rgb(RGB_R,RGB_G,RGB_B));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SB_G.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                RGB_G = progress;
                TV_G.setText("G: " + RGB_G);
                RGB_szinkod.setText("(" + RGB_R + ", " + RGB_G + ", " + RGB_B + ")");
                FL_doboz.setBackgroundColor(rgb(RGB_R,RGB_G,RGB_B));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SB_B.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                RGB_B = progress;
                TV_B.setText("B: " + RGB_B);
                RGB_szinkod.setText("(" + RGB_R + ", " + RGB_G + ", " + RGB_B + ")");
                FL_doboz.setBackgroundColor(rgb(RGB_R,RGB_G,RGB_B));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

}
