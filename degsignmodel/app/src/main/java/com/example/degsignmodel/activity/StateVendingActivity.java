package com.example.degsignmodel.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.degsignmodel.R;
import com.example.degsignmodel.vendingState.VendingMachine;

public class StateVendingActivity extends AppCompatActivity implements View.OnClickListener {
    private Button insertButton;
    private Button backButton;
    private Button trunkButton;
    private Button addButton;
    private VendingMachine machine;
    private EditText msgEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vending_state);
        machine = new VendingMachine(5);
        initView();
        initListener();
    }

    private void initView() {
        insertButton = findViewById(R.id.insert_money);
        backButton = findViewById(R.id.back_money);
        trunkButton = findViewById(R.id.turn_trunk);
        addButton = findViewById(R.id.add_goods);
        msgEditText = findViewById(R.id.show_msg);
    }

    private void initListener() {
        insertButton.setOnClickListener(this);
        backButton.setOnClickListener(this);
        trunkButton.setOnClickListener(this);
        addButton.setOnClickListener(this);
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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.insert_money:
                machine.insertMoney();
                break;
            case R.id.back_money:
                machine.backMoney();
                break;
            case R.id.turn_trunk:
                machine.turnTrunk();
                break;
            case R.id.add_goods:
                machine.addGoods(3);
                break;
            default:
                break;
        }

        msgEditText.setText(machine.getMsg());
    }
}
