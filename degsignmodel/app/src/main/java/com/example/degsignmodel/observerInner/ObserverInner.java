package com.example.degsignmodel.observerInner;

import java.util.Observable;
import java.util.Observer;

public class ObserverInner implements Observer {

    public void registerObserver(Observable observable) {
        observable.addObserver(this);
    }

    public void unRegisterObserver(Observable observable) {
        observable.deleteObserver(this);

    }

    @Override
    public void update(Observable observable, Object o) {

        if (observable instanceof ObjectFrom3D) {
            ObjectFrom3D objectFrom3D = (ObjectFrom3D) observable;
            System.out.println("ObjectFrom3D's msg -- >" + objectFrom3D.getMsg());
        } else if (observable instanceof ObjectFromSsq) {
            ObjectFromSsq objectFromSsq = (ObjectFromSsq) observable;
            System.out.println("ObjectFromSsq's msg -- >" + objectFromSsq.getMsg());
        }
    }
}
