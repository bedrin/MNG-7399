package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_41 {
    private final Production6_41 production = new Production6_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}