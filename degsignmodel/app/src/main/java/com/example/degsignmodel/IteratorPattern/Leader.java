package com.example.degsignmodel.IteratorPattern;

public abstract class Leader {

    protected Leader nexthandler;

    public final void handleRequest(int money) {
        if (money <= limit()) {
            handleMoney(money);
        } else {
            if (null != nexthandler) {
                nexthandler.handleMoney(money);
            }
        }

    }

    public abstract int limit();

    public abstract void handleMoney(int money);
}
