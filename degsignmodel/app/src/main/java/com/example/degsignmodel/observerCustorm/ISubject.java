package com.example.degsignmodel.observerCustorm;


public interface ISubject {

    public void registerObserver(Observer observer);

    public void unRegisterObserver(Observer observer);

    public void notifyObservers();
}
