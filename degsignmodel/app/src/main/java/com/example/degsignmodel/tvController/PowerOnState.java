package com.example.degsignmodel.tvController;

import android.util.Log;

public class PowerOnState implements TvState {
    private static final String TAG = PowerOnState.class.getName();

    @Override
    public void nextChannel() {
        Log.d(TAG, "下一頻道");
    }

    @Override
    public void prevChannel() {
        Log.d(TAG, "上一頻道");
    }

    @Override
    public void turnUp() {
        Log.d(TAG, "調高音量");
    }

    @Override
    public void turnDown() {
        Log.d(TAG, "調低音量");
    }
}
