package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_23 {
    private final Production6_23 production = new Production6_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}