package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_64 {
    private final Production6_64 production = new Production6_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}