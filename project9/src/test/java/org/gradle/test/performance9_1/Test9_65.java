package org.gradle.test.performance9_1;

import static org.junit.Assert.assertEquals;

public class Test9_65 {
    private final Production9_65 production = new Production9_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}