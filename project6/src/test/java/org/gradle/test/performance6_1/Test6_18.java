package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_18 {
    private final Production6_18 production = new Production6_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}