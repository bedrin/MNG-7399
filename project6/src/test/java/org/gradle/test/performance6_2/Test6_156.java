package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_156 {
    private final Production6_156 production = new Production6_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}