package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_177 {
    private final Production8_177 production = new Production8_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}