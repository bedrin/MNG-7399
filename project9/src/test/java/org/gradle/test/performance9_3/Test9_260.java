package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_260 {
    private final Production9_260 production = new Production9_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}