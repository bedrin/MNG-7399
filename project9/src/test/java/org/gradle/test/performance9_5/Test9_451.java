package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_451 {
    private final Production9_451 production = new Production9_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}