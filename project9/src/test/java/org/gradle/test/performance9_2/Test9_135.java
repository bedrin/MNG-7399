package org.gradle.test.performance9_2;

import static org.junit.Assert.assertEquals;

public class Test9_135 {
    private final Production9_135 production = new Production9_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}