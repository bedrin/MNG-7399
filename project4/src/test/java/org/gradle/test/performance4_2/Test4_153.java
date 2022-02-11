package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_153 {
    private final Production4_153 production = new Production4_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}