package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_262 {
    private final Production9_262 production = new Production9_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}