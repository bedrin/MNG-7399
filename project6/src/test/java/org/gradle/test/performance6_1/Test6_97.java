package org.gradle.test.performance6_1;

import static org.junit.Assert.assertEquals;

public class Test6_97 {
    private final Production6_97 production = new Production6_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}