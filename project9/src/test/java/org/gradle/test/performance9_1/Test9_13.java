package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_13 {
    private final Production9_13 production = new Production9_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}