package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_477 {
    private final Production6_477 production = new Production6_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}