package com.example.degsignmodel.loginController;

import android.content.Context;

public class LoginManager {
    public UserState userState;
    public static LoginManager instance;
    private Context context;

    public static LoginManager getInstance(Context context) {
        if (instance == null) {
            synchronized (LoginManager.class) {
                if (instance == null) {
                    instance = new LoginManager(context);
                }
            }
        }
        return instance;
    }

    private LoginManager(Context context) {
        this.context = context;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public void forward() {
        userState.forward(context);
    }

    public void comment() {
        userState.comment(context);
    }
}
