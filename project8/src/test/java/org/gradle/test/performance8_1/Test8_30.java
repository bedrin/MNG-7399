package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_30 {
    private final Production8_30 production = new Production8_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}