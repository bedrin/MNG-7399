package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_168 {
    private final Production6_168 production = new Production6_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}