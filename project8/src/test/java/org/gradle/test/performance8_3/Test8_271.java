package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_271 {
    private final Production8_271 production = new Production8_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}