package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_375 {
    private final Production9_375 production = new Production9_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}