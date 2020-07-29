package com.example.degsignmodel.weatherDataObserver;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private float temp, humudity;
    private ISubject weatherData;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        int a = 0;
    }

    @Override
    public void update(float temp, float humudity, float pressure) {
        System.out.print("current temp = " + temp + ",humudity = " + humudity);
    }
}
