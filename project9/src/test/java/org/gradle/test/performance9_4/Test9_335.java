package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_335 {
    private final Production9_335 production = new Production9_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}