package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_385 {
    private final Production6_385 production = new Production6_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}