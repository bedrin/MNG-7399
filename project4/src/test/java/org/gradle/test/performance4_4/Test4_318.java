package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_318 {
    private final Production4_318 production = new Production4_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}