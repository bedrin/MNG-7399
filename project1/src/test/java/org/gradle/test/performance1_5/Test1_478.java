package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_478 {
    private final Production1_478 production = new Production1_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}