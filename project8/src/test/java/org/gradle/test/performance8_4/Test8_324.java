package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_324 {
    private final Production8_324 production = new Production8_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}