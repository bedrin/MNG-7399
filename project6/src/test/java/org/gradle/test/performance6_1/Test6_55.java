package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_55 {
    private final Production6_55 production = new Production6_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}