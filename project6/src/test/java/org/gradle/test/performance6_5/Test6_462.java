package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_462 {
    private final Production6_462 production = new Production6_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}