package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_447 {
    private final Production6_447 production = new Production6_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}