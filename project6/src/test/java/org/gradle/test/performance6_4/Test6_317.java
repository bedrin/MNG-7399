package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_317 {
    private final Production6_317 production = new Production6_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}