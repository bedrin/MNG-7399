package org.gradle.test.performance3_5;

import static org.junit.Assert.assertEquals;

public class Test3_496 {
    private final Production3_496 production = new Production3_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}