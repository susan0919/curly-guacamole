package com.example.degsignmodel.observerInner;

import android.util.Log;

import java.util.Observable;

public class ObjectFromSsq extends Observable {
    public static final String TAG = ObjectFromSsq.class.getName();
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        Log.d(TAG, "msg = " + msg);
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
