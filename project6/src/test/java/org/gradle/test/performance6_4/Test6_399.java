package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_399 {
    private final Production6_399 production = new Production6_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}