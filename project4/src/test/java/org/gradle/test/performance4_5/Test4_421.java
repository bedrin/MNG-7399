package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_421 {
    private final Production4_421 production = new Production4_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}