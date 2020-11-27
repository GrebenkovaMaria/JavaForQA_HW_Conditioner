package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void shouldIncreaseTemperatureLowMax() {
        Conditioner conditioner = new Conditioner();
        int expected = 21;
        int actaul = conditioner.increaseCurrentTemperature(true, 25, 20);
        assertEquals(expected, actaul);
    }

    @Test
    void shouldNotIncreaseTemperatureEqualMax() {
        Conditioner conditioner = new Conditioner();
        int expected = 25;
        int actaul = conditioner.increaseCurrentTemperature(true, 25, 25);
        assertEquals(expected, actaul);
    }

    @Test
    void shouldNotIncreaseTemperatureIfOff() {
        Conditioner conditioner = new Conditioner();
        int expected = 0;
        int actaul = conditioner.increaseCurrentTemperature(false, 25, 35);
        assertEquals(expected, actaul);
    }

    @Test
    void shouldIncreaseTemperatureIfMoreMax() {
        Conditioner conditioner = new Conditioner();
        int expected = 25;
        int actaul = conditioner.increaseCurrentTemperature(true, 25, 35);
        assertEquals(expected, actaul);
    }

    @Test
    void shouldDecreaseTemperatureIfMoreMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 20;
        int actaul = conditioner.decreaseCurrentTemperature(true, 15, 21);
        assertEquals(expected, actaul);
    }

    @Test
    void shouldNotDecreaseTemperatureIfOff() {
        Conditioner conditioner = new Conditioner();
        int expected = 0;
        int actaul = conditioner.decreaseCurrentTemperature(false, 15, 21);
        assertEquals(expected, actaul);
    }

    @Test
    void shouldNotDecreaseTemperatureIfMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 15;
        int actaul = conditioner.decreaseCurrentTemperature(true, 15, 15);
        assertEquals(expected, actaul);
    }

    @Test
    void shouldNotDecreaseTemperatureIfLessMin() {
        Conditioner conditioner = new Conditioner();
        int expected = 15;
        int actaul = conditioner.decreaseCurrentTemperature(true, 15, 1);
        assertEquals(expected, actaul);
    }
}