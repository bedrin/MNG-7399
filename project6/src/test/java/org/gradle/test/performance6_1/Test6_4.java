package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_4 {
    private final Production6_4 production = new Production6_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}