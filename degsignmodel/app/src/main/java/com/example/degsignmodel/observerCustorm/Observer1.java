package com.example.degsignmodel.observerCustorm;

import android.util.Log;

public class Observer1 implements Observer {

    public static final String TAG = "Observer1";
    private ISubject subject;

    public Observer1(ISubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.d(TAG, "Observer1 得到3D号码 -->" + msg + ",我要记下来");
    }
}
