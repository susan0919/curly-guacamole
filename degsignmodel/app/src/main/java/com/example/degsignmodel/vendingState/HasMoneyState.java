package com.example.degsignmodel.vendingState;

import java.util.Random;

public class HasMoneyState implements IState {
    private String msg = "";
    private VendingMachine machine;
    private Random random = new Random();

    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        msg = "您已经投过币了，无需再投";
        machine.stateChangeListener(msg);
    }

    @Override
    public void backMoney() {
        msg = "退币成功";
        machine.stateChangeListener(msg);
        machine.setState(machine.getNoMoneyState());
    }

    @Override
    public void turnTrunk() {
        msg = "你转动了手柄";
        machine.stateChangeListener(msg);
        int winner = random.nextInt(10);
        if (winner == 0 && machine.getCounts() > 1) {
            machine.setState(machine.getWinState());
        } else {
            machine.setState(machine.getSoldSate());
        }
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
