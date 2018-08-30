package com.ty.patterns.graphic.concreteobserver;

import com.ty.patterns.graphic.observer.DisplayElement;
import com.ty.patterns.graphic.observer.Observer;
import com.ty.patterns.graphic.subject.Subject;

public class CurrentCondituonDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentCondituonDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //注册观察者
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }
}
