package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_149 {
    private final Production6_149 production = new Production6_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}