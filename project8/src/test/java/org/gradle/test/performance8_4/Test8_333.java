package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_333 {
    private final Production8_333 production = new Production8_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}