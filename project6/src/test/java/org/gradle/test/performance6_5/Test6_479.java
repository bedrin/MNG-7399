package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_479 {
    private final Production6_479 production = new Production6_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}