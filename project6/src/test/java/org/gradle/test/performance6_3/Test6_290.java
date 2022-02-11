package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_290 {
    private final Production6_290 production = new Production6_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}