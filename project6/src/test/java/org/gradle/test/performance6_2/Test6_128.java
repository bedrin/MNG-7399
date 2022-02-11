package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_128 {
    private final Production6_128 production = new Production6_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}