package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_274 {
    private final Production9_274 production = new Production9_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}