package org.gradle.test.performance5_5;

import static org.junit.Assert.assertEquals;

public class Test5_487 {
    private final Production5_487 production = new Production5_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}