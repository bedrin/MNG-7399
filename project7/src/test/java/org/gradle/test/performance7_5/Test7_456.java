package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_456 {
    private final Production7_456 production = new Production7_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}