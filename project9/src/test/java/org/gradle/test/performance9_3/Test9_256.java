package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_256 {
    private final Production9_256 production = new Production9_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}