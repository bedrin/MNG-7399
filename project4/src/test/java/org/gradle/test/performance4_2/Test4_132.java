package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_132 {
    private final Production4_132 production = new Production4_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}