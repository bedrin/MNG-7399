package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_316 {
    private final Production4_316 production = new Production4_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}