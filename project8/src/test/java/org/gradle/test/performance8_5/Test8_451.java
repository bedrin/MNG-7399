package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_451 {
    private final Production8_451 production = new Production8_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}