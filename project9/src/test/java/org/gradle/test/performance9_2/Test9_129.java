package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_129 {
    private final Production9_129 production = new Production9_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}