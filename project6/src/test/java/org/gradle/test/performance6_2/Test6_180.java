package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_180 {
    private final Production6_180 production = new Production6_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}