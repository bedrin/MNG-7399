package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_364 {
    private final Production6_364 production = new Production6_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}