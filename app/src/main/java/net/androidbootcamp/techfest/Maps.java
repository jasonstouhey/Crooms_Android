package net.androidbootcamp.techfest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Maps extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);

        pager.setAdapter(new CustomPagerAdapter(getSupportFragmentManager(), this));
    }

    class CustomPagerAdapter extends FragmentPagerAdapter {

        Context mContext;

        public CustomPagerAdapter(FragmentManager fm, Context context) {
            super(fm);
            mContext = context;
        }

        @Override
        public Fragment getItem(int position) {
            switch(position) {

                case 0: return FirstFragment.newInstance("FirstFragment, Instance1");
                case 1: return SecondFragment.newInstance("SecondFragment, Instance2");
                default: return SecondFragment.newInstance("SecondFragment, Default");
            }
        }


        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch(position) {
                case 0: return "Exhibit Map";
                case 1: return "School Map";
                default: return "No View";
            }
        }
    }
}
