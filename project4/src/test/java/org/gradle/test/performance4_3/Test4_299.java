package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_299 {
    private final Production4_299 production = new Production4_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}