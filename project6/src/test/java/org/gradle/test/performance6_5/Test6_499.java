package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_499 {
    private final Production6_499 production = new Production6_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}