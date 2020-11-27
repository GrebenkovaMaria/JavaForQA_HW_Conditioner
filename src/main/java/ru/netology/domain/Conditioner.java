package ru.netology.domain;

public class Conditioner {
    private String name;
    private int minTemperature;
    private int maxTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int increaseCurrentTemperature(boolean on, int maxTemperature, int currentTemperature) {
        if (on == false) {
            return 0;
        }
        if (currentTemperature >= maxTemperature) {
            return maxTemperature;
        }
        int newCurrentTemperature = currentTemperature + 1;
        return newCurrentTemperature;
    }

    public int decreaseCurrentTemperature(boolean on, int minTemperature, int currentTemperature) {
        if (on == false) {
            return 0;
        }
        if (currentTemperature <= minTemperature) {
            return minTemperature;
        }
        int newCurrentTemperature = currentTemperature - 1;
        return newCurrentTemperature;
    }
}