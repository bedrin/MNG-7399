package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_487 {
    private final Production1_487 production = new Production1_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}