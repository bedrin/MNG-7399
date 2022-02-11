package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_20 {
    private final Production6_20 production = new Production6_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}