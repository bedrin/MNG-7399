package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_319 {
    private final Production6_319 production = new Production6_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}