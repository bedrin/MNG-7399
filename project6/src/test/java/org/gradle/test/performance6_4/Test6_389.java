package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_389 {
    private final Production6_389 production = new Production6_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}