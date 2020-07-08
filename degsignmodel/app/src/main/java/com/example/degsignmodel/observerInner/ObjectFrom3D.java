package com.example.degsignmodel.observerInner;

import android.util.Log;

import java.util.Observable;

public class ObjectFrom3D extends Observable {
    public static final String TAG = ObjectFrom3D.class.getName();
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
