package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_489 {
    private final Production8_489 production = new Production8_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}