package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_365 {
    private final Production8_365 production = new Production8_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}