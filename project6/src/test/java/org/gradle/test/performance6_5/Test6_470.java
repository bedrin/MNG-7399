package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_470 {
    private final Production6_470 production = new Production6_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}