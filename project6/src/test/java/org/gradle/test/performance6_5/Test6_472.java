package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_472 {
    private final Production6_472 production = new Production6_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}