package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_421 {
    private final Production1_421 production = new Production1_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}