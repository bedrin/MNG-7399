package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_158 {
    private final Production9_158 production = new Production9_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}