package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_487 {
    private final Production4_487 production = new Production4_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}