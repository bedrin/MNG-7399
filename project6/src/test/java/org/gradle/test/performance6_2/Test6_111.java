package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_111 {
    private final Production6_111 production = new Production6_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}