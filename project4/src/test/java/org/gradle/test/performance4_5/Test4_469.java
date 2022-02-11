package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_469 {
    private final Production4_469 production = new Production4_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}