package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_158 {
    private final Production6_158 production = new Production6_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}