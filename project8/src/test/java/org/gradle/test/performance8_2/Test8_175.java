package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_175 {
    private final Production8_175 production = new Production8_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}