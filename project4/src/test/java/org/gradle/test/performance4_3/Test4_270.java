package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_270 {
    private final Production4_270 production = new Production4_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}