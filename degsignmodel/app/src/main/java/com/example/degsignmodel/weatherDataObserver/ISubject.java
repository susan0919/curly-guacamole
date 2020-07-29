package com.example.degsignmodel.weatherDataObserver;

public interface ISubject {
    void registerObserver(IObserver o);

    void unRegisterObserver(IObserver o);

    void notifyObservers();
}
