package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_6 {
    private final Production6_6 production = new Production6_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}