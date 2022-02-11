package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_301 {
    private final Production4_301 production = new Production4_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}