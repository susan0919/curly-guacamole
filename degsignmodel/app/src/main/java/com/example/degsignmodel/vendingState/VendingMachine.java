package com.example.degsignmodel.vendingState;

import android.util.Log;

public class VendingMachine implements IStateListener {
    public static final String TAG = VendingMachine.class.getName();
    public HasMoneyState hasMoneyState;
    public NoMoneyState noMoneyState;
    public SoldOutState soldOutState;
    public SoldState soldSate;
    public WinState winState;

    private int counts = 0;
    private IState currentState = noMoneyState;

    public VendingMachine(int counts) {
        this.counts = counts;
        hasMoneyState = new HasMoneyState(this);
        noMoneyState = new NoMoneyState(this);
        soldSate = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winState = new WinState(this);
        if (counts > 0) {
            this.counts = counts;
            currentState = noMoneyState;
        } else {
            this.counts = 0;
            currentState = soldOutState;
        }
    }

    public void insertMoney() {
        currentState.insertMoney();
    }

    public void backMoney() {
        currentState.backMoney();
    }

    public void turnTrunk() {
        currentState.turnTrunk();
        if (currentState == soldSate || currentState == winState) {
            currentState.dispense();
        }
    }

    public void addGoods(int counts) {
        this.counts += counts;
        if (this.counts > 0) {
            currentState = noMoneyState;
        } else {
            currentState = soldOutState;
        }
    }

    public void dispense() {
//        Log.d(TAG, "售出一件商品");
        if (counts != 0) {
            counts -= 1;
        }
    }

    public void setState(IState state) {
        currentState = state;
    }

    public int getCounts() {
        return this.counts;
    }

    public String getMsg() {
        return currentState.getMsg();
    }

    public HasMoneyState getHasMoneyState() {
        return hasMoneyState;
    }

    public NoMoneyState getNoMoneyState() {
        return noMoneyState;
    }


    public SoldOutState getSoldOutState() {
        return soldOutState;
    }


    public SoldState getSoldSate() {
        return soldSate;
    }


    public WinState getWinState() {
        return winState;
    }


    @Override
    public void stateChangeListener(String msg) {

    }
}
