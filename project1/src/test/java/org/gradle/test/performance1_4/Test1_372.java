package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_372 {
    private final Production1_372 production = new Production1_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}