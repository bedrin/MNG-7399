package org.gradle.test.performance1_5;

import static org.junit.Assert.assertEquals;

public class Test1_477 {
    private final Production1_477 production = new Production1_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}