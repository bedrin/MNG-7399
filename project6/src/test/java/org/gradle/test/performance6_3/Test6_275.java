package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_275 {
    private final Production6_275 production = new Production6_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}