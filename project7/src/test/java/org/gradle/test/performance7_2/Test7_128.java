package org.gradle.test.performance7_2;

import static org.junit.Assert.assertEquals;

public class Test7_128 {
    private final Production7_128 production = new Production7_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}