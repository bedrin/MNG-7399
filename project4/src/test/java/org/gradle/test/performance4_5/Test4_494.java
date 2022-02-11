package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_494 {
    private final Production4_494 production = new Production4_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}