package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_455 {
    private final Production1_455 production = new Production1_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}