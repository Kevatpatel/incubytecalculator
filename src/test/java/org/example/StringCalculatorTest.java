package org.example;

import junit.framework.TestCase;

public class StringCalculatorTest extends TestCase {

    public void testShouldReturnZeroForEmptyString() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }
}
