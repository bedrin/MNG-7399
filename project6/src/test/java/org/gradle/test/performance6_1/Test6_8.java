package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_8 {
    private final Production6_8 production = new Production6_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}