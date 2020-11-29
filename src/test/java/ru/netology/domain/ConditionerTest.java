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
        int actual = conditioner.increaseCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseTemperatureEqualMax() {
        Conditioner conditioner = new Conditioner();
        int expected = 25;
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(25);
        int actual = conditioner.increaseCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseTemperatureIfMoreMax() {
        Conditioner conditioner = new Conditioner();
        int expected = 25;
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(26);
        int actual = conditioner.increaseCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseTemperatureMoreMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 21;
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(22);
        int actual = conditioner.decreaseCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseTemperatureEqualMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 15;
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(15);
        int actual = conditioner.decreaseCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseTemperatureIfLessMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 15;
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(14);
        int actual = conditioner.decreaseCurrentTemperature();
        assertEquals(expected, actual);
    }
}