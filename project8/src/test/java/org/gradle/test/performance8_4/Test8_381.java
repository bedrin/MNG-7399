package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_381 {
    private final Production8_381 production = new Production8_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}