package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_443 {
    private final Production9_443 production = new Production9_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}