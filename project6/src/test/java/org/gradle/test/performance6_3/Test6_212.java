package org.gradle.test.performance6_3;

import static org.junit.Assert.assertEquals;

public class Test6_212 {
    private final Production6_212 production = new Production6_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}