package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_352 {
    private final Production7_352 production = new Production7_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}