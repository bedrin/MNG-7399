package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_304 {
    private final Production6_304 production = new Production6_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}