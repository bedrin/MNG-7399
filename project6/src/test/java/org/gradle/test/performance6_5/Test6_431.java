package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_431 {
    private final Production6_431 production = new Production6_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}