package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_137 {
    private final Production6_137 production = new Production6_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}