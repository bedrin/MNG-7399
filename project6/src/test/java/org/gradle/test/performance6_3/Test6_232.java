package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_232 {
    private final Production6_232 production = new Production6_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}