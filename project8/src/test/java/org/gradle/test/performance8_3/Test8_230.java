package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_230 {
    private final Production8_230 production = new Production8_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}