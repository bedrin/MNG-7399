package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_383 {
    private final Production5_383 production = new Production5_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}