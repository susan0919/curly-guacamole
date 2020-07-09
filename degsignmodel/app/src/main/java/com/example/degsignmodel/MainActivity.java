package com.example.degsignmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.degsignmodel.observerCustorm.ObjectFor3D;
import com.example.degsignmodel.observerCustorm.Observer1;
import com.example.degsignmodel.observerCustorm.Observer2;
import com.example.degsignmodel.observerInner.ObjectFrom3D;
import com.example.degsignmodel.observerInner.ObjectFromSsq;
import com.example.degsignmodel.observerInner.ObserverInner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getName();
    private Button observerCusButton;
    private Button observerInnerButton;
    private Button stateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView() {
        observerCusButton = findViewById(R.id.observer1);
        observerInnerButton = findViewById(R.id.observer2);
        stateButton = findViewById(R.id.state);
    }

    private void initListener() {
        observerCusButton.setOnClickListener(this);
        observerInnerButton.setOnClickListener(this);
        stateButton.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.observer1:
                init3DEvent();
                break;
            case R.id.observer2:
                initObserverEvent();
                break;
            case R.id.state:
                ComponentName componentName = new ComponentName(this, StateActivity.class);
                Intent intent = new Intent();
                intent.setComponent(componentName);
                startActivity(intent);

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
