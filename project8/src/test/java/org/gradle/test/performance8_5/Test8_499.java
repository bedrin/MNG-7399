package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_499 {
    private final Production8_499 production = new Production8_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}