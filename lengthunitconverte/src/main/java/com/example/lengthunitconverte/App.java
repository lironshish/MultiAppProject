package com.example.lengthunitconverte;

import com.example.weightconverter.App_Parent;

public class App extends App_Parent {

    @Override
    protected String getWeatherApiKey() {
        return "API_FOR_LENGTH_CONVERTOR";
    }

    @Override
    public void onCreate() {
        super.onCreate();

        statsClass = MainActivity.class;

    }
}
