package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_491 {
    private final Production4_491 production = new Production4_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}