package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_240 {
    private final Production4_240 production = new Production4_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}