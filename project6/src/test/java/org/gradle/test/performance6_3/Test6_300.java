package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_300 {
    private final Production6_300 production = new Production6_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}