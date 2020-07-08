package com.example.degsignmodel.observerCustorm;

import android.util.Log;

public class Observer2 implements Observer {
    public static final String TAG = "Observer2";
    private ISubject subject;

    public Observer2(ISubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.d(TAG, "Observer2 得到3D号码 -->" + msg + ",我要告訴舍友嗎");
    }
}
