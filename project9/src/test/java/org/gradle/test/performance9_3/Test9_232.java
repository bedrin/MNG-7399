package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_232 {
    private final Production9_232 production = new Production9_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}