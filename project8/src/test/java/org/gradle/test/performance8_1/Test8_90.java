package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_90 {
    private final Production8_90 production = new Production8_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}