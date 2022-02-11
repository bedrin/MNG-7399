package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_115 {
    private final Production4_115 production = new Production4_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}