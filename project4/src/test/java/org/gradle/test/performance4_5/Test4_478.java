package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_478 {
    private final Production4_478 production = new Production4_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}