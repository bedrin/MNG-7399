package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_440 {
    private final Production1_440 production = new Production1_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}