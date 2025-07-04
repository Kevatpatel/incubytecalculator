package org.example;

import junit.framework.TestCase;

public class StringCalculatorTest extends TestCase {

    public void testShouldReturnZeroForEmptyString() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }

    public void testShouldReturnSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        assertEquals(1, result);
    }

    public void testShouldReturnSumOfTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,5");
        assertEquals(6, result);
    }


}
