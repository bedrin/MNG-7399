package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_363 {
    private final Production9_363 production = new Production9_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}