package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_326 {
    private final Production6_326 production = new Production6_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}