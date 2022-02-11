package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_384 {
    private final Production4_384 production = new Production4_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}