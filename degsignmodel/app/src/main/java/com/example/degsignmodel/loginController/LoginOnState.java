package com.example.degsignmodel.loginController;

import android.content.Context;
import android.widget.Toast;

public class LoginOnState implements UserState {
    @Override
    public void forward(Context context) {
        Toast.makeText(context, "转发微博", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context, "提交评论", Toast.LENGTH_SHORT).show();
    }
}
