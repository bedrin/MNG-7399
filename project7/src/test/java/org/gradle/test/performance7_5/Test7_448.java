package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_448 {
    private final Production7_448 production = new Production7_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}