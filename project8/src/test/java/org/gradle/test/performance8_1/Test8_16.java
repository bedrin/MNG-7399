package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_16 {
    private final Production8_16 production = new Production8_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}