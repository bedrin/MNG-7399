package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_116 {
    private final Production9_116 production = new Production9_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}