package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_164 {
    private final Production6_164 production = new Production6_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}