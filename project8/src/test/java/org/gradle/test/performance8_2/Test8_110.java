package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_110 {
    private final Production8_110 production = new Production8_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}