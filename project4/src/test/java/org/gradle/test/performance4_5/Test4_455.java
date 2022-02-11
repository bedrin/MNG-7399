package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_455 {
    private final Production4_455 production = new Production4_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}