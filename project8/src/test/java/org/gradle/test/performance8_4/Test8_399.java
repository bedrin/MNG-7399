package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_399 {
    private final Production8_399 production = new Production8_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}