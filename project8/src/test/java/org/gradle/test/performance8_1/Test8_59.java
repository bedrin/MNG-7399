package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_59 {
    private final Production8_59 production = new Production8_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}