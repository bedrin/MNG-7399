package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_86 {
    private final Production8_86 production = new Production8_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}