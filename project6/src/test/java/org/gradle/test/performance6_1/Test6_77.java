package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_77 {
    private final Production6_77 production = new Production6_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}