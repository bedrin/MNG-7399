package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_371 {
    private final Production4_371 production = new Production4_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}