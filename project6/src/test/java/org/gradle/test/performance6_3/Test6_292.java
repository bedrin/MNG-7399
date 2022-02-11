package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_292 {
    private final Production6_292 production = new Production6_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}