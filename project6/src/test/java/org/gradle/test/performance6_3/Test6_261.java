package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_261 {
    private final Production6_261 production = new Production6_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}