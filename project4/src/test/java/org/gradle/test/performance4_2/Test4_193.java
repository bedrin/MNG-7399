package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_193 {
    private final Production4_193 production = new Production4_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}