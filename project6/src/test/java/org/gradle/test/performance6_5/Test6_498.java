package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_498 {
    private final Production6_498 production = new Production6_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}