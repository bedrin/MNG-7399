package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_344 {
    private final Production6_344 production = new Production6_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}