package org.gradle.test.performance6_5;

import static org.junit.Assert.assertEquals;

public class Test6_406 {
    private final Production6_406 production = new Production6_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}