package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_488 {
    private final Production9_488 production = new Production9_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}