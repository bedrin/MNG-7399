package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_289 {
    private final Production6_289 production = new Production6_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}