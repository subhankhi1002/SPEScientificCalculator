package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SPEScientificCalculator_test {

    SPEScientificCalculator ob= new SPEScientificCalculator();

    @Test
    public void testSquareRootFunc() {
        assertEquals("Square root of 100 should be 10", 10, ob.findSquareRoot(100), 0);
        assertEquals("Square root of 36 should be 6", 6, ob.findSquareRoot(36), 0);
    }
    @Test
    public void testSquareRootZero() {
        assertEquals("Square root of 0 should be 0", 0, ob.findSquareRoot(0), 0);
    }


    @Test
    public void testFactorialFunc() {
        assertEquals("Factorial of 4 should be 24",24, ob.calculateFactorial(4),0);
        assertEquals("Factorial of 5 should be 120", 120, ob.calculateFactorial(5), 0);
        assertEquals("Factorial of 10 should be 3628800", 3628800, ob.calculateFactorial(10), 0);
    }
    @Test
    public void testFactorialZer() {
        assertEquals("Factorial of 0 should be 1", 1, ob.calculateFactorial(0), 0);
    }
    @Test
    public void testLogNatural() {
        assertEquals("Value not Correct",2.772588722239781, ob.computeNaturalLog(16),0);
        assertEquals("Natural logarithm of 25 should be approximately 3.2188758248682006", 3.2188758248682006, ob.computeNaturalLog(25), 0.000000000000001);
        assertEquals("Natural logarithm of 36 should be approximately 3.58351893845611", 3.58351893845611, ob.computeNaturalLog(36), 0.00000000000001);
    }



    @Test
    public void testPowerFunc() {
        assertEquals("2 raised to the power of 3 should be 8",8, ob.evaluatePower(2,3),0);
        assertEquals("4 raised to the power of 3 should be 64", 64, ob.evaluatePower(4, 3), 0);
        assertEquals("9 raised to the power of 2 should be 81", 81, ob.evaluatePower(9, 2), 0);
    }

    @Test
    public void testPowerFuncZeroExponent() {
        // Any number raised to the power of 0 should be 1
        assertEquals("Any number raised to the power of 0 should be 1", 1, ob.evaluatePower(10, 0), 0);
        assertEquals("Any number raised to the power of 0 should be 1", 1, ob.evaluatePower(0, 0), 0);
        assertEquals("Any number raised to the power of 0 should be 1", 1, ob.evaluatePower(-5, 0), 0);
    }
}
