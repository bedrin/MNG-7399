package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_115 {
    private final Production6_115 production = new Production6_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}