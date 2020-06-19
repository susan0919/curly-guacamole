package com.example.degsignmodel.tvController;

import android.util.Log;

public class TvController implements PowerController {
    public static final String TAG = TvController.class.getName();
    public TvState tvState;

    public void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        Log.d(TAG, "开机了");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        Log.d(TAG, "关机了");
    }

    public void nextChannel() {
        tvState.nextChannel();
    }

    public void prevChannel() {
        tvState.prevChannel();
    }

    public void turnUp() {
        tvState.turnUp();
    }

    public void turnDown() {
        tvState.turnDown();
    }

}
