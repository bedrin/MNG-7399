package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_104 {
    private final Production6_104 production = new Production6_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}