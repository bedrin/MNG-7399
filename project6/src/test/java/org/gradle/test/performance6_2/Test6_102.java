package org.gradle.test.performance6_2;

import static org.junit.Assert.assertEquals;

public class Test6_102 {
    private final Production6_102 production = new Production6_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}