package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_408 {
    private final Production6_408 production = new Production6_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}