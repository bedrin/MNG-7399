package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_359 {
    private final Production9_359 production = new Production9_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}