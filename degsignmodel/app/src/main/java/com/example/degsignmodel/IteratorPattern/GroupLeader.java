package com.example.degsignmodel.IteratorPattern;

import android.util.Log;

public class GroupLeader extends Leader {
    public static final String TAG = GroupLeader.class.getName();

    @Override
    public int limit() {
        return 100;
    }

    @Override
    public void handleMoney(int money) {
        Log.d(TAG, "组长复批报销" + money + "元");
    }
}
