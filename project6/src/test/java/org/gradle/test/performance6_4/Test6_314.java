package org.gradle.test.performance6_4;

import static org.junit.Assert.assertEquals;

public class Test6_314 {
    private final Production6_314 production = new Production6_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}