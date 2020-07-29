package com.example.degsignmodel.weatherDataObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {
    private List<IObserver> list = new ArrayList<>();
    private float temp, humudity, pressure;

    public WeatherData() {

    }

    @Override
    public void registerObserver(IObserver o) {
        list.add(o);
    }

    @Override
    public void unRegisterObserver(IObserver o) {
        int i = list.indexOf(o);
        if (i > 0) {
            list.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : list) {
            observer.update(temp, humudity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurement(float temp, float humudity, float pressure) {
        this.temp = temp;
        this.humudity = humudity;
        this.pressure = pressure;
    }
}
