package com.example.degsignmodel.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.degsignmodel.R;
import com.example.degsignmodel.bankProxy.BankActivity;
import com.example.degsignmodel.mediaState.PlayerStateActivity;
import com.example.degsignmodel.threadState.StateThreadActivity;
import com.example.degsignmodel.vendingState.StateVendingActivity;

public class ProxyActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ProxyActivity.class.getName();
    private Button bankButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        initView();
        initListener();
    }

    private void initView() {
        bankButton = findViewById(R.id.bank);
    }

    private void initListener() {
        bankButton.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bank:
                ComponentName componentName = new ComponentName(this, BankActivity.class);
                startActivity(new Intent().setComponent(componentName));
                break;
            default:
                break;
        }
    }

}
