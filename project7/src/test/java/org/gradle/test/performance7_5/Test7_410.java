package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_410 {
    private final Production7_410 production = new Production7_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}