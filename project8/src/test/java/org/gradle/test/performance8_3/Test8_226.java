package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_226 {
    private final Production8_226 production = new Production8_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}