package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_384 {
    private final Production1_384 production = new Production1_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}