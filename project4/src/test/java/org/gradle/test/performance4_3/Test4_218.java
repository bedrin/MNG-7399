package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_218 {
    private final Production4_218 production = new Production4_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}