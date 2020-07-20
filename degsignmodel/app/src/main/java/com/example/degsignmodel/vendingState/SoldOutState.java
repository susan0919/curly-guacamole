package com.example.degsignmodel.vendingState;

public class SoldOutState implements IState {
    private static final String TAG = SoldOutState.class.getName();
    private String msg = "";
    private VendingMachine machine;

    public SoldOutState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        msg = "投币失败，商品已售罄";
        machine.stateChangeListener(msg);
    }

    @Override
    public void backMoney() {
        msg = "您未投币，想退钱么？...";
        machine.stateChangeListener(msg);
    }

    @Override
    public void turnTrunk() {
        msg = "商品售罄，转动手柄也木有用";
        machine.stateChangeListener(msg);
    }

    @Override
    public void dispense() {
        msg = "非法状态";
        machine.stateChangeListener(msg);
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
