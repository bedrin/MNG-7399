package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_397 {
    private final Production4_397 production = new Production4_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}