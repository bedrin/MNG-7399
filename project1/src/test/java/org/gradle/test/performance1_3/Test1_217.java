package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_217 {
    private final Production1_217 production = new Production1_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}