package com.example.degsignmodel.bankProxy;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.degsignmodel.R;


public class BankActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = BankActivity.class.getName();
    private Button openAccountButton;
    private Button saveMoneyButton;
    private Button takeMoneyButton;
    private Button closeAccountButton;
    private TextView msgTextView;
    private IBankAIDL binder;
    private String str;
    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            System.out.print("onServiceConnected success ");
            binder =  IBankAIDL.Stub.asInterface(iBinder);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_proxy);
        initView();
        initListener();
        bindService();
    }

    private void bindService() {
        Intent intent = new Intent(BankActivity.this, BankService.class);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    private void initView() {
        openAccountButton = findViewById(R.id.open_account);
        saveMoneyButton = findViewById(R.id.save_money);
        takeMoneyButton = findViewById(R.id.take_money);
        closeAccountButton = findViewById(R.id.close_account);
        msgTextView = findViewById(R.id.account_detail);
    }

    private void initListener() {
        openAccountButton.setOnClickListener(this);
        saveMoneyButton.setOnClickListener(this);
        takeMoneyButton.setOnClickListener(this);
        closeAccountButton.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getApplicationContext().unbindService(serviceConnection);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.open_account:
                try {
                    str = binder.openAccount("Aige", "123456789");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                System.out.print("open_account" + str);
                msgTextView.setText(str);
                break;
            case R.id.save_money:
                try {
                    str = binder.saveMoney(99999, "dksalejo222");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                System.out.print("save_money" + str);
                msgTextView.setText(str);
                break;
            case R.id.take_money:
                try {
                    str = binder.takeMoney(88888, "skdfjaeoi33333", "12345896");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                System.out.print("take_money" + str);
                msgTextView.setText(str);
                break;
            case R.id.close_account:
                try {
                    str = binder.closeAccount("djfkser2222", "12358541");
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                System.out.print("close_account" + str);
                msgTextView.setText(str);
                break;
            default:
                break;
        }
    }
}
