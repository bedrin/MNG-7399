package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_471 {
    private final Production1_471 production = new Production1_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}