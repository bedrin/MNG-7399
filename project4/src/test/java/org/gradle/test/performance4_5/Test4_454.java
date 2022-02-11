package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_454 {
    private final Production4_454 production = new Production4_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}