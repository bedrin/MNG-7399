package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_342 {
    private final Production4_342 production = new Production4_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}