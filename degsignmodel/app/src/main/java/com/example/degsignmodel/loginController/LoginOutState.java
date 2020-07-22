package com.example.degsignmodel.loginController;

import android.content.Context;
import android.content.Intent;

import com.example.degsignmodel.activity.LoginActivity;

public class LoginOutState implements UserState {
    @Override
    public void forward(Context context) {
        goToLoginActivity(context);
    }

    @Override
    public void comment(Context context) {
        goToLoginActivity(context);
    }

    private void goToLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);

    }
}
