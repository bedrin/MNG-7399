package org.gradle.test.performance4_1;

import static org.junit.Assert.assertEquals;

public class Test4_37 {
    private final Production4_37 production = new Production4_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}