package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_221 {
    private final Production6_221 production = new Production6_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}