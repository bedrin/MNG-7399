package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_372 {
    private final Production8_372 production = new Production8_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}