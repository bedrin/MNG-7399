package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_125 {
    private final Production9_125 production = new Production9_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}