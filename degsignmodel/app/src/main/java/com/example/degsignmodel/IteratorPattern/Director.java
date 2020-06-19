package com.example.degsignmodel.IteratorPattern;

import android.util.Log;

public class Director extends Leader {
    public static final String TAG = Director.class.getName();

    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handleMoney(int money) {
        Log.d(TAG, "组长复批报销" + money + "元");
    }
}
