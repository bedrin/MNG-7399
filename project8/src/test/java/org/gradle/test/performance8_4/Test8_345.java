package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_345 {
    private final Production8_345 production = new Production8_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}