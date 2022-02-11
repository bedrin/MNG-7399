package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_319 {
    private final Production4_319 production = new Production4_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}