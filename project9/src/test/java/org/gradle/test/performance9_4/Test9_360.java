package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_360 {
    private final Production9_360 production = new Production9_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}