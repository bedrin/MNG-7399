package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_210 {
    private final Production4_210 production = new Production4_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}