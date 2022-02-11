package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_348 {
    private final Production6_348 production = new Production6_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}