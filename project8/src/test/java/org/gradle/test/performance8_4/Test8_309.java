package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_309 {
    private final Production8_309 production = new Production8_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}