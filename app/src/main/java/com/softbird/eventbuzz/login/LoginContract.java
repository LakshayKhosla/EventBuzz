package com.softbird.eventbuzz.login;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/**
 * Created by laksh on 18-Feb-18.
 */

public interface LoginContract {

     interface View{
        void startLoginActivity();
        void startLandingActivity();
        void showErrorMessage(String message);
    }

     interface Presenter{

         void loginWithFirebase(GoogleSignInAccount account);

    }

}
