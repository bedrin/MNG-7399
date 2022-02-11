package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_363 {
    private final Production4_363 production = new Production4_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}