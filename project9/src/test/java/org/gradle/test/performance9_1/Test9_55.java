package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_55 {
    private final Production9_55 production = new Production9_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}