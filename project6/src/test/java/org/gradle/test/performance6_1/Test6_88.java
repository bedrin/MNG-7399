package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_88 {
    private final Production6_88 production = new Production6_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}