package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_20 {
    private final Production8_20 production = new Production8_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}