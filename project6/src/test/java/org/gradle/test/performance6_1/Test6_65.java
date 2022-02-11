package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_65 {
    private final Production6_65 production = new Production6_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}