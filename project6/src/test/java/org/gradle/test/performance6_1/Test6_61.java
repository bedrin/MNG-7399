package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_61 {
    private final Production6_61 production = new Production6_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}