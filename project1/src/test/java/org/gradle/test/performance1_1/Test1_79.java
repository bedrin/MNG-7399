package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_79 {
    private final Production1_79 production = new Production1_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}