package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_194 {
    private final Production1_194 production = new Production1_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}