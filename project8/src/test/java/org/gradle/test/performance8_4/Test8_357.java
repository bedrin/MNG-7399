package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_357 {
    private final Production8_357 production = new Production8_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}