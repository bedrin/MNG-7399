package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_287 {
    private final Production6_287 production = new Production6_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}