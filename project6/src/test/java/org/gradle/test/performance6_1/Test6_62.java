package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_62 {
    private final Production6_62 production = new Production6_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}