package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_117 {
    private final Production7_117 production = new Production7_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}