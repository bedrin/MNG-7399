package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_144 {
    private final Production4_144 production = new Production4_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}