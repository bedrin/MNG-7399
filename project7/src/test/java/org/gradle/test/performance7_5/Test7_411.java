package org.gradle.test.performance7_5;

import static org.junit.Assert.assertEquals;

public class Test7_411 {
    private final Production7_411 production = new Production7_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}