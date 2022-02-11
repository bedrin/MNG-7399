package org.gradle.test.performance4_2;

import static org.junit.Assert.assertEquals;

public class Test4_108 {
    private final Production4_108 production = new Production4_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}