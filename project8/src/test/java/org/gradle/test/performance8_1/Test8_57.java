package org.gradle.test.performance8_1;

import static org.junit.Assert.assertEquals;

public class Test8_57 {
    private final Production8_57 production = new Production8_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}