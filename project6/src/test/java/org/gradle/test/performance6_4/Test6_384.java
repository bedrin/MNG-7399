package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_384 {
    private final Production6_384 production = new Production6_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}