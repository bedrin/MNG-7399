package org.gradle.test.performance8_4;

import static org.junit.Assert.assertEquals;

public class Test8_361 {
    private final Production8_361 production = new Production8_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}