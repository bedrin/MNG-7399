package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_16 {
    private final Production6_16 production = new Production6_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}