package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_377 {
    private final Production9_377 production = new Production9_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}