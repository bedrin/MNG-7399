package org.gradle.test.performance5_4;

import static org.junit.Assert.assertEquals;

public class Test5_372 {
    private final Production5_372 production = new Production5_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}