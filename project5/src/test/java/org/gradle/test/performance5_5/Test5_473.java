package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_473 {
    private final Production5_473 production = new Production5_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}