package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_129 {
    private final Production4_129 production = new Production4_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}