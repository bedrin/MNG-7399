package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_147 {
    private final Production6_147 production = new Production6_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}