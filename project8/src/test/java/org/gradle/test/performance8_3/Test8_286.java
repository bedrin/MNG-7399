package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_286 {
    private final Production8_286 production = new Production8_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}