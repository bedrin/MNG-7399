package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_264 {
    private final Production1_264 production = new Production1_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}