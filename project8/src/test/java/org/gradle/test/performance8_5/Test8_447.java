package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_447 {
    private final Production8_447 production = new Production8_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}