package org.gradle.test.performance1_4;

import static org.junit.Assert.assertEquals;

public class Test1_373 {
    private final Production1_373 production = new Production1_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}