package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_318 {
    private final Production6_318 production = new Production6_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}