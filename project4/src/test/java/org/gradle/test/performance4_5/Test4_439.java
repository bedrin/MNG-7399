package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_439 {
    private final Production4_439 production = new Production4_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}