package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_51 {
    private final Production6_51 production = new Production6_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}