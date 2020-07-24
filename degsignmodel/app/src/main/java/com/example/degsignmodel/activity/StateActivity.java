package com.example.degsignmodel.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.degsignmodel.R;
import com.example.degsignmodel.mediaState.PlayerStateActivity;
import com.example.degsignmodel.observerCustorm.ObjectFor3D;
import com.example.degsignmodel.observerCustorm.Observer1;
import com.example.degsignmodel.observerCustorm.Observer2;
import com.example.degsignmodel.observerInner.ObjectFrom3D;
import com.example.degsignmodel.observerInner.ObjectFromSsq;
import com.example.degsignmodel.observerInner.ObserverInner;
import com.example.degsignmodel.threadState.StateThreadActivity;
import com.example.degsignmodel.vendingState.StateVendingActivity;

import java.sql.BatchUpdateException;

public class StateActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = StateActivity.class.getName();
    private Button vendingButton;
    private Button threadButton;
    private Button playerButton;

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
        playerButton = findViewById(R.id.player);
    }

    private void initListener() {
        vendingButton.setOnClickListener(this);
        threadButton.setOnClickListener(this);
        playerButton.setOnClickListener(this);
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
            case R.id.player:
                Intent intentPlayer = new Intent();
                intentPlayer.setComponent(new ComponentName(this, PlayerStateActivity.class));
                startActivity(intentPlayer);
                break;
            default:
                break;
        }
    }

}
