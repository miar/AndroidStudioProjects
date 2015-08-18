package com.example.miguel.modernartui;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.util.Random;

public class MainActivity extends Activity { //AppCompatActivity {

    private SeekBar seekBar = null;
    private ImageView rectImage2 = null;
    private ImageView rectImage3 = null;
    private ImageView rectImage4 = null;
    private ImageView rectImage5 = null;
    private ColorDrawable backImage2 = null;
    private ColorDrawable backImage3 = null;
    private ColorDrawable backImage4 = null;
    private ColorDrawable backImage5 = null;
    private int backColorImage2;
    private int backColorImage3;
    private int backColorImage4;
    private int backColorImage5;
    private int randColorOffset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = (SeekBar) findViewById(R.id.seekBar1);
        rectImage2 = (ImageView) findViewById(R.id.rectimage2);
        rectImage3 = (ImageView) findViewById(R.id.rectimage3);
        rectImage4 = (ImageView) findViewById(R.id.rectimage4);
        rectImage5 = (ImageView) findViewById(R.id.rectimage5);
        backImage2 = (ColorDrawable) rectImage2.getBackground();
        backImage3 = (ColorDrawable) rectImage3.getBackground();
        backImage4 = (ColorDrawable) rectImage4.getBackground();
        backImage5 = (ColorDrawable) rectImage5.getBackground();
        backColorImage2 = backImage2.getColor();
        backColorImage3 = backImage3.getColor();
        backColorImage4 = backImage4.getColor();
        backColorImage5 = backImage5.getColor();


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                Random r = new Random();
                randColorOffset = -(r.nextInt(0 - backColorImage2) - backColorImage2);
                int newColor = backColorImage2 + progressValue *randColorOffset ;
                //Log.i("INFO", "progress=" + progressValue + " newColor2=" + newColor);
                rectImage2.setBackgroundColor(newColor);

                randColorOffset = -(r.nextInt(0 - backColorImage3) - backColorImage3);
                newColor = backColorImage3 + progressValue * randColorOffset ;
                //Log.i("INFO", "progress=" + progressValue + " newColor3=" + newColor);
                rectImage3.setBackgroundColor(newColor);

                randColorOffset = -(r.nextInt(0 - backColorImage4) - backColorImage4);
                newColor = backColorImage4 + progressValue * randColorOffset ;
                //Log.i("INFO", "progress=" + progressValue + " newColor4=" + newColor);
                rectImage4.setBackgroundColor(newColor);

                randColorOffset = -(r.nextInt(0 - backColorImage5) - backColorImage5);
                newColor = backColorImage5 + progressValue * randColorOffset ;
                //Log.i("INFO", "progress=" + progressValue + " newColor5=" + newColor);
                rectImage5.setBackgroundColor(newColor);
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}