package org.gradle.test.performance8_2;

import static org.junit.Assert.assertEquals;

public class Test8_156 {
    private final Production8_156 production = new Production8_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}