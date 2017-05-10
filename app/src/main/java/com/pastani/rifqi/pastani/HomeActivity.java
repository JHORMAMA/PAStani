package com.pastani.rifqi.pastani;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.tab_layout) TabLayout tabLayout;
    @BindView(R.id.view_pager) ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        viewPager.setAdapter(new TabAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }

     class TabAdapter extends FragmentPagerAdapter {
         public TabAdapter(FragmentManager fm) {
             super(fm);
         }

         @Override
         public int getCount() {
             return 2;
         }

         @Override
         public CharSequence getPageTitle(int position) {
             /**
              * This method returns the title of the tab according to the position.
              */
             switch (position) {
                 case 0:
                     return "Profile";

                 case 1:
                     return "Home";
             }
             return null;
         }

         @Override
         public Fragment getItem(int position) {

             if (position == 0) {

                 return new ProfileFragment();
             } else if (position == 1) {

                 return new ProfileFragment();
             }
             return null;
         }
     }
//    @OnClick(R.id.profile_button)
//    public void profileListener() {
//        Log.d("Log", "Login attempt");
//            Intent intent = new Intent(HomeActivity.this,ProfileActivity.class);
//            startActivity(intent);
//        }
}
