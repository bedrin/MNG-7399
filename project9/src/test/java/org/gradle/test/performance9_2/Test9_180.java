package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_180 {
    private final Production9_180 production = new Production9_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}