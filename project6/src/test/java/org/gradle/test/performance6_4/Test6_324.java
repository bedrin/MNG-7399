package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_324 {
    private final Production6_324 production = new Production6_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}