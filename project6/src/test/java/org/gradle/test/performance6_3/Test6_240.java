package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_240 {
    private final Production6_240 production = new Production6_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}