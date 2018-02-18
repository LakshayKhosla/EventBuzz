package com.softbird.eventbuzz.Helper;

/**
 * Created by laksh on 18-Feb-18.
 */

public class LoggedInModel {

    private boolean isLoggedIn; String email;
    private String name;


    public LoggedInModel(boolean isLoggedIn, String email, String name) {
        this.isLoggedIn = isLoggedIn;
        this.email = email;
        this.name = name;
    }

    public boolean getLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
