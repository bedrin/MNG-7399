package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_125 {
    private final Production4_125 production = new Production4_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}