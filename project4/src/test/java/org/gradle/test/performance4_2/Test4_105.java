package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_105 {
    private final Production4_105 production = new Production4_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}