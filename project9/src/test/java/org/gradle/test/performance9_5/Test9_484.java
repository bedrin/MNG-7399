package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_484 {
    private final Production9_484 production = new Production9_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}