package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_375 {
    private final Production6_375 production = new Production6_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}