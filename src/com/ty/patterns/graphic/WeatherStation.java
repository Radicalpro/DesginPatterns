package com.ty.patterns.graphic;

import com.ty.patterns.graphic.concreteobserver.CurrentCondituonDisplay;
import com.ty.patterns.graphic.concretesubject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentCondituonDisplay conditionsDisplay = new CurrentCondituonDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 78, 40.4f);
    }
}
