package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_328 {
    private final Production9_328 production = new Production9_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}