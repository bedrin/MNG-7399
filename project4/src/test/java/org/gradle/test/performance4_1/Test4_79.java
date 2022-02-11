package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_79 {
    private final Production4_79 production = new Production4_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}