package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_485 {
    private final Production9_485 production = new Production9_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}