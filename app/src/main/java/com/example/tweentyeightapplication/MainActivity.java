package com.example.tweentyeightapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tweentyeightapplication.Adapter.ViewPagerAdapter;
import com.example.tweentyeightapplication.Fragment.FriendsFragment;
import com.example.tweentyeightapplication.Fragment.GroupsFragment;
import com.example.tweentyeightapplication.Fragment.HomeFragment;
import com.example.tweentyeightapplication.Fragment.NotificationsFragment;
import com.example.tweentyeightapplication.Fragment.ProfileFragment;
import com.example.tweentyeightapplication.Fragment.WatchFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar_Id);
        setSupportActionBar(toolbar);

        access();
        addFragment();
        addTitleList();
        adapter();
        setupTabIcons();

    }

    private void adapter() {
        viewPagerAdapter = new ViewPagerAdapter(fragmentList, titleList, getSupportFragmentManager(), 1);
        viewPager.setAdapter(viewPagerAdapter);
    }

    private void addTitleList() {
        titleList.add("");
        titleList.add("");
        titleList.add("");
        titleList.add("");
        titleList.add("");
        titleList.add("");
    }

    private void addFragment() {
        fragmentList.add(new HomeFragment());
        fragmentList.add(new FriendsFragment());
        fragmentList.add(new GroupsFragment());
        fragmentList.add(new WatchFragment());
        fragmentList.add(new NotificationsFragment());
        fragmentList.add(new ProfileFragment());
    }

    private void access() {
        tabLayout = findViewById(R.id.tabLayout_Id);
        viewPager = findViewById(R.id.viewPager_Id);
        tabLayout.setupWithViewPager(viewPager);
    }


    //tablayout..set icon
    private void setupTabIcons() {

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_friends);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_groups);
        tabLayout.getTabAt(3).setIcon(R.drawable.watch);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_notifications);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_profile_black_24dp);
    }
    }
