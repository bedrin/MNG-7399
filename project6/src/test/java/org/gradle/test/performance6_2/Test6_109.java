package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_109 {
    private final Production6_109 production = new Production6_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}