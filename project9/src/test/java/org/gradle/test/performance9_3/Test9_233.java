package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_233 {
    private final Production9_233 production = new Production9_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}