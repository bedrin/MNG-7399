package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_161 {
    private final Production8_161 production = new Production8_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}