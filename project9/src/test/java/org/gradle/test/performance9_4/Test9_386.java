package org.gradle.test.performance9_4;

import static org.junit.Assert.assertEquals;

public class Test9_386 {
    private final Production9_386 production = new Production9_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}