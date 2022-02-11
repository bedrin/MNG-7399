package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_279 {
    private final Production4_279 production = new Production4_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}