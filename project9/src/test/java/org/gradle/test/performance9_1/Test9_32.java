package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_32 {
    private final Production9_32 production = new Production9_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}