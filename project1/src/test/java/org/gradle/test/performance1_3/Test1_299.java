package org.gradle.test.performance1_3;

import static org.junit.Assert.assertEquals;

public class Test1_299 {
    private final Production1_299 production = new Production1_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}