package org.gradle.test.performance8_5;

import static org.junit.Assert.assertEquals;

public class Test8_467 {
    private final Production8_467 production = new Production8_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}