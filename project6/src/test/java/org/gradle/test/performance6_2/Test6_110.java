package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_110 {
    private final Production6_110 production = new Production6_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}