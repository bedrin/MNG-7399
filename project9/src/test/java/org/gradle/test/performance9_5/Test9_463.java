package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_463 {
    private final Production9_463 production = new Production9_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}