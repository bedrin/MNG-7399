package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_403 {
    private final Production8_403 production = new Production8_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}