package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_185 {
    private final Production1_185 production = new Production1_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}