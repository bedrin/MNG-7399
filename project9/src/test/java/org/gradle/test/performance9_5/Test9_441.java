package org.gradle.test.performance9_5;

import static org.junit.Assert.assertEquals;

public class Test9_441 {
    private final Production9_441 production = new Production9_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}