package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_346 {
    private final Production6_346 production = new Production6_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}