package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_120 {
    private final Production6_120 production = new Production6_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}