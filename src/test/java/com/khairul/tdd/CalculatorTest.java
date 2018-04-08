package com.khairul.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void addTwoPositiveNumbers() {
        int expectedValue = 30;
        int actualResult = calculator.add(10,20);
        assertEquals("The sum of positive numbers is correct", expectedValue, actualResult);
    }

    @Test
    public void addTwoNegativeNumbers() {
        int expectedValue = -30;
        int actualResult = calculator.add(-10,-20);
        assertEquals("The sum of negative numbers is correct", expectedValue, actualResult);
    }

    @Test
    public void subtractTwoPositiveNumbers() {
        int expectedValue = 10;
        int actualResult = calculator.substract(20,10);
        assertEquals("The sum of positive numbers is correct", expectedValue, actualResult);
    }

    @Test
    public void subtractTwoNegativeNumbers() {
        int expectedValue = -10;
        int actualResult = calculator.substract(-20,-10);
        assertEquals("The sum of negative numbers is correct", expectedValue, actualResult);
    }
}