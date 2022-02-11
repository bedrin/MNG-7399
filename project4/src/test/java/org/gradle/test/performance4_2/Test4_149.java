package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_149 {
    private final Production4_149 production = new Production4_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}