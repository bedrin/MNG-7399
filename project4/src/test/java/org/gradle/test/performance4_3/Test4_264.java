package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_264 {
    private final Production4_264 production = new Production4_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}