package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_420 {
    private final Production9_420 production = new Production9_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}