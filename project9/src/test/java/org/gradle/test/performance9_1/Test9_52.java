package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_52 {
    private final Production9_52 production = new Production9_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}