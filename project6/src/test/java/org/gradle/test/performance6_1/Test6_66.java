package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_66 {
    private final Production6_66 production = new Production6_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}