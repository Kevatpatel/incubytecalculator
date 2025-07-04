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



    public void testShouldReturnSumOfMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2,3,4");
        assertEquals(10, result);
    }

    public void testShouldAllowNewlineAsDelimiter() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1\n2,3");
        assertEquals(6, result);
    }

    public void testShouldSupportCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//;\n1;2");
        assertEquals(3, result);
    }



}
