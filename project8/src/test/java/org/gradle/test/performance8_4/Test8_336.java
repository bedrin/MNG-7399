package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_336 {
    private final Production8_336 production = new Production8_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}