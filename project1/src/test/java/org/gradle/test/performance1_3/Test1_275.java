package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_275 {
    private final Production1_275 production = new Production1_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}