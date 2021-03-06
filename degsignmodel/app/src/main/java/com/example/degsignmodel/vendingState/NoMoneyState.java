package com.example.degsignmodel.vendingState;

public class NoMoneyState implements IState {
    private static final String TAG = NoMoneyState.class.getName();
    private String msg = "";
    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        msg = "投币成功";
        machine.stateChangeListener(msg);
        machine.setState(machine.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        msg = "您未投币，想退钱吗";
        machine.stateChangeListener(msg);
    }

    @Override
    public void turnTrunk() {
        msg = "您未投币，转动手柄也没有用";
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
