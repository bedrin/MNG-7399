package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_144 {
    private final Production8_144 production = new Production8_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}