package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_391 {
    private final Production9_391 production = new Production9_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}