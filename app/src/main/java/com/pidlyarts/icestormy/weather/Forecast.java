package com.pidlyarts.icestormy.weather;

/**
 * Created by pidly on 4/26/15.
 */
public class Forecast {
    private Current mCurrent;
    private Hour[] mHourelyForecast;
    private Day[] mDailyForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourelyForecast() {
        return mHourelyForecast;
    }

    public void setHourelyForecast(Hour[] hourelyForecast) {
        mHourelyForecast = hourelyForecast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }
}
