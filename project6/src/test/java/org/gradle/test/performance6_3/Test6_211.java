package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_211 {
    private final Production6_211 production = new Production6_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}