package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_49 {
    private final Production6_49 production = new Production6_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}