package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_46 {
    private final Production8_46 production = new Production8_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}