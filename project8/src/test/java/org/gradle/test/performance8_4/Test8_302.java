package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_302 {
    private final Production8_302 production = new Production8_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}