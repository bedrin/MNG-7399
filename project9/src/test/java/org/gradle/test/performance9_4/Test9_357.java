package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_357 {
    private final Production9_357 production = new Production9_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}