package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_15 {
    private final Production6_15 production = new Production6_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}