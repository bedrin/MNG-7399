package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_351 {
    private final Production8_351 production = new Production8_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}