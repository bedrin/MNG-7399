package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_381 {
    private final Production9_381 production = new Production9_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}