package org.gradle.test.performance4_4;

import static org.junit.Assert.assertEquals;

public class Test4_357 {
    private final Production4_357 production = new Production4_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}