package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_23 {
    private final Production4_23 production = new Production4_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}