package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_354 {
    private final Production9_354 production = new Production9_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}