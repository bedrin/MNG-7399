package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_126 {
    private final Production9_126 production = new Production9_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}