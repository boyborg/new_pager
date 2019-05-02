package com.here.new_pager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity implements chat.SendMessage {
    Viewpager_Adapter vpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vast=(ViewPager)findViewById(R.id.viewPager);
        Viewpager_Adapter vpAdapt= new Viewpager_Adapter(getSupportFragmentManager(), MainActivity.this);
        vast.setAdapter(vpAdapt);
        TabLayout tabs=(TabLayout)findViewById(R.id.tabLayout);
        tabs.setupWithViewPager(vast);
        getSupportActionBar().setTitle("WA");
    }
    public  void SendData(String message){
       String tag="android:switcher:" + R.id.viewPager+":"+1;
       Status f= (Status) getSupportFragmentManager().findFragmentByTag(tag);
       f.displayRecieveData(message);
    }
}
