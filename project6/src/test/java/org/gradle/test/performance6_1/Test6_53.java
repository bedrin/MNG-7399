package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_53 {
    private final Production6_53 production = new Production6_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}