package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_496 {
    private final Production9_496 production = new Production9_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}