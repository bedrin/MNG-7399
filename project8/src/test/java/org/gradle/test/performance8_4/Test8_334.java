package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_334 {
    private final Production8_334 production = new Production8_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}