package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_493 {
    private final Production1_493 production = new Production1_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}