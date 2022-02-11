package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_120 {
    private final Production4_120 production = new Production4_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}