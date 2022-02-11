package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_57 {
    private final Production6_57 production = new Production6_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}