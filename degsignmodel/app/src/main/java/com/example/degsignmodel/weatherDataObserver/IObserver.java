package com.example.degsignmodel.weatherDataObserver;

public interface IObserver {
    void update(float temp, float humidity, float pressure);
}
