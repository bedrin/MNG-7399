package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_278 {
    private final Production9_278 production = new Production9_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}