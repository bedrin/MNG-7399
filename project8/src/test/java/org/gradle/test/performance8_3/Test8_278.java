package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_278 {
    private final Production8_278 production = new Production8_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}