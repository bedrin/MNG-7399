package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_451 {
    private final Production5_451 production = new Production5_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}