package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_339 {
    private final Production1_339 production = new Production1_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}