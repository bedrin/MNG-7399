package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_158 {
    private final Production8_158 production = new Production8_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}