package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_492 {
    private final Production8_492 production = new Production8_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}