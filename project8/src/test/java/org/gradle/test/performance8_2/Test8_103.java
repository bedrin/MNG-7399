package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_103 {
    private final Production8_103 production = new Production8_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}