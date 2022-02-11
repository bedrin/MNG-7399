package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_275 {
    private final Production4_275 production = new Production4_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}