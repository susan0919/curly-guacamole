package com.example.degsignmodel.state;

public class SoldState implements IState {
    private static final String TAG = SoldState.class.getName();
    private String msg = "";
    private VendingMachine machine;

    public SoldState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        msg = "正在出货，请勿投币";
    }

    @Override
    public void backMoney() {
        msg = "正在出货，没有可退的钱";
    }

    @Override
    public void turnTrunk() {
        msg = "正在出货，请勿重复转动手柄";
    }

    @Override
    public void dispense() {
        machine.dispense();
        if (machine.getCounts() > 0) {
            msg = "出貨成功 退回到未投幣狀態";
            machine.setState(machine.getNoMoneyState());
        } else {
            msg = "出貨成功 商品已售罄";
            machine.setState(machine.getSoldOutState());
        }
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
