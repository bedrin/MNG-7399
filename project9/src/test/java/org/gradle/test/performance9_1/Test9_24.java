package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_24 {
    private final Production9_24 production = new Production9_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}