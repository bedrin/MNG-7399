package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_496 {
    private final Production7_496 production = new Production7_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}