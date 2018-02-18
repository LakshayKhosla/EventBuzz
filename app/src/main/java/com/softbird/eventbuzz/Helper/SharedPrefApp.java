package com.softbird.eventbuzz.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;

/**
 * Created by laksh on 18-Feb-18.
 */

public class SharedPrefApp {

    //region Variables
    private SharedPreferences sharedPreferences;
    private static SharedPrefApp instance;
    //endregion

    //region Instance

    public static SharedPrefApp getInstance(){
        if(instance == null){
            synchronized (SharedPrefApp.class){
                instance = new SharedPrefApp();
            }
        }
        return  instance;
    }

    //endregion

    //region LogIn
    public void saveIsLoggedIn(Context context, LoggedInModel model){

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("IS_LOGIN", model.getLoggedIn());
        editor.putString("EMAIL",model.getEmail());
        editor.putString("NAME",model.getName());
        editor.commit();
    }

    public LoggedInModel getISLoggedIn(Context context){

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        LoggedInModel model = new LoggedInModel(sharedPreferences.getBoolean("IS_LOGIN", false), sharedPreferences.getString("EMAIL", null), sharedPreferences.getString("NAME", null));
        return model;
    }
    //endregion
}
