package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_348 {
    private final Production9_348 production = new Production9_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}