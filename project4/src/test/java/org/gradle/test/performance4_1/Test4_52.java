package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_52 {
    private final Production4_52 production = new Production4_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}