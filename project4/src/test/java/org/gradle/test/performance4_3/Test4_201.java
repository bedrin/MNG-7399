package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_201 {
    private final Production4_201 production = new Production4_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}