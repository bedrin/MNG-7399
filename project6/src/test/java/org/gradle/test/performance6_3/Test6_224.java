package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_224 {
    private final Production6_224 production = new Production6_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}