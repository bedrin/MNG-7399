package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_430 {
    private final Production9_430 production = new Production9_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}