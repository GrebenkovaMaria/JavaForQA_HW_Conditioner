package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncreaseTemperatureLowMax() {
        Conditioner conditioner = new Conditioner();
        int expected = 21;
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseTemperatureEqualMax() {
        Conditioner conditioner = new Conditioner();
        int expected = 25;
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseTemperatureIfMoreMax() {
        Conditioner conditioner = new Conditioner();
        int expected = 25;
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(27);
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseTemperatureMoreMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 15;
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseTemperatureEqualMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 15;
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature() ;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseTemperatureIfLessMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 15;
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(14);
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature() ;
        assertEquals(expected, actual);
    }
}