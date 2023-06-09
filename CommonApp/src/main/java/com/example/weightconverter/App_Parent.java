package com.example.weightconverter;

import android.app.Application;

import com.example.weightconverter.utils.MSP;
import com.example.weightconverter.utils.MySignalV2;


public abstract class App_Parent extends Application {

    protected static Class<?> statsClass;

    protected abstract String getWeatherApiKey();

    @Override
    public void onCreate() {
        super.onCreate();

        MySignalV2.initHelper(this);
        MSP.initHelper(this);
        String weatherApiKey = getWeatherApiKey();
        initAPI(weatherApiKey);

    }

    private void initAPI(String api) {

    }
}
