package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_365 {
    private final Production6_365 production = new Production6_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}