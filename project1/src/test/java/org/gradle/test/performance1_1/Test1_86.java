package org.gradle.test.performance1_1;

import static org.junit.Assert.assertEquals;

public class Test1_86 {
    private final Production1_86 production = new Production1_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}