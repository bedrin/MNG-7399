package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_30 {
    private final Production6_30 production = new Production6_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}