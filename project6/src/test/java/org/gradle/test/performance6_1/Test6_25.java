package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_25 {
    private final Production6_25 production = new Production6_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}