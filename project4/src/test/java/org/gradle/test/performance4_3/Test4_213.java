package org.gradle.test.performance4_3;

import static org.junit.Assert.assertEquals;

public class Test4_213 {
    private final Production4_213 production = new Production4_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}