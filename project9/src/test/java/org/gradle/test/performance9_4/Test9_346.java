package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_346 {
    private final Production9_346 production = new Production9_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}