package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_315 {
    private final Production6_315 production = new Production6_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}