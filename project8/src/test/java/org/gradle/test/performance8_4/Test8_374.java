package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_374 {
    private final Production8_374 production = new Production8_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}