package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_290 {
    private final Production4_290 production = new Production4_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}