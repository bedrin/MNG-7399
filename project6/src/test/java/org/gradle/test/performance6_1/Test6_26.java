package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_26 {
    private final Production6_26 production = new Production6_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}