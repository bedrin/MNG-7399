package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_87 {
    private final Production6_87 production = new Production6_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}