package org.gradle.test.performance7_4;

import static org.junit.Assert.assertEquals;

public class Test7_375 {
    private final Production7_375 production = new Production7_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}