package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_113 {
    private final Production4_113 production = new Production4_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}