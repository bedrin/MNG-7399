package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_342 {
    private final Production9_342 production = new Production9_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}