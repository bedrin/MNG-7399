package org.gradle.test.performance4_5;

import static org.junit.Assert.assertEquals;

public class Test4_431 {
    private final Production4_431 production = new Production4_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}