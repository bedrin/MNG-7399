package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_494 {
    private final Production9_494 production = new Production9_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}