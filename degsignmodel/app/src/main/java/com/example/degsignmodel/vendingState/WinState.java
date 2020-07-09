package com.example.degsignmodel.vendingState;

public class WinState implements IState {
    private static final String TAG = WinState.class.getName();
    private String msg = "";
    private VendingMachine machine;

    public WinState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        msg = "非法状态";
    }

    @Override
    public void backMoney() {
        msg = "非法状态";
    }

    @Override
    public void turnTrunk() {
        msg = "非法状态";
    }

    @Override
    public void dispense() {
        msg = "你中奖了，恭喜你，将得到2件商品";
        machine.dispense();
        if (machine.getCounts() == 0) {
            msg = msg + "\n 商品已售罄";
            machine.setState(machine.getSoldOutState());
        } else {
            machine.dispense();
            if (machine.getCounts() == 0) {
                msg = msg + "\n 商品已售罄,奖品已成功领取";
                machine.setState(machine.getSoldOutState());
            } else {
                msg = msg + "\n 奖品已成功领取";
                machine.setState(machine.getNoMoneyState());
            }
        }
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
