package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_280 {
    private final Production6_280 production = new Production6_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}