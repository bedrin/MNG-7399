package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_409 {
    private final Production4_409 production = new Production4_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}