package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_198 {
    private final Production6_198 production = new Production6_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}