package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_377 {
    private final Production4_377 production = new Production4_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}