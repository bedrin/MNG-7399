package org.gradle.test.performance7_3;

import static org.junit.Assert.assertEquals;

public class Test7_299 {
    private final Production7_299 production = new Production7_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}