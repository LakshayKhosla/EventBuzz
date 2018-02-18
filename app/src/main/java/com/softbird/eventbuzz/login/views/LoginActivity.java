package com.softbird.eventbuzz.login.views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.softbird.eventbuzz.R;
import com.softbird.eventbuzz.groups.views.MainActivity;
import com.softbird.eventbuzz.login.LoginContract;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void bt_login_Click(View view){

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        //startActivity(intent);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    public void startLoginActivity() {

    }

    @Override
    public void startLandingActivity() {

    }

    @Override
    public void showErrorMessage(String message) {

    }
}
