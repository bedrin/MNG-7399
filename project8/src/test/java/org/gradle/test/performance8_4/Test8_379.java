package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_379 {
    private final Production8_379 production = new Production8_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}