package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_148 {
    private final Production4_148 production = new Production4_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}