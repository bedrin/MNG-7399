package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_328 {
    private final Production4_328 production = new Production4_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}