package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_312 {
    private final Production4_312 production = new Production4_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}