package org.gradle.test.performance9_3;

import static org.junit.Assert.assertEquals;

public class Test9_237 {
    private final Production9_237 production = new Production9_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}