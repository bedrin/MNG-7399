package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_402 {
    private final Production9_402 production = new Production9_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}