package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_292 {
    private final Production8_292 production = new Production8_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}