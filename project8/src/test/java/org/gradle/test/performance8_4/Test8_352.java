package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_352 {
    private final Production8_352 production = new Production8_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}