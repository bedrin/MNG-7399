package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_285 {
    private final Production4_285 production = new Production4_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}