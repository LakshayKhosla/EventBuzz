package com.softbird.eventbuzz.groupinsider.views;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.softbird.eventbuzz.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class GroupsViewActivity extends AppCompatActivity {


    /* Variables */

    AHBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_view);
        bindViews();
        setUpBottomNavigation();
    }

    private void bindViews(){

        bottomNavigation = findViewById(R.id.bottom_navigation_container);
    }


    private void setUpBottomNavigation(){

        AHBottomNavigationItem item1 = new AHBottomNavigationItem("Upcoming",R.drawable.ic_event_navigation_upcoming);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("Completed",R.drawable.ic_event_completed);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem("Chats",R.drawable.ic_chat);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem("Members",R.drawable.ic_multiple_users);
        AHBottomNavigationItem item5 = new AHBottomNavigationItem("Profile",R.drawable.ic_single_user);

        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);
        bottomNavigation.addItem(item4);
        bottomNavigation.addItem(item5);

        bottomNavigation.setDefaultBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        bottomNavigation.setBehaviorTranslationEnabled(false);


        bottomNavigation.setForceTint(true);
        bottomNavigation.setTranslucentNavigationEnabled(true);
        //bottomNavigation.setColoredModeColors(getResources().getColor(R.color.colorPrimary), Color.parseColor("#747474") );

        bottomNavigation.setInactiveColor(Color.parseColor("#80FFFFFF"));
        bottomNavigation.setAccentColor(Color.WHITE);
        //bottomNavigation.setColored(true);

        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.SHOW_WHEN_ACTIVE);



    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
