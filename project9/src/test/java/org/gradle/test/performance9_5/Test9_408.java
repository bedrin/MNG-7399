package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_408 {
    private final Production9_408 production = new Production9_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}