package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_430 {
    private final Production4_430 production = new Production4_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}