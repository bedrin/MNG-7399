package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_45 {
    private final Production6_45 production = new Production6_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}