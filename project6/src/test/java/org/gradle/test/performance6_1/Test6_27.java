package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_27 {
    private final Production6_27 production = new Production6_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}