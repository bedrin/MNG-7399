package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_455 {
    private final Production8_455 production = new Production8_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}