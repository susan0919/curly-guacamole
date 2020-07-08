package com.example.degsignmodel.observerCustorm;

import java.util.ArrayList;
import java.util.List;

public class ObjectFor3D implements ISubject {

    private List<Observer> list = new ArrayList<>();
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        if (list.contains(observer)) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(msg);
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
