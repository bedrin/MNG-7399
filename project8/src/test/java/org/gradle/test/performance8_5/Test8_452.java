package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_452 {
    private final Production8_452 production = new Production8_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}