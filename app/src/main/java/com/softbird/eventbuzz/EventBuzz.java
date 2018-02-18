package com.softbird.eventbuzz;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by laksh on 09-Dec-17.
 */

public class EventBuzz extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-RobotoRegular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
