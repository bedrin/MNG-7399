package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_451 {
    private final Production1_451 production = new Production1_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}