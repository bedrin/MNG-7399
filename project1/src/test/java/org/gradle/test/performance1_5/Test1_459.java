package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_459 {
    private final Production1_459 production = new Production1_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}