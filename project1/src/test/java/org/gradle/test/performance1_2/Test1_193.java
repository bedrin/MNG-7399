package org.gradle.test.performance1_2;

import static org.junit.Assert.assertEquals;

public class Test1_193 {
    private final Production1_193 production = new Production1_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}