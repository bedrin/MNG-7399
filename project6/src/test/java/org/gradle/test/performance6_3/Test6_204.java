package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_204 {
    private final Production6_204 production = new Production6_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}