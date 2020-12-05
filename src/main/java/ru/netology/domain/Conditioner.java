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

    public int getMaxTemperature(int i) {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public void increaseCurrentTemperature() {
        this.currentTemperature = this.currentTemperature + 1;
        if (this.currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
        }
    }

    public void decreaseCurrentTemperature() {
        this.currentTemperature = this.currentTemperature - 1;
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
        }
    }
}