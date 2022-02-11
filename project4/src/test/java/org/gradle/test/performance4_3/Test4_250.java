package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_250 {
    private final Production4_250 production = new Production4_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}