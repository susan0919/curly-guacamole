package com.example.degsignmodel.IteratorPattern;

import android.util.Log;

public class Manager extends Leader {
    public static final String TAG = Manager.class.getName();

    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handleMoney(int money) {
        Log.d(TAG, "主管复批报销" + money + "元");
    }
}
