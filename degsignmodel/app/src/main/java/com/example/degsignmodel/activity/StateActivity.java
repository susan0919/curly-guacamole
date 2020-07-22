package com.example.degsignmodel.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.degsignmodel.R;
import com.example.degsignmodel.observerCustorm.ObjectFor3D;
import com.example.degsignmodel.observerCustorm.Observer1;
import com.example.degsignmodel.observerCustorm.Observer2;
import com.example.degsignmodel.observerInner.ObjectFrom3D;
import com.example.degsignmodel.observerInner.ObjectFromSsq;
import com.example.degsignmodel.observerInner.ObserverInner;

public class StateActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = StateActivity.class.getName();
    private Button vendingButton;
    private Button threadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        initView();
        initListener();
    }

    private void initView() {
        vendingButton = findViewById(R.id.vending);
        threadButton = findViewById(R.id.thread);
    }

    private void initListener() {
        vendingButton.setOnClickListener(this);
        threadButton.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.vending:
                ComponentName componentName = new ComponentName(this, StateVendingActivity.class);
                Intent intent = new Intent();
                intent.setComponent(componentName);
                startActivity(intent);
                break;
            case R.id.thread:
                Intent intentThread = new Intent();
                intentThread.setComponent(new ComponentName(this, StateThreadActivity.class));
                startActivity(intentThread);
                break;
            default:
                break;
        }
    }

    private void init3DEvent() {
        ObjectFor3D objectFor3D = new ObjectFor3D();

        Observer1 observer1 = new Observer1(objectFor3D);
        Observer2 observer2 = new Observer2(objectFor3D);

        objectFor3D.setMsg("20140420的3D号码是：127");
        objectFor3D.setMsg("20140421的3D号码是：333");
    }

    private void initObserverEvent() {
        Log.d(TAG, "initObserverEvent");
        ObjectFrom3D objectFrom3D = new ObjectFrom3D();
        ObjectFromSsq objectFromSsq = new ObjectFromSsq();

        ObserverInner observer = new ObserverInner();
        observer.registerObserver(objectFrom3D);
        observer.registerObserver(objectFromSsq);

        objectFrom3D.setMsg("hello 3d'nums : 110");
        objectFromSsq.setMsg("ssq'nums : 12,13,31,5,4,3 15");
    }

}
