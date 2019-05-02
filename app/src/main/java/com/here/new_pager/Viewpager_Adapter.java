package com.here.new_pager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//class for initialize fragment {that extends from fragment pager adapter)

public class Viewpager_Adapter extends FragmentPagerAdapter {
    public Context context;
    public  final int PAGE_COUNT=3; //final = kostanta
    public String tabJudul []= new String[]{"CHATS","STATUS","CALLS"};
    public Viewpager_Adapter(FragmentManager fm,Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int page){ //adalah position
        Fragment frost = null;
        switch (page){
            case 0:
                frost= new chat();
                break;
            case 1:
                frost=new Status();
                break;
            case 2:
                frost=new Telepon();
                break;
        }

        return frost;
    }

    @Override
    public int getCount(){
        return PAGE_COUNT;
    }

    @Override
    public  CharSequence getPageTitle(int posisi){
        return tabJudul[posisi];
    }
}
