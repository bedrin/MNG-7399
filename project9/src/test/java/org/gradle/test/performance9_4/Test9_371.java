package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_371 {
    private final Production9_371 production = new Production9_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}