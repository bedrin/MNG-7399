package org.gradle.test.performance8_3;

import static org.junit.Assert.assertEquals;

public class Test8_227 {
    private final Production8_227 production = new Production8_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}