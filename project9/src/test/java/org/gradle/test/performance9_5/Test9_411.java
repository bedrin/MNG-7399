package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_411 {
    private final Production9_411 production = new Production9_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}