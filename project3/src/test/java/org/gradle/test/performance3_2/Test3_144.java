package org.gradle.test.performance3_2;

import static org.junit.Assert.assertEquals;

public class Test3_144 {
    private final Production3_144 production = new Production3_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}