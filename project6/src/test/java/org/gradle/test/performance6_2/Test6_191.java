package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_191 {
    private final Production6_191 production = new Production6_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}