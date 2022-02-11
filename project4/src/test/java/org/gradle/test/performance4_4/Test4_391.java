package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_391 {
    private final Production4_391 production = new Production4_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}