package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_293 {
    private final Production6_293 production = new Production6_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}