package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_387 {
    private final Production1_387 production = new Production1_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}