package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_165 {
    private final Production4_165 production = new Production4_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}