package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_297 {
    private final Production8_297 production = new Production8_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}