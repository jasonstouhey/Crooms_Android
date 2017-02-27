package net.androidbootcamp.techfest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;

import net.androidbootcamp.techfest.R;

public class Maps extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);

        pager.setAdapter(new CustomPagerAdapter(getSupportFragmentManager(), this));

        PagerTabStrip pagerTabStrip = (PagerTabStrip) findViewById(R.id.pager_tab_strip);
        pagerTabStrip.setGravity(Gravity.LEFT);

        //SlidingTabLayout slidingTab= (SlidingTabLayout) this.findViewById(R.id.pager_tab_strip);
        //slidingTab.setDistributeEvenly(true);
        //slidingTab.setViewPager(pager);



        /**
         Button b1 = (Button) findViewById(R.id.btnButton);
         b1.setOnClickListener(new View.OnClickListener() {
         final TextView Change = ((TextView)findViewById(R.id.txtView));
         public void onClick(View view) {
         Change.setText("Hello");
         }
         });
         */

        /**
         * final TextView Change = ((TextView) findViewById(R.id.txtView));
         Change.setText("Hello Map");
         */


        /**
         Switch switch1 = (Switch) findViewById(R.id.switch1);
         if (switch1 != null) {
         switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if (isChecked) {
        ImageView imgMap1= (ImageView) findViewById(R.id.imgMap1);
        imgMap1.setImageResource(R.mipmap.exhibit);
        }
        if (!isChecked) {
        ImageView imgMap1= (ImageView) findViewById(R.id.imgMap1);
        imgMap1.setImageResource(R.mipmap.ic_launcher);
        }
        }
        });

         }
         */


    }


    /**
     private class MyPagerAdapter extends FragmentPagerAdapter {

     public MyPagerAdapter(FragmentManager fm) {
     super(fm);
     }

     @Override
     public Fragment getItem(int pos) {
     switch(pos) {

     case 0: return FirstFragment.newInstance("FirstFragment, Instance1");
     case 1: return SecondFragment.newInstance("SecondFragment, Instance2");
     default: return SecondFragment.newInstance("SecondFragment, Default");
     }
     }

     @Override
     public int getCount() {
     return 2;
     }
     }
     */


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

            /**
             // Create fragment object
             Fragment fragment = new DemoFragment();

             // Attach some data to the fragment
             // that we'll use to populate our fragment layouts
             Bundle args = new Bundle();
             args.putInt("page_position", position + 1);

             // Set the arguments on the fragment
             // that will be fetched in the
             // DemoFragment@onCreateView
             fragment.setArguments(args);

             return fragment;
             */

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

    /**
     private void OnCheckedChangeListener(CompoundButton buttonView, boolean isChecked) {
     if(isChecked) {
     final TextView Change = ((TextView)findViewById(R.id.txtView));
     public void onClick(View view) { Change.setText("Hello");
     }
     }
     */
}
