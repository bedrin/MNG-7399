package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_142 {
    private final Production8_142 production = new Production8_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}