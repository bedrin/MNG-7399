package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_354 {
    private final Production8_354 production = new Production8_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}