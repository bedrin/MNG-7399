package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_343 {
    private final Production6_343 production = new Production6_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}