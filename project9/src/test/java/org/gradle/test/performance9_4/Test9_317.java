package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_317 {
    private final Production9_317 production = new Production9_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}