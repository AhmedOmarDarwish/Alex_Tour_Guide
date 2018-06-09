package com.example.a3mr.alextourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    ViewPager slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ViewPager viewPager =  findViewById(R.id.viewpager);
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout =  findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


        slider = findViewById( R.id.slider );
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter( this );
        slider.setAdapter( viewPagerAdapter );
        Timer timer = new Timer();
        timer.scheduleAtFixedRate( new MyTimerTask(), 1000, 2000 );
    }
    public class MyTimerTask extends TimerTask {
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(slider.getCurrentItem()==0){
                        slider.setCurrentItem(1);
                    }else if(slider.getCurrentItem()==1) {
                        slider.setCurrentItem(2);
                    } else if(slider.getCurrentItem()==2){
                        slider.setCurrentItem(3);
                    } else if(slider.getCurrentItem()==3){
                        slider.setCurrentItem(4);
                    } else if(slider.getCurrentItem()==4){
                        slider.setCurrentItem(5);
                    } else if(slider.getCurrentItem()==5){
                        slider.setCurrentItem(6);
                    } else if(slider.getCurrentItem()==6){
                        slider.setCurrentItem(7);
                    } else if(slider.getCurrentItem()==7){
                        slider.setCurrentItem(8);
                    }else {
                        slider.setCurrentItem(0);
                    }
                }
            });
        }
}}

