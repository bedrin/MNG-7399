package org.gradle.test.performance5_3;

import static org.junit.Assert.assertEquals;

public class Test5_278 {
    private final Production5_278 production = new Production5_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}