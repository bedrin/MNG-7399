package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_441 {
    private final Production6_441 production = new Production6_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}