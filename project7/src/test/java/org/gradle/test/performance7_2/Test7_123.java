package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_123 {
    private final Production7_123 production = new Production7_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}