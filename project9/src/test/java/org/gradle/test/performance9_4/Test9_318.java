package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_318 {
    private final Production9_318 production = new Production9_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}