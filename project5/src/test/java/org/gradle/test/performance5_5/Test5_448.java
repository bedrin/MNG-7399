package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_448 {
    private final Production5_448 production = new Production5_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}