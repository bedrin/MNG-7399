package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_407 {
    private final Production8_407 production = new Production8_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}