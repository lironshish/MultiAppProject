package com.example.conversioncalculator;

import com.example.weightconverter.App_Parent;

public class App extends App_Parent {

    @Override
    protected String getWeatherApiKey() {
        return "API_FOR_WEIGHT_CONVERTOR";
    }

    @Override
    public void onCreate() {
        super.onCreate();

        statsClass = MainActivity.class;

    }
}
