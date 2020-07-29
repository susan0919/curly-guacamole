package com.example.degsignmodel.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.degsignmodel.R;
import com.example.degsignmodel.observerCustorm.ObjectFor3D;
import com.example.degsignmodel.observerCustorm.Observer1;
import com.example.degsignmodel.observerCustorm.Observer2;
import com.example.degsignmodel.observerInner.ObjectFrom3D;
import com.example.degsignmodel.observerInner.ObjectFromSsq;
import com.example.degsignmodel.observerInner.ObserverInner;
import com.example.degsignmodel.weatherDataObserver.WeatherDataActivity;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getName();
    private Button observerButton;
    private Button factoryButton;
    private Button stateButton;
    private Button facadeButton;
    private Button decoratorButton;
    private Button templateMethodButton;
    private Button strategyButton;
    private Button commandButton;
    private Button chainOfResponsibilityButton;
    private Button mementoButton;
    private Button proxyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView() {
        observerButton = findViewById(R.id.observer);
        factoryButton = findViewById(R.id.factory);
        stateButton = findViewById(R.id.state);
        facadeButton = findViewById(R.id.facade);
        decoratorButton = findViewById(R.id.decorator);
        templateMethodButton = findViewById(R.id.templateMethod);
        strategyButton = findViewById(R.id.strategy);
        commandButton = findViewById(R.id.command);
        chainOfResponsibilityButton = findViewById(R.id.chainOfResponsibility);
        mementoButton = findViewById(R.id.memento);
        proxyButton = findViewById(R.id.proxy);
    }

    private void initListener() {
        observerButton.setOnClickListener(this);
        factoryButton.setOnClickListener(this);
        stateButton.setOnClickListener(this);
        facadeButton.setOnClickListener(this);
        decoratorButton.setOnClickListener(this);
        templateMethodButton.setOnClickListener(this);
        strategyButton.setOnClickListener(this);
        commandButton.setOnClickListener(this);
        chainOfResponsibilityButton.setOnClickListener(this);
        mementoButton.setOnClickListener(this);
        proxyButton.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.observer:
                ComponentName componentObserver = new ComponentName(this, WeatherDataActivity.class);
                startActivity(new Intent().setComponent(componentObserver));
                break;
            case R.id.state:
                ComponentName componentName = new ComponentName(this, StateActivity.class);
                startActivity(new Intent().setComponent(componentName));
                break;
            case R.id.proxy:
                ComponentName componentProxy = new ComponentName(this, ProxyActivity.class);
                startActivity(new Intent().setComponent(componentProxy));
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
