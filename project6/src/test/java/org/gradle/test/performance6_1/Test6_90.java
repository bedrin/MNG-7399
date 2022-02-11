package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_90 {
    private final Production6_90 production = new Production6_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}