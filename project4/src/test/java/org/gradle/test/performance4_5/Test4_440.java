package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_440 {
    private final Production4_440 production = new Production4_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}