package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_318 {
    private final Production8_318 production = new Production8_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}