package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_20 {
    private final Production4_20 production = new Production4_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}